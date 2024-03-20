package state_design_pattern_home.sculb.edu_game_development;

public class DeadState implements PlayerState{
    @Override
    public void action(Player player) {
        player.dead();
    }
}
