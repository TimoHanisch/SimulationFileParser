package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.utils.ScopeHelper;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class VarExpression implements Expression<String> {

    private String var;

    private String value;

    public VarExpression(String var) {
        this.var = var;
    }

    @Override
    public boolean evaluate(Scope scope) {
        value = ScopeHelper.getVarValue(scope, var);
        return value != null;
    }

    @Override
    public String getValue() {
        return value;
    }
}
