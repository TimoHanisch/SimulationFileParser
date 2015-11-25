package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.expressions.StringConcatExpression;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class VarStatement implements Statement {

    private String name;
    private StringConcatExpression stringConcatExpression;

    @Override
    public boolean execute(Scope scope) {
        String value = null;
        if (stringConcatExpression.evaluate(scope)) {
            value = stringConcatExpression.getValue();
        } else {
            return false;
        }
        return scope.addScopeVar(name, value);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStringConcatExpression(StringConcatExpression stringConcatExpression) {
        this.stringConcatExpression = stringConcatExpression;
    }
}
