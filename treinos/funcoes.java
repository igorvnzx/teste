package treinos;

import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //double x = sc.nextDouble();
        //double y = sc.nextDouble();

        //if (x > 0 && y < 0){
              //  System.out.println("Q4");}
        //else if (x < 0 && y > 0){
            //System.out.println("Q2"); }
        //else if (x < 0 && y < 0){
            //System.out.println("Q3");}
        //else if (x > 0 && y > 0){
            //System.out.println("Q1");}
        //else if (x == 0 && y == 0){
           // System.out.println("Origem");}




        double n1 = sc.nextDouble();

        String i1 = "(0,25]" ;
        String i2 = "(25, 50]";
        String i3 = "(50, 75]";
        String i4 = "(75, 100]";

        if (n1 > 0 && n1 <= 25){
            System.out.printf("Intervalo %s",i1 ); }

        else if (n1 > 25 && n1 <= 50){
            System.out.printf("Intervalo %s", i2); }
        else if (n1 > 50 && n1 <=75){
            System.out.printf("Intervalo %s", i3); }
        else if (n1 > 75 && n1 <= 100){
            System.out.printf("Intervalo %s", i4); }
        else {
            System.out.println("Está fora de intervalo");}

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0 ){
            soma += x;
            x = sc.nextInt(); }

        System.out.println(soma);


    }
}

