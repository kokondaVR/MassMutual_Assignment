package page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Excercise1 {
	
	@FindBy(xpath="//*[contains(@id,'lbl_val_')]")
	public static List<WebElement> Label_Values_List;
	
	@FindBy(xpath="//*[contains(@id,'txt_val_')]")
	public static List<WebElement> TextField_Values_List;
	
	@FindBy(id="lbl_ttl_val")
	public static WebElement Field_TotalBalance;
	
	@FindBy(id="txt_ttl_val")
	public static WebElement TxtField_TotalValue;
}
