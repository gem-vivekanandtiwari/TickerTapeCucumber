package com.qa.gemini.ticker.stepdefinition;

import org.openqa.selenium.By;

public class Locator {

    public static By search = By.xpath("//input[@type='search']");

    public static By stock = By.xpath("//*[@id='react-autowhatever-1']/ul/li[1]");

    public static By verify = By.xpath("//*[@id='react-autowhatever-1']//span[@class='font-medium history-title']");

    public static By heading = By.xpath("//*[@class='jsx-2903438179 security-name']");

    public static By high = By.xpath("//*[@id='app-container']//div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]");

    public static By low = By.xpath("//*[@id='app-container']//div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]");

    public static By change = By.xpath("//*[@id='app-container']//div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]");

    public static By week = By.xpath("//input[@value='1w']");

    public static By mo = By.xpath("//input[@value='1mo']");

    public static By year = By.xpath("//input[@value='1y']");

    public static By year5 = By.xpath("//input[@value='5y']");

}
