import java.io.*;

public class Compte implements Serializable {
    String root;
    String username;
    String login;
    Compte(String root,String username,String login){
        this.root=root;
        this.username=username;
        this.login=login;
    }
public String getroot() { return root; }
public void setroot(String root) { this.root = root; }
public String getusername() { return username; }
public void setusername(String username) { this.username = username; }
public String getlogin() { return login; }
public void setlogin(String login) { this.login =login; }
}
