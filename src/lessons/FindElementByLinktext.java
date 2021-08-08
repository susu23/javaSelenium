package lessons;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinktext {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		
		//通过超链接文本
		driver.findElement(By.partialLinkText("苏炳添将出任中国代表团闭幕式旗手")).click();
		Thread.sleep(1000);
		
		assert driver.getCurrentUrl()=="https://www.baidu.com/s?cl=3&tn=baidutop10&fr=top1000&wd=%E8%8B%8F%E7%82%B3%E6%B7%BB%E5%B0%86%E5%87%BA%E4%BB%BB%E4%B8%AD%E5%9B%BD%E4%BB%A3%E8%A1%A8%E5%9B%A2%E9%97%AD%E5%B9%95%E5%BC%8F%E6%97%97%E6%89%8B&rsv_idx=2&rsv_dl=fyb_n_homepage&hisfilter=1";
		System.out.println("断言通过");
		
		driver.quit();
		
		
		
	}

}
