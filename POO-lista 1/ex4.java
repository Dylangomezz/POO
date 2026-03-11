import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Digite um número de 3 digitos: ");
            numero = scan.nextInt();

            if (numero >= 100 && numero <= 999) {
                break;
            }
            else{
                System.out.println("Valor inválido. Digite um número com 3 dígitos.");
            }
        }
        int centena = numero/100;
        int dezena = (numero % 100)/10;
        int unidade = numero % 10;

        int soma = centena + dezena + unidade;
        System.out.println("A soma dos algorismos inseridos é: "+ soma);
        scan.close();
    }
}