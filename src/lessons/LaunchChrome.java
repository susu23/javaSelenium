package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
		//get()打开一个站点
		driver.get("https://www.baidu.com");
		//getTitle()获取当前页面title的值
		System.out.println("当前打开页面的标题是："+driver.getTitle());
		
		//关闭并退出浏览器
		driver.quit();
	}

}
