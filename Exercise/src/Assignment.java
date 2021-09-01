import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Emmanuel";
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		driver.findElement(By.id("name")).sendKeys(text);
		// click on Alert button
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		// to grab and print the text before accepting it
		System.out.println(driver.switchTo().alert().getText());
		// method in selenium to switch to Alert (JavaScript text)not in selenium
		driver.switchTo().alert().accept();
		// for confirm button
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText()); // grab the text
		driver.switchTo().alert().dismiss(); // for cancel or non
	}

}
