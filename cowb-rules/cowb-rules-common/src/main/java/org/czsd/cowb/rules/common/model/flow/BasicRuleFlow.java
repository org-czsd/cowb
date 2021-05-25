package org.czsd.cowb.nodes.common.model.flow;

import org.czsd.cowb.rules.api.flow.RuleFlowNode;
import org.czsd.cowb.rules.common.model.flow.AbstractRuleFlow;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * basic rule flow
 */
public class BasicRuleFlow extends AbstractRuleFlow {
    
    private RuleFlowNode chain;
    
    @Override
    public RuleFlowNode chain() {
        return chain;
    }
}
