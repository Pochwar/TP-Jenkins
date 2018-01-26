package com.imie.tp.calculator.operation;

/**
 * Division class.
 * @author poch
 *
 */
public class DivisionOperation extends OperationCommandBase {

    public DivisionOperation(float baseValue) {
        super(baseValue);
    }

    @Override
    public void make(float value) {
        if (value == 0) {
            this.currentValue = Integer.MIN_VALUE;
        } else {
            this.currentValue /= value;
        }
    }

    public float getCurrentValue() {
        return this.currentValue;
    }

}
