package com.nhs.uk;

import com.nhs.uk.propertyreader.PropertyReader;
import com.nhs.uk.utility.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * Unit test for simple App.
 */
public class Hooks extends Utility
{
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}

