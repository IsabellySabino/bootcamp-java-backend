public class Petshop1_0 {

    private String nome;

    private boolean clean;

    public Petshop1_0(String nome) {
        this.nome = nome;
        this.clean = false;
    }

    public Petshop1_0() {}

    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
