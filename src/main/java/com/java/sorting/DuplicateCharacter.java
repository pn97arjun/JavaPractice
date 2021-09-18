package com.java.sorting;

import org.testng.annotations.Test;

public class DuplicateCharacter {

    @Test
    public void duplicateCharacterString() {
        String str1 = "Selenium Selenium";
        char str[] = str1.toCharArray();
        int i, j, count = 0;
        for (i = 0; i < str.length; i++) {
            count = 1;
            for (j = i + 1; j < str.length; j++) {

                if (str[i] == str[j] && str[i] != ' ') {
                    count++;
                    str[j] ='0'; //remove visited characters
                }
            }
            if (count > 1 && str[i] != '0')
                System.out.println(str[i] + " " + count);
        }

    }
}



