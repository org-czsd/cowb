package org.czsd.cowb.rules.common.model.judge;

import org.czsd.cowb.rules.api.common.Action;
import org.czsd.cowb.rules.api.common.Condition;
import org.czsd.cowb.rules.api.common.Facts;
import org.czsd.cowb.rules.api.judge.Judgement;
import org.czsd.cowb.rules.common.exception.IllegalRuleException;

/**
 * abstract judgement
 */
public abstract class AbstractJudgement implements Judgement {
    
    
    /**
     *  set the condition
     */
    abstract void when(Condition condition);
    
    /**
     *  set the the action to be executed when the condition is true
     */
    abstract void then(Action action);
    
    /**
     *  set the the action to be executed when the condition is false
     */
    abstract void elseThen(Action action);
    
    public boolean evaluate(Facts facts) {
        Condition condition = condition();
        if (condition == null){
            throw new IllegalRuleException("rule condition must not be null");
        }
        return condition.evaluate(facts);
    }
    
    public Object fire(Facts facts) {
        Action action;
        if (evaluate(facts)){
            action = then();
        } else {
            action = otherwise();
        }
        if (action != null){
            return action.execute(facts);
        }
        return null;
    }
}
