package org.example.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    @Test
    @Parameters("Name")
    public void firstTestcase(String name){
        System.out.println("My Name is: "+name);

    }
}

/*
    included in XML:
        <parameter name="Name" value="Pravin"></parameter>
 */