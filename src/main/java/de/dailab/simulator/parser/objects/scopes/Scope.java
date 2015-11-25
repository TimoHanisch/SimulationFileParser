package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.objects.statements.Statement;
import de.dailab.simulator.parser.utils.ScopeHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 14.05.2015
 */
public abstract class Scope {

    private final List<Statement> statementList = new ArrayList<>();
    private Scope parentScope;
    private Map<String, String> scopeVars = new HashMap<>();
    private Map<String, String> metaMap = new HashMap<>();

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public abstract boolean execute();

    public boolean addScopeVar(String name, String value) {
        if (this.scopeVars.containsKey(name)) {
            return false;
        }
        this.scopeVars.put(name, value);
        return true;
    }

    public String getScopeVarValue(String name) {
        return scopeVars.get(name);
    }

    public boolean containsScopeVar(String name) {
        return scopeVars.containsKey(name);
    }

    public Map<String, String> getScopeVars() {
        return scopeVars;
    }

    public boolean addScopeMetaVar(String name, String value) {
        if (metaMap.containsKey(name)) {
            return false;
        }
        metaMap.put(name, value);
        return true;
    }

    public boolean addAssignedMetaInfo(String key, String link) {
        String value = ScopeHelper.getMetaValue(this, link);
        if (metaMap.containsKey(key)) {
            return false;
        } else if (value == null) {
            return false;
        }
        metaMap.put(key, value);
        return true;
    }

    public String getScopeMetaVarValue(String name) {
        return metaMap.get(name);
    }

    public boolean containsMetaVar(String name) {
        return metaMap.containsKey(name);
    }

    public Map<String, String> getMetaMap() {
        return metaMap;
    }

    public Scope getParent() {
        return parentScope;
    }

    public void setVarValue(String name, String value) {
        this.scopeVars.put(name, value);
    }

    public void addStatement(Statement stmt) {
        this.statementList.add(stmt);
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void resetVars() {
        scopeVars.clear();
        metaMap.clear();
    }
}
