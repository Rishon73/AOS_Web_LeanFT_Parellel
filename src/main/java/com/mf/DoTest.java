package com.mf;

import com.hp.lft.sdk.SrfLab;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.mobile.*;

public class DoTest {

    private Browser browser;

    /*
    public DoTest(BrowserDescription description)  throws Exception  {
        // SRF browser


        // SRF mobile device browser
        DeviceDescription dd = new DeviceDescription();
        dd.setOsType("Android"); //or: dd.set("osType", "Android")
        dd.setOsVersion("5.02"); //or: dd.set("osVersion", "5.02")
        dd.set("testName", "My LeanFT mobile test");
        Device device = SrfLab.lockDevice(dd);

        Browser br = BrowserFactory.launch(BrowserType.CHROME, device);

        // Local browser
        Browser browser2 = BrowserFactory.launch(BrowserType.CHROME);

        // Browder on Mobile device in MC
    }
    */

    // SRF browser
        public DoTest(BrowserType browserType, String browserVersion, String osType, String osVersion, String testName)  throws Exception {
        BrowserDescription bd = new BrowserDescription();
        bd.setType(browserType); //or: bd.set("type", BrowserType.INTERNET_EXPLORER) or: bd.set("type", "INTERNET_EXPLORER")
        bd.set("version", browserVersion);
        bd.set("osType", osType);
        bd.set("osVersion", osVersion);
        bd.set("testName", testName);
        browser = SrfLab.launchBrowser(bd);
    }

    // SRF mobile device browser
    public DoTest(BrowserType browserType, String deviceID, String testName) throws Exception {
        DeviceDescription dd = new DeviceDescription();
        dd.setId(deviceID);
        dd.set("testName", testName);
        Device device = SrfLab.lockDevice(dd);
        browser = BrowserFactory.launch(browserType, device);
    }

    // Local browser
    public DoTest(BrowserType browserType) throws Exception {
        browser = BrowserFactory.launch(browserType);
    }

    // Browder on Mobile device in MC
    public DoTest(BrowserType browserType, String deviceID) throws Exception {

    }

    public Browser getBrowser() {
        return browser;
    }

}
