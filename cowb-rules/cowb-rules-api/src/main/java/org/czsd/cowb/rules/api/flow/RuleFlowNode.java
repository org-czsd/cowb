package org.czsd.cowb.rules.api.flow;

import org.czsd.cowb.rules.api.common.Rule;

/**
 * rule flow node
 */
public interface RuleFlowNode {
    /**
     * get the rule presented in this node
     */
    Rule rule();
    
    RuleFlowNode pre();
    
    RuleFlowNode next();
    
    RuleFlowNode head();
    
    RuleFlowNode tail();
    
    int size();
    
    void add(RuleFlowNode tail);
    
    boolean hasNext();
    
    void head(RuleFlowNode head);
    
    void pre(RuleFlowNode pre);
    
    void next(RuleFlowNode next);
    
    void tail(RuleFlowNode tail);
    
}
