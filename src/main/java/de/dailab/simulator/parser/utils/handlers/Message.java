package de.dailab.simulator.parser.utils.handlers;

/**
 * Created by thanisch on 22.05.2015.
 */
public interface Message {

    String getMessage();

    String getTypeString();

    int getPos();

    int getLine();
}
