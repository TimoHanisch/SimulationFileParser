package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class DecStatement implements Statement {
    private String varName;

    @Override
    public boolean execute(Scope scope) {
        return false;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
