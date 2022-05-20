import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
public class ATM_TransactionTest {
    @Test
    public void test0() {
        assertTrue(ATM_Transaction.transactions("Withdraw",5000) == "Please collect your money");
    }
    @Test
    public void test1() {
        assertTrue(ATM_Transaction.transactions("Deposit",2000) == "Your Money has been successfully depsited");

    }
    @Test
    public void test2() {
        assertTrue(ATM_Transaction.transactions("Deposit",8000) == "Your Money has been successfully depsited");

    }
    @Test
    public void test3() {
        assertTrue(ATM_Transaction.transactions("Withdraw",10000) == "Insufficient Balance");
    }
    
}