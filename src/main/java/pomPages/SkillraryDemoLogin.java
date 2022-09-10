package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
@FindBy(id="course")
private WebElement coursetab;



@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
private WebElement seleniumtrain;


@FindBy(name="addresstype")//test2
private WebElement courseDropDown;//test2



public WebElement getCoursetab() {
	return coursetab;
}

public WebElement getCourseDropDown() {//test2
	return courseDropDown;//test2
}
public SkillraryDemoLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
    public void  seleniumtab() {
	seleniumtrain.click();

    }
}

//

//@FindBy(xpath="//select[@class='chosen-select']")//
//private WebElement dropdown;

//public WebElement getDropdown() {
	//return dropdown;
//}




