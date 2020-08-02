package swjtu.springbootmybatis.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import swjtu.springbootmybatis.pojo.Department;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    // 获取所有部门信息
    List<Department> getDepartments();
    // 通过id获得部门
    Department getDepartment(Integer id);

}
