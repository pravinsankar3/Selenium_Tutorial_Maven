package org.example.testNG;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = {"apple"})
    public void apple1(){
        System.out.println("apple1");
    }
    @Test(groups = {"apple"})
    public void apple2(){
        System.out.println("apple2");
    }
    @Test(groups = {"samsung"})
    public void samsung1(){
        System.out.println("samsung1");
    }
    @Test(groups = {"samsung"})
    public void samsung2(){
        System.out.println("samsung2");
    }
    @Test(groups = {"vivo"})
    public void vivo1(){
        System.out.println("vivo1");
    }
    @Test(groups = {"vivo"})
    public void vivo2(){
        System.out.println("vivo2");
    }
}
