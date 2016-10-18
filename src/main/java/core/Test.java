package core;

import java.time.LocalTime;
import java.util.Locale;

/**
 * Created by User on 18.10.2016.
 */
public class Test {
    public static void main(String[] args) {

        GreetingsChoice greetingsChoice = new GreetingsChoice();

        System.out.println(greetingsChoice.choice(Locale.getDefault(), LocalTime.now(), "cp1251"));

    }
}
