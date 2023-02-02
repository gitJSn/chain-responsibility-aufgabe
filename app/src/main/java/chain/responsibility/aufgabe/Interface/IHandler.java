package chain.responsibility.aufgabe.Interface;

import chain.responsibility.aufgabe.Request;

// DONT CHANGE
public interface IHandler {
    void setNext(IHandler handler);

    void handleRequest(Request request);
}
