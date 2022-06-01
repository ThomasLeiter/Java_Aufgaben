package Objektorientierte_Aufgaben.Aufgabe_Exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BankkontoTests {

    Bankkonto bankkonto;
    
    @Before
    public void testSetup(){
        bankkonto = new Bankkonto();
    }

    @Test
    public void testAuszahlen() {
        System.out.println("Teste die Auszahlungsmethode ...");
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
        Throwable t = assertThrows(
            Transaktionsfehler.class,
            () -> bankkonto.auszahlen(-12.0));
        assertEquals(String.format(
            "Fehlermeldung %s ist falsch.", 
            t.getMessage()), "Auszahlungsbetrag -12.00 ist negativ.", 
            t.getMessage());
    }

    @Test
    public void testEinzahlen() {
        System.out.println("Teste die Einzahlungsmethode ...");
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
        Throwable t = assertThrows(
            Transaktionsfehler.class,
            () -> bankkonto.einzahlen(-12.0));
        assertEquals(String.format(
            "Fehlermeldung %s ist falsch.", 
            t.getMessage()), "Einzahlungsbetrag -12.00 ist negativ.", 
            t.getMessage());
    }

    public static void main(String ... args){
        Result result = JUnitCore.runClasses(BankkontoTests.class);
		
        for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
        }
          
        System.out.println(result.wasSuccessful());
     }

}
