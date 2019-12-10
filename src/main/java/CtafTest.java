import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/** 

*

*/
public class CtafTest {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.19.223.226:8080/#/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-routerlink/web-main/web-header/nav/div/ul/li[4]/a")).click();
		//driver.getCurrentUrl();
		Thread.sleep(3000);
		//窗口切换
		for (String handle:driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ctaf-page/nav/div/div[2]/a[5]")).click();//点击获取到白色主题
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ctaf-page/nav/div/div[2]/a[4]")).click();//点击切换到黑色主题
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Container\"]/div/ul/li[4]/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div[2]/div[1]/div[1]/ctaf-cp-tabsetn/div/div[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div[2]/div[1]/div[1]/ctaf-cp-tabsetn/div/div[1]/div/div/div/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Forms\"]/div/ul/li[22]/span/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[7]/ctaf-cp-textbox/ctaf-cp-textualinput/ctaf-cp-formcontrol/div/input")).clear();//清空用户名框中的值
		Thread.sleep(2000);
		driver.findElement((By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[7]/ctaf-cp-textbox/ctaf-cp-textualinput/ctaf-cp-formcontrol/div/input"))).sendKeys("12345678");//用户名
		Thread.sleep(2000);
		driver.findElement(By.name("usertruename")).sendKeys("yangyang");//真实姓名
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[9]/ctaf-cp-password/ctaf-cp-textualinput/ctaf-cp-formcontrol/div/input")).sendKeys("aaaa1111!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[10]/ctaf-cp-bignumber/div/div/input")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[13]/ctaf-cp-datetimepicker/span/input")).sendKeys("1990-07-20");
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[13]/ctaf-cp-datetimepicker/span/div/div[2]/table/tbody/tr[4]/td[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userjob\"]/ctaf-cp-autocomplete/span/input")).sendKeys("测试");//第一职业
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[17]/ctaf-cp-dropdownlist/div/button/span")).click();//第二职业
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/div[17]/ctaf-cp-dropdownlist/div/button/span/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ctaf-page/div/div[2]/div/ng-component/div/form/ctaf-cp-button[1]/button")).click();

		//driver.findElement(By.xpath("//*[@id=\"SwitchComponent_44\"]/div[1]/div/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"RadioboxComponent_45\"]/div[1]/input")).click();
		//Thread.sleep(2000);
		//driver.quit();
	}
}