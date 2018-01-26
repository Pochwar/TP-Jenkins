package com.imie.tp.calculator.operation;

/**
 * Base Operation command.
 * @author poch
 *
 */
public abstract class AbstractOperationCommandBase implements OperationCommand {

    /**
     * Value of the operation.
     */
    public transient float currentValue;

    /**
     * Constructor.
     * @param baseValue
     */
    public AbstractOperationCommandBase(final float baseValue) {
        this.currentValue = baseValue;
    }

}
