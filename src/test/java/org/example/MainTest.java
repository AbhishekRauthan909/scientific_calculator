package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testCalSquareRoot() {
        provideInput("1\n16\n5\n");
        Main.main(new String[0]);
        assertEquals("*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Enter a number for which you want to calculate the square root\n" +
                "The square root of a number is: 4.0\n" +
                "*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Exiting from the application\n", getOutput());
    }

    @Test
    void testCalFactorial() {
        provideInput("2\n5\n5\n");
        Main.main(new String[0]);
        assertEquals("*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Enter a number for which you want to calculate the factorial\n" +
                "The factorial of a number is: 120\n" +
                "*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Exiting from the application\n", getOutput());
    }

    @Test
    void testCalNaturalLogarithm() {
        provideInput("3\n2.71828\n5\n");
        Main.main(new String[0]);
        assertEquals("*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Enter a number for which you want to calculate the logarithm\n" +
                "The natural logarithm of a number is: 0.999999327347282\n" +
                "*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Exiting from the application\n", getOutput());
    }

    @Test
    void testCalPowerFunction() {
        provideInput("4\n2\n3\n5\n");
        Main.main(new String[0]);
        assertEquals("*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Enter the base\n" +
                "Enter the exponent\n" +
                "The power of a number: 2.0 raised to the power of 3.0 is: 8.0\n" +
                "*********Welcome to Scientific Calculator Menu*********\n" +
                "1. Square Root Function\n" +
                "2. Factorial Function\n" +
                "3. Natural Logarithm\n" +
                "4. Power Function\n" +
                "5. Exit\n" +
                "Enter your choice\n" +
                "Exiting from the application\n", getOutput());
    }

    private String getOutput() {
        return testOut.toString();
    }
}
