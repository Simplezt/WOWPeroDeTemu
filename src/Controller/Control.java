package Controller;

import Model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Control {

private Long latestIdCreated;

    public Control() {

    }

    public void createNewPlayer(){

        String nickname = "username";
        String password = "password";

        Player player = new Player(nickname, password);
        player.setPlayerID(generatePlayerID());
        listOfPlayers = organizePlayerList(listOfPlayers);

    }

    private Long generatePlayerID(){
        Long id = 1L; //Default value
        if(listOfPlayers.size() == 0){
            latestIdCreated = id;
            return id;
        }
        latestIdCreated++;
        id = latestIdCreated;
        return id;
    }

    private ArrayList<Player> organizePlayerList(ArrayList<Player> list){
        if(list.size() <2){
            return list;
        }
        int mid = list.size()/2;
        ArrayList<Player> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Player> right = new ArrayList<>(list.subList(mid, list.size()));

        return mergeList(organizePlayerList(left), organizePlayerList(right));

    }

    private ArrayList<Player> mergeList(ArrayList<Player> left, ArrayList<Player> right){
        ArrayList<Player> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < left.size() && j < right.size()){
            if(left.get(i).getPlayerID() <= right.get(j).getPlayerID()){
                result.add(left.get(i));
                i++;
            }
            else{
                result.add(right.get(j));
                j++;
            }

        }
        while(i < left.size()){
            result.add(left.get(i));
            i++;
        }
        while(j < right.size()){
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    ArrayList<Player> listOfPlayers =  new ArrayList<>();
    }


