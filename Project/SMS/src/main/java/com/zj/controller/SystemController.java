package com.zj.controller;

import com.zj.bean.Admin;
import com.zj.bean.LoginForm;
import com.zj.bean.Student;
import com.zj.bean.Teacher;
import com.zj.service.AdminService;
import com.zj.service.StudentService;
import com.zj.service.TeacherService;
import com.zj.util.CreateVerifiCodeImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/system")
public class SystemController {

    @Resource
    private AdminService adminService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StudentService studentService;
    //存储返回给页面的对象数据
    private Map<String,Object> result = new HashMap<String, Object>();

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "system/login";
    }

    //验证码图片
    @RequestMapping("/getVerifiCodeImage")
    public void getVerifiCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //验证码图片
        BufferedImage verifiCodeImage = CreateVerifiCodeImage.getVerifiCodeImage();
        //验证码
        String verifiCode = String.valueOf(CreateVerifiCodeImage.getVerifiCode());
        //将验证码图片输出到登录界面
        ImageIO.write(verifiCodeImage,"JPEG",response.getOutputStream());
        //存储验证码Session
        request.getSession().setAttribute("verifiCode",verifiCode);
    }

    //
    @PostMapping("login")
    @ResponseBody
    public Map<String, Object> login(LoginForm loginForm, HttpServletRequest request) {

        // 校验验证码信息
        String vcode = (String) request.getSession().getAttribute("verifiCode");
        if ("".equals(vcode)) {
            result.put("success", false);
            result.put("msg", "长时间为操作,会话已失效,请刷新页面后重试!");
            return result;
        } else if (!loginForm.getVerifiCode().equalsIgnoreCase(vcode)) {
            result.put("success", false);
            result.put("msg", "验证码错误!");
            return result;
        }
        request.getSession().removeAttribute("verifiCode");

        //效验用户登录信息
        switch (loginForm.getUserType()) {
            //管理员身份
            case 1:
                try {
                    Admin admin = adminService.login(loginForm);//验证账户和密码是否存在
                    if (admin != null) {
                        HttpSession session = request.getSession(); //将用户信息存储到Session
                        session.setAttribute("userInfo", admin);
                        session.setAttribute("userType", loginForm.getUserType());
                        result.put("success", true);
                        return result;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    result.put("success", false);
                    result.put("msg", "登录失败! 服务器端发生异常!");
                    return result;
                }
                break;
            //学生身份
            case 2:
                try {
                    Student student = studentService.login(loginForm);
                    if (student != null) {
                        HttpSession session = request.getSession();
                        session.setAttribute("userInfo", student);
                        session.setAttribute("userType", loginForm.getUserType());
                        result.put("success", true);
                        return result;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    result.put("success", false);
                    result.put("msg", "登录失败! 服务器端发生异常!");
                    return result;
                }
                break;
            //教师身份
            case 3:
                try {
                    Teacher teacher = teacherService.login(loginForm);
                    if (teacher != null) {
                        HttpSession session = request.getSession();
                        session.setAttribute("userInfo", teacher);
                        session.setAttribute("userType", loginForm.getUserType());
                        result.put("success", true);
                        return result;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    result.put("success", false);
                    result.put("msg", "登录失败! 服务器端发生异常!");
                    return result;
                }
                break;
        }
        //登录失败
        result.put("success", false);
        result.put("msg", "用户名或密码错误!");
        return result;
    }
}
