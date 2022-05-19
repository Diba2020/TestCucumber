package StepDefinitionCrm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CrmLoginPage {
WebDriver driver;

@Given("user is on the login page")
public void user_is_on_the_login_page() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("http://automationpractice.com/index.php");
 driver.manage().window().maximize();
 Thread.sleep(2000);
}

@Then("user enters the username")
public void user_enters_the_username() {
   String title = driver.getTitle();
   System.out.println(title);
   Assert.assertEquals("My Store", title);
   
}

@Then("user enters the password")
public void user_enters_the_password() {
	driver.findElement(By.linkText("Sign in")).click();
 driver.findElement(By.id("email")).sendKeys("yeasmin.rokshana@gmail.com");
 driver.findElement(By.id("passwd")).sendKeys("Diba@1234");
   
}

@Then("user clik on the login buton")
public void user_clik_on_the_login_buton() {
driver.findElement(By.id("SubmitLogin")).click();
   
    
}

@Then("seu is on the homepage")
public void seu_is_on_the_homepage() {
   driver.findElement(By.id("my-account"));
   driver.findElement(By.className("icon-home")).click();
   
}

}