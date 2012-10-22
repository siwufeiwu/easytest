/****************************************************************************************************************
*
*  Copyright (c) 2012 OCLC, Inc. All Rights Reserved.
*
*  OCLC proprietary information: the enclosed materials contain
*  proprietary information of OCLC, Inc. and shall not be disclosed in whole or in 
*  any part to any third party or used by any person for any purpose, without written
*  consent of OCLC, Inc.  Duplication of any portion of these materials shall include this notice.
*
******************************************************************************************************************/

package org.easetech.easytest.runner;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.junit.runner.notification.RunListener;

/**
 * Currently just a placeholder class that will be used later to factor out some common logic from the Runner class.
 *
 */
public class EasyTestRunListener extends RunListener {

    /**
     * Called before any tests have been run.
     * @param description describes the tests to be run
     */
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("testRunStarted");
    }
    
    /**
     * Called when all tests have finished
     * @param result the summary of the test run, including all the tests that failed
     */
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("testRunFinished");
    }
    
    /**
     * Called when an atomic test is about to be started.
     * @param description the description of the test that is about to be run 
     * (generally a class and method name)
     */
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("testStarted");
    }

    /**
     * Called when an atomic test has finished, whether the test succeeds or fails.
     * @param description the description of the test that just ran
     */
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("testFinished");
    }

    /** 
     * Called when an atomic test fails.
     * @param failure describes the test that failed and the exception that was thrown
     */
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("testFailure");
    }

    /**
     * Called when an atomic test flags that it assumes a condition that is
     * false
     * 
     * @param failure
     *            describes the test that failed and the
     *            {@link AssumptionViolatedException} that was thrown
     */
    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("testAssumptionFailure");
    }

    /**
     * Called when a test will not be run, generally because a test method is annotated 
     * with {@link org.junit.Ignore}.
     * 
     * @param description describes the test that will not be run
     */
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("testIgnored");
    }
}