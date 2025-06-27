package Model;

import java.util.ArrayList;

public class Player {

    public Player(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public void setPlayerID(long playerID) {
        this.playerID = playerID;
    }

    public long getPlayerID() {
        return playerID;
    }

    private long playerID;
    private String nickName;
    private String password;

    private String email;

    ArrayList<Character> listOfCharacters = new ArrayList<>();




}
