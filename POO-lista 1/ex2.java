import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 3; i++){
            System.out.print("Digite o " + i + "º ano: ");
            int ano = scan.nextInt();

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("O ano " + ano + " é bissexto.\n");
            }else{
                System.out.println("O ano " + ano + " não é bissexto.\n");
            }
        }
        scan.close();
    }
}