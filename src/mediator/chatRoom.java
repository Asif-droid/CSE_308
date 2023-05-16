package mediator;

public class chatRoom implements chatRoomIn{
    @Override
    public void showMsg(String msg, Participant p1) {
        System.out.println(msg+" sent "+p1.getname());
    }
}
