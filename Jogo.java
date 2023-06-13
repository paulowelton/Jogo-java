import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("--------------------------------------");
        System.out.println("JOGO DA ADIVINHAÇÃO ESCOLHA O NIVEL: \n 1-FACIL\n 2-MEDIO\n 3-DIFICIL\n 4-IMPOSSIVEL");
        System.out.println("--------------------------------------");
        int resposta;
        resposta = scan.nextInt();
        if(resposta == 1){
            System.out.println("NIVEL FACIL");
            int ale = aleatorio.nextInt(10);
            int res =0;
            while (res != ale) {
                System.out.println("Digite um número: ");
                res = scan.nextInt();
                
                if (res == ale) {
                    System.out.println("Parabéns, você acertou!");
                } else if (res > ale) {
                    System.out.println("Falta menos.");
                } else {
                    System.out.println("Falta mais.");
                }
            }
            }
        if(resposta == 2){
            System.out.println("NIVEL MEDIO");
            int ale = aleatorio.nextInt(50);
            int res =0;
            while (res != ale) {
                System.out.println("Digite um número: ");
                res = scan.nextInt();
                
                if (res == ale) {
                    System.out.println("Parabéns, você acertou!");
                } else if (res > ale) {
                    System.out.println("Falta menos.");
                } else {
                    System.out.println("Falta mais.");
                }
            }
        }    
            if(resposta == 3){
                System.out.println("DIVEL DIFICIL");
                int ale = aleatorio.nextInt(100);
                int res =0;
                while (res != ale) {
                    System.out.println("Digite um número: ");
                    res = scan.nextInt();
                    
                    if (res == ale) {
                        System.out.println("Parabéns, você acertou!");
                    } else if (res > ale) {
                        System.out.println("Falta menos.");
                    } else {
                        System.out.println("Falta mais.");
                    }
                }
            }
        if(resposta == 4){
            System.out.println("NIVEL IMPOSSIVEL");
            int ale = aleatorio.nextInt(1000000000);
            int res =0;
            while (res != ale) {
                System.out.println("Digite um número: ");
                res = scan.nextInt();
                
                if (res == ale) {
                    System.out.println("Parabéns, você acertou!");
                } else if (res > ale) {
                    System.out.println("Falta menos.");
                } else {
                    System.out.println("Falta mais.");
                }
            }
        }        
        }
    }    


