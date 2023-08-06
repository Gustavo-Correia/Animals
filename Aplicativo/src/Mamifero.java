public class Mamifero extends Animal {
    private String Alimento;

    public Mamifero(String nome, Double comprimento, int nmrdepastas, String cor,String ambiente, Double velomedia,String Alimento) {
        super(nome,comprimento,nmrdepastas,cor,ambiente,velomedia);
        this.Alimento = Alimento;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }

    
    public String ImprimirMamifero() {
            return "Nome:" + getNome() + "\n" +"Comprimento:"+ getComprimento() +" cm"+ "\n" + 
            "Patas:" + getNmrdepastas() + "\n" + "Cor:" + getCor() + "\n" + "Ambiente:" +
            getAmbiente() + "\n" + "Velocidade:" + getVelomedia() + "m/s \n" + "Alimento: " + this.Alimento;
    }

    
}
