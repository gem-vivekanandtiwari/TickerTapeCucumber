package com.qa.gemini.ticker.stepdefinition;

import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.Before;

public class TickerTapeHook {

    @Before
    public void start(){
        DriverManager.setUpBrowser();
    }
}
