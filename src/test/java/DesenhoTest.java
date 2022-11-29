import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenhoTest {

    @Test
    void deveRetornarTriangulo(){
        Triangulo tri = new Triangulo();
        Poligono poligono = new Poligono(tri.getNumLados(), tri);

        Desenho desenho = new Desenho(poligono);

        assertEquals(3, desenho.getDesenho());
    }

    @Test
    void deveRetornarQuadrado(){
        Quadrado quad = new Quadrado();
        Poligono poligono = new Poligono(quad.getNumLados(), quad);

        Desenho desenho = new Desenho(poligono);

        assertEquals(4, desenho.getDesenho());
    }

}