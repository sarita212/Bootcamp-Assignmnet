package com.trainning.sarita.bootcamp.assignment1;

public class HimaSalary {
    public static void main(String[] args) {
        int basicSalary = 85000;
        float ta = (15*85000/100);
        float Da = (20*85000/100);
        float hra = (18*85000/100);
        float pf = (20*85000/100);
        float tax= (25*85000/100);

        float grossAmount = (basicSalary+ta+Da+hra);
        float netAmount = (grossAmount-(pf+tax));

        System.out.println("The GrossAmount is: " +grossAmount);
        System.out.println("The NetAmount is: "+netAmount);
    }
}
