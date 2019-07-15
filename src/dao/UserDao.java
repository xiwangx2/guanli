package dao;

import bean.User;

public interface UserDao {
    //增
    void addUser(User user);
    //删
    boolean deleteUser(int id);
    //改
    boolean  updateUser(User user);
    //查
    void show();
    //根据ID修改密码
    boolean updateUserPassword(int id,String password);
    //根据ID查询账户
    boolean getMessage(int id);
}
