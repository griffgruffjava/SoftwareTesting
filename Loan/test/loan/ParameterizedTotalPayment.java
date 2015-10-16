/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author t00152975
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTotalPayment {

    private double expectedRate;
    private double expectedTotal;
    private double amount;
    private double rate;
    private int period;

    @Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
            {10.0, 6374.11, 5000.0, 10.0, 5}, //expected,  amount, rate, period 
            {10.0, 6374.11, 5000.0, 10.0, 5},//expected,  amount, rate, period
            {10.0, 6374.11, 5000.0, 10.0, 5},//expected,  amount, rate, period 
        });
    }

    public ParameterizedTotalPayment(double expectedRate, double expectedTotal, double amount, double rate, int period) {
        this.expectedRate = expectedRate;
        this.expectedTotal = expectedTotal;
        this.amount = amount;
        this.rate = rate;
        this.period = period;
    }

    @Test
    public void TestTotalPayment_Calc() {
        System.out.println("Test TotalPayment: " + amount);
        Loan calc = new Loan(amount, rate, period);
        assertEquals(expectedTotal, calc.getTotalPayment(), 0.5);
    }
    
    @Test
    public void testGetRate() {
       System.out.println("Test Get rate: " + rate);
       Loan calc = new Loan(amount, rate, period);
       assertEquals(expectedRate, calc.getRate(), 0.5);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
