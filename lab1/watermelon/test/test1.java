import com.company.Main;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class test1 {
    @Test
    public void test0() {
        assertTrue(Main.can_be_divided(8) == true);
    }
    @Test
    public void test2() {
        assertTrue(Main.can_be_divided(2) ==false);
    }
    @Test
    public void test3() {
        assertTrue(Main.can_be_divided(9) == false);
    }
}
