public class AbelhaRainha extends Abelha{
    int quantidadeDeOvos;

    public AbelhaRainha(){
        this.consumoBasico = 20;
    }
    @Override
    public double consumoTotal() {
        return super.consumoTotal() + (quantidadeDeOvos * 0.01);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Quantidade de ovos: " + quantidadeDeOvos);
    }
}
