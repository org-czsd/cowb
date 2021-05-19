package org.czsd.cowb.rules.api.common;

/**
 * a rule includes one {@link Condition} and two {@link Action}s which would be executed
 * when then condition is true or false
 */
public interface Rule {
    
    /**
     * fire the rule
     * @param facts the facts to be used
     * @return the result of the rule executed under the facts
     */
    Object fire(Facts facts);
}
