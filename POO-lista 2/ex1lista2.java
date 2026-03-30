/*
Classe Identificador

Desenvolva em Java um programa capaz de reconhecer diferentes tipos de dados informados pelo usuário. 
O sistema deve receber três entradas distintas: um texto, um número inteiro e um número decimal. Para cada valor digitado,
o programa deve ser capaz de identificar o tipo correspondente e exibir uma mensagem clara que descreva tanto o conteúdo quanto sua categoria.

Para isso, crie uma classe chamada Identificador. 
Essa classe deve conter métodos sobrecarregados chamados mostrarDado, cada um recebendo um parâmetro de tipo diferente (texto, número inteiro e número decimal). 
Cada versão do método deve retornar uma mensagem textual que informe o valor digitado e o tipo de dado reconhecido.

Na classe principal (Main), utilize a classe Scanner para solicitar ao usuário os três valores. 
Em seguida, invoque os respectivos métodos da classe Identificador e exiba os resultados no console.
Cada método deve imprimir uma mensagem clara, por exemplo:

"Você digitou o texto 'Olá Mundo', que é do tipo String."
"Você digitou o número inteiro 25, que é do tipo int."
"Você digitou o número decimal 8.75, que é do tipo double."


*/
import java.util.Scanner;
class Identificador{
    public String mostarDados(String texto){
        return "Você digitou o texto '" + texto + "', que é do tipo String.";
    }
    public String mostrarDados(int numInteiro){
        return "Você digitou o número inteiro "+ numInteiro +", que é do tipo int.";
    }
    public String mostrarDados(double numDecimal){
        return "Você digitou o número decimal " + numDecimal + ", que é do tipo double.";
    }
}

public class ex1lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Identificador identificador = new Identificador();

        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();
        System.out.print("Digite o número inteiro: ");
        int numInteiro = scan.nextInt();
        System.out.print("Digite o número decimal: ");
        double numDecimal = scan.nextDouble();

        System.out.println(identificador.mostarDados(texto));
        System.out.println(identificador.mostrarDados(numInteiro));
        System.out.println(identificador.mostrarDados(numDecimal));

        scan.close();
    }
}
