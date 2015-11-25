package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.ConstructorScope;
import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import de.dailab.simulator.parser.utils.ScopeHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 18.05.2015
 */
public class ConstructorStatement implements Statement {

    private String constructorName;

    private String filePath;

    private Map<String, String> initVarMap = new HashMap<>();

    public ConstructorStatement(String constructorName, String filePath) {
        this.constructorName = constructorName;
        this.filePath = filePath;
    }

    @Override
    public boolean execute(Scope scope) {
        final SimulationScope simulationScope = ScopeHelper.getSimulation(scope);
        final ConstructorScope executeConstructorScope = simulationScope.getConstructor(constructorName);
        if (executeConstructorScope == null) {
            return false;
        }
        for (String key : initVarMap.keySet()) {
            if (!executeConstructorScope.addScopeVar(key, initVarMap.get(key))) {
                return false;
            }
        }
        executeConstructorScope.setPath(filePath);
        return executeConstructorScope.execute();
    }

    public boolean addInitVar(String name, String value) {
        if (initVarMap.containsKey(name)) {
            return false;
        }
        initVarMap.put(name, value);
        return true;
    }
}
