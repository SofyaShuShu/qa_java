package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionHasManeParameterizedTest {
    @Mock
    Feline feline;
    private String sex;
    private boolean expectedMane;

    public LionHasManeParameterizedTest(String sexLion, boolean hasMane) {
        this.sex = sexLion;
        this.expectedMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void getLionHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualMane = lion.doesHaveMane();
        Assert.assertEquals(expectedMane, actualMane);
    }
}