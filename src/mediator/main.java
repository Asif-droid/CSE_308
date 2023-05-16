package mediator;

public class main {
    public static void main(String[] args) {
        chatRoom room=new chatRoom();

        p1 p1=new p1(room,"x");
        p2 p2=new p2(room,"y");
        p1.send("hello how are you");
        p2.send("I'm fine you?");
    }
}
