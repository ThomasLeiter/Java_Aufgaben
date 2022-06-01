package Objektorientierte_Aufgaben.Aufgabe_Exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class BankkontoTests {

    Bankkonto bankkonto;
    
    @Before
    public void testSetup(){
        bankkonto = new Bankkonto();
    }

    @Test
    public void testAuszahlen() {
        try{
            bankkonto.einzahlen(100.0);
            assertEquals(bankkonto.getKontostand(), 100.0, 0.0);
        } catch(Transaktionsfehler e){
            fail();
        }
        try{
            bankkonto.auszahlen(24.0);
            assertEquals(bankkonto.getKontostand(), 76.0, 0.0);
        } catch(Transaktionsfehler e){
            fail();
        }
        assertThrows(
            "Auszahlungsbetrag -12.00 ist negativ.",
            Transaktionsfehler.class,
            () -> bankkonto.auszahlen(-12.0));
    }

    @Test
    public void testEinzahlen() {
        try{
            bankkonto.einzahlen(12.0);
            assertEquals(bankkonto.getKontostand(), 12.0, 0.0);
        } catch(Transaktionsfehler e){
            fail();
        }
        try{
            bankkonto.einzahlen(24.0);
            assertEquals(bankkonto.getKontostand(), 36.0, 0.0);
        } catch(Transaktionsfehler e){
            fail();
        }
        assertThrows(
            "Einzahlungsbetrag -12.00 ist negativ.",
            Transaktionsfehler.class,
            () -> bankkonto.einzahlen(-12.0));
    }
}
