package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Jonas Aramayo on 5/30/2016.
 */
public class LeftPane extends AbstractBasePage{
    @FindBy(xpath = "//li[@id='filter_inbox']")
    private WebElement inboxSection;

    public InboxHome clickInboxSection() {
        wait.until(ExpectedConditions.elementToBeClickable(inboxSection));
        inboxSection.click();
        return new InboxHome();
    }
}