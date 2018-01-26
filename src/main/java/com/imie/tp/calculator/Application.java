package com.imie.tp.calculator;

import com.imie.tp.calculator.utils.KeyboardUtils;

public final class Application {

    /**
     * Constructor
     */
    private Application() {}


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Divide
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit

        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application

        //TODO
        boolean running = true;
        Integer task = 0;
        String menu = "Type of Operation :"
                /*
                + "\n- 1 : Addition"
                + "\n- 2 : Subtraction"
                + "\n- 3 : Divide"
                + "\n- 4 : Multiplication"
                + "\n- 5 : Display History"
                + "\n- 9 : Quit"
                */
                ;

        while (running) {
            switch (task) {
                case 0:
                    task = Integer.parseInt(KeyboardUtils.readFromKeyboard(menu));
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

}
