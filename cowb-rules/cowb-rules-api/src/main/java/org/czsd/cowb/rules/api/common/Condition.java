package org.czsd.cowb.rules.api.common;

/**
 * condition
 */
public interface Condition {
    
    /**
     * evaluate the result of this {@link Condition} by given facts
     * @return true or false
     */
    boolean evaluate(Facts facts);
}
