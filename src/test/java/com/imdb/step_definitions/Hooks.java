package com.imdb.step_definitions;

import com.imdb.util.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){

        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(){
       Driver.getDriver().close();
    }

}
