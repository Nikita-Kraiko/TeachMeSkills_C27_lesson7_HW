package com.tms.lesson7_hw.task1.run;

import com.tms.lesson7_hw.task1.job.Accountant;
import com.tms.lesson7_hw.task1.job.Director;
import com.tms.lesson7_hw.task1.job.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();
        Director director = new Director();
        Accountant accountant = new Accountant();
        int x = 0;

        System.out.print("Enter job title: ");
        x = scanner.nextInt();
        scanner.close();

        switch (x){
            case 1:
                worker.output();
                break;
            case 2:
                accountant.output();
                break;
            case 3:
                director.output();
                break;
            default:
                System.out.println("Error ID");
                break;
        }










    }
}
