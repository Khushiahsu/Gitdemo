package script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
@Test

public void tc1() {
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	utilities.switchingTabs(driver);
	SkillraryDemoLogin sd= new SkillraryDemoLogin(driver);
	utilities.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtab();
	
	AddToCart d = new AddToCart(driver);
	utilities.doubleClick(driver,d.getAddbutn());
	d.addtocartbtn();
	utilities.alertPopup(driver);
	
}
}
