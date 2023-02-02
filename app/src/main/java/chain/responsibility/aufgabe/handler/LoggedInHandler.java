package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class LoggedInHandler implements IHandler {

    IUserService userService;
    private IHandler next;

    // DONT CHANGE
    public LoggedInHandler(IUserService userService) {
        this.userService = userService;
    }

    // CHANGE BELOW
    @Override
    public void setNext(IHandler handler) {
        // TODO wie setzt man hier den nächsten handler? Siehe Präsentation
    }

    @Override
    public void handleRequest(Request request) {
        // TODO Überprüfe ob der nutzer "registriert" ist.
        // Nutze userService.checkUser(...) für die Überprüfung

        // Ist registriert? -> SOUT info dass nutzer registriert ist, falls es noch
        // einen next
        // handler gibt -> führe ihn aus!

        // Ist kein registriert? -> SOUT info dass nutzer nicht registriert ist
    }
}
