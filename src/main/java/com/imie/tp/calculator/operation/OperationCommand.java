package com.imie.tp.calculator.operation;

/**
 * Operation interface.
 * @author poch
 *
 */
public interface OperationCommand {

    /**
     * Method to make operation.
     * @param value
     */
    void make(final float value);

    /**
     * Method to get the current value.
     * @return
     */
    float getCurrentValue();
}
