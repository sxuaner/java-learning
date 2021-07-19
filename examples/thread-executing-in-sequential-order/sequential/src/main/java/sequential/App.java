package sequential;

import java.util.List;
import java.util.ArrayList;

/**
 * t1, t2, t3 execute one after another.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyThread t1 = new ThreadOne();
        new Thread(t1).start();

        // assertArrayEquals(String message, Object[] expecteds, Object[] actuals)
        // Asserts that two object arrays are equal.
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("T1 is running!");
        expectedOutput.add("T2 is running!");
        expectedOutput.add("T3 is running!");

        System.out.println(expectedOutput.toString());
        System.out.println(MyThread.output.toString());

    }
}