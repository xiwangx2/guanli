package controller;

import bean.User;
import common.Common;
import dao.UserDao;
import dao.impl.UserDaoImpl;

import java.util.Scanner;

public class App {
    private static UserDao ud=new UserDaoImpl();
    public static void main(String [] args){
       // ud.addUser(new User(9999,"laowang","9001"));
       // User.;
      //  ud.show();

    while (true){
        System.out.println("请选择功能：1、注册 2、删除 3、更改账户信息 4、查询所有用户 5、查询用户 6、修改密码");
        Scanner sc=new Scanner(System.in);
        Common.show(sc.nextInt());
    }
    }
}
