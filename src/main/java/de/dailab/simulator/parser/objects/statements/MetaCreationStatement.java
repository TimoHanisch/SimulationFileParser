package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import de.dailab.simulator.parser.objects.expressions.ArrayEvaluationExpression;
import de.dailab.simulator.parser.objects.expressions.StringConcatExpression;
import de.dailab.simulator.parser.objects.expressions.VarExpression;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class MetaCreationStatement implements Statement {

    private final SimulationScope simulationScope;
    private String key;
    private String value;

    private StringConcatExpression keyStringConcat;
    private ArrayEvaluationExpression keyArrayEval;

    private StringConcatExpression valueStringConcat;
    private ArrayEvaluationExpression valueArrayEval;
    private VarExpression keyVarExpression;
    private VarExpression valueVarExpression;

    public MetaCreationStatement(SimulationScope simulationScope) {
        this.simulationScope = simulationScope;
    }


    @Override
    public boolean execute(Scope scope) {
        if (keyVarExpression != null) {
            if (keyVarExpression.evaluate(scope)) {
                this.key = keyVarExpression.getValue();
            } else {
                return false;
            }
        } else if (keyArrayEval != null) {
            if (keyArrayEval.evaluate(scope)) {
                this.key = keyArrayEval.getValue();
            } else {
                return false;
            }
        } else if (keyStringConcat != null) {
            if (this.keyStringConcat.evaluate(scope)) {
                this.key = this.keyStringConcat.getValue();
            } else {
                return false;
            }
        }
        if (valueVarExpression != null) {
            if (valueVarExpression.evaluate(scope)) {
                this.value = valueVarExpression.getValue();
            } else {
                return false;
            }
        } else if (valueArrayEval != null) {
            if (valueArrayEval.evaluate(scope)) {
                this.value = valueArrayEval.getValue();
            } else {
                return false;
            }
        } else if (keyStringConcat != null) {
            if (valueStringConcat.evaluate(scope)) {
                this.value = valueStringConcat.getValue();
            } else {
                return false;
            }
        }
        if (key != null && value != null && this.simulationScope.addScopeMetaVar(key, value)) {
            return true;
        }
        return false;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKeyStringConcat(StringConcatExpression keyStringConcat) {
        this.keyStringConcat = keyStringConcat;
    }

    public void setKeyArrayEval(ArrayEvaluationExpression keyArrayEval) {
        this.keyArrayEval = keyArrayEval;
    }

    public void setValueStringConcat(StringConcatExpression valueStringConcat) {
        this.valueStringConcat = valueStringConcat;
    }

    public void setValueArrayEval(ArrayEvaluationExpression valueArrayEval) {
        this.valueArrayEval = valueArrayEval;
    }

    public void setKeyVarExpression(VarExpression keyVarExpression) {
        this.keyVarExpression = keyVarExpression;
    }

    public void setValueVarExpression(VarExpression valueVarExpression) {
        this.valueVarExpression = valueVarExpression;
    }
}
