public class Pessoa {

    public String nome;
    public int cpf;
    public int qtdEnd;

    Endereco[] enderecos = new Endereco[5];

    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;
    }

    public int i = 0;
    public void addEndereco(Endereco end) {

        if(i < qtdEnd){
            enderecos[i] = end;
            i++;
        }else{
            System.out.println("Não foi possível adicionar mais endereços");
        }

    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("------------");
        System.out.println("Endereços: ");
        for(int i = 0; i< qtdEnd; i++) {
            if (enderecos[i] != null) {
                System.out.println(enderecos[i].rua);
                System.out.println(enderecos[i].bairro);
                System.out.println(enderecos[i].num);
                System.out.println(" ");
            }
        }





    }
}
