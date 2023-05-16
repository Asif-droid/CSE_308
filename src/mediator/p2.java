package mediator;

public class p2 extends Participant{
    public chatRoom room;
    String name;

    public p2(chatRoom room,String name){
        this.room=room;
        this.name=name;

    }

    @Override
    public void send(String msg) {
        room.showMsg(msg,this);

    }

    @Override
    public String getname() {
        return name;
    }
}
