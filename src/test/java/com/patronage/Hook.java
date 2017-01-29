package com.patronage;

import cucumber.api.Scenario;
import cucumber.api.java.After;

/**
 * Created by pgone on 29.01.2017.
 */
public class Hook {
    /*@Before
    public void InitializeTest()
    {

    }*/

    @After
    public void TearDownTest(Scenario scenario)
    {
        //if(scenario.isFailed()) ==
        System.out.println(scenario.getName()+" failed");
        //take screenshot
    }
}
