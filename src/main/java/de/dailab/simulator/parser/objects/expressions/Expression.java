package de.dailab.simulator.parser.objects.expressions;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public interface Expression<T> {

    boolean evaluate(Scope scope);

    T getValue();
}
