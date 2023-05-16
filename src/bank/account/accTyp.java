package bank.account;

public class accTyp {

    public account accType(String type){
        if(type.equalsIgnoreCase("student")){
            return new stAcc();
        }
        else if(type.equalsIgnoreCase("savings")){
            return new svAcc();
        }
        else if(type.equalsIgnoreCase("fixed")){
            return new fxAcc();
        }
        else if(type.equalsIgnoreCase("loan")){
            return new lnAc();
        }
        else {
            return null;
        }
    }

}
