class PovoIndigena{
    private String nome;
    private String localizacao;
    private int populacao;


    public PovoIndigena(){}
    public PovoIndigena(String novoNome, String novaLocalizacao, int novaPopulacao){
        this.nome = novoNome;
        this.localizacao = novaLocalizacao;
        this.populacao = novaPopulacao;
    }

    //get
    public String getNome() {
        return this.nome;
    }
    public String getLocalizacao() {
        return this.localizacao;
    }
    public int getPopulacao() {
        return this.populacao;
    }

    //set
    public void setNome(String nome){
        if (nome == null) {
            System.out.println("Erro: o nome não pode ser vazio.");
        }else{
            this.nome = nome;
        }
    }
    public void setPopulação(int populacao){
        if (populacao < 0) {
            System.out.println("Erro: a população não pode ser menor que zero.");
        }else{
            this.populacao = populacao;
        }
    }

    //Classificação da população
    public void classicacaoPopulacao(){
        if (populacao <= 10.000) {
            System.out.println(nome + " possui uma população pequena.");
        }else if (populacao <= 50.000) {
            System.out.println(nome + " possui uma população mediana.");
        }else{
            System.out.println(nome + " possui uma população grande.");
        }
    }

    //print
    public String toString(){
        return "Nome: "+ nome + "\nLocalização: " + localizacao + "\nPopulação: " + populacao;
    }
}


public class aula2003 {
    public static void main(String[] args) 
        
    {
        PovoIndigena tikuna = new PovoIndigena("Tikuna", "Amazonas", 74061);
        PovoIndigena kokama = new PovoIndigena("Kokama", "Pará", 64327);
        PovoIndigena makuxi = new PovoIndigena("Makuxi", "Roraima", 53446);

        System.out.println(tikuna);
        tikuna.classicacaoPopulacao();
        System.out.println();
        System.out.println(kokama);
        kokama.classicacaoPopulacao();
        System.out.println();
        System.out.println(makuxi);
        makuxi.classicacaoPopulacao();
        
    }
}

