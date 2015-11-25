package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class StringExpression implements Expression<String> {

    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(Scope scope) {
        return true;
    }

    @Override
    public String getValue() {
        return value;
    }
}
