public class AbelhaOperaria extends Abelha{
    int horaDeVoo;

    public AbelhaOperaria(){
        this.consumoBasico = 10;
    }
    @Override
    public double consumoTotal() {
        return super.consumoTotal() + (horaDeVoo * 2);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Horas de voo: " + horaDeVoo);
    }
}
