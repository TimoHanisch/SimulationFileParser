package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class BooleanExpression implements Expression<Boolean> {

    private boolean aBoolean;
    private boolean value;
    private String leftValue;
    private ArrayEvaluationExpression leftArrayEval;
    private StringConcatExpression leftStringConcat;
    private String rightValue;
    private ArrayEvaluationExpression rightArrayEval;
    private StringConcatExpression rightStringConcat;
    private VarExpression leftVarExpression;
    private VarExpression rightVarExpression;
    private Operators operator;

    @Override
    public boolean evaluate(Scope scope) {
        value = false;
        leftValue = evaluateValue(scope, leftVarExpression, leftArrayEval, leftStringConcat);
        if(leftValue == null) {
            return false;
        }
        rightValue = evaluateValue(scope, rightVarExpression, rightArrayEval, rightStringConcat);
        if(rightValue == null) {
            return false;
        }
        if (leftValue.equals(rightValue) && operator == Operators.Equal || !leftValue.equals(rightValue) && operator == Operators.Unequal) {
            value = true;
            return true;
        }
        value = aBoolean;
        return true;
    }

    private String evaluateValue(Scope scope, VarExpression varExpression, ArrayEvaluationExpression arrayEval, StringConcatExpression stringConstant) {
        if (leftVarExpression != null) {
            if (leftVarExpression.evaluate(scope)) {
                return leftVarExpression.getValue();
            } else {
                return null;
            }
        } else if (leftArrayEval != null) {
            if (leftArrayEval.evaluate(scope)) {
                return leftArrayEval.getValue();
            } else {
                return null;
            }
        } else if (leftStringConcat != null) {
            if (leftStringConcat.evaluate(scope)) {
                return leftStringConcat.getValue();
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public Boolean getValue() {
        return value;
    }

    public void setBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void setLeftArrayEval(ArrayEvaluationExpression leftArrayEval) {
        this.leftArrayEval = leftArrayEval;
    }

    public void setLeftStringConcat(StringConcatExpression leftStringConcat) {
        this.leftStringConcat = leftStringConcat;
    }

    public void setRightArrayEval(ArrayEvaluationExpression rightArrayEval) {
        this.rightArrayEval = rightArrayEval;
    }

    public void setRightStringConcat(StringConcatExpression rightStringConcat) {
        this.rightStringConcat = rightStringConcat;
    }

    public void setLeftVarExpression(VarExpression leftVarExpression) {
        this.leftVarExpression = leftVarExpression;
    }

    public void setRightVarExpression(VarExpression rightVarExpression) {
        this.rightVarExpression = rightVarExpression;
    }

    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    public enum Operators {Unequal, Equal}
}
