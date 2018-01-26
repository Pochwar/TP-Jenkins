package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * Application class for Calculator program.
 * @author poch
 *
 */
public final class Application {

    /**
     * Constant string for equality
     */
    private static final String EQUALS = " = ";

    /**
     * Constructor.
     */
    private Application() {}


    /**
     *
     * @param args
     */
    public static void main(final String... args) {

        boolean running = true;
        Integer task = 0;
        final String menu = "Type of Operation :"
                + "\n- 1 : Addition"
                + "\n- 2 : Subtraction"
                + "\n- 3 : Divide"
                + "\n- 4 : Multiplication"
                + "\n- 5 : Display History"
                + "\n- 9 : Quit"
                ;

        while (running) {
            switch (task) {
                case 0:
                    task = Integer.parseInt(KeyboardUtils.readFromKeyboard(menu));
                    break;

                case 1:
                    addition();
                    task = 0;
                    break;

                case 2:
                    substraction();
                    task = 0;
                    break;

                case 3:
                    division();
                    task = 0;
                    break;

                case 4:
                    multiplication();
                    task = 0;
                    break;

                case 5:
                    displayHistory();
                    task = 0;
                    break;

                case 9:
                    System.out.println("Goodbye !!");
                    running = false;
                    break;

                default :
                    task = 0;
                    break;
            }

        }
    }

    private static void addition() {
        final float[] values = askValues();
        final AdditionOperation addition = new AdditionOperation(values[0]);

        addition.make(values[1]);

        final String operation = values[0] + " + " + values[1] + EQUALS + addition.getCurrentValue();

        System.out.println(operation);
        recordValues(operation);
    }

    private static void substraction() {
        final float[] values = askValues();
        final SubstractionOperation substraction = new SubstractionOperation(values[0]);

        substraction.make(values[1]);

        final String operation = values[0] + " - " + values[1] + EQUALS + substraction.getCurrentValue();

        System.out.println(operation);
        recordValues(operation);
    }

    private static void division() {
        final float[] values = askValues();
        final DivisionOperation division = new DivisionOperation(values[0]);

        division.make(values[1]);

        final String operation = values[0] + " / " + values[1] + EQUALS + division.getCurrentValue();

        System.out.println(operation);
        recordValues(operation);
    }

    private static void multiplication() {
        final float[] values = askValues();
        final MultiplicationOperation multiplication = new MultiplicationOperation(values[0]);

        multiplication.make(values[1]);

        final String operation = values[0] + " * " + values[1] + EQUALS + multiplication.getCurrentValue();

        System.out.println(operation);
        recordValues(operation);
    }

    private static float[] askValues() {
        float[] valuesArray;
        valuesArray = new float[2];

        valuesArray[0] = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter value A"));
        valuesArray[1] = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter value B"));

        return valuesArray;
    }

    private static void recordValues(final String operation) {
        final HistoryManager historyManager = HistoryManager.getInstance();
        historyManager.addOperation(operation);
    }

    private static void displayHistory() {
        final HistoryManager historyManager = HistoryManager.getInstance();

        System.out.println(historyManager.getHistory());
    }

}
