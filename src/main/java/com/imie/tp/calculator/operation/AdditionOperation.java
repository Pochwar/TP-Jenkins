package com.imie.tp.calculator.operation;

/**
 * Addition class.
 * @author poch
 *
 */
public class AdditionOperation extends AbstractOperationCommandBase {

    /**
     * Method constructor.
     * @param baseValue
     */
    public AdditionOperation(final float baseValue) {
        super(baseValue);
    }


    /**
     * Method to make the addition.
     * @param value
     */
    @Override
    public void make(final float value) {
        this.currentValue += value;

    }

    /**
     * Method to get the current value.
     */
    public float getCurrentValue() {
        return this.currentValue;
    }

}
