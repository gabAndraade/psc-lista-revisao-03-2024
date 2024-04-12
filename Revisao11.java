import java.util.Scanner;
import java.util.Random;

public class Revisao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroEscolhido = random.nextInt(100)+1;
        int chute = 0;
        int tentativas = 0;
        System.out.println("Jogo de adivinhação! Tente adivinhar um número entre 1 e 100.");
        while (chute!=numeroEscolhido) {
            System.out.println("Digite seu chute: ");
            chute = scanner.nextInt();
            tentativas++;
            if (chute<numeroEscolhido) {
                System.out.println("Errou! Tente um número maior.");               
            }else if(chute>numeroEscolhido){
                System.out.println("Errou! Tente um número menor.");
            }else{
                System.out.println("Parabéns!!! Você conseguiu acertar o número "+numeroEscolhido+" em "+tentativas+" tentativas");
            }
        }
        scanner.close();
    }    
}
