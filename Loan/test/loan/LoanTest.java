/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author t00152975
 */
public class LoanTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public LoanTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    /* for console output testing */
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    /* for console output testing */
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Test of getAmount method, of class Loan.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Loan instance = new Loan(5000.00, 10.00, 5);
        double expResult = 5000;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testMain() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Loan testloan = new Loan(-500.0, 10.0, 5);
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(//
                System.getProperty("line.separator"));
        assertEquals(1, linesOfOutput.length);
        assertEquals("Error Negative and zero amount values invalid", linesOfOutput[0]);
    }

    /**
     * Test of getPeriod method, of class Loan.
     */
    @Test
    public void testGetPeriod() {
        System.out.println("getPeriod");
        Loan instance = new Loan(5000.00, 10.00, 5);
        int expResult = 5;
        int result = instance.getPeriod();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRate method, of class Loan.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        Loan instance = new Loan(5000.00, 10.00, 5);
        double expResult = 10.00;
        double result = instance.getRate();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getMonthlyPayment method, of class Loan.
     */
    @Test
    public void testGetMonthlyPayment() {
        System.out.println("getMonthlyPayment");
        Loan instance = new Loan(5000.00, 10.00, 5);
        double expResult = 106.2352;
        double result = instance.getMonthlyPayment();
        assertEquals(expResult, result, 0.0001);

    }

    /**
     * Test of getTotalPayment method, of class Loan.
     */
    @Test
    public void testGetTotalPayment() {
        System.out.println("getTotalPayment");
        Loan instance = new Loan(5000.00, 10.00, 5);
        double expResult = 6374.1134;
        double result = instance.getTotalPayment();
        assertEquals(expResult, result, 0.0001);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

   /* @Test
    public void invalidMessagesShouldThrowAutoPopulateException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Error Negative and zero amount values invalid");
        Loan testloan = new Loan(-500.0, 10.0, 5);
        System.out.println("amt is " + testloan.getAmount());
    }*/

    /**
     * Test of getTotalPaymentAndCost method, of class Loan.
     */
    @Test
    public void testGetTotalPaymentAndCost() {
        System.out.println("getTotalPaymentAndCost");
        LoanFees loanFees = null;
        Loan instance = new Loan();
        double expResult = 0.0;
        double result = instance.getTotalPaymentAndCost(loanFees);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of GetOwner method, of class Loan.
     */
    @Test
    public void testGetOwner() {
        System.out.println("GetOwner");
        Customer Cust = null;
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.GetOwner(Cust);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
