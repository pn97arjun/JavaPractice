package com.java.practice;
import org.testng.annotations.Test;
public class swapvalueswithout3rdvariable {

    @Test
public void swap() {
        int x=10;
        int y=5;
        System.out.println("Before Swapping X:" + x + "  Y:" + y );
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping X:" + x + "   Y:" + y );
}
}
