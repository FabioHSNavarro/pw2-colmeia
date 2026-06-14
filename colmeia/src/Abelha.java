public abstract class Abelha {
    protected String nome;
    protected int idade;
    protected String funcao;
    protected int consumoBasico;

    public double consumoTotal(){
        return this.consumoBasico;
    }
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade em dias: " + idade);
        System.out.println("Funcao: " + funcao);
        System.out.println("Consumo Basico: " + consumoBasico);
        System.out.println("Consumo Total: " + consumoTotal());
    }

}
