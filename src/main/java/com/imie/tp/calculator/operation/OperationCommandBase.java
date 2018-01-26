package com.imie.tp.calculator.operation;

/**
 * Base Operation command.
 * @author poch
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

    public float currentValue;

    public OperationCommandBase(float baseValue) {
        this.currentValue = baseValue;
    }

}
