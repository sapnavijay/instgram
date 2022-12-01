package Instagram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Insta
{
	public static WebDriver chro;
	public static WebDriverWait w;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwaredrivers/chromedriver.exe");
		chro=new ChromeDriver();
		w=new WebDriverWait(chro, 15);
		chro.get("https://www.instagram.com/");
		
		createacc();
		login();
		chat();
		story();
	}
	
	public static void createacc() throws InterruptedException
	{
	
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//p[@class='_ab25']/a")))).click();
		Thread.sleep(1001);
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//input[@name='emailOrPhone']")))).sendKeys("sapna@gmail.com");
		
		chro.findElement(By.xpath("//input[@name='fullName']")).sendKeys("SapVijay");
		
		chro.findElement(By.xpath("//input[@name='username']")).sendKeys("teaaddict");
		chro.findElement(By.xpath("//input[@name='password']")).sendKeys("TEA1999");
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//button[.='Sign up']")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//a[.='Log in']")))).click();
	}
	public static void login() throws InterruptedException
	{
		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//input[@name='username']")))).sendKeys("sapnasantimaplar");
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//input[@type='password']")))).sendKeys("7224vijay");
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//button[@type='submit']")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//div[@class='_aagx']")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//button[.='Not Now']")))).click();
		
	}
	public static void chat() throws InterruptedException
	{
		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//a[@href='/direct/inbox/?next=%2F']")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//h4[.='Messages']/ancestor::div[2]/following-sibling::div[1]//a//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//textarea[@placeholder='Message...']")))).sendKeys("hii");
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//button[.='Send']")))).click();
		
		/*Actions act=new Actions(chro);
		Thread.sleep(5000);
		WebElement signin = chro.findElement(By.xpath("(//textarea[@placeholder='Message...']/ancestor::div[5]/div[1]/div[1]/div[1]/div)[last()]"));
		act.moveToElement(signin).perform();
		Thread.sleep(5000);
		chro.findElement(By.xpath("(//textarea[@placeholder='Message...']/ancestor::div[5]/div[1]/div[1]/div[1]/div)[last()]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		JavascriptExecutor un = (JavascriptExecutor)chro;
		WebElement unsend = chro.findElement(By.xpath("(//div[.='Unsend'])[1]/button"));
		un.executeScript("arguments[0].click();", unsend);
		//Alert del = chro.switchTo().alert();
		//del.accept();*/
	}
	public static void story() throws InterruptedException
	{
		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("(//a[@href='/?next=%2F'])[2]")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//div[@role='menu']/div[1]/div[1]/div[1]/ul/li[3]/div[1]/button")))).click();
		w.until(ExpectedConditions.visibilityOf(chro.findElement(By.xpath("//a[@href='/?next=%2F']")))).click();
	}
	
}




