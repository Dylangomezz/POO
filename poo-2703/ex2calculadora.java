/******************************************************************************

27032026 - Classe Calculadora (codigo base)

MENTE DE ALGORITMO

1) Crie a classe Calculadora:

2) Declare os atributos do objeto:
    Dois atributos privados numéricos que aceitem decimais.
    (Sintaxe: Visibilidade  Tipo  Nome; )
    
3) Declare os métodos da classe
    (Sintaxe: Visibilidade Categoria  TipoRetorno NomeMetodo(tipo nomeParametro))
    
    *Construtores: Vazio e sobrecarregado
    
    * Encapsulamento: getters/setters para todos os atributos
    
    * Operação:
        * somar 
        * subtrair 
        * multiplicar 
        * dividir 
        * resto 
    PS: Lembre-se de resolver a situação de divisões por valor zero. 
    Dica: Busquem formas de resolver isso dentro do método, levando em consideração
    o tipo de retorno do método, a classe String e seus métodos estáticos.
    
        
4) Na classe Main:
    *Criar um objeto da classe  Calculadora, passando os parametros (5,3) ao construtor.
    *Testar o método de operação "somar" e "dividir".
    *Implementar 
    

*******************************************************************************/
class Calculadora{
    //atributos
    private double n1;
    private double n2;
    //construtores
    public Calculadora(){}
    public Calculadora(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    //get set
    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN2(){
        return n2;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }
    //operações
    //soma
    public double somar(){
        return n1 + n2;
    }
    //subtração
    public double subtrair(){
        return n1 - n2;
    }
    //multiplicação 
    public double multiplicar(){
        return n1 * n2;
    }
    //subtração
    public String dividir(){
        if (n2 == 0) {
            return "Erro: divisão por zero";
        }
        // return    "" + (n1/n2);
        return String.valueOf(n1/n2);
    }
    //resto
    public double resto(){
        return n1 % n2;
    }
}

public class ex2calculadora {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora(5,3);
        System.out.println("Soma: " + cal.somar());
        System.out.println("Divisão: " + cal.dividir());
    }
}