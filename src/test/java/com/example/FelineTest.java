package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getFoodFeline() throws Exception{
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFelineFamily(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutKittensCount(){
      Feline feline = new Feline();
      int expectedKittensCount = 1;
      int actualKittensCount = feline.getKittens();
      Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensWithKittensCount(){
        Feline feline = new Feline();
        int expectedKittensCount = 7;
        int actualKittensCount = feline.getKittens(expectedKittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
