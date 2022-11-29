public abstract class FormaGeometrica {

    private int numLados;

    public FormaGeometrica(int numLados) {
        this.numLados = numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public int getLados(){
        return this.numLados;
    }

    public abstract int getNumLados();

}
