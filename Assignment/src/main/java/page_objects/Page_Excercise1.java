package page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Excercise1 {
	
	@FindBy(xpath="//*[contains(@id,'lbl_val_')]")
	public static List<WebElement> ElementsList_Labels;
	
	@FindBy(xpath="//*[contains(@id,'txt_val_')]")
	public static List<WebElement> ElementsList_TextField_Values;
	
	@FindBy(id="lbl_ttl_val")
	public static WebElement Label_TotalBalance;
	
	@FindBy(id="txt_ttl_val")
	public static WebElement TextField_TotalValue;
}
