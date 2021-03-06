package test03;

public class Computer {
 /*   名称name（String类型）

    价格price（ double类型）

    类型type（String类型）*/

    private String name;
    private double price;
    private String type;

    public Computer() {
    }

    public Computer(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}