package INSCALE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssessmentQ1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\IdeaProjects\\selenium jars and driver\\drivers\\chromedriver\\chromedriver.exe");

    }
    WebDriver driver = new ChromeDriver();

        @Given("^I navigate to website using link$")
        public void navigateLink(){


            // Maximize the browser
            driver.manage().window().maximize();

            // Launch Website
            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        }

        @When("^I login as Bank Manager$")
        public void loginBankManager(){

            //click Bank Manager Login button
            driver.findElement(By.id("Bank Manager Login")).click();
        }

        @When("^I click Add customer button$")
        public void addCustomer(){

            //click Add customer button
            driver.findElement(By.id("Add Customer\n" +
                    "\t\t")).click();
        }

        @And("^I enter details customer Christopher Connely$")
        public void enterCustomer1(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Christopher");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Connely");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("L789C349");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Frank Christopher$")
        public void enterCustomer2(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Frank");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Christopher");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("A897N450");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Christopher Minka$")
        public void enterCustomer3(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Christopher");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Minka");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("M098Q585");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Connely Jackson$")
        public void enterCustomer4(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Connely");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Jackson");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("L789C349");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Jackson Frank$")
        public void enterCustomer5(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Jackson");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Frank");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("L789C349");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Minka Jackson$")
        public void enterCustomer6(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Minka");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Jackson");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("A897N450");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @And("^I enter details customer Jackson Connely$")
        public void enterCustomer7(){

            //enter First Name
            WebElement inputFirst = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
            inputFirst.sendKeys("Jackson");

            //enter Last Name
            WebElement inputLast = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
            inputLast.sendKeys("Connely");

            //enter Postcode
            WebElement inputPostcode = driver.findElement(By.cssSelector("input[placeholder = 'Post Code']"));
            inputPostcode.sendKeys("L789C349");

            //click Add customer button
            driver.findElement(By.xpath("//button[@id = 'submit']")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @When("^I click Customer Tab button$")
        public void clickCustomerTab(){

            //click Add customer button
            driver.findElement(By.id("Customers\n" +
                    "\t\t")).click();
        }

        @Then("^I verify all the customers are inserted in the table$")
        public boolean verifyInsertCustomer(){

            WebElement Customer1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[6]"));
            Boolean customer1Displayed = Customer1.isDisplayed();

            if (customer1Displayed) {
                System.out.println("The Customer1 is displayed.");
            } else {
                System.out.println("The Customer1 is not displayed.");
            }

            WebElement Customer2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[7]"));
            Boolean customer2Displayed = Customer2.isDisplayed();

            if (customer2Displayed) {
                System.out.println("The Customer2 is displayed.");
            } else {
                System.out.println("The Customer2 is not displayed.");
            }

            WebElement Customer3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[8]"));
            Boolean customer3Displayed = Customer3.isDisplayed();

            if (customer3Displayed) {
                System.out.println("The Customer3 is displayed.");
            } else {
                System.out.println("The Customer3 is not displayed.");
            }

            WebElement Customer4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[9]"));
            Boolean customer4Displayed = Customer4.isDisplayed();

            if (customer4Displayed) {
                System.out.println("The Customer4 is displayed.");
            } else {
                System.out.println("The Customer4 is not displayed.");
            }

            WebElement Customer5 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[10]"));
            Boolean customer5Displayed = Customer5.isDisplayed();

            if (customer5Displayed) {
                System.out.println("The Customer5 is displayed.");
            } else {
                System.out.println("The Customer5 is not displayed.");
            }

            WebElement Customer6 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[11]"));
            Boolean customer6Displayed = Customer6.isDisplayed();

            if (customer6Displayed) {
                System.out.println("The Customer6 is displayed.");
            } else {
                System.out.println("The Customer6 is not displayed.");
            }

            WebElement Customer7 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[12]"));
            Boolean customer7Displayed = Customer7.isDisplayed();

            if (customer7Displayed) {
                System.out.println("The Customer7 is displayed.");
            } else {
                System.out.println("The Customer7 is not displayed.");
            }

            return false;
        }

        @And("^I verify delete customer Jackson Frank and Christopher Connely$")
        public void deleteCustomer(){

            //delete Jackson Frank
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[10]/td[5]/button")).click();
            //delete Christopher Connely
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[6]/td[5]/button")).click();

        }


}
