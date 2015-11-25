package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class IfStatement implements Statement {

    private Scope ifScope;

    public IfStatement(Scope ifScope) {
        this.ifScope = ifScope;
    }


    @Override
    public boolean execute(Scope scope) {
        return ifScope.execute();
    }
}
