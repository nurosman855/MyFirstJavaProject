package inlämning;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;



public class TextAnalysTest {

    //TEst 1 en vanlig rad med text
    @Test
    public void testBearbetaEnRad() {

        TextAnalys analys = new TextAnalys();

        analys.bearbetaRad("Hej Världen");

        assertEquals(1,analys.getAntalRader());
        assertEquals(11, analys.getAntalTecken());
    }

    // Test 2; en tom rad
    @Test

    public void testBearbetaTomRad() {
        TextAnalys analys = new TextAnalys();
        analys.bearbetaRad("");

        assertEquals(1, analys.getAntalRader());
        assertEquals(0,analys.getAntalTecken());
    }
    // test 3: Flera rader
    @Test

    public void testFleraRader() {

        TextAnalys analys =new TextAnalys(); // Arrange

        //Act
        analys.bearbetaRad("Första raden");
        analys.bearbetaRad("andra raden");
        analys.bearbetaRad("Tredje");

        //Assert
        assertEquals(3,analys.getAntalRader());
        assertEquals(29,analys.getAntalTecken());


    }

}
