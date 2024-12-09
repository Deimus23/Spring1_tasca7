package Ejercicio2.Main;

import Ejercicio2.Clases.FaceToFaceWorker;
import Ejercicio2.Clases.OnlineWorker;
import Ejercicio2.Clases.Worker;

public class Main {

   @SuppressWarnings("deprecation")
    public static void main(String[] args) {
       Worker worker= new Worker("Antonio","Carrasco",14);
       OnlineWorker onlineWorker= new OnlineWorker("Angel","Pelaez",14,25);
       FaceToFaceWorker faceToFaceWorker=new FaceToFaceWorker("Jofre","Coca",14,50);

       int wSalary= worker.salary(5);
       int oSalary=onlineWorker.salary(5);
       int fSalary=faceToFaceWorker.salary(5);

       System.out.println(wSalary);
       System.out.println(oSalary);
       System.out.println(fSalary);

       int salaryOld = worker.salaryOld(40);
       System.out.println("Salari calculat amb mètode obsolet: " + salaryOld);
       int salaryOld2 = onlineWorker.salaryOld(40);
       System.out.println("Salari calculat amb mètode obsolet: " + salaryOld2);
       int salaryOld3 = faceToFaceWorker.salaryOld(40);
       System.out.println("Salari calculat amb mètode obsolet: " + salaryOld3);
    }
}