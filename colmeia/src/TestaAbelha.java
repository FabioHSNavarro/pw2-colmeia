public class TestaAbelha {
    public static void main(String[] args) {
        AbelhaOperaria abelha1 = new AbelhaOperaria();
        abelha1.nome = "Maya";
        abelha1.idade = 10;
        abelha1.funcao = "Coletar Nectar";
        abelha1.horaDeVoo = 3;
        abelha1.exibir();
        System.out.println("---------------------");

        AbelhaZangao abelha2 = new AbelhaZangao();
        abelha2.nome = "Marcelo";
        abelha2.idade = 20;
        abelha2.funcao = "Processo Reprodutivo";
        abelha2.quantidadeDeVoo = 4;
        abelha2.exibir();
        System.out.println("---------------------");

        AbelhaRainha abelha3 = new AbelhaRainha();
        abelha3.nome = "Jessica";
        abelha3.idade = 30;
        abelha3.funcao = "Reproducao da colonia";
        abelha3.quantidadeDeOvos = 100;
        abelha3.exibir();
        System.out.println("---------------------");

        double consumoTotalDia = abelha1.consumoTotal() + abelha2.consumoTotal() + abelha3.consumoTotal();
        System.out.println("Consumo total do dia: " + consumoTotalDia);
    }
}
