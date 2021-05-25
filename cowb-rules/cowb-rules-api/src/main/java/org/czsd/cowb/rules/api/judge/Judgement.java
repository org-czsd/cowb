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
     * get the action to be executed when the condition is true
     *  @return then action
     */
    Action then();
    
    /**
     * get the action to be executed when the condition is false
     *  @return otherwise action
     */
    Action otherwise();
    
    /**
     * get the action to be evaluated
     * @return the condition
     */
    Condition condition();
    
    /**
     *  evaluate the result of the condition by facts
     * @param facts the facts
     * @return the result of the conditon with the facts
     */
    boolean evaluate(Facts facts);
    
}
