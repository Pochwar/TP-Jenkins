package com.imie.tp.calculator.operation;

/**
 * Division class.
 * @author poch
 *
 */
public class DivisionOperation extends AbstractOperationCommandBase {

    /**
     * Method constructor.
     * @param baseValue
     */
    public DivisionOperation(final float baseValue) {
        super(baseValue);
    }

    /**
     * Method to make the division.
     * @param value
     */
    @Override
    public void make(final float value) {
        if (value == 0) {
            this.currentValue = Integer.MIN_VALUE;
        } else {
            this.currentValue /= value;
        }
    }

    /**
     * Method to get the current value.
     */
    public float getCurrentValue() {
        return this.currentValue;
    }

}
