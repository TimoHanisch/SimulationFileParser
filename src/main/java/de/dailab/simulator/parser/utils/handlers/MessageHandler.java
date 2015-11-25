package de.dailab.simulator.parser.utils.handlers;

import java.util.Stack;

/**
 * Created by thanisch on 22.05.2015.
 */
public class MessageHandler {

    private Stack<Message> messageStack = new Stack<>();

    public MessageHandler addMessage(Message msg){

        return this;
    }
}
