package Ejercicio1.Main;

import Ejercicio1.Clases.FaceToFaceWorker;
import Ejercicio1.Clases.OnlineWorker;
import Ejercicio1.Clases.Worker;

public class Main {
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
    }
}