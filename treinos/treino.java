package treinos;

import java.util.Scanner;
public class treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time;
        System.out.println("Nome do time");
        time = sc.next();
        System.out.println("Colocaçao do seu time");
        int posicao;
        posicao = sc.nextInt();
        if (posicao == 1 ){
            System.out.println("Campeao");}
        if (posicao <= 4){
            System.out.println("Classificado libertadores");
        }
        else if (posicao == 5 && posicao == 6){
            System.out.println("Libertadores qualificaçao");
        }
        else if (posicao == 7 || posicao <= 12){
            System.out.println("Classificado Sulamericana");
        }
        else if (posicao == 13 || posicao <= 16){
            System.out.println("Sem classificaçao");
        }
        else {
            System.out.println("Rebaixamento");
        }


    }
}
