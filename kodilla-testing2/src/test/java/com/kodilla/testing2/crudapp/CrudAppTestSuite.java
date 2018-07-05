package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://korneliaadamczyk.github.io";
    private WebDriver driver;
    private Random generaton;


    @Before
    public void initTests(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generaton = new  Random();
    }

    @After
    public void cleanUpAfterTest(){
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME ="//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generaton.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    @Test
    public void shouldCreateCrudAppTestTask() throws InterruptedException {
        String taskName = createCrudAppTestTask();
    }

    private void sendTestTaskToTrello (String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> { WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
            Select select = new Select(selectElement);
            select.selectByIndex(1);

            WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
            buttonCreateCard.click();
        });
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }

    @Test
    public void shouldSendTestTaskToTrello() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
    }

    private boolean checkTaskExistsInTrello (String taskName) throws InterruptedException  {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("korakodilla@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("kodillakora");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.get("https://trello.com/kornelia76/boards");
        driverTrello.findElements(By.xpath("//a[@class=\"board-tile mod-light-background\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(t -> t.getText().contains(taskName));


        driverTrello.close();

        return result;
    }

    @Test
    public void shouldCheckTaskExistsInTrello() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        Assert.assertTrue(checkTaskExistsInTrello(taskName));
    }

    private void deleteTask (String taskName) {

        //driver.navigate().refresh();

        //while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> { WebElement buttonDelete = theForm.findElement(By.xpath(".//button[4]"));
                    buttonDelete.click();
                });
    }

    @Test
    public void shouldDeleteTask() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTask(taskName);

    }
}
