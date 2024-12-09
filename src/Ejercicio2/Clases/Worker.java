package Ejercicio2.Clases;

public class Worker {
    private String name;
    private String surname;
    private int pricePerHour;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Worker(String name, String surname, int pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public int  salary(int hoursWorked){
        int baseSalary=pricePerHour*hoursWorked;
        System.out.println("The worker have to claim : "+baseSalary+" $");
        return baseSalary;
    }
    @Deprecated
    public int salaryOld(int hoursWorked) {
        return pricePerHour*hoursWorked ;
    }

}
