package org.czsd.cowb.rules.api.judge;

import org.czsd.cowb.rules.api.common.Action;
import org.czsd.cowb.rules.api.common.Condition;
import org.czsd.cowb.rules.api.common.Facts;
import org.czsd.cowb.rules.api.common.Rule;

/**
 * a regular rule include a condition
 */
public interface Judgement extends Rule {
    
    /**
     *  @return the action to be executed when the condition is true
     */
    Action then();
    
    /**
     *  the action to be executed when the condition is false
     */
    Action otherwise();
    
    /**
     *  the action to be evaluated
     */
    Condition condition();
    
    /**
     *  evaluate the result of the condition by facts
     * @param facts the facts
     * @return the result of the conditon with the facts
     */
    boolean evaluate(Facts facts);
    
}
