public class AbelhaOperaria extends Abelha implements ColetarRecursos, DefenderColmeia{
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
    @Override
    public void coletarRecursos(){
        System.out.println(nome + ":");
        System.out.println("Coletando Recursos");
    }
    @Override
    public void defenderColmeia(){
        System.out.println(nome + ":");
        System.out.println("Defendendo colmeia");
    }
}
