package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Jonas Aramayo on 5/30/2016.
 */
public class InboxHome extends AbstractBasePage{
    @FindBy(xpath = "//a[contains(.,'Add Task')]")
    private WebElement addTaskLink;

    public TaskPane clickAddTask(String nameTask, String priority) {
        wait.until(ExpectedConditions.elementToBeClickable(addTaskLink));
        addTaskLink.click();
        return new TaskPane(nameTask, priority);
    }
}
