package state_design_pattern_home.sculb.edu_game_development;

public class Main {
    public static void main(String[] args) {
        GameContext gameContext=new GameContext();
        gameContext.setState(new HealthyState());
        gameContext.gameAction();
        System.out.println("*****");

        gameContext.setState(new SurvivalState());
        gameContext.gameAction();
        System.out.println("*****");
        gameContext.setState(new DeadState());
        gameContext.gameAction();
        System.out.println("*****");

    }
}
