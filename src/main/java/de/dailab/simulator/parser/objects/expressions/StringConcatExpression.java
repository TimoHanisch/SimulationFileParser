package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class StringConcatExpression implements Expression<String> {

    private List<Expression> expressionList = new ArrayList<>();

    private String value;

    public void addExpression(Expression expr) {
        this.expressionList.add(expr);
    }

    @Override
    public boolean evaluate(Scope scope) {
        StringBuilder builder = new StringBuilder();
        for (Expression expr : expressionList) {
            if (expr.evaluate(scope)) {
                builder.append(expr.getValue());
            } else {
                return false;
            }
        }
        value = builder.toString();
        return true;
    }

    @Override
    public String getValue() {
        return value;
    }
}
