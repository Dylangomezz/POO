import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número relativo ao mês (1-12): ");
        int mes = scan.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Estação Verão.");   
                
                break;
        
            case 3:
            case 4:
            case 5:
                System.out.println("Estação Outono.");    
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estação Inverno.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Estação Primavera.");
                break;
            default:
                System.out.println("Mês inválido!");
        }
        scan.close();
    }
}