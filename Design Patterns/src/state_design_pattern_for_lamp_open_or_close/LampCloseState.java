package state_design_pattern_for_lamp_open_or_close;

public class LampCloseState implements LampState{
    @Override
    public void onOpen() {
        System.out.println("Lamba kapalı ama şuan açılıyor");
    }

    @Override
    public void onClose() {
        System.out.println("Lambayı kapatmaya çalışıyorsunuz fakat zaten kapalı...");
    }
}
