package state_design_pattern_for_lamp_open_or_close;

public class LampOpenState implements LampState{
    @Override
    public void onOpen() {
        System.out.println("Lamba açmaya çalışıyorsunuz fakat lamba zaten açık.");
    }

    @Override
    public void onClose() {
        System.out.println("Lamba açık fakat kapanıyor...");

    }
}
