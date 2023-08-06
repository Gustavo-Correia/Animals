public class Peixe extends Animal{
    private String Caracteristica;

    public Peixe(String nome, Double comprimento, int nmrdepastas, String cor,String ambiente, Double velomedia,String Caracteristica) {
        super(nome,comprimento,nmrdepastas,cor,ambiente,velomedia);
        this.Caracteristica = Caracteristica;
    }

    public String getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        Caracteristica = caracteristica;
    }

    
    public String ImprimirPeixe() {
        return "Nome:" + getNome() + "\n" +"Comprimento:"+ getComprimento() +"cm"+ "\n" + 
        "Patas:" + getNmrdepastas() + "\n" + "Cor:" + getCor() + "\n" + "Ambiente:" +
        getAmbiente() + "\n" + "Velocidade:" + getVelomedia() + "m/s \n" + "Caracteristica=" + this.Caracteristica;
    }
    
   

}
