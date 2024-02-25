import org.example.Main;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testCalSquareRoot() {
        ByteArrayInputStream in = new ByteArrayInputStream("4\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Main.calSquareRoot(scanner);
        assertEquals(2.0, Math.sqrt(4));
    }

    @Test
    public void testCalFactorial() {
        ByteArrayInputStream in = new ByteArrayInputStream("5\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Main.calFactorial(scanner);
        assertEquals(120, factorial(5));
    }

    @Test
    public void testCalNaturalLogarithm() {
        ByteArrayInputStream in = new ByteArrayInputStream("10\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Main.calNaturalLogarithm(scanner);
        assertEquals(2.302585092994046, Math.log(10));
    }

    @Test
    public void testCalPowerFunction() {
        ByteArrayInputStream in = new ByteArrayInputStream("2\n3\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Main.calPowerFunction(scanner);
        assertEquals(8.0, Math.pow(2, 3));
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
}
