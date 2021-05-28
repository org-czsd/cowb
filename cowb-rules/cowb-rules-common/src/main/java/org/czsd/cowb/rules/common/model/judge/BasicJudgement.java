package org.czsd.cowb.rules.common.model.judge;

import org.czsd.cowb.rules.api.common.Action;
import org.czsd.cowb.rules.api.common.Condition;

/**
 * basic judgement
 */
public class BasicJudgement extends AbstractJudgement {
    
    private Action then;
    private Action otherwise;
    private Condition condition;
    
    public BasicJudgement(Action then, Action otherwise, Condition condition) {
        this.then = then;
        this.otherwise = otherwise;
        this.condition = condition;
    }
    
    public BasicJudgement() {
    }
    
    @Override
    public Action then() {
        return then;
    }
    
    @Override
    public Action otherwise() {
        return otherwise;
    }
    
    @Override
    public Condition condition() {
        return condition;
    }
    
    @Override
    public void when(Condition condition){
        this.condition = condition;
    }
    
    @Override
    public void then(Action action){
        this.then = action;
    }
    
    @Override
    public void elseThen(Action action){
        this.otherwise = action;
    }
}
