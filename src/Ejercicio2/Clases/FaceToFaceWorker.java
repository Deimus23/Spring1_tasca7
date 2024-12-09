package Ejercicio2.Clases;

public class FaceToFaceWorker extends Worker {
    private int oilWaste;

    public FaceToFaceWorker(String name, String surname, int pricePerHour, int oilWaste) {
        super(name, surname, pricePerHour);
        this.oilWaste=oilWaste;
    }
    @Override
    public int salary(int hoursWorked) {
        int baseSalary = super.salary(hoursWorked);
        return baseSalary+oilWaste;
    }
    @Deprecated
    public int salaryOld(int hoursWorked) {
        int baseSalary = super.salaryOld(hoursWorked);
        return baseSalary;
    }
}
