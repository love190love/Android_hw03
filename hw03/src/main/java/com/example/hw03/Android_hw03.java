package com.example.hw03;

public class Android_hw03 {
     public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("體重(公斤):");
        double inp1=scanner.nextInt();

        System.out.println("身高(公分):");
        double inp2=scanner.nextInt();

        double Hei=inp2/100;
        double BMI=inp1/(Hei*Hei);

        System.out.println("你 的 BMI 值 : "+BMI);
    }
}
