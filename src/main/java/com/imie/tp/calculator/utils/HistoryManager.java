package com.imie.tp.calculator.utils;

import java.util.ArrayList;

/**
 * Class to manage history of operations.
 * @author poch
 *
 */
public class HistoryManager {

    /**
     * HistoryManager instance.
     */
    private static final HistoryManager INSTANCE = new HistoryManager();

    /**
     * History list.
     */
    private final transient ArrayList<String> cache = new ArrayList<String>();

    /**
     * Singleton method to get HistoryManager instance.
     */
    public static HistoryManager getInstance() {
        return INSTANCE;
    }

    /**
     * Add an operation to the list.
     * @param operation
     */
    public final void addOperation(final String operation) {
        this.cache.add(operation);
    }

    /**
     * Clear the list.
     */
    public void clear() {
        this.cache.clear();
    }

    /**
     * Get the list.
     * @return
     */
    public String getHistory() {
        final StringBuilder stringBuilder = new StringBuilder();

        for (final String string : cache) {
            stringBuilder.append(string);
            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }

}
