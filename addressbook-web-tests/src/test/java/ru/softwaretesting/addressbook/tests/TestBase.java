package ru.softwaretesting.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.softwaretesting.addressbook.appmanager.ApplicationManager;

public class TestBase {


    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        app.stop();
    }


}
