/******************************************************************************

 Classe Aluno 


Implemente em Java um programa que simule a avaliação de um estudante. 
O programa deve possuir uma classe chamada Aluno, que conterá quatro atributos privados para armazenar as notas. 
Essa classe deve oferecer um método para leitura de cada nota, garantindo que o valor esteja entre 0 e 10, 
além de comparar cada nova nota com a anterior e informando se foi maior, menor ou igual. 

Além disso, a classe deve possuir um método para calcular a média das quatro notas e outro para exibir se o aluno foi aprovado ou reprovado,
considerando a média mínima de 6. 

A classe principal (Main) deve instanciar um objeto Aluno, solicitar as notas ao usuário por meio da classe Scanner e,
ao final, mostrar o resultado da avaliação.


*******************************************************************************/
import java.util.Scanner;
class Aluno{
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double lerNotaValida(Scanner scan) {
        double nota;
        while (true) {
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.print("Nota inválida! Digite novamente (0 a 10): ");
            }
        }
    }
    

    public void lerNotas(Scanner scan) {
    System.out.print("Digite a primeira nota: ");
    nota1 = lerNotaValida(scan);

    System.out.print("Digite a segunda nota: ");
    nota2 = lerNotaValida(scan);
    compararNotas(nota2, nota1);

    System.out.print("Digite a terceira nota: ");
    nota3 = lerNotaValida(scan);
    compararNotas(nota3, nota2);

    System.out.print("Digite a quarta nota: ");
    nota4 = lerNotaValida(scan);
    compararNotas(nota4, nota3);
    }


    private void compararNotas(double atual, double anterior) {
        if (atual > anterior) {
            System.out.println("A nota é maior que a anterior.");
        } else if (atual < anterior) {
            System.out.println("A nota é menor que a anterior.");
        } else {
            System.out.println("A nota é igual à anterior.");
        }
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public void verificarSituacao(){
        double media = calcularMedia();
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado.");
        }
    }

}
public class ex2lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.lerNotas(scan);
        aluno.verificarSituacao();

        scan.close();
    }
}
