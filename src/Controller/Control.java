package Controller;

import Model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Control {


    public Control() {

    }

    public void createNewPlayer(){

        String nickname = "username";
        String password = "password";
        Player player = new Player(nickname, password);
    }

    private Long generateRandomPlayerID(){
        Long id = 1L;
        for(int i = 0; listOfPlayers.size()> i; i++){
            if(listOfPlayers.get(i).getPlayerID() == id){
                id ++;
            }
        }
        return id;
    }

    ArrayList<Player> listOfPlayers =  new ArrayList<>();
    }


