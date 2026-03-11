import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        do{
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero < 0 ) {
                System.out.println("Número inválido! Digite apenas 0 ou positivo.");
            }
        }while(numero<0);    
        

        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de "+ numero +" é: "+ fatorial);
        scan.close();
    }    
}