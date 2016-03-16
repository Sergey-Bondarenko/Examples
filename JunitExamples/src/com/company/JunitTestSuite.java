package com.company;

import junit.framework.*;
public class JunitTestSuite {
    public static void main(String[] a) {
        // add the test's in the suite
        TestSuite suite = new TestSuite();
        // TestSuite suite = new TestSuite(TestJunit.class, TestJunit2.class, TestJunit3.class)
        suite.addTestSuite(TestJunit.class);
        suite.addTestSuite(TestJunit2.class);
        suite.addTestSuite(TestJunit3.class);

        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}