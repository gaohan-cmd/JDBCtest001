package atm.service;

import atm.dao.AtmDao;
import atm.entity.atm;

import java.util.Scanner;

public class AtmSrivice {
    //此界面只会调用dao因此可以保护隐私
    //注册的功能
    AtmMenu am=new AtmMenu();
    AtmDao ad=new AtmDao();
    public boolean regatmservice(Scanner sc){
        //获取注册时候的信息
        atm a=am.regmenu(sc);
        boolean flag=ad.regatm(a);
        return  flag;
    }
    //登录的功能
    public atm loginatmservice(Scanner sc){
        atm a=am.loginmenu(sc);
        atm a1=ad.loginAtm(a.getCode(),a.getPwd());
        return a1;
    }
}
