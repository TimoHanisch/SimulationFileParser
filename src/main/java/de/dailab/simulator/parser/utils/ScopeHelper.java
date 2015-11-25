package de.dailab.simulator.parser.utils;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 14.05.2015
 */
public class ScopeHelper {

    public static String getVarValue(Scope scope, String name) {
        String value = scope.getScopeVarValue(name);
        while (value == null && scope.getParent() != null) {
            scope = scope.getParent();
            value = scope.getScopeVarValue(name);
        }
        return value;
    }

    public static SimulationScope getSimulation(Scope scope) {
        while (!(scope instanceof SimulationScope)) {
            scope = scope.getParent();
        }
        return (SimulationScope) scope;
    }

    public static Scope getVarScope(Scope scope, String name) {
        String value = scope.getScopeVarValue(name);
        while (value == null && scope.getParent() != null) {
            scope = scope.getParent();
            value = scope.getScopeVarValue(name);
        }
        return scope;
    }

    public static String getMetaValue(Scope scope, String link) {
        String value = scope.getScopeMetaVarValue(link);
        while (value == null && scope.getParent() != null) {
            scope = scope.getParent();
            value = scope.getScopeMetaVarValue(link);
        }
        return value;
    }
}
