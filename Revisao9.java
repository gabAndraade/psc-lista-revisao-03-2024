import java.util.Scanner;
public class Revisao9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double numero;   
    System.out.println("Digite o número: ");
        numero = scanner.nextDouble();
        for(int i = 1;i<=10;i++){
            double result = numero*i;
            System.out.println(numero + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
