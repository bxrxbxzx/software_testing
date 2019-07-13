package ru.softwaretesting.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.softwaretesting.addressbook.appmanager.AplicationManager;

public class TestBase {


    protected final AplicationManager app = new AplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        app.stop();
    }


}
