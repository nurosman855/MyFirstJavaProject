package inlämning;

public class TextAnalys {
    //klassen som räknar rader och tecken
    private int antalRader = 0; // Håller koll på hur många rader som har behandlats
    private int antalTecken =0; // håller koll på hur många tecken totalt som har lästs

    public void bearbetaRad(String rad) { // Metod som tar emot en string som parameter
        antalRader++; // Ökar räknare för antal rader
        antalTecken += rad.length(); //Lägger till antal tecken i denna rad
    }

    public int getAntalRader(){
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }



}
