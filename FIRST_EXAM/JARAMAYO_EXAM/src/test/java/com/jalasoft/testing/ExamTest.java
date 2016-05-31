package com.jalasoft.testing;

import com.jalasoft.testing.pages.InboxHome;
import com.jalasoft.testing.pages.LeftPane;
import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.MainContainer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Jonas Aramayo on 5/25/2016.
 */
public class ExamTest {
    private MainContainer mainContainer;

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        mainContainer = login.loginAs("pedroaramayot@hotmail.com", "Control*88");
    }

    @Test
    public void testAddATaskFromInbox() {
        String taskName = "Task 01";
        String priority = "New Campaign 00001";
        /**Steps:
         * 1. Go to Inbox section
         * 2. Click '+ Add Task' link
         * 3. Set a name
         * 4. Select a Priority
         * 5. Click Add Task button*/
        LeftPane leftPane = mainContainer.goToLeftPane();
        InboxHome inboxHome= leftPane.clickInboxSection();
        inboxHome.clickAddTask(taskName,priority);
        /*inboxHome.setANameTask(taskName);
        inboxHome.selectPriority(priority);
        inboxHome.clickAddTaskButton();*/
    }
}
