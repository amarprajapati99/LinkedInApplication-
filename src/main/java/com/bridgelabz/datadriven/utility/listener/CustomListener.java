package com.bridgelabz.datadriven.utility.listener;

import com.bridgelabz.datadriven.base.BaseClass;
import com.bridgelabz.datadriven.utility.CaptureScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends BaseClass implements ITestListener{

    CaptureScreenshot captureScreenshot = new CaptureScreenshot();

    @Override
    public void onTestStart (ITestResult result) {

        System.out.println("Method testStart " + result.getName());

        try {
            captureScreenshot.captureScreenshot(result.getName(), "started");
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess (ITestResult result) {
        System.out.println("Method skipped " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "skipped");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure (ITestResult result) {
        System.out.println("Method failed " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped (ITestResult result) {
        System.out.println("Method skipped " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "skipped");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
        System.out.println("Method failed with some pass percntage " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "failedButPass");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onStart (ITestContext context) {

    }

    @Override
    public void onFinish (ITestContext context) {

    }
}
