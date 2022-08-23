package com.qa.gemini.ticker.stepdefinition;


import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.io.IOException;



public class TickerTape {

    @Given("^Search Stock in the search box (.+)")
    public void Search_Stock_in_the_search_box(String Stock) throws IOException {
        DriverAction.waitSec(2);
        DriverAction.typeText(Locator.search, Stock+Keys.ENTER);
        DriverAction.waitSec(5);

    }

    @Then("Verify If its Stock Type")
    public void verify_if_its_stock_type() throws IOException {
        DriverAction.click(Locator.stock);
        DriverAction.waitSec(5);
        String verify = DriverAction.getElementText(Locator.verify);
        if (verify.equals("Stocks")) {
            System.out.printf("Validation successful asset is stock\n");
            GemTestReporter.addTestStep("Validation", "Asset is Stock", STATUS.PASS, DriverAction.takeSnapShot());
        }
    }

    @Then("Click on It")
    public void click_on_it() {
        DriverManager.getWebDriver().findElement(Locator.search).sendKeys(Keys.ENTER);
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for one day")
    public void show_the_analytic_for_one_day() {
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String high = high1.substring(1, 10);
        String low = low1.substring(1, 10);
        String change = change1;
        System.out.print("Insights of " + heading + "for one day" + "\nHigh " + high + "\nLow " + low + "\nChange " + change + "\n");
        GemTestReporter.addTestStep("Insights of " + heading + "for one day", "High " + high + "<br>Low " + low + "<br>Change " + change, STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for one Week")
    public void show_the_analytic_for_one_week() throws IOException {
        DriverAction.click(Locator.week, "Click on 1w");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String high = high1.substring(1, 10);
        String low = low1.substring(1, 10);
        String change = change1;
        System.out.print("Insights of " + heading + " for one week" + "\nHigh " + high + "\nLow " + low + "\nChange " + change + "\n");
        GemTestReporter.addTestStep("Insights of " + heading + " for one week", "High " + high + "<br>Low " + low + "<br>Change " + change, STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for one Month")
    public void show_the_analytic_for_one_month() throws IOException {
        DriverAction.click(Locator.mo, "Click on 1M");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String high = high1.substring(1, 10);
        String low = low1.substring(1, 10);
        String change = change1;
        System.out.print("Insights of " + heading + " for one month" + "\nHigh " + high + "\nLow " + low + "\nChange " + change + "\n");
        GemTestReporter.addTestStep("Insights of " + heading + " for one month", "High " + high + "<br>Low " + low + "<br>Change " + change, STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for one year")
    public void show_the_analytic_for_one_year() throws IOException {
        DriverAction.click(Locator.year, "Click on 1y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String high = high1.substring(1, 10);
        String low = low1.substring(1, 10);
        String change = change1;
        System.out.print("Insights of " + heading + " for one year" + "\nHigh " + high + "\nLow " + low + "\nChange " + change + "\n");
        GemTestReporter.addTestStep("Insights of " + heading + " for one year", "High " + high + "<br>Low " + low + "<br>Change " + change, STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for five year")
    public void show_the_analytic_for_five_year() throws IOException {
        DriverAction.click(Locator.year5, "Click on 5y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String high = high1.substring(1, 10);
        String low = low1.substring(1, 10);
        String change = change1;
        System.out.print("Insights of " + heading + " for five year" + "\nHigh " + high + "\nLow " + low + "\nChange " + change + "\n");
        GemTestReporter.addTestStep("Insights of " + heading + " for five year", "High " + high + "<br>Low " + low + "<br>Change " + change, STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.waitSec(5);
    }
}
