package state_design_pattern_home.sculb.edu_game_development;

public class HealthyState implements PlayerState{
    @Override
    public void action(Player player) {
        player.attack();
        player.fireBomb();
        player.fireGunblade();
        player.fireLaserPistol();
    }
}
