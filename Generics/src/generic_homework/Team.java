package generic_homework;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

    private String name;
    private List<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addPlayer(T player) {
        members.add(player);
        System.out.println(player.getName() + " added to team " + name);

    }

    public void listPlayers() {
        System.out.println("Players of team " + name + " : ");
        for (T player : members) {
            System.out.println("- " + player.getName());

        }
    }

    public static void main(String[] args) {
        // TODO: Farklı türlerde oyuncu nesneleri oluşturun ve Team sınıfını kullanarak bir takım oluşturun.
        // Takıma oyuncuları ekleyin ve takımın oyuncularını listeyin.


        Team<Player> team = new Team<>("GALATASARAY");
        team.addPlayer(new Player("Icardi"));
        team.addPlayer(new Player("Mertens"));
        team.addPlayer(new Player("Kerem"));
        team.addPlayer(new Player("Barış"));
        team.addPlayer(new Player("Kaan"));
        team.addPlayer(new Player("Köhn"));
        team.addPlayer(new Player("Kerem"));
        team.addPlayer(new Player("Abdülkerim"));
        team.addPlayer(new Player("Toreira"));
        team.addPlayer(new Player("Sanchez"));
        team.addPlayer(new Player("Muslera"));

        team.listPlayers();

        Team<FootballPlayer>footballPlayerTeam=new Team<>("TRABZONSPOR");
        footballPlayerTeam.addPlayer(new FootballPlayer("Uğurcan"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Eren"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Onauachu"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Pepe"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Meunier"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Trezequet"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Enis"));
        footballPlayerTeam.listPlayers();

        Team<BasketballPlayer>basketballPlayerTeam=new Team<>("ANADOLU EFES");
        basketballPlayerTeam.addPlayer(new BasketballPlayer("Larkin"));
        basketballPlayerTeam.listPlayers();
    }
}

class Player {
    private String name;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}

class BasketballPlayer extends Player {
    public BasketballPlayer(String name) {
        super(name);
    }
}