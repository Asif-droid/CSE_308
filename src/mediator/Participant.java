package mediator;

public abstract class Participant {
    public abstract void send(String msg);
    public abstract String getname();
}
