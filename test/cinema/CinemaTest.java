package cinema;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filipi Vieira
 */
public class CinemaTest {
    
    public CinemaTest() {
    }

    /**
     * Test of getNome method, of class Cinema.
     */
    @Test
    public void testGetNome() {
        String nome = "Titanic";
        String diretor = "";
        String ano = "";
        String idioma = "";
        String genero = "";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.getNome();
        assertEquals("Titanic", res);
    }

    /**
     * Test of getDiretor method, of class Cinema.
     */
    @Test
    public void testGetDiretor() {
        String nome = "";
        String diretor = "Zack Snyder";
        String ano = "";
        String idioma = "";
        String genero = "";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.getDiretor();
        assertEquals("Zack Snyder", res);
    }

    /**
     * Test of getAno method, of class Cinema.
     */
    @Test
    public void testGetAno() {
        String nome = "";
        String diretor = "";
        String ano = "2020";
        String idioma = "";
        String genero = "";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.getAno();
        assertEquals("2020", res);
    }

    /**
     * Test of getIdioma method, of class Cinema.
     */
    @Test
    public void testGetIdioma() {
        String nome = "";
        String diretor = "";
        String ano = "";
        String idioma = "Legendado";
        String genero = "";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.getIdioma();
        assertEquals("Legendado", res);
    }

    /**
     * Test of getGenero method, of class Cinema.
     */
    @Test
    public void testGetGenero() {
        String nome = "";
        String diretor = "";
        String ano = "";
        String idioma = "";
        String genero = "Drama";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.getGenero();
        assertEquals("Drama", res);
    }
    /**
     * Test of toString method, of class Cinema.
     */
    @Test
    public void testToString() {
        String nome = "Liga da Justiça";
        String diretor = "Zack Snyder";
        String ano = "2017";
        String idioma = "Dublado";
        String genero = "Ação";
        Cinema t = new Cinema(nome, diretor, ano, idioma, genero);
        String res = t.toString();
        assertEquals("Liga da Justiça, Zack Snyder, 2017, Dublado, Ação", res);
    }
    
}
