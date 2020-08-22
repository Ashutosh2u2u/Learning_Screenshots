package sikuliDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest {

	public static void main(String[] args) throws Exception {
        //Sikuli: object creation of Screen and Pattern class to instantiate their methods
		Screen screen=new Screen();
		Pattern image1=new Pattern("D:\\Software Support\\Sikuli Tool\\Sikuli_Images\\Fb_Id.PNG");
		Pattern image2=new Pattern("D:\\Software Support\\Sikuli Tool\\Sikuli_Images\\Fb_pwd.PNG");
		Pattern image3=new Pattern("D:\\Software Support\\Sikuli Tool\\Sikuli_Images\\Fb_Login.PNG");
		
		//Selenium Webdriver: launch url in chrome browser
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Utilize wait,type and click method of Screen Class
		//screen.wait(image1, 10);
		screen.type(image1,"abc@gmail.com");
		screen.type(image2,"Ash123");
		screen.click(image3);
		
		driver.close();

	}

}
