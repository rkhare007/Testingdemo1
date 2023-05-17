package org.example.junithelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    StringHelper stringHelper=new StringHelper();

    @Parameters
    public static Collection<String[]> testConditions(){

    }


    @Test
    public void testtruncateAInFirst2Positions() {
    }
}
