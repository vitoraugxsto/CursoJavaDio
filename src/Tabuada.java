import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int contador = 1;
            
        while(contador < 10){
            contador++;
            System.out.println(numero * contador);
        }


    }
}