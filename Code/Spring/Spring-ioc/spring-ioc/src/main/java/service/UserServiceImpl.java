package service;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserDaoMysqlImpl;

public class UserServiceImpl  implements UserService{
    
    private UserDao userDao;
    //利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
