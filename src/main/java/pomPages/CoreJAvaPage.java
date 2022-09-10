package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJAvaPage {
@FindBy(xpath="//img[@title='Core Java for Selenium']")
private WebElement selenium;

public CoreJAvaPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}public void seleniumtrainings() {
	selenium.click();
}
}
