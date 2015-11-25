package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import de.dailab.simulator.parser.utils.ScopeHelper;

/**
 *
 * @since 13.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class MetaExpression implements Expression<String> {

    private String link;

    private String value;

    public MetaExpression(String link) {
        this.link = link;
    }

    @Override
    public boolean evaluate(Scope scope) {
        String var = ScopeHelper.getVarValue(scope, link);
        SimulationScope simulationScope = ScopeHelper.getSimulation(scope);
        if (simulationScope.getScopeMetaVarValue(var) != null) {
            value = simulationScope.getScopeMetaVarValue(var);
            return true;
        } else if (scope.getScopeMetaVarValue(var) != null) {
            value = scope.getScopeMetaVarValue(var);
            return true;
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }


}
