import java.util.ArrayList;
import java.util.List;

public class Poligono extends FormaGeometrica{

    private FormaGeometrica poligonos;

    public Poligono(int numLados, FormaGeometrica fg){
        super(numLados);
        this.poligonos = fg;
    }

    public int getNumLados(){
        return this.getLados();
    }

}
