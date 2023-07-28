package INSCALE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssessmentQ2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\IdeaProjects\\selenium jars and driver\\drivers\\chromedriver\\chromedriver.exe");

    }
    WebDriver driver = new ChromeDriver();


    @When("^I login as Customer$")
    public void loginCustomer(){

        //click Bank Manager Login button
        driver.findElement(By.id("Customer Login")).click();
    }

    @And("^I choose name as Hermoine Granger$")
    public void chooseCustomer(){

        Select yourName = new Select(driver.findElement(By.name("userSelect")));
        yourName.selectByVisibleText("Hermoine Granger");

    }

    @And("^I click login button$")
    public void clickLogin(){

        //click login button
        driver.findElement(By.id("Login")).click();

    }

    @And("^I choose 1003 from drop down$")
    public void choose1003 (){

        Select yourName = new Select(driver.findElement(By.name("accountSelect")));
        yourName.selectByVisibleText("1003");

    }

    @When("^I click on deposit and enter amount 50000$")
    public void deposit50000(){

        driver.findElement(By.id("Deposit\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("50000");

        driver.findElement(By.id("Deposit")).click();
    }

    @Then("^I verify current balance 50000$")
    public void verifyBalance50000(){

        if( driver.findElement(By.id("50000")).isDisplayed()){

            System.out.println("current balance is 50000");

        }else{

            System.out.println("current balance is not equal 50000");

        }


    }

    @When("^I click on withdraw and enter amount 3000$")
    public void withdraw3000(){

        driver.findElement(By.id("Withdrawl\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("3000");

        driver.findElement(By.id("Withdraw")).click();
    }

    @Then("^I verify current balance 47000$")
    public void verifyBalance47000(){

        if( driver.findElement(By.id("47000")).isDisplayed()){

            System.out.println("current balance is 47000");

        }else{

            System.out.println("current balance is not equal 47000");

        }


    }

    @When("^I click on withdraw and enter amount 2000$")
    public void withdraw2000(){

        driver.findElement(By.id("Withdrawl\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("2000");

        driver.findElement(By.id("Withdraw")).click();
    }

    @Then("^I verify current balance 45000$")
    public void verifyBalance45000(){

        if( driver.findElement(By.id("45000")).isDisplayed()){

            System.out.println("current balance is 45000");

        }else{

            System.out.println("current balance is not equal 45000");

        }


    }

    @When("^I click on deposit and enter amount 5000$")
    public void deposit5000(){

        driver.findElement(By.id("Deposit\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("5000");

        driver.findElement(By.id("Deposit")).click();
    }

    @When("^I click on withdraw and enter amount 10000$")
    public void withdraw10000(){

        driver.findElement(By.id("Withdrawl\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("10000");

        driver.findElement(By.id("Withdraw")).click();
    }

    @Then("^I verify current balance 40000$")
    public void verifyBalance40000(){

        if( driver.findElement(By.id("40000")).isDisplayed()){

            System.out.println("current balance is 40000");

        }else{

            System.out.println("current balance is not equal 40000");

        }


    }

    @When("^I click on withdraw and enter amount 15000$")
    public void withdraw15000(){

        driver.findElement(By.id("Withdrawl\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("15000");

        driver.findElement(By.id("Withdraw")).click();
    }

    @Then("^I verify current balance 25000$")
    public void verifyBalance25000(){

        if( driver.findElement(By.id("25000")).isDisplayed()){

            System.out.println("current balance is 25000");

        }else{

            System.out.println("current balance is not equal 25000");

        }


    }

    @When("^I click on deposit and enter amount 1500$")
    public void deposit1500(){

        driver.findElement(By.id("Deposit\n" +
                "\t\t")).click();

        WebElement amount = driver.findElement(By.cssSelector("input[placeholder = 'amount']"));
        amount.sendKeys("1500");

        driver.findElement(By.id("Deposit")).click();
    }

    @Then("^I verify current balance 26500$")
    public void verifyBalance26500(){

        if( driver.findElement(By.id("26500")).isDisplayed()){

            System.out.println("current balance is 26500");

        }else{

            System.out.println("current balance is not equal 26500");

        }


    }

    @And("^I verify current balance is tally with Balance section  in the Customer Homepage$")
    public void verifyTallyCurrentBalance(){

        driver.findElement(By.id("Transactions\n" +
                "\t\t")).click();

        driver.findElement(By.className("btn")).click();

        if( driver.findElement(By.id("26500")).isDisplayed()){

            System.out.println("current balance is 26500");

        }else{

            System.out.println("current balance is not equal 26500");

        }

    }
}
