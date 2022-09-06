package fundamentals;

import org.junit.Test;

public class ProgrammingModel
{

    @Test
    public void test_ex_1_1_1()
    {
        // a.
        System.out.println( ( 0 + 15 ) / 2 );
        // b.
        double pow = 2.0 * Math.pow( 10, -6 );
        System.out.println( pow * 100000000.1 );
        // c.
        System.out.println( true && false || true && true );
    }
}
