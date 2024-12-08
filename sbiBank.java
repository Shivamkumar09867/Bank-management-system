public class sbiBank extends Bank {

    public int checkBal(){
        return super.balance;
    }

    public int withdraw(int amount){
        if (amount<super.balance) {
            System.out.println("withdraw is successfully.......");
            super.balance=super.balance-amount;
            return amount;
            
        }
        else{
            System.out.println("insuffient balance....");
            return 0;
        }
    }
    public void deposite(int amount){
        super.balance=super.balance + amount;
        
        

    }

}
