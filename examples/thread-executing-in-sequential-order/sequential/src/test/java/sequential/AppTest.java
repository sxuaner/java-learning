package sequential;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
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
        
        // ArrayList is not an array but a list. Convert it to Array in this case!
        // message parameter means the message to display when this assertion is run.
        assertArrayEquals("Comparing 2 arraylists!", expectedOutput.toArray(), MyThread.output.toArray()); 

    }
}
