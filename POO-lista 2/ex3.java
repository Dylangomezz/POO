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
public class ex3 {
    
}
