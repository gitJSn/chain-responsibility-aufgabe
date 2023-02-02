package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class IsVipHandler implements IHandler {
    IUserService userService;
    private IHandler next;

    // DONT CHANGE
    public IsVipHandler(IUserService userService) {
        this.userService = userService;
    }

    // CHANGE BELOW
    @Override
    public void setNext(IHandler handler) {
        // TODO wie setzt man hier den nächsten handler? Siehe Präsentation
    }

    @Override
    public void handleRequest(Request request) {
        // TODO Überprüfe ob der nutzer VIP ist.
        // Nutze userService.checkVIP(...) für die Überprüfung

        // Ist VIP? -> SOUT info dass nutzer VIP ist, falls es noch einen next
        // handler gibt -> führe ihn aus!

        // Ist kein VIP? -> SOUT info dass nutzer kein VIP ist
    }

}
