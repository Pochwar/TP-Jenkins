package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * Class to add some utils functions.
 * @author poch
 *
 */
public final class KeyboardUtils {

    @SuppressWarnings("resource")
    public static String readFromKeyboard(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        return keyboard.nextLine();
    }
}
