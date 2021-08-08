package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		try {
			String baidu_title="百度一下，你就知道";
			assert baidu_title== driver.getTitle();
			System.out.println("test pass");
			}catch(Exception e) {
				e.printStackTrace();
		}
		//通过id定位
		//driver.findElement(By.id("kw")).sendKeys("Selenium");
		
		//通过name定位
		driver.findElement(By.name("wd")).sendKeys("Selenium");
				
		driver.findElement(By.id("su")).click();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement ele_string=driver.findElement(By.xpath("//*[@id='2']/h3/a[1]"));
		String ele_string1=ele_string.getText();
		System.out.println(ele_string1);
		
		try {
			if(ele_string1.equals("Selenium automates browsers. That's it!")) {
				System.out.println("Testing is successful!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		driver.quit();
		
	}

}
