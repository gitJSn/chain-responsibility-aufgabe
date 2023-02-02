package chain.responsibility.aufgabe;

import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;
import chain.responsibility.aufgabe.handler.IsAdminHandler;
import chain.responsibility.aufgabe.handler.IsVipHandler;
import chain.responsibility.aufgabe.handler.LoggedInHandler;

public class App {
    public static void main(String[] args) {
        // DONT CHANGE!
        IUserService userService = new UserService();
        IHandler loggedInHandler = new LoggedInHandler(userService);
        IHandler isAdminHandler = new IsAdminHandler(userService);
        IHandler isVIPHandler = new IsVipHandler(userService);

        // Code hier drunter einfügen:

        // TODO Bsp: Setze den VIP handler "hinter" den loggedInHandler

        // TODO Starte die überprüfung loggedInHandler.handleRequest(...)
        // handlerName.handleRequest(new Request("VIP", "p4ssw0rd")) z.b.
        // testnutzer sind in UserService angelegt
    }
}
