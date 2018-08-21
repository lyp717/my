package test05;

public class Test {
    public static void main(String[] args) {

        Person per = new Person("张三",25);
        per.startExercise(new Fitness() {
            @Override
            public void fitnessPlan(Plan p) {
                p.printPlan();
            }
        });
        Plan p = new Plan();

        p.printPlan();

    }
}
