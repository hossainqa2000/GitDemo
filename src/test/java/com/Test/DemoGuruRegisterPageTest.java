package com.Test;

import com.Pages.DemoGuruRegisterPage;
import com.basePack.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoGuruRegisterPageTest extends BaseClass {
    DemoGuruRegisterPage dgTP;

    @BeforeMethod
    public void initializeuitestpracticeLoginPage() {
        dgTP= PageFactory.initElements(driver, DemoGuruRegisterPage.class);
    }
 @BeforeMethod
    public void initializeuitestpracticeLoginPage() {
        dgTP= PageFactory.initElements(driver, DemoGuruRegisterPage.class);
    }

    @Test(dataProvider = "dgTPdata")
    public void UserApplicationForm(String Fname, String Lname, String Pno, String Email, String Address, String City, String State, String PostalCode,
                                   String Country, String UserName, String Password, String ConPassword ) throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        dgTP.enterFirstName(Fname);
        dgTP.enterLastName(Lname);
        dgTP.enterPhoneNo(Pno);
        dgTP.enterEmail(Email);
        dgTP.enterAddress(Address);
        dgTP.enterCity(City);
        dgTP.enterStateName(State);
        dgTP.enterZipcode(PostalCode);
        dgTP.selCountry(Country);
        dgTP.enterUserName(UserName);
        dgTP.enterPassword(Password);
        dgTP.enterRePassword(ConPassword);
        dgTP.clickOnSubmitBTN();

        Thread.sleep(3000);


    }//Test End
    @DataProvider(name="dgTPdata")
    public Object[][] getData(){
        return new Object[][] {
                {"Md","Hossain","3472854204","hossain@gmail.com","8835 164th ST","Jamaica","New York","11432","UNITED STATES","hossain2100","1234abcd","1234abcd"},
                {"Emrul","Emran","9292854201","emrul@gmail.com","10019 204th ST","Jamaica","New York","11432","UNITED STATES","emran7700","abcdabcd","abcdabcd"},
                {"Shahed","Noor","3929382462","noor@gmail.com","8835 214th ST","Jamaica","New York","11432","UNITED STATES","shahedny","1234abcd","12344859"},
                {"Rahman","Shafin","7162854007","shafin@gmail.com","1315 post Ave","Elmond","New York","11111","UNITED STATES","shafin231","1234abcd","12najd54"},
			{"Rahman","Shafin","7162854007","shafin@gmail.com","1315 post Ave","Elmond","New York","11111","UNITED STATES","shafin231","1234abcd","12najd54"},



        };
    }


}//ClassEnd
