package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static String XPATH_INPUT_COOKIES = "//div[@class=\"_9o-r\"]/button[@class=\"_42ft _4jy0 _9o-t _4jy3 _4jy1 selected _51sy\"]";
    private static String XPATH_INPUT_DAY = "//div[@class=\"_5k_5\"]/span[@class\"_5k_4\"]/span/select[1]";
    private static String XPATH_INPUT_MONTH = "//div[@class=\"_5k_5\"]/select[@class=\"_9407 _5dba _9hk6 _8esg\"]";
    private static String XPATH_INPUT_YEAR = "//div[@class=\"_5k_5\"]/select[@class=\"_9407 _5dba _9hk6 _8esg\"]";
    private static String XPATH_INPUT_REGISTER = "//div[@class=\"_6ltg\"]/a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]";
    private static String XPATH_SELECT ="//div[@class=\"large_form\"]";
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.facebook.com/");

        WebElement clickCookies = webDriver.findElement(By.xpath(XPATH_INPUT_COOKIES));
        clickCookies.click();

        WebElement clickCreateAccount = webDriver.findElement(By.xpath(XPATH_INPUT_REGISTER));
        clickCreateAccount.click();

        while (!webDriver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement selectDay = webDriver.findElement(By.xpath(XPATH_INPUT_DAY));
        Select selectD = new Select(selectDay);
        selectD.selectByIndex(16);

        WebElement selectMonth = webDriver.findElement(By.xpath(XPATH_INPUT_MONTH));
        Select selectM = new Select(selectMonth);
        selectM.selectByIndex(2);

        WebElement selectYear = webDriver.findElement(By.xpath(XPATH_INPUT_YEAR));
        Select selectY = new Select(selectYear);
        selectY.selectByIndex(23);
    }
}