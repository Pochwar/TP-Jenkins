package com.imie.tp.calculator.operation;

/**
 * Subtraction class.
 * @author poch
 *
 */
public class SubstractionOperation extends AbstractOperationCommandBase {

    /**
     * Method constructor.
     * @param baseValue
     */
    public SubstractionOperation(final float baseValue) {
        super(baseValue);
    }

    /**
     * Method to make the subtraction.
     * @param value
     */
    @Override
    public void make(final float value) {
        this.currentValue -= value;

    }

    /**
     * Method to get the current value.
     */
    public float getCurrentValue() {
        return this.currentValue;
    }

}
