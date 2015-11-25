package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.utils.ScopeHelper;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class IncStatement implements Statement {

    private String varName;

    @Override
    public boolean execute(Scope scope) {
        Scope valueScope = ScopeHelper.getVarScope(scope, varName);
        String value = ScopeHelper.getVarValue(scope, varName);
        if (value == null) {
            return false;
        } else {
            int intValue = Integer.parseInt(value) + 1;
            valueScope.setVarValue(varName, Integer.toString(intValue));
        }
        return true;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
