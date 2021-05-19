package org.czsd.cowb.rules.common.exception;

/**
 * illegal rule exception
 */
public class IllegalRuleException extends RuntimeException {
    
    public IllegalRuleException() {
        super();
    }
    
    public IllegalRuleException(String message) {
        super(message);
    }
}
