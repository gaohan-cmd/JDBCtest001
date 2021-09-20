package atm.service;

import atm.entity.atm;

import java.util.Scanner;

public class AtmMenu {
    //登录注册界面
    public int regAndLogMenu(Scanner sc){
        System.out.println("------------");
        System.out.println("   1，注册   ");
        System.out.println("   2，登录   ");
        System.out.println("   3，退出   ");
        System.out.println("------------");
        System.out.println("请输入操作序号：");
        int index=sc.nextInt();
        return index;
    }
    //注册界面
   public atm regmenu(Scanner sc){
        System.out.println("请输入账号：");
        String code=sc.next();
       System.out.println("请输入密码：");
       String pwd=sc.next();
       System.out.println("请输入姓名：");
       String name=sc.next();
       atm a=new atm();
       a.setName(name);
       a.setCode(code);
       a.setMoney(0);
       a.setPwd(pwd);
       return a;
   }
   //登录界面
    public atm loginmenu(Scanner sc){
        System.out.println("请输入账号：");
        String code=sc.next();
        System.out.println("请输入密码：");
        String pwd=sc.next();
        atm a=new atm();
        a.setCode(code);
        a.setPwd(pwd);
        return a;
    }
}
