package test04;

public  abstract class Card {
    private String name;

    public Card() {
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  public  abstract   void  cardholder(Person p);
}
