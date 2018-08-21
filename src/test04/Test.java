package test04;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三");
        ICBC i = new ICBC("张三");

    //    i.cardholder(  );
        i.prepaid();
        i.save();
    }
}
