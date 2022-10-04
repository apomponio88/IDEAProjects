package WeightCalculatorPackage;

public class GainsCalculator {

  private String typeOfExercise;
  private int numberOfReps;
  private int numberOfSets;



    public void chestDaySetup(String typeOfExercise, int numberOfReps, int numberOfSets) {
        this.typeOfExercise = typeOfExercise;
        this.numberOfReps = numberOfReps;
        this.numberOfSets = numberOfSets;
    }

    public String getTypeOfExercise() {
        return typeOfExercise;
    }

    public void setTypeOfExercise(String typeOfExercise) {
        this.typeOfExercise = typeOfExercise;
    }

    public int getNumberOfReps() {

        return numberOfReps;
    }

    public void setNumberOfReps(int numberOfReps) {
        this.numberOfReps = numberOfReps;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }







}
