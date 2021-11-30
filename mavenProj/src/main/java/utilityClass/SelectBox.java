package utilityClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {
	public void selectBoxHandler(WebElement ele,String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);
	}

}
