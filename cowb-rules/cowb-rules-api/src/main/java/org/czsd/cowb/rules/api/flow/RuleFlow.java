package org.czsd.cowb.rules.api.flow;

import org.czsd.cowb.rules.api.common.Rule;

/**
 * a rule flow  contains serveral rules and can be executed orderly
 */
public interface RuleFlow extends Rule{
    RuleFlowNode chain();
}
