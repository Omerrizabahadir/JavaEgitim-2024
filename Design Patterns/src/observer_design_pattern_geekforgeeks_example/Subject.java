package observer_design_pattern_geekforgeeks_example;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
