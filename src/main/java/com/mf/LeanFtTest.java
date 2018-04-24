package com.mf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    private BrowserBuilder browserBuilder;
    private MCUtils mcutils;

    @BeforeClass
    public void beforeClass() throws Exception {
        mcutils = new MCUtils();
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

    //@Test
    public void SRFMobileBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME, "ZX1G22D3VD", "Shiff's remote SRF mobile browser test");
        mcutils.logMessages("SRF mobile browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser(), false);
    }

    @Test //(threadPoolSize = 3, invocationCount = 1)
    public void SRFBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME, "63", "Windows", "10", "Shiff's remote browser test");
        mcutils.logMessages("SRF browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser(), false);
    }

    //@Test
    public void localBrowser() throws Exception {
        BrowserBuilder test = new BrowserBuilder(BrowserType.CHROME);
        mcutils.logMessages("Local browser test", LOG_LEVEL.INFO);
        runMyTest(test.getBrowser(), true);
    }

    // Execute the actual test
    private void runMyTest(Browser browser, boolean closeBrowser) throws Exception {
        mcutils.logMessages("Navigate to...", LOG_LEVEL.INFO);
        browser.navigate("http://tinyurl.com/hpe-shop");

        mcutils.logMessages("waiting 10 seconds", LOG_LEVEL.INFO);
        mcutils.windowSync(10000);
/*
        AOSWebAppModel appModel = new AOSWebAppModel(browser);
        appModel.MICEShopNowLink().click();
        appModel.expensiveMouse().click();
        appModel.SaveToCartButton().click();
*/
        if (closeBrowser) {
            mcutils.logMessages("Closing browser", LOG_LEVEL.INFO);
            browser.close();
        }

    }
}