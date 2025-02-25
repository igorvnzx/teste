package treinos;

import java.io.PrintStream;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite um numero:");
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int D = sc.nextInt();

       int diferenca;
       diferenca = (A * B - C * D);
       System.out.println("A diferença é: " + diferenca);




        //Scanner sc = new Scanner(System.in);
       // System.out.println("Digite o nome do funciomário: ");//
       // String funcionario;
        //funcionario = sc.next();//

       // System.out.println("Digite o valor recebido por hora: ");//
       // double valor;//
     //   valor = sc.nextDouble();

      //  System.out.println("Digite quantas horas por dia trabalhadas: ");//
     //   int hora;
    //    hora = sc.nextInt();//

     //   double salario;//
       // salario = valor * hora * 22;//

      //  System.out.println("O salário mensal de " + funcionario + "é de: " + salario);//



       // double area; //
    //    double pi;//
        //double raio;//
      // pi = 3.14;//
        //raio = 4;//
       // area = pi * Math.pow(raio, 2);//

        //System.out.println("o valor da area é: " + area);


        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        if (codigo == 1) {
           total = quantidade * 4.00; }
       else if (codigo == 2){
            total = quantidade * 4.5; }
       else if (codigo == 3){
           total = quantidade * 5; }
       else if (codigo == 4){
           total = quantidade * 2; }
       else if (codigo == 5){
           total = quantidade * 1.5;}
       else{
           total = quantidade *1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

       sc.close();
    }
    }
