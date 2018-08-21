package test05;

public class Plan {

    private String ready;
    private String exercise;

    public Plan() {
    }

    public Plan(String ready, String exercise) {
        this.ready = ready;
        this.exercise = exercise;
    }

    public String getReady() {
        return ready;
    }

    public void setReady(String ready) {
        this.ready = ready;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }
    public void printPlan(){

        System.out.println("热身"+getReady()+"锻炼"+getExercise());
    }
}
