public class AbelhaRainha extends Abelha implements SemCapacidades{
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
    @Override
    public void semCapacidades(){
        System.out.println(nome + ":");
        System.out.println("Nao possui capacidades especiais");
    }
}
