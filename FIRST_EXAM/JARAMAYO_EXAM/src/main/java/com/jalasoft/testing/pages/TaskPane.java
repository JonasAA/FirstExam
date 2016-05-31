package com.jalasoft.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Jonas Aramayo on 5/30/2016.
 */
public class TaskPane extends AbstractBasePage{
    private String nameTask_;
    private String priority_;

    @FindBy(xpath = "//div[@class='richtext_editor sel_richtext_editor']")
    private WebElement nameTaskTextField;

    @FindBy(xpath = "//img[@class='cmp_priority4 form_action_icon menu_icon']")
    private WebElement priorityButton;

    @FindBy(className = "//td[@class='on']")
    private WebElement priorityPane;

    @FindBy(className = "//span[contains(.,'Add Task')]")
    private WebElement addTaskButton;

    public TaskPane(String nameTask, String priority) {
        nameTask_ = nameTask;
        priority_ = priority;
        this.setNameTask();
        this.setPriority();
        this.clickAddTaskButton();
    }

    public void setNameTask(){
        wait.until(ExpectedConditions.visibilityOf(nameTaskTextField));
        nameTaskTextField.sendKeys(nameTask_);
    }

    public void setPriority(){
        /*wait.until(ExpectedConditions.visibilityOf(priorityButton));
        priorityButton.click();

                //frame(driver.findElement(By.id("iframeResult")));
        priorityPane.click();
        driver.findElement(By.className("AmiMenu priority_menu"))
                .findElement(By.className("no_hover"))
                .findElement(By.className("menu_buttons priorities"))
                .findElement(By.className("priorities"))
                .findElement(By.className("a_priority pri_selected"));*/
    }
    public void clickAddTaskButton(){
        driver.findElement(By.xpath("//span[contains(.,'Add Task')]")).click();
        /*wait.until(ExpectedConditions.elementToBeClickable(addTaskButton));
        addTaskButton.click();*/
    }

}