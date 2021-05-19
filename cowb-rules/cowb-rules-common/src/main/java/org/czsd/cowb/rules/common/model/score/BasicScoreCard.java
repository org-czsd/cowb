package org.czsd.cowb.rules.common.model.score;

import org.czsd.cowb.rules.api.score.CalculateType;
import org.czsd.cowb.rules.api.score.ScoringCondition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * basic score card
 */
public class BasicScoreCard extends AbstractScoreCard {
    
    public BasicScoreCard(List<ScoringCondition> conditions) {
        this.conditions = conditions;
    }
    
    public BasicScoreCard() {
    }
    
    private List<ScoringCondition> conditions = new ArrayList<>();
    private CalculateType calculateType;
    
    @Override
    public Collection<ScoringCondition> conditions() {
        return conditions;
    }
    
    @Override
    public CalculateType calculateType() {
        return calculateType;
    }
}
