package Lecture3;

import java.util.ArrayList;

class Player{
    String name;
    boolean alive;
    static ArrayList<Player> players = new ArrayList<>();
    public Player(String name){
        this.name = name;
        this.alive = true;
        Player.players.add(this);
    }

    @Override
    public String toString() {
        return this.name +" : "+ this.alive;
    }

    public void die(){
        this.alive = false;
    }

    public void revive(){
        this.alive = true;
    }
}

class shooter extends Player{
    int kills;
    public shooter(String name) {
        super(name);
        this.kills = 0;
    }
    public void kill(Player player){
        if (player == this){
            return;
        }
        if (player.alive){
        player.die();
        this.kills+=1;
        }
    }
}

public class ShootingGame {
    public static void main(String[] args) {
        Player ravi = new Player("Ravi");
        Player shubham = new Player("Shubham");
        System.out.println(Player.players);
        ravi.die();
        System.out.println(Player.players);
        ravi.revive();
        System.out.println(Player.players);

        shooter gogo = new shooter("Crime Master gogo");
        System.out.println(Player.players );
        gogo.kill(ravi);
        gogo.kill(gogo);
        System.out.println(Player.players);
        System.out.println(gogo.kills);
    }
}
