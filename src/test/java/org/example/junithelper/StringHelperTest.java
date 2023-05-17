package org.example.junithelper;

import static org.junit.Assert.*;

import org.junit.*;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is executed before class");
    }

    @Before
    public void setUp(){
        System.out.println("This will be executed before test");
    }

    @Test
    public void testtruncateAInFirst2Positions() {
        String actual = stringHelper.truncateAInFirst2Positions("AABCD");
        String expected = "BCD";
        System.out.println("This is test method");
        assertEquals(expected, actual);
    }

    @Test
    public void testareFirstAndLastTwoCharactersTheSame() {
        boolean actual=stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
        System.out.println("This is test method");
        assertFalse("This Condition is failing",actual);

    }

    @After
    public void tearDown(){
        System.out.println("This will be executed after test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is executed after class");
    }
}