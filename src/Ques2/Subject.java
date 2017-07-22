package Ques2;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
