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
        MyThread t2 = new ThreadTwo();
        MyThread t3 = new ThreadThree();

        // sequential.ThreadOne@60720923
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    
        // new Thread(t1).start();
        Thread st = new Thread(t1);
        // StarterThread st = new StarterThread(t1);
        st.setName("I was created!");
        // st.start();
        // st.setThread(t2);
        st.run();
        // st.setThread(t3);
        // st.run();

        // assertArrayEquals(String message, Object[] expecteds, Object[] actuals)
        // Asserts that two object #arrays# are equal.
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("T1 is running!");
        expectedOutput.add("T2 is running!");
        expectedOutput.add("T3 is running!");

        System.out.println(expectedOutput.toString());
        System.out.println(MyThread.output.toString());
    }
}