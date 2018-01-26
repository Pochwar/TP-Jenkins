package com.imie.tp.calculator.operation;

public class MultiplicationOperation extends OperationCommandBase {

    public MultiplicationOperation(float baseValue) {
        super(baseValue);
    }

    @Override
    public void make(float value) {
        this.currentValue *= value;

    }

    public float getCurrentValue() {
        return this.currentValue;
    }

}
