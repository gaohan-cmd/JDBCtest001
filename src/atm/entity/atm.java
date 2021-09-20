package atm.entity;

import java.util.Objects;

public class atm {
    private int id;
    private String code;
    private String pwd;
    private String name;
    private double money;
    //get、set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        atm atm = (atm) o;
        return id == atm.id && Double.compare(atm.money, money) == 0 && Objects.equals(code, atm.code) && Objects.equals(pwd, atm.pwd) && Objects.equals(name, atm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, pwd, name, money);
    }
}
