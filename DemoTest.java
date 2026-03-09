import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {

    @Test
    public void validTriangle() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void validTriangleDifferentOrder() {
        assertTrue(Demo.isTriangle(5, 3, 4));
    }

    @Test
    public void equilateralTriangle() {
        assertTrue(Demo.isTriangle(3, 3, 3));
    }

    @Test
    public void isoscelesTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 8));
    }

    @Test
    public void invalidTriangle() {
        assertFalse(Demo.isTriangle(1, 2, 3));
    }

    @Test
    public void boundaryEqualShouldFail1() {
        assertFalse(Demo.isTriangle(2, 3, 5));
    }

    @Test
    public void boundaryEqualShouldFail2() {
        assertFalse(Demo.isTriangle(1, 1, 2));
    }

    @Test
    public void boundaryEqualShouldFail3() {
        assertFalse(Demo.isTriangle(10, 5, 5));
    }

    @Test
    public void zeroSideShouldFail() {
        assertFalse(Demo.isTriangle(0, 4, 5));
    }

    @Test
    public void allZerosShouldFail() {
        assertFalse(Demo.isTriangle(0, 0, 0));
    }

    @Test
    public void negativeSideShouldFail() {
        assertFalse(Demo.isTriangle(-1, 4, 5));
    }

    @Test
    public void permutationInvalidShouldFail() {
        assertFalse(Demo.isTriangle(5, 10, 5));
    }

    @Test
    public void veryLargeValues() {
        assertTrue(Demo.isTriangle(1000000, 1000001, 1999999));
    }


    @Test
    public void mainPrintsTriangleForValidInput() {
        String input = "3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Demo.main(new String[]{});

        String printed = out.toString().toLowerCase();
        assertTrue(printed.contains("triangle"));
        assertFalse(printed.contains("not a triangle"));
    }

    @Test
    public void mainPrintsNotTriangleForInvalidInput() {
        String input = "1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Demo.main(new String[]{});

        String printed = out.toString().toLowerCase();
        assertTrue(printed.contains("not"));
    }
}