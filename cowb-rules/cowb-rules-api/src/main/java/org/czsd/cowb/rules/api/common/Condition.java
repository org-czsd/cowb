package org.czsd.cowb.rules.api.common;

/**
 * condition
 */
public interface Condition {
    boolean evaluate(Facts facts);
}
