package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.PartialTaskScope;
import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import de.dailab.simulator.parser.objects.expressions.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class PartialTaskCreationStatement implements Statement {

    private Map<String, String> metaMap = new HashMap<>();

    private boolean sequential = true;

    private String name;
    private SimulationScope simulationScope;
    private ArrayEvaluationExpression arrayExprStmt;
    private StringConcatExpression stringConcatExpression;
    private VarExpression nameVarExpression;

    private Map<String, Expression> metaMapExpression = new HashMap<>();

    public PartialTaskCreationStatement(SimulationScope simulationScope) {
        this.simulationScope = simulationScope;
    }

    public void setSequential(boolean sequential) {
        this.sequential = sequential;
    }

    @Override
    public boolean execute(Scope scope) {
        if (nameVarExpression != null) {
            if (nameVarExpression.evaluate(scope)) {
                this.name = nameVarExpression.getValue();
            } else {
                return false;
            }
        } else if (arrayExprStmt != null) {
            if (arrayExprStmt.evaluate(scope)) {
                this.name = arrayExprStmt.getValue();
            } else {
                return false;
            }
        } else if (stringConcatExpression != null) {
            if (stringConcatExpression.evaluate(scope)) {
                this.name = stringConcatExpression.getValue();
            } else {
                return false;
            }
        }
        PartialTaskScope partialTaskScope = this.simulationScope.createPartialTask(name);
        if (partialTaskScope == null) {
            return false;
        }
        for (String key : metaMap.keySet()) {
            partialTaskScope.addScopeMetaVar(key, metaMap.get(key));
        }
        for (String key : metaMapExpression.keySet()) {
            String value;
            if (metaMapExpression.get(key) instanceof MetaExpression) {
                if (metaMapExpression.get(key).evaluate(scope)) {
                    value = ((MetaExpression) metaMapExpression.get(key)).getValue();
                } else {
                    return false;
                }
            } else {
                if (metaMapExpression.get(key).evaluate(scope)) {
                    value = ((MetaExpression) metaMapExpression.get(key)).getValue();
                } else {
                    return false;
                }
            }
            if (!partialTaskScope.addScopeMetaVar(key, value)) {
                return false;
            }
        }
        partialTaskScope.setSequential(this.sequential);
        return true;
    }

    public boolean addMetaInfo(String key, String value) {
        if (metaMap.containsKey(key) || simulationScope.getScopeMetaVarValue(key) != null) {
            return false;
        }
        metaMap.put(key, value);
        return true;
    }

    public void setArrayExprStmt(ArrayEvaluationExpression arrayExprStmt) {
        this.arrayExprStmt = arrayExprStmt;
    }

    public void setStringConcatExpression(StringConcatExpression stringConcatExpression) {
        this.stringConcatExpression = stringConcatExpression;
    }

    public void setNameVarExpression(VarExpression nameVarExpression) {
        this.nameVarExpression = nameVarExpression;
    }

    public boolean addExpressionMeta(String key, Expression expression) {
        if (metaMapExpression.containsKey(key)) {
            return false;
        }
        this.metaMapExpression.put(key, expression);
        return true;
    }

    public String getMetaInfo(String var) {
        return metaMap.get(var);
    }
}
