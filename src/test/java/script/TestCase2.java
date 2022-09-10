package script;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.Point;


import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
@Test
public void tc2() throws IOException
{
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	utilities.switchingTabs(driver);
	SkillraryDemoLogin d= new SkillraryDemoLogin(driver);
	utilities.dropdown(d.getCourseDropDown(),pdata.getPropertydata("nameofthecourse"));//something wrong
	//dropdown(d.getCoursetab(),pdata.getPropertydata("coursename"));
	
	
	
	TestingPage t = new TestingPage(driver);
	utilities.dragDrop(driver,t.getSeleniumtraining(), t.getCart());
	Point loc = t.getFacebook().getLocation();
	int x= loc.getX();
	int y=loc.getY();
	utilities.scrollBar(driver, x, y);
	t.facebooklogo();
	
	
}
}
