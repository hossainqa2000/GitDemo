package com.Pages;

import com.basePack.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class uitestpracticeLoginPage extends BaseClass {
    @FindBy(id="firstname")
    WebElement firstname;
    public void enterFirstName(String fname) {
        firstname.sendKeys(fname);
    }
    @FindBy(id="lastname")
    WebElement lastname;
    public void enterLastName(String lname) {
        lastname.sendKeys(lname);
    }

    @FindBy(name="optradio")
    WebElement martialStatus;
    public void clickOnMarriedBTN() {
        martialStatus.click();
    }

    @FindBy(xpath="//input[@value='read']")
    WebElement hobby;
    public void clickHobby() {
        hobby.click();
    }
    @FindBy(id="sel1")
    WebElement countrySelect;
    public void selCountry(String country) {
        Select selectCountry = new Select(countrySelect);
        selectCountry.selectByVisibleText(country);
    }

    @FindBy(id="datepicker")
    WebElement dateOfBirth;
    public void enterdateOfBirth(String dtOfBirth) {
        dateOfBirth.sendKeys(dtOfBirth);
    }

    @FindBy(id="phonenumber")
    WebElement phoneNo;
    public void enterPhoneNo(String phone) {
        phoneNo.sendKeys(phone);
    }

    @FindBy(id="username")
    WebElement username;
    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    @FindBy(id="email")
    WebElement email;
    public void enterEmail(String mail) {
        email.sendKeys(mail);
    }

    @FindBy(id="comment")
    WebElement userComment;
    public void enterComment(String comment) {
        userComment.sendKeys(comment);
    }

    @FindBy(id="pwd")
    WebElement password;
    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }
    @FindBy(xpath="//button[@type='submit']")
    WebElement submitBTN;
    public void clicksubmitBTN() {
        submitBTN.click();
    }




}//ClassEnd
