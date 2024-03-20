package state_design_pattern_home.sculb.edu_game_development;

public class GameContext {
    private Player player = new Player();

    public void gameAction(String state) {
        if (state == "healthy") {
            player.attack();
            player.fireBomb();
            player.fireGunblade();
            player.fireLaserPistol();
        } else if (state == "survival") {
            player.survive();
            player.firePistol();
        } else if (state == "dead") {
            player.dead();
        }
    }
    private PlayerState state=null;

    public void setState(PlayerState state){
        this.state=state;
    }
    public void gameAction(){
        state.action(player);
    }
}


