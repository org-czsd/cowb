package org.czsd.cowb.rules.common.model.flow;

import org.czsd.cowb.rules.api.common.Condition;
import org.czsd.cowb.rules.api.common.Rule;
import org.czsd.cowb.rules.api.flow.RuleFlowNode;
import org.czsd.cowb.rules.common.model.judge.BasicJudgement;

/**
 * desicion node
 */
public class DecisionRuleFlowNode extends AbstractRuleFlowNode {
    private RuleFlowNode match;
    private RuleFlowNode opposite;
    private Condition condition;
    
    public DecisionRuleFlowNode(RuleFlowNode match, RuleFlowNode opposite, Condition condition) {
        this.match = match;
        this.opposite = opposite;
        this.condition = condition;
    }
    
    public DecisionRuleFlowNode() {
    }
    
    @Override
    public Rule rule() {
        return new BasicJudgement(
                (facts) -> {
                    RuleFlowNode node = match;
                    Object result = null;
                    while(node != null){
                        Rule rule = node.rule();
                        result = rule.fire(facts);
                        node = node.next();
                    }
                    return result;
                },
                (facts) -> {
                    RuleFlowNode node = opposite;
                    Object result = null;
                    while(node != null){
                        Rule rule = node.rule();
                        result = rule.fire(facts);
                        node = node.next();
                    }
                    return result;
                },
                condition);
    }
    
    @Override
    public void add(RuleFlowNode tail) {
        throw new UnsupportedOperationException("add method is not supported in a decision. A decision must be the tail of the rule flow node chain");
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    public RuleFlowNode getMatch() {
        return match;
    }
    
    public void setMatch(RuleFlowNode match) {
        this.match = match;
    }
    
    public RuleFlowNode getOpposite() {
        return opposite;
    }
    
    public void setOpposite(RuleFlowNode opposite) {
        this.opposite = opposite;
    }
    
    public Condition getCondition() {
        return condition;
    }
    
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
