package test03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Computer cp1 = new Computer("DELL",6799,"一体机)");
        Computer cp2 = new Computer("MacAir", 7488,"颜值担当");
        Computer cp3 = new Computer("MIAir",4288,"轻薄笔记本");
        ArrayList<Computer> list = new ArrayList<>();

        list.add(cp1);
        list.add(cp2);
        list.add(cp3);
        ArrayList<Computer> list_=    filter(list, "Air");



    }
    public static ArrayList<Computer> filter(ArrayList<Computer> list, String str) {


        for (int i = 0; i < list.size(); i++) {
           Computer   c  =list.get(i);
           if(c.getName().contains(str)){

              System.out.println(c.getName()+"\t"+c.getPrice()+"\t"+c.getType());
           }
        }

        return list;
    }
}
