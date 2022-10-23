package ders06_junit;

import org.junit.*;

public class C02_notasyonlar {

    @BeforeClass
    public static void SetupClass(){
        System.out.println("Before Class calisti");

    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("after class calisti");
    }

    @Before
    public void setupMethod(){
        System.out.println("Before calisti");
    }
    @After
    public void afterMethod() {
        System.out.println("After calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }
    @Test @Ignore
    public void test2(){
        System.out.println("Test2 calisti");
    }
    @Test
    public void test3() {
        System.out.println("Test3 calisti");
    }

}
