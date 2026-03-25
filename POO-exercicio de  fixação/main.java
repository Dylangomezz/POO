class Funcinario{
    String nome;
    String departamento;
    double salario;
    String dataInicio;
    String rg;
    //metodo aumento
    void recebeAumento(double aumento){
        this.salario = salario + aumento;
    }
    //metodo ganho anual
    double ganhoAnual(){
        return salario*12;
    }
    //metodo mostra de dados dos funcionarios
    void mostrarDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Departamento: "+ this.departamento);
        System.out.println("Salário: "+ this.salario);
        System.out.println("Data de ínicio: "+ this.dataInicio);
        System.out.println("Rg: "+ this.rg);
        
    }
    //metodo 4
    boolean ganhaMais(double aumento){
        return salario > aumento;
    }
    
}

public class main {
    public static void main(String[] args) {
        //funcionarios
        Funcinario joao = new Funcinario();
        joao.nome = "João Alves";
        joao.departamento = "Financeiro";
        joao.salario = 5000;
        joao.dataInicio = "01/01/2020";
        joao.rg = "1223330";

        Funcinario maria = new Funcinario();
        maria.nome ="Maria Baderna";
        maria.departamento ="Artístico";
        maria.salario= 8000;
        maria.dataInicio="05/07/1828";
        maria.rg="9998887";     

        //Aumento
        joao.recebeAumento(500);
        maria.recebeAumento(600);

        //joao
        System.out.println("Quantidades de caracteres do nome de João: "+ joao.nome.length());
        
        joao.mostrarDados();
       
        System.out.println("João recebe anualmente: R$"+ joao.ganhoAnual());
        
        if (joao.ganhaMais(5500)) {
            System.out.println("João ganha mais que 5500 R$");
        }else{
            System.out.println("João não recebe mais que 5500 R$.");
        }
        
        //Maria
        System.out.println("Quantidade de caracteres do nome de Maria: "+ maria.nome.length());
        maria.mostrarDados();
        System.out.println("Maria recebe anualmente: R$"+ maria.ganhoAnual());
        if (maria.ganhaMais(joao.salario)) {
            System.out.println("Maria ganha mais que João.");
        }else{
            System.out.println("Maria ganha menos que João.");
        }

    }
}