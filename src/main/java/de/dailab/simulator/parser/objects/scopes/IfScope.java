package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.objects.expressions.BooleanExpression;
import de.dailab.simulator.parser.objects.statements.Statement;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 15.05.2015
 */
public class IfScope extends Scope {

    private BooleanExpression booleanExpression;

    private Scope elseBlock;

    public IfScope(Scope parentScope) {
        super(parentScope);
    }

    @Override
    public boolean execute() {
        if (booleanExpression != null) {
            if (booleanExpression.evaluate(getParent())) {
                if (booleanExpression.getValue()) {
                    resetVars();
                    for (Statement stmt : getStatementList()) {
                        if (!stmt.execute(this)) {
                            return false;
                        }
                    }
                    return true;
                } else if (elseBlock != null) {
                    elseBlock.resetVars();
                    return elseBlock.execute();
                }
                return true;
            }
        }
        return false;
    }

    public void setElseBlock(Scope elseBlock) {
        this.elseBlock = elseBlock;
    }

    public BooleanExpression getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(BooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }
}
