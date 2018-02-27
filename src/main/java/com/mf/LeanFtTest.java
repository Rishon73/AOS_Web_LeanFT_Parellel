package com.mf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.mobile.*;
import com.hp.lft.verifications.*;
import java.util.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    DoTest doTest;
    MCUtils mcutils;

    @BeforeClass
    public void beforeClass() throws Exception {

        mcutils = new MCUtils();
        /*
        // SRF browser
        BrowserDescription bd = new BrowserDescription();
        bd.setType(BrowserType.CHROME); //or: bd.set("type", BrowserType.INTERNET_EXPLORER) or: bd.set("type", "INTERNET_EXPLORER")
        bd.set("version", "57");
        bd.set("osType", "Windows");
        bd.set("osVersion", "10");
        bd.set("testName", "My LeanFT web test");

        // SRF mobile device browser
        DeviceDescription dd = new DeviceDescription();
        dd.setOsType("Android"); //or: dd.set("osType", "Android")
        dd.setOsVersion("5.02"); //or: dd.set("osVersion", "5.02")
        dd.set("testName", "My LeanFT mobile test");
        Device device = SrfLab.lockDevice(dd);

        Browser br = BrowserFactory.launch(BrowserType.CHROME, device);

        // Local browder
        Browser browser2 = BrowserFactory.launch(BrowserType.CHROME);

        // Browder on Mobile device in MC
        */
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test //(threadPoolSize = 3, invocationCount = 1)
    public void test() throws Exception {

        DoTest test = new DoTest(BrowserType.FIREFOX);
        //DoTest test = new DoTest(BrowserType.CHROME, "63", "Windows", "10", "Shiff's remote test");

        mcutils.logMessages("1", LOG_LEVEL.INFO);
        Browser browser = test.getBrowser();

        mcutils.logMessages("2", LOG_LEVEL.INFO);
        browser.navigate("http://tinyurl.com/hpe-shop");



        mcutils.logMessages("3", LOG_LEVEL.INFO);
        mcutils.windowSync(20000);
    }

}