package org.czsd.cowb.rules.common.model.flow;

import org.czsd.cowb.rules.api.flow.RuleFlowNode;

/**
 * @Description : AbstractRuleFlowNode
 * @Author : shawnSiao
 * @Date 2021/5/24 23:05:43
 */
public abstract class AbstractRuleFlowNode implements RuleFlowNode {
    
    private RuleFlowNode pre;
    
    private RuleFlowNode next;
    
    private RuleFlowNode head;
    
    private RuleFlowNode tail;
    
    private int size;
    
    @Override
    public RuleFlowNode pre() {
        return this.pre;
    }
    
    @Override
    public RuleFlowNode next() {
        return this.next;
    }
    
    @Override
    public RuleFlowNode head() {
        return this.head;
    }
    
    @Override
    public RuleFlowNode tail() {
        return this.tail;
    }
    
    @Override
    public int size() {
        return this.size;
    }
    
    @Override
    public void add(RuleFlowNode tail) {
        tail.pre(this.tail);
        tail.head(this.head);
        this.tail.next(tail);
        RuleFlowNode head = this.head;
        while (head.hasNext()){
            head.next().tail(tail);
            head = head.head();
        }
    }
    
    @Override
    public boolean hasNext() {
        return this.next != null;
    }
}
