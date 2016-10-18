package core;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Locale;

/**
 * Created by User on 18.10.2016.
 */
public class GreetingsChoiceTest {
    @Test
    public void choiceTest0() {
        String result = new GreetingsChoice().choice(Locale.getDefault(), LocalTime.now(), "cp1251");
        Assert.assertNotNull("Error: result is null in choiceTest0() ",result);
    }
    

    @Test
    public void choiceTest1() {
        String result = new GreetingsChoice().choice(Locale.getDefault(), LocalTime.now(), "cerere");
        Assert.assertNull("Error: result is not null in choiceTest1() ",result);
    }

    @Test
            (expected = Exception.class)
    public void choiceTest2() {
        String result = new GreetingsChoice().choice(Locale.getDefault(), LocalTime.of(25, 3, 3), "cp1251");

    }

    @Test
            (timeout = 1000)
    public void choiceTest3() {
        String result = new GreetingsChoice().choice(Locale.getDefault(), LocalTime.of(23, 3, 3), "cp1251");

    }
}