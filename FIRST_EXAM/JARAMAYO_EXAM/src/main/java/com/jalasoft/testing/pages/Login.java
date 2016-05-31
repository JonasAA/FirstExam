package com.jalasoft.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends AbstractBasePage {

    public static final String URL_TODOIST = "https://en.todoist.com/";

    /*@FindBy(id = "sel_login")
    private WebElement loginButtonMenu;*/

    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(className = "amibutton amibutton_red sel_login")
    private WebElement loginButton;

    public Login() {
        driver.get(URL_TODOIST);
        this.goToLoginForm();
    }

    public void goToLoginForm() {
        //loginButtonMenu.click();
        driver.findElement(By.xpath("//a[@class='sel_login']")).click();
        driver.switchTo().frame("GB_frame").switchTo().frame("GB_frame");
    }


   public void setEmailTextField(String username) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.clear();
        emailTextField.sendKeys(username);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public MainContainer clickLoginButtonToMainContainer() {
        //clickLoginButton();
        driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setEmailTextField(userName);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }

}
