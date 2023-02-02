package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class IsAdminHandler implements IHandler {

    private IUserService userService;
    private IHandler next;

    // DONT CHANGE
    public IsAdminHandler(IUserService userService) {
        this.userService = userService;
    }

    // CHANGE BELOW
    @Override
    public void setNext(IHandler handler) {
        // TODO wie setzt man hier den nächsten handler? Siehe Präsentation
    }

    @Override
    public void handleRequest(Request request) {
        // TODO Überprüfe ob der nutzer aus dem request Admin ist:
        // Nutze userService.checkAdmin(...) für die Überprüfung

        // Ist admin? -> SOUT info dass nutzer Admin ist, falls es noch einen next
        // handler gibt -> führe ihn aus!

        // Ist kein admin? -> SOUT info dass nutzer kein Admin ist
    }

}
