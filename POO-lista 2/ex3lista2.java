/******************************************************************************

Classe Semaforo

Imagine que você precisa modelar em Java o funcionamento de um semáforo de trânsito. 
Esse semáforo deve possuir dois atributos principais: um que representa a cor atual e outro que representa a duração em segundos. 
Esses atributos devem ser modificados apenas dentro da própria classe.
A cor do semáforo não pode ser qualquer valor arbitrário: ela deve ser validada para aceitar apenas três possibilidades — vermelho, amarelo ou verde. 
Da mesma forma, a duração não pode assumir valores negativos, e qualquer tentativa de atribuir um número menor que zero deve ser rejeitada e 
uma mensagem de erro deve ser exibida.

A classe deve oferecer diferentes formas de inicialização. Um construtor vazio deve permitir criar um semáforo sem valores, enquanto um construtor sobrecarregado
deve receber os dois atributos e aplicar as validações necessárias antes de atribuí-los. 

Além disso, devem existir métodos de acesso (getters e setters) que respeitem essas regras de validação.
O comportamento do semáforo também precisa ser representado por métodos específicos: 
Um método capaz de alterar a cor, verificando se o novo valor é permitido; 
métodos booleanos que indiquem se a cor atual é vermelha, amarela ou verde; e 
um método que retorne uma mensagem textual descrevendo o estado completo do semáforo, incluindo a cor e a duração configurada.

No programa principal, o usuário deve ser capaz de informar valores de cor e duração por meio da classe Scanner.
O sistema deve instanciar 2 objetos da classe Semaforo, um com o construtor vazio e preenchido pelo usuario, e outro com o construtor sobrecarregado.
Após isso, deverá realizar os seguintes testes:

    Primeiro Objeto:
    *Criado Vazio.
    *Inserir cor: "azul"  (Testando a validação do construtor).
    *Atualizando cor: "verde".
    *Inserindo duração: -5 (Testando a validação do construtor)
    *Inserindo duração: 10
    *Executar método que pergunte se a cor é vermelho.
    *Executar método que retorne mensagem textual com o estado do semáforo.
    * 

    Segundo Objeto:
    * Criado a partir do construtor com os parâmentros (amarelo, 15).
    * Exibir em tela a cor armazenada.
    * Atualizar cor: "violeta".
    * Atualzar duração para 20.
    * Executar método que pergunte se a cor é "amarelo".
    * Executar método que retorne mensagem textual com o estado do semáforo.

*******************************************************************************/
import java.util.Scanner;
class Semaforo{
    private String cor;
    private int duracao;

    public Semaforo(){}
    //construtor com parametros
    public Semaforo(String cor, int duracao){
        setCor(cor);
        setDuracao(duracao);
    }

    //validção da cor
    private boolean corValida(String cor) {
        return cor.equalsIgnoreCase("vermelho") ||
               cor.equalsIgnoreCase("amarelo") ||
               cor.equalsIgnoreCase("verde");
    }

    //set get cor
    public void setCor(String cor) {
        if (corValida(cor)) {
            this.cor = cor.toLowerCase();
        } else {
            System.out.println("Cor inválida! Use: vermelho, amarelo ou verde.");
        }
    }
    public String getCor() {
        return cor;
    }

    //set get duração
    public void setDuracao(int duracao) {
        if (duracao >= 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválida! Não pode ser negativa.");
        }
    }
    public int getDuracao() {
        return duracao;
    }

    //booleano
    public boolean isVermelho() {
        return "vermelho".equals(cor);
    }

    public boolean isAmarelo() {
        return "amarelo".equals(cor);
    }

    public boolean isVerde() {
        return "verde".equals(cor);
    }
    //estado do semafro
    public String mostrarEstado() {
        return "Semáforo na cor " + cor + " com duração de " + duracao + " segundos.";
    }
}
public class ex3lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //primeiro objeto
        Semaforo semaforo1 = new Semaforo();

        System.out.println("\n--- Primeiro Semáforo ---");

        System.out.print("Inserir cor (teste inválido): ");
        semaforo1.setCor("azul");

        System.out.print("Atualizando cor: ");
        semaforo1.setCor("verde");

        System.out.print("Inserindo duração inválida: ");
        semaforo1.setDuracao(-5);

        System.out.print("Inserindo duração válida: ");
        semaforo1.setDuracao(10);

        System.out.println("É vermelho? " + semaforo1.isVermelho());
        System.out.println(semaforo1.mostrarEstado());

        //segundo objeto
        Semaforo semaforo2 = new Semaforo("amarelo", 15);
        System.out.println("\n--- Segundo Semáforo ---");

        System.out.println("Cor atual: " + semaforo2.getCor());

        System.out.print("Atualizando cor inválida: ");
        semaforo2.setCor("violeta");

        System.out.print("Atualizando duração: ");
        semaforo2.setDuracao(20);

        System.out.println("É amarelo? " + semaforo2.isAmarelo());
        System.out.println(semaforo2.mostrarEstado());

        scan.close();
    }
}
