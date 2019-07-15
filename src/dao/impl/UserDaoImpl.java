package dao.impl;

import bean.User;
import dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean updateUserPassword(int id, String password) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.get(i).setPassword(password);
                System.out.println("修改成功");
                return true;
            }
        }
        System.out.println("该用户不存在");
        return false;
    }

    @Override
    public boolean getMessage(int id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                System.out.println(list.get(i));
                return true;
                //return list.get(i).toString();
            }
        }
        System.out.println("该用户不存在");
        return false;
    }

    private static List<User> list =new ArrayList<User>();
    static{
        for(int i=0;i<8;i++){
            list.add(new User(100+i,"u00"+i,"500"+i));
        }
    }


    @Override
    public void addUser(User user) {
        if(user!=null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == user.getId()) {
                    System.out.println("此用户已录入！！！");
                }
            }
        }
        list.add(user);
        System.out.println("添加成功");
    }

    @Override
    public boolean deleteUser(int id) {

        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i);
                System.out.println("删除成功");
                return true;
            }
        }
        System.out.println("该用户不存在");
        return false;
    }

    @Override
    public boolean updateUser(User user) {

        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==user.getId()){
                User user2=list.get(i);
                user2.setName(user.getName());
                user.setPassword(user.getPassword());
                return true;
            }
        }
        System.out.println("该用户不存在");
            return false;
    }

    @Override
    public void show() {
        for(int i=0;i<list.size();i++){
            System.out.println("数据为"+list.get(i));
        }

    }
}
