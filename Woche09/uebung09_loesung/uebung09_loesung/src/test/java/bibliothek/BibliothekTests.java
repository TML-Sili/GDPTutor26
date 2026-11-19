package bibliothek;

import org.junit.Test;
import static org.junit.Assert.*;

public class BibliothekTests {

    @Test
    public void testVererbungUndBeschreibung() {
        Medium b = new Buch("Clean Code", 2008, "Robert C. Martin");
        Medium h = new Hoerbuch("Der Hobbit", 2012, 660);

        assertTrue(b instanceof Ausleihbar);
        assertTrue(h instanceof Ausleihbar);
        assertEquals("Buch: Clean Code (2008) von Robert C. Martin", b.getBeschreibung());
        assertEquals("Hörbuch: Der Hobbit (2012), 660 Min.", h.getBeschreibung());
    }

    @Test
    public void testAusleihenUndZurueckgeben() {
        Ausleihbar b = new Buch("Java", 2026, "Max Muster");
        assertFalse(b.istAusgeliehen());
        b.ausleihen();
        assertTrue(b.istAusgeliehen());
        b.zurueckgeben();
        assertFalse(b.istAusgeliehen());
    }

    @Test
    public void testEquals() {
        Buch b1 = new Buch("Dune", 1965, "Frank Herbert");
        Buch b2 = new Buch("Dune", 1965, "Frank Herbert");
        Buch b3 = new Buch("Dune", 1965, "Anderer Autor");
        Hoerbuch h1 = new Hoerbuch("Dune", 1965, 1260);
        Hoerbuch h2 = new Hoerbuch("Dune", 1965, 1260);
        Hoerbuch h3 = new Hoerbuch("Dune", 1965, 900);

        assertEquals(b1, b1);
        assertEquals(b1, b2);
        assertNotEquals(b1, b3);
        assertNotEquals(b1, h1);
        assertNotEquals(b1, null);
        assertEquals(h1, h2);
        assertNotEquals(h1, h3);
    }
}
