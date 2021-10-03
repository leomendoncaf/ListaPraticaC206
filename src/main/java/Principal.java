public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Leonardo",1080354069,2);
        Endereco e1 = new Endereco("Rua Professor Samuel Bruce","Inatel",20);
        Endereco e2 = new Endereco("Rua Regis Salles de Paula","Jardim Paraiso",31);

        p1.addEndereco(e1);
        p1.addEndereco(e2);
        p1.mostraInfo();



    }

}
