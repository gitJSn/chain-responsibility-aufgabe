package chain.responsibility.aufgabe.Interface;

// DONT CHANGE
public interface IUserService {
    public boolean checkUser(String email, String password);

    public boolean checkAdmin(String email, String password);

    public boolean checkVIP(String email, String password);
}
