public class Teacher extends Person {

    private int monthlySalary;

    public Teacher(String name, String addy, int monthlySalary) {

        super(name, addy);
        this.monthlySalary = monthlySalary;

    }

    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    @Override
    public String toString() {

        return super.toString() + "\n  salary " + getMonthlySalary() + " euro/month";

    }
    
}
