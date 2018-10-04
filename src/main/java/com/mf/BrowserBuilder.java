package com.mf;

import com.hp.lft.sdk.SrfLab;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.mobile.*;

enum LabType {SRF, MC};

public class BrowserBuilder {

    private Browser browser;

    // SRF browser
    public BrowserBuilder(BrowserType browserType, String browserVersion, String osType, String osVersion, String testName)  throws Exception {
        BrowserDescription bd = new BrowserDescription();
        bd.setType(browserType); //or: bd.set("type", BrowserType.INTERNET_EXPLORER) or: bd.set("type", "INTERNET_EXPLORER")
        bd.set("version", browserVersion);
        bd.set("osType", osType);
        bd.set("osVersion", osVersion);
        bd.set("testName", testName);
        browser = SrfLab.launchBrowser(bd);
    }

    // SRF mobile browser
    public BrowserBuilder(LabType labType, BrowserType browserType, String deviceID, String testName) throws Exception {
        DeviceDescription dd = new DeviceDescription();
        dd.setId(deviceID);
        Device device;
        if (labType == LabType.SRF) {
            dd.set("testName", testName);
            device = SrfLab.lockDevice(dd);
        }
        else
            device = MobileLab.lockDevice(dd);

        browser = BrowserFactory.launch(browserType, device);
    }

    // Local browser
    public BrowserBuilder(BrowserType browserType) throws Exception {
        browser = BrowserFactory.launch(browserType);
    }

    // Browser on Mobile device in MC
    public BrowserBuilder(BrowserType browserType, String deviceID) throws Exception {

    }

    public Browser getBrowser() {
        return browser;
    }

}
