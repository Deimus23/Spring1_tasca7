package Ejercicio2.Clases;

public class OnlineWorker extends Worker {
    private int internetExpense;
    public OnlineWorker(String name, String surname, int pricePerHour, int internetExpense) {
        super(name, surname, pricePerHour);
        this.internetExpense=internetExpense;
    }
    @Override
    public int salary(int hoursWorked) {
        int baseSalary = super.salary(hoursWorked);
        return baseSalary+internetExpense;
    }
    @Deprecated
    public int salaryOld(int hoursWorked) {
        int baseSalary = super.salaryOld(hoursWorked);
        return baseSalary;
    }
}


