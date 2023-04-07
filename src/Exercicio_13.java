import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) throws Exception {
        
        int genero;
        
        double peso, pesoarrendodado;
        
        Scanner input ;

        input = new Scanner(System.in);

        System.out.println("Digite sua altura: ");

        double altura = input.nextDouble();

        System.out.println("Digite 1 se você for um homem ou digite 2 se você for uma mulher");

        genero = input.nextInt();

        input.close();

        switch (genero) {

            case 1:

                peso = (72.7 * altura) -58;

                pesoarrendodado = Math.ceil(peso * 100) / 100;

                System.out.print("Seu peso ideal é: " + pesoarrendodado);

                break;

            case 2:

                peso = (62.1 * altura) - 44.7;

                pesoarrendodado = Math.ceil(peso * 100) / 100;

                System.out.print("Seu peso ideal é: " + pesoarrendodado);

                break;
            
            default:

                System.out.print("Numéro inválido, reinicie o programa.");

        }

    }

}
