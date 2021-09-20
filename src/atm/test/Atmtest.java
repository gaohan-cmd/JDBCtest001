package atm.test;


import atm.dao.AtmDao;
import atm.entity.atm;
import atm.service.AtmMenu;
import atm.service.AtmSrivice;

import java.util.Scanner;

public class Atmtest {
    public static void main(String[] args) {
        AtmMenu atmMenu=new AtmMenu();
        AtmSrivice atmSrivice=new AtmSrivice();
        Scanner sc=new Scanner(System.in);
        while(true){
            int index=atmMenu.regAndLogMenu(sc);
            if(index==1){
                boolean b=atmSrivice.regatmservice(sc);
                if(b){
                    System.out.println("注册成功");
                }else{
                    System.out.println("登录失败");
                }
            }else if(index==2){
                atm a=atmSrivice.loginatmservice(sc);
                if(a!=null){
                    System.out.println("登录成功");
                }else{
                    System.out.println("登录失败");
                }
            }else{
                break;
            }
        }
    }
}
