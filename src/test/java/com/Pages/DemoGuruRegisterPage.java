package com.Pages;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DemoGuruRegisterPage extends BaseClass {
    @FindBy(name="firstName")
    WebElement firstname;
    public void enterFirstName(String fname) {
        firstname.sendKeys(fname);
    }
    @FindBy(name="lastName")
    WebElement lastname;
    public void enterLastName(String lname) {
        lastname.sendKeys(lname);
    }

    @FindBy(name="phone")
    WebElement phoneNo;
    public void enterPhoneNo(String phonenum){
        phoneNo.sendKeys(phonenum);
    }

    @FindBy(id="userName")
    WebElement eMail;
    public void enterEmail(String email){
        eMail.sendKeys(email);
    }

    @FindBy(name="address1")
    WebElement inputaddress;
    public void enterAddress(String address){
        inputaddress.sendKeys(address);
    }
    @FindBy(name="city")
    WebElement cityName;
    public void enterCity(String city){
        cityName.sendKeys(city);
    }
    @FindBy(name="state")
    WebElement inputStateName;
    public void enterStateName(String state){
        inputStateName.sendKeys(state);
    }

    @FindBy(name="postalCode")
    WebElement inputZip;
    public void enterZipcode(String zipcode){
        inputZip.sendKeys(zipcode);
    }

    //SELECT METHOD==========================
    @FindBy(name="country")
    WebElement countrySelect;
    public void selCountry(String country) {
        Select selectCountry = new Select(countrySelect);
        selectCountry.selectByVisibleText(country);
    }

    @FindBy(id="email")
    WebElement userName;
    public void enterUserName(String user){
        userName.sendKeys(user);
    }

    @FindBy(name = "password")
    WebElement pWord;
    public void enterPassword(String passWord){
        pWord.sendKeys(passWord);
    }

    @FindBy(name = "confirmPassword")
    WebElement confirmPWord;
    public void enterRePassword(String rePassword){
        confirmPWord.sendKeys(rePassword);
    }

    @FindBy(name="submit")
    WebElement submitBTN;
    public void clickOnSubmitBTN(){
        submitBTN.click();
    }


   @FindBy(name="submit")
    WebElement submitBTN;
    public void clickOnSubmitBTN(){
        submitBTN.click();
    }




}//ClassEnd
