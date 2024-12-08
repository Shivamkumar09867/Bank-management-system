import java.util.Scanner;;
public class BankDriver {
    public static void main(String[] args) {
        sbiBank sbi = new sbiBank();
        Bank b= sbi;//upcating

        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to SBI Bank");
        System.out.println("1: check balance");
        System.out.println("2: withdraw cash");
        System.out.println("3: depost cash");

        int sel= sc.nextInt();
        if (sel==1) {
            String num = sc.nextLine();
            num= "enter you pin";
            System.out.println(num);

            int pin =sc.nextInt();

            if (pin==123) {
                System.out.println("your available balance are =: " + b.checkBal());
                
            }
            else{
                System.out.println("please enter you correct pin");
            }

            
        }
        else if (sel==2) {
            String num = sc.nextLine();
            num= "enter you pin";
            System.out.println(num);

            int pin =sc.nextInt();

            if (pin==123) {
                System.out.println("enter amount");
                int amt= sc.nextInt();
                b.withdraw(amt);
                System.out.println("available balance are :" + b.checkBal());
                
                
            }
            else{
                System.out.println("please enter you correct pin");
            }
    

            
        }
        else if (sel==3) {
            String num = sc.nextLine();
            num= "enter you pin";
            System.out.println(num);

            int pin =sc.nextInt();

            if (pin==123) {
                System.out.println("enter amount");
                int dep = sc.nextInt();
                b.deposite(dep);
                System.out.println("available balance are :" +b.checkBal());
    
            }

            else{
                System.out.println("please enter you correct pin");
            }
            
        }
        else{
            System.out.println("please you select given option");
        }
        
    }
}
