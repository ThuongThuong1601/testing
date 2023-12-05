package com.guru99.pages;

import org.opena.selenium.WebDriver;

import org.opena.selenium.WebElement;

import org.opena.selenium.support.CacheLookup;

import org.opena.selenium.support.FindBy;

import org.opena.selenium.support.PageFactory;

import main.java.com.guru99.page.page.BasePage;

public class LoginPage extends BasePage{

    @CacheLookup
    @FindBy(name="uid")
    private WebDriver userId;

    @CacheLookup
    @FindBy(name="password")
    private WebElement userPassword;

    @CacheLookup
    @FindBy(name="btnLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver, this);
    }

    public void loginToApplication(String username, String password){
        elementControl.setText(userId, username);

        elementControl.setText(userPassword, password);

        elementControl.clickElement(loginButton);
    }
}