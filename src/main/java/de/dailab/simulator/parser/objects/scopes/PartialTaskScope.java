package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.objects.statements.Statement;
import de.dailab.simulator.parser.utils.ScopeHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 07.05.2015
 */
public class PartialTaskScope extends ScopeImpl {

    private boolean sequential = true;

    public PartialTaskScope(Scope parentScope) {
        super(parentScope);
    }

    public boolean isSequential() {
        return sequential;
    }

    public void setSequential(boolean sequential) {
        this.sequential = sequential;
    }

    public TaskScope createExtendingTask() {
        SimulationScope simulation = ScopeHelper.getSimulation(this);
        TaskScope taskScope = new TaskScope(simulation);
        taskScope.setSequential(this.sequential);
        for (String key : getMetaMap().keySet()) {
            taskScope.addScopeMetaVar(key, getScopeMetaVarValue(key));
        }
        return taskScope;
    }
}
