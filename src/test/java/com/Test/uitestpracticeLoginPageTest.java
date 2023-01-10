package com.Test;

import com.Pages.uitestpracticeLoginPage;
import com.basePack.BaseClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class uitestpracticeLoginPageTest extends BaseClass {
    uitestpracticeLoginPage uitTP;

    @BeforeMethod
    public void initializeuitestpracticeLoginPage() {
        uitTP= PageFactory.initElements(driver, uitestpracticeLoginPage.class);

    }

    @Test(dataProvider = "uitTPdata")
    public void UserApplicationForm(String Fname, String Lname,String CountryNM, String DOB,String Phone,
                                    String UserNM,String Email, String Comment, String PWRD) throws InterruptedException {
        driver.get("http://uitestpractice.com/Students/Form");
        uitTP.enterFirstName(Fname);
        uitTP.enterLastName(Lname);
        uitTP.clickOnMarriedBTN();
        uitTP.clickHobby();
        uitTP.selCountry(CountryNM);
        Thread.sleep(3000);
        uitTP.enterdateOfBirth(DOB);
        uitTP.enterPhoneNo(Phone);
        uitTP.enterUsername(UserNM);
        uitTP.enterEmail(Email);
        Thread.sleep(3000);
        uitTP.enterComment(Comment);
        uitTP.enterPassword(PWRD);
        uitTP.clicksubmitBTN();
        Thread.sleep(3000);


    }//Test End

    @DataProvider(name="uitTPdata")
    public Object[][] getData(){
        return new Object[][] {
                {"Md", "Hossain", "Bangladesh", "09/01/1978", "3472854204", "hossain2100", "hossain@gmail.com", "QA Automation", "12345678"},
                {"Shahed", "Noor", "Bangladesh", "01/01/1985", "9292854204", "noor1200", "noor@gmail.com", "Big Data DEVELOPER", "abcd5678"},
                {"Shahriar", "Rahman", "Bangladesh", "06/07/1995", "3472853829", "rahamansh00", "rahman@gmail.com", "Data Engineer", "12345678"},
                {"Emrul", "Emran", "Bangladesh", "06/15/1978", "9292854277", "emran2100", "emrul@gmail.com", "Bigdata Engineer", "zmsd5678"},
                {"Spancer", "Rahman", "Bangladesh", "09/01/1992", "3472903204", "rahman2100", "rahman@gmail.com", "QA Automation", "12345678"},


		};
    }

}//Class End
//Class End
//Class End
//Class End
