package treinos;

import java.util.Scanner;

public class desafiolucon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aluno;
        System.out.println("Nome do aluno: ");
        aluno = sc.next();
        System.out.println("Digite suas notas:");

        double nota1, nota2, nota3, nota4;
        double media;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media > 6.5 && media < 7) {
            media = 7; }

        if (media >= 7) {
            System.out.println("Você foi aprovado :) ");}

        else if (media < 7 && media > 5) {
            System.out.println("Você vai para recuperação"); }

        else if (media < 5 && media > 3){
            System.out.println("Aluno vai para final");}

        else {
            System.out.println("REPROVADO VAGABUNDO");}

        System.out.println(" A média é de: " + media);


    }
}


