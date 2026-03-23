import java.util.Scanner;
class Conversor{

    public static double celsiusPfahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitPcelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static double celsiusPkelvin(double celsius){
        return celsius + 273.15;
    }
    public static double kelvinPcelsius(double kelvin){
        return kelvin - 273.15;
    }
}

public class aula1303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n    MENU DE CONVERSÃO   ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.print("Escolha uma opção: ");

        int opcao = scan.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();


        switch(opcao) {
            case 1:
                System.out.println("Resultado: " + Conversor.celsiusPfahrenheit(valor));
                break;
            case 2:
                System.out.println("Resultado: " + Conversor.fahrenheitPcelsius(valor));
                break;
            case 3:
                System.out.println("Resultado: " + Conversor.celsiusPkelvin(valor));
                break;
            case 4:
                System.out.println("Resultado: " + Conversor.kelvinPcelsius(valor));
                break;
            default:
                System.out.println("Opção inválida!");
        }
        scan.close();
    }
}
/*
EXEMPLOS DE TESTE:

Opção: 1
Valor: 0
Saída: Resultado: 32.0

Opção: 2
Valor: 32
Saída: Resultado: 0.0

Opção: 3
Valor: 25
Saída: Resultado: 298.15

Opção: 4
Valor: 300
Saída: Resultado: 26.85
*/
