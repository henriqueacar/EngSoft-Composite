public class Desenho {
    private FormaGeometrica desenho;

    public Desenho (FormaGeometrica fg) {
        this.desenho = fg;
    }

    public int getDesenho() {
        return desenho.getNumLados();
    }

    public void setDesenho(FormaGeometrica desenho) {
        this.desenho = desenho;
    }
}
