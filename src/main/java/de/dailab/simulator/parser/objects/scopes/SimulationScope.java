package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.utils.IdGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 07.05.2015
 */
public class SimulationScope extends ScopeImpl {

    private Map<String, PartialTaskScope> partialTaskMap = new HashMap<>();

    private Map<String, TaskScope> taskMap = new HashMap<>();

    private Map<String, ConstructorScope> constructorMap = new HashMap<>();

    private boolean autocomplete = false;

    private String name;

    private String start;

    private String goal;

    private int loop = 1;

    public SimulationScope(String name) {
        super(null);
        this.name = name;
    }

    public boolean addConstructor(String name, ConstructorScope constructorScope) {
        if (this.constructorMap.containsKey(name)) {
            return false;
        }
        this.constructorMap.put(name, constructorScope);
        return true;
    }

    public PartialTaskScope createPartialTask(String name) {
        if (partialTaskMap.containsKey(name)) {
            return null;
        }
        PartialTaskScope partialTaskScope = new PartialTaskScope(this);
        partialTaskMap.put(name, partialTaskScope);
        return partialTaskScope;
    }

    public TaskScope createTask(String name) {
        if (taskMap.containsKey(name)) {
            return null;
        }
        TaskScope taskScope = new TaskScope(this);
        taskMap.put(name, taskScope);
        return taskScope;
    }

    public TaskScope createTask() {
        String name = "taskScope" + IdGenerator.generateId();
        TaskScope taskScope = new TaskScope(this);
        taskMap.put(name, taskScope);
        return taskScope;
    }

    public TaskScope createExtendingTask(String name, String partialName) {
        if (!partialTaskMap.containsKey(partialName)) {
            return null;
        } else if (taskMap.containsKey(name)) {
            return null;
        }
        TaskScope taskScope = partialTaskMap.get(partialName).createExtendingTask();
        taskMap.put(name, taskScope);
        return taskScope;
    }

    public TaskScope createExtendingTask(String partialName) {
        if (!partialTaskMap.containsKey(partialName)) {
            return null;
        }
        String name = "taskScope" + IdGenerator.generateId();
        TaskScope taskScope = partialTaskMap.get(partialName).createExtendingTask();
        taskMap.put(name, taskScope);
        return taskScope;
    }

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAutocomplete() {
        return autocomplete;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public boolean getAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(boolean autocomplete) {
        this.autocomplete = autocomplete;
    }

    public ConstructorScope getConstructor(String name) {
        return constructorMap.get(name);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SimulationScope: ").append(name).append("\n");
        builder.append("Start: ").append(start).append("\n");
        builder.append("Loop: ").append(loop).append("\n");
        builder.append("Autocomplete: ").append(autocomplete).append("\n");
        for (String key : getMetaMap().keySet()) {
            builder.append("Meta: ").append(key).append(", ").append(getScopeMetaVarValue(key)).append("\n");
        }
        for (String key : partialTaskMap.keySet()) {
            PartialTaskScope pt = partialTaskMap.get(key);
            builder.append("PartialTask: ").append(key).append("\n");
            for (String mKey : pt.getMetaMap().keySet()) {
                builder.append("\tMeta: ").append(mKey).append(", ").append(pt.getMetaMap().get(mKey)).append("\n");
            }
            builder.append("\tSequential: ").append(pt.isSequential()).append("\n");
        }
        for (String key : taskMap.keySet()) {
            TaskScope t = taskMap.get(key);
            builder.append("TaskScope: ").append(key).append("\n");
            for (String mKey : t.getMetaMap().keySet()) {
                builder.append("\tMeta: ").append(mKey).append(", ").append(t.getMetaMap().get(mKey)).append("\n");
            }
            builder.append("\tSequential: ").append(t.isSequential()).append("\n");
            for (String k : t.getKnowledgeList()) {
                builder.append("\tKnowledge: ").append(k).append("\n");
            }
        }
        return builder.toString();
    }
}
