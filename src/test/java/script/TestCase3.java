package script;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CoreJAvaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishList;

public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchtxtbox(pdata.getPropertydata("coursedata"));
		s.gobutton();
	
	    CoreJAvaPage cj= new CoreJAvaPage(driver); 
	    cj.seleniumtrainings();
	    
	    WishList w = new WishList(driver);{
	    	utilities.switchFrame(driver);
	    	w.playbutton();
	    	w.pausebutton();
	    	utilities.switchbackframe(driver);
	    	
	    }
		
		
	}
}

