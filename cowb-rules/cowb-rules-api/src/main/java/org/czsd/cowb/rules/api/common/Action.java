package org.czsd.cowb.rules.api.common;

/**
 * action
 */
public interface Action {
    /**
     * the method defined for this {@link Action} that to be executed
     * @return the execution result
     */
    Object execute(Facts facts);
}
