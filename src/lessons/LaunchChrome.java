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
		
		
		//get()��һ��վ��
		driver.get("https://www.baidu.com");
		//getTitle()��ȡ��ǰҳ��title��ֵ
		System.out.println("��ǰ��ҳ��ı����ǣ�"+driver.getTitle());
		
		//�رղ��˳������
		driver.quit();
	}

}
