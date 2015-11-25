package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.utils.ScopeHelper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class ArrayEvaluationExpression implements Expression<String> {

    private List<Integer> indices = new ArrayList<>();

    private String value;

    public ArrayEvaluationExpression(List<Integer> indices) {
        this.indices = indices;
    }

    @Override
    public boolean evaluate(Scope scope) {
        String input = ScopeHelper.getVarValue(scope, "input");
        if (indices.get(0) == -1 && indices.get(1) == -1) {
            if (indices.get(2) < 0 || indices.get(2) >= input.length()) {
                return false;
            }
            value = String.valueOf(input.charAt(indices.get(2)));
        } else if (indices.get(0) == -1) {
            if (indices.get(1) >= input.length()) {
                return false;
            }
            value = input.substring(0, indices.get(1));
        } else if (indices.get(1) == -1) {
            if (indices.get(0) < 0) {
                return false;
            }
            value = input.substring(indices.get(0));
        } else {
            if (indices.get(0) < 0 || indices.get(0) >= input.length() || indices.get(1) < 0 || indices.get(1) >= input.length()) {
                return false;
            }
            value = input.substring(indices.get(0), indices.get(1));
        }
        return true;
    }

    @Override
    public String getValue() {
        return value;
    }
}
