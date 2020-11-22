
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Random;

import static org.junit.Assert.*;


public class BinsTest {


    @Test

    public void constructorAndGetTest(String expected) {
        int max = Integer.parseInt(expected);
        Bins bin = new Bins(2,max);
        Assert.assertEquals(2,bin.getMin());
        Assert.assertEquals(max,bin.getMax());

    }

    @Test
    public void incrementAndGetBinTest() {
        Bins bin = new Bins(2,12);
        Random random = new Random();
        Integer n = random.nextInt(10)+1;
        for (int i = 0; i<n; i++) {
            bin.incrementBin(3);
        }
        Assert.assertEquals(n,bin.getBin(3));
    }

}