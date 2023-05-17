package org.example.junithelper;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class TestArrayCompare {

    @Test
    public void testArrays(){
        int [] actual={12,3,7,1};
        Arrays.sort(actual);
        int[] expected={1,3,7,12};

        assertArrayEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void testException(){
        int a[]=null;
        Arrays.sort(a);
    }

    @Test(timeout = 1)
    public void testPerformance(){
        int a[] ={1,4,6};
        for(int i=0;i<100000;i++){
            a[0]=i;
            Arrays.sort(a);
        }
    }
}
