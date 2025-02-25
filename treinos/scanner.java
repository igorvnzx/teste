package treinos;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tecla;
        double numero1, numero2;
        double S, M, D, SB;

        tecla = sc.nextInt();

        System.out.println("Digite dois numeros: ");

        if (tecla >= 1 && tecla <= 3) {
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();


            if (tecla == 1) {
                S = numero1 + numero2;
                System.out.println(S);
            } else if (tecla == 2) {
                M = numero1 * numero2;
                System.out.println(M);
            } else if (tecla == 3) {
                D = numero1 / numero2;
                System.out.println(D);
            }
            else if (tecla == 4) {
                SB = numero1 - numero2;
                System.out.println(SB);
            }
                else {
                    System.out.println("comando inexistente");
            }

        }
    }
}