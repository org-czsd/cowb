package org.czsd.cowb.rules.api.flow;

import org.czsd.cowb.rules.api.common.Rule;

/**
 * rule flow node
 */
public interface RuleFlowNode {
    /**
     * get the rule presented in this node
     * @return the rule
     */
    Rule rule();
    
    /**
     * get the pre node
     * @return pre node
     */
    RuleFlowNode pre();
    
    /**
     * get the next node
     * @return next node
     */
    RuleFlowNode next();
    
    /**
     * get the head node
     * @return the head
     */
    RuleFlowNode head();
    
    /**
     * get the tail node
     * @return the tail
     */
    RuleFlowNode tail();
    
    /**
     * get the size of this flow
     * @return size
     */
    int size();
    
    /**
     * add a node to the tail of the chain
     * @param tail the node to be added
     */
    void add(RuleFlowNode tail);
    
    /**
     * whether this node has next node
     * @return {@code true} when has next
     *         else {@code false}
     */
    boolean hasNext();
    
    
    /**
     * set the head node
     * @param head the head node
     */
    void head(RuleFlowNode head);
    
    /**
     * set the pre node
     * @param pre the pre node
     */
    void pre(RuleFlowNode pre);
    /**
     * set the next node
     * @param next the next node
     */
    void next(RuleFlowNode next);
    
    
    /**
     * set the tail node
     * @param tail the tail node
     */
    void tail(RuleFlowNode tail);
    
}
