package com.imie.tp.calculator.operation;

public class AdditionOperation extends OperationCommandBase {

    public AdditionOperation(float baseValue) {
        super(baseValue);
    }

    @Override
    public void make(float value) {
        this.currentValue += value;

    }

    public float getCurrentValue() {
        return this.currentValue;
    }

}
