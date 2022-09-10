package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearstab;

@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
private WebElement SkillraryDemoApp;

@FindBy(name="q")
private WebElement searchtab;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;



public SkillraryLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void gearsbutton() {
	gearstab.click();
}
public void skillrarydemoapplication()
{
	SkillraryDemoApp.click();
}
public WebElement getSearchtab() {
	return searchtab;
}
}