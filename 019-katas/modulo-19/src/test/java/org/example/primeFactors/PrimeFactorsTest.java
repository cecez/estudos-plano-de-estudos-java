package org.example.primeFactors;

import static org.example.primeFactors.PrimeFactors.generate;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class PrimeFactorsTest extends TestCase {

    private static List<Integer> list(int... integers) {
        List<Integer> integerList = new ArrayList<>();
        for (int i : integers) {
            integerList.add(i);
        }
        return integerList;
    }

    @DataProvider
    public static Object[][] myDataProvider() {
        return new Object[][]{
                {1, list()},
                {2, list(2)},
                {3, list(3)},
                {4, list(2, 2)},
                {6, list(2, 3)},
                {8, list(2, 2, 2)},
                {9, list(3, 3)},
                {10, list(2, 5)},
                {37, list(37)},
                {111, list(3, 37)},
        };
    }

    @Test
    @UseDataProvider("myDataProvider")
    public void dataProviderTest(int n, List<Integer> integerList) {
        Assert.assertEquals(integerList, generate(n));
    }
}
