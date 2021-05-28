package org.czsd.cowb.rules.common.model.flow;

import org.czsd.cowb.rules.api.common.Rule;

/**
 * basic rule flow node
 */
public class BasicRuleFlowNode extends AbstractRuleFlowNode {
    
    private Rule rule;
    
    public BasicRuleFlowNode(Rule rule) {
        this.rule = rule;
    }
    
    @Override
    public Rule rule() {
        return rule;
    }
}
