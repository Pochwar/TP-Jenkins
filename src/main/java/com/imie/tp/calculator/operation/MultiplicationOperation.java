package com.imie.tp.calculator.operation;

/**
 * Multiplication class.
 * @author poch
 *
 */
public class MultiplicationOperation extends AbstractOperationCommandBase {

    /**
     * Method constructor.
     * @param baseValue
     */
    public MultiplicationOperation(final float baseValue) {
        super(baseValue);
    }

    /**
     * Method to make the multiplication.
     * @param value
     */
    @Override
    public void make(final float value) {
        this.currentValue *= value;

    }

    /**
     * Method to get the current value.
     */
    public float getCurrentValue() {
        return this.currentValue;
    }

}
