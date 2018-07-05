package com.kodilla.testing2.com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_WAIT_FOR_1 = "//select[1]";

    public static void main (String[] args){

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_1)).isDisplayed());

            WebElement day = driver.findElement(By.xpath(XPATH_DAY_SELECT));
            Select selectDay = new Select(day);
            selectDay.selectByIndex(10);

            WebElement month = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
            Select selectMonth = new Select(month);
            selectMonth.selectByIndex(10);

            WebElement year = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
            Select selectYear = new Select(year);
            selectYear.selectByIndex(10);

        }

    }

