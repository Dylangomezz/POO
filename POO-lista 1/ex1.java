import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= 5; i++){          
                System.out.print("Digite um número "+ i + " : "  );
                double numeros = scan.nextDouble();
                soma += numeros;

                if (i == 1) {
                    maior = numeros;
                    menor = numeros;
                }else{
                    if (numeros > maior) {
                        maior = numeros;
                    }else if (numeros < menor) {
                        menor = numeros;
                    }
                }
        }
        double media = soma/5;
        System.out.println("A média é: "+ media);
        System.out.println("Maior número: "+ maior);
        System.out.println("Menor número: "+ menor);

        scan.close();
    }
}