package org.czsd.cowb.rules.common.model.score;

import org.czsd.cowb.rules.api.common.Facts;
import org.czsd.cowb.rules.api.score.CalculateType;
import org.czsd.cowb.rules.api.score.ScoreCard;
import org.czsd.cowb.rules.api.score.ScoringCondition;

import java.util.Collection;

/**
 * abstract score card
 */
public abstract class AbstractScoreCard implements ScoreCard {
    
    @Override
    public Object fire(Facts facts) {
        Collection<ScoringCondition> conditions = conditions();
        int result = 0;
        for (ScoringCondition condition: conditions){
            if (condition.evaluate(facts)){
                result += condition.score();
            }
        }
        if (CalculateType.AVG == calculateType()){
            return ((double)result)/(((double)conditions.size()));
        }
        return result;
    }
    
}
