package org.czsd.cowb.rules.api.score;

import org.czsd.cowb.rules.api.common.Condition;

/**
 * condition with socre
 */
public interface ScoringCondition extends Condition {
    
    /**
     *  @return the score of the condition
     */
    int score();
}
