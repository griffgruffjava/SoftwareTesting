package loan;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.verify;

/**
 *
 * @author t00136071
 */
public class LoansFeesTest {

    public LoansFeesTest() {
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

/**
     * Test of getTotalPaymenpluCosst method, of class Loan   */
    @Test
    public void testGetTotalPaymentplusCost() {
        System.out.println("getTotalPaymentplusCost");
     



        Loan instance = new Loan(5000.0,10.0,5);
        /* Call the createMock to create a mock of the LoanFee class */
        LoanFees mockLoanFees = EasyMock.createMock("mockLoanFees",LoanFees.class);
        
     /* Set up the expected values and return values. */
        expect(mockLoanFees.getCost(5000.00)).andReturn(10.00);
        replay(mockLoanFees);

        double expResult = 6384.11;
        double result = instance.getTotalPaymentAndCost(mockLoanFees);
        assertEquals(expResult, result, 0.5);
        verify(mockLoanFees);
        
    }
}