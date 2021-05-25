package org.czsd.cowb.rules.api.score;

import org.czsd.cowb.rules.api.common.Rule;

import java.util.Collection;

/**
 * score card
 */
public interface ScoreCard extends Rule {
    
    /**
     *  get the condition of the scorecard
     *  @return the conditions each of which has a score
     */
    Collection<ScoringCondition> conditions();
    
    /**
     *  get the calculate type of the scorecard
     *  @return the calculate type
     */
    CalculateType calculateType();
}
