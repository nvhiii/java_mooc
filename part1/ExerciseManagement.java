import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<String> em;
    private ArrayList<String> completedExercises;

    public ExerciseManagement() {
        this.em = new ArrayList<>();
        this.completedExercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        return this.em;
    }

    public void add(String x) {
        this.em.add(x);
    }

    public void markAsCompleted(String exercise) {
        this.completedExercises.add(exercise);
    }

    public boolean isCompleted(String exercise) {
        return this.completedExercises.contains(exercise);
    }

}
