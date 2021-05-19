package org.czsd.cowb.rules.api.score;

import org.czsd.cowb.rules.api.common.Rule;

import java.util.Collection;

/**
 * score card
 */
public interface ScoreCard extends Rule {
    
    /**
     *  @return the conditions each of which has a score
     */
    Collection<ScoringCondition> conditions();
    
    /**
     *  @return the calculate type
     */
    CalculateType calculateType();
}
