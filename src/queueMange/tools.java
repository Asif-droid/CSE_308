package queueMange;

public  class tools {
    private String name;
    private  int qnt;
    private int cost;

    /*public void setName(String name) {
        this.name = name;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }*/
    public tools(String name,int qnt,int cost){
        this.qnt=qnt;
        this.name=name;
        this.cost=cost;
    }

    public int getCost() {

        return cost*qnt;
    }

    public String getName() {
        return name;
    }

    public int getQnt() {
        return qnt;
    }
}
