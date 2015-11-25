package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.objects.expressions.BooleanExpression;
import de.dailab.simulator.parser.objects.statements.Statement;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 15.05.2015
 */
public class ElseScope extends Scope {

    private Scope setParentIfScope;

    public ElseScope(Scope parentScope) {
        super(parentScope);
    }

    @Override
    public boolean execute() {
        for (Statement stmt : getStatementList()) {
            if (!stmt.execute(this)) {
                return false;
            }
        }
        return true;
    }

    public void setParentIfScope(Scope ifScope) {
        this.setParentIfScope = setParentIfScope;
    }
}
