package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by pgone on 29.01.2017.
 */
public class LoginPage {
    @FindBy(how = How.NAME, using = "email")
    public WebElement email;
    @FindBy(how = How.NAME, using = "passwd")
    public WebElement password;
    @FindBy(how = How.NAME, using = "SubmitLogin")
    public WebElement LoginButton;
    @FindBy(how = How.NAME, using = "alert alert-danger")
    public WebElement AlertClass;


    public WebElement getEmail(){return email;};
    public WebElement getPassword(){return password;};
    public WebElement getLoginButton(){return LoginButton;};
    public WebElement getAlertClass(){return AlertClass;};
}
