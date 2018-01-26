package com.imie.tp.calculator.operation;

/**
 * Operation interface.
 * @author poch
 *
 */
public interface OperationCommand {

    void make(float value);

    float getCurrentValue();
}
