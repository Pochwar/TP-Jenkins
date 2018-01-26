package com.imie.tp.calculator.utils;

import java.util.Locale;
import java.util.Scanner;

/**
 * Class to add some utils functions.
 * @author poch
 *
 */
public final class KeyboardUtils {

    /**
     * Get keyboard answer to a console question.
     * @param displayAsk
     * @return
     */
    @SuppressWarnings("resource")
    public static String readFromKeyboard(final String displayAsk) {
        final Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.ENGLISH);

        System.out.println(displayAsk);

        return keyboard.nextLine();
    }
}
