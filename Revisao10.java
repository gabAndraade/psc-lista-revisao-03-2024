public class Revisao10 {
    public static void main(String[] args) {
        int numero;
        double soma = 0;
        for(numero = 2;numero<=100;numero+=2){
            System.out.println(numero);
            soma += numero;                       
        }
        System.out.println("A soma dos números pares de 1 a 100 é: "+soma);
    }
}
