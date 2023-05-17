package org.example.junithelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    StringHelper stringHelper=new StringHelper();

    String actual;
    String expected;

    public ParameterizedTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameters
    public static List<String[]> testConditions(){
        String expectedoutputs[][]={
                {"AACD","CD"},{"ACD","CD"}
        };
        return Arrays.asList(expectedoutputs);
    }


    @Test
    public void testtruncateAInFirst2Positions() {
        assertEquals(expected, stringHelper.truncateAInFirst2Positions(actual));
    }
}
