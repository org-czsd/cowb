package org.czsd.cowb.rules.common.model.flow;

import org.czsd.cowb.rules.api.common.Facts;
import org.czsd.cowb.rules.api.common.Rule;
import org.czsd.cowb.rules.api.flow.RuleFlow;
import org.czsd.cowb.rules.api.flow.RuleFlowNode;

/**
 * abstract rule flow
 */
public abstract class AbstractRuleFlow implements RuleFlow{
    
    @Override
    public Object fire(Facts facts) {
        RuleFlowNode node = chain();
        Object result = null;
        while(node != null){
            Rule rule = node.rule();
            result = rule.fire(facts);
            node = node.next();
        }
        return result;
    }
}
