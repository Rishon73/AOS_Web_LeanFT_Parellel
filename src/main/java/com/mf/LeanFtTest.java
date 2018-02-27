package com.mf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    BrowserBuilder browserBuilder;
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

    @Test
    public void SRFMobileBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME, "ZX1G22D3VD", "Shiff's remote SRF mobile browser test");
        mcutils.logMessages("SRF mobile browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser());
    }

    @Test //(threadPoolSize = 3, invocationCount = 1)
    public void SRFBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME, "63", "Windows", "10", "Shiff's remote browser test");
        mcutils.logMessages("SRF browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser());
    }

    @Test
    public void localBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME);
        mcutils.logMessages("Local browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser());
    }

    private void runMyTest(Browser browser) throws Exception {
        mcutils.logMessages("Navigate to...", LOG_LEVEL.INFO);
        browser.navigate("http://tinyurl.com/hpe-shop");

        mcutils.logMessages("waiting 10 seconds", LOG_LEVEL.INFO);
        mcutils.windowSync(10000);

        mcutils.logMessages("Closing browser", LOG_LEVEL.INFO);
        browser.close();

    }
}