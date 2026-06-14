public class AbelhaZangao extends Abelha{
    int quantidadeDeVoo;

    public AbelhaZangao(){
        this.consumoBasico = 15;
    }

    @Override
    public double consumoTotal() {
        return super.consumoTotal() + (quantidadeDeVoo * 3);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Quantidade de voos: " + quantidadeDeVoo);
    }
}