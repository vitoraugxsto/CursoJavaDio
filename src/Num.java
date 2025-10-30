import java.util.Scanner;


public class Num {
    static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite um numero maior que o primeiro");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite p para Par e i para Impar");
        String escolha = scanner.next();

            switch (escolha) {
                case "p" -> {
                    int contadorDois = segundoNumero;
                    while (contadorDois >= primeiroNumero) {
                        if (contadorDois % 2 ==0){
                            System.out.println(contadorDois);
                        }
                        contadorDois--;
                    }
                }
                    case "i" -> {
                        int contadorTres = segundoNumero;
                        while (contadorTres >= primeiroNumero) {

                            if (contadorTres % 2 != 0){
                                System.out.println(contadorTres);
                            }
                            contadorTres--;
                        }
                    }
                default -> System.out.println("Opção inválida");
            }
    }
}
