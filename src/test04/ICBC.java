package test04;

public class ICBC extends Card implements  Credit{
    @Override
    public void cardholder(Person p) {
        System.out.println(p.getName()+"使用的是"+p.getName()+"行用卡");
    }

    public ICBC() {
    }

    public ICBC(String name) {
        super(name);
    }

    @Override
    public void prepaid() {

    }

    @Override
    public void save() {
        System.out.println("可以存钱");

    }
}
