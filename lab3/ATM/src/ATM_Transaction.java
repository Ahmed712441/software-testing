import java.util.Scanner;
public class ATM_Transaction {
    public static String transactions(String op,int with_dep) {
        int balance=7000;
        if (op.equals("Withdraw")){
            if (balance >= with_dep) {
                balance = balance - with_dep;
                return "Please collect your money";
            }
            else {
                return "Insufficient Balance";
            }

        }
        else if(op.equals("Deposit")) {
            balance = balance + with_dep;
            return "Your Money has been successfully depsited";
        }

        return "not found this operation";
    }

        public static void main(String[] args) {
            int balance = 5000, withdraw, deposit;
            Scanner s = new Scanner(System.in);
            String  n = s.next();

        }


}

