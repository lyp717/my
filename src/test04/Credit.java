package test04;

public interface Credit {

    void prepaid();

    public default void save(){

        System.out.println("可以存钱");
    }
}
