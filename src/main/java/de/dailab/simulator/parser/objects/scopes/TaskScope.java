package de.dailab.simulator.parser.objects.scopes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 07.05.2015
 */
public class TaskScope extends PartialTaskScope {

    private List<String> knowledgeList = new ArrayList<>();

    public TaskScope(Scope parentScope) {
        super(parentScope);
    }

    public void addKnowledge(String knowledge) {
        this.knowledgeList.add(knowledge);
    }

    public List<String> getKnowledgeList() {
        return knowledgeList;
    }
}
