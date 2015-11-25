package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public interface Statement {

    boolean execute(Scope scope);
}
