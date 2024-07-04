package POM_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {


 @FindBy(xpath = "//span[text()='Vinayak Ashok Chavan']") private WebElement  name;

    public homepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }




public void verifyname()
{
    String text = name.getText();
    System.out.println(text);
    String exptext="Vinayak Ashok Chavan";

    if (text.equals(exptext))
    {
        System.out.println("correct name");

    }
    else
    {
        System.out.println("wrong name");

    }



}




}
