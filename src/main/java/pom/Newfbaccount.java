package pom;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;





public class Newfbaccount  extends Basepage implements Autoconstant 
{

	//private static final String sheet = null;
	//private static final String excel_path = null;
	public WebDriver driver;
	//Declaration
	@FindBy(xpath="//input[@id='u_0_m']")
	private WebElement fn;
	
	@FindBy(xpath="//input[@id='u_0_o']")
	private WebElement sn;
	
	@FindBy(xpath="//input[@id='u_0_r']")
	private WebElement no;
	
	@FindBy(xpath="//input[@id='u_0_w']")
	private WebElement password;
	@FindBy(id="day")
	private WebElement date;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	 @FindBy(xpath="//label[.='Male']")
	 private WebElement male;
	 @FindBy(xpath="//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")
	 private WebElement sginup;

	
	//Intilization
	public Newfbaccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	//utilisation
	public void createfb() throws IOException, InterruptedException
	{
		Thread.sleep(6000);
		fn.sendKeys(Excellibrary.getcellvalue(excel_path, sheet, 0, 0));
		sn.sendKeys(Excellibrary.getcellvalue(excel_path, sheet, 0, 1));
		no.sendKeys(Excellibrary.getcellvalue(excel_path, sheet,  0, 2));
	    password.sendKeys(Excellibrary.getcellvalue(excel_path, sheet, 0, 3));
		//fn.sendKeys("mikun");
		//sn.sendKeys("mohanty");
		//no.sendKeys("6371933645");
		//password.sendKeys("dibya1234");

	   
	}
	
	public void birthday(){
		selectbyindex(date, 8);
		selectbyindex(month, 2);
		selectbyindex(year, 25);
		
		/*WebElement listbox = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(listbox);
		sel.selectByIndex(3);*/
		//sel.selectByVisibleText(arg0);
		}
		
	
		
	
	
		
	
	
	public void gender(){
		male.click();
		sginup.click();
	
	
	
	





















	}
}
