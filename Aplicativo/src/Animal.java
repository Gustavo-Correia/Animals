public class Animal {
    private String nome;
    private Double comprimento;
    private int nmrdepastas;
    private String cor;
    private String ambiente;
    private Double velomedia;
    
    public Animal() {
        
    }

    public Animal(String nome, Double comprimento, int nmrdepastas, String cor, String ambiente, Double velomedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.nmrdepastas = nmrdepastas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velomedia = velomedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNmrdepastas() {
        return nmrdepastas;
    }

    public void setNmrdepastas(int nmrdepastas) {
        this.nmrdepastas = nmrdepastas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelomedia() {
        return velomedia;
    }

    public void setVelomedia(Double velomedia) {
        this.velomedia = velomedia;
    }

    @Override
    public String toString(){
        return "Nome:" + this.nome + "\n" +"Comprimento:"+ this.comprimento + "\n" + 
        "Patas:" + this.nmrdepastas + "\n" + "Cor:" + this.cor + "\n" + "Ambiente:" +
        this.ambiente + "\n" + "Velocidade:" + this.velomedia + "m/s \n";  
    }
}
