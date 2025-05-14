package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    private Feline feline;

    @Test
    public void getKittens() throws Exception {
     LionAlex alex = new LionAlex(feline);
     int expectedKittens = 0;
     int actualKittens = alex.getKittens();
     Assert.assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFriends() throws Exception {
     LionAlex alex = new LionAlex(feline);
     List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
     List<String> actualFriends = alex.getFriends();
     Assert.assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
    LionAlex alex = new LionAlex(feline);
    String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
    String actualPlaceOfLiving = alex.getPlaceOfLiving();
    Assert.assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

}
