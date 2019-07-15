package common;

import bean.User;
import dao.UserDao;
import dao.impl.UserDaoImpl;

import java.util.Scanner;

public class Common {
    private static UserDao userDao=new UserDaoImpl( );
    public  static void  show (int number){//写成static 可通过类名.方法名直接调用方法
        if(number>0&&number<7) {
            switch (number) {
                case 1:
                    System.out.println("开始注册");
                    userDao.addUser(getUser());
                    break;
                case 2:
                    System.out.println("请输入所删除对象的ID");
                    userDao.deleteUser(getId());
                    break;
                case 3:
                    userDao.updateUser(getUser());
                    break;
                case 4:
                    userDao.show();
                    break;
                 case 5:
                     System.out.println("请输入用户ID值");
                     userDao.getMessage(getId());
                    break;
                case 6:
                    System.out.println("请输入用户ID值");
                    userDao.updateUserPassword(getId(),getPassword());
                    break;
                default:
                    System.exit(0);
                    break;

            }
        }
        else System.out.println("该功能未定义，请重新输入");
    }


    //添加键盘录入系统
    public static User getUser(){
    System.out.println("id:");
    Scanner sc=new Scanner(System.in);//id
         System.out.println("姓名:");
    Scanner sc2=new Scanner(System.in);//姓名
        System.out.println("密码:");
    Scanner sc3=new Scanner(System.in);//密码
        return new User(sc.nextInt(),sc2.next(),sc3.next());

    }
    //获取ID值
    public static int getId() {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        return id;
    }
    //获取密码
    public static String getPassword() {
        System.out.println("请输入新的密码：");
        Scanner sc=new Scanner(System.in);
        String password=sc.next();
        return password;//sc.toString();
    }
}
