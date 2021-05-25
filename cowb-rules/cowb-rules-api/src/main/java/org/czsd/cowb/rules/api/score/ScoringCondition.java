package org.czsd.cowb.rules.api.score;

import org.czsd.cowb.rules.api.common.Condition;
import org.czsd.cowb.rules.api.common.Facts;

/**
 * condition with socre
 */
public interface ScoringCondition extends Condition {
    
    /**
     *  get the score that should be add to the result of the {@link ScoreCard}
     *  when {@link #evaluate(Facts)} is true
     *  @return the score of the condition
     */
    int score();
}
