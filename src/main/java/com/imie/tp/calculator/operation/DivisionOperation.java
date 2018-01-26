package com.imie.tp.calculator.operation;

public class DivisionOperation extends OperationCommandBase {

    public DivisionOperation(float baseValue) {
        super(baseValue);
    }

    @Override
    public void make(float value) {
        if(value == 0) {
            this.currentValue = Integer.MIN_VALUE;
        } else {
            this.currentValue /= value;
        }
    }

    public float getCurrentValue() {
        return this.currentValue;
    }

}
