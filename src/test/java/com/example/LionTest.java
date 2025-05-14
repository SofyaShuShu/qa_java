package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertThrows;

public class LionTest {

    @Mock
    Feline feline;

   @Before
   public void setUp() {
       MockitoAnnotations.openMocks(this);
   }

    @Test
    public void getKittensWithoutKittensCount() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        int expectedKittensCount = 1;
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
       public void getFoodLion() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getExceptionWithIncorrectLionSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Не удалось определить", feline);
        });

        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
