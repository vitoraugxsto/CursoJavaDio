import java.util.Scanner;

public class Class {

    static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu peso?");
        double peso = scanner.nextDouble();
        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();

        double imc = peso/(altura * altura);

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }
          else if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }
            else if (imc >= 25.0 && imc <=29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }
        else if(imc >= 35.0 && imc <= 39.0) {
            System.out.println("Obesidade grau II");
        }
        else if (imc <= 40.0){
             System.out.println("Obesidade grau III (Mórbida)");
        }

    }

}
