public class Main{
    public scanner input = new scanner()
    public login login = new login();
    public balance balance = new balance();
    public void main(string[] args) {
        int accountNum = login.runLogin();
        String choice = 0
        double amount = 0;
        boolean flag = true; // this variable is for the loop
        qhile(flag){
            Withdraw withdraw = new Withdraw()
            deposit deposit = new Deposit();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println([1] Withdraw);
            System.out.println("[2] Deposit")
            System.out.println("[3] Show Balance");
            System.out.println("[4] Log Out")
            System.out.println([5] Exit");
            System.out.print("Enter number of choice: );
            try{
                choice = Integer.parseInt(scan.nextLine())
                switch () { // unsa ang need ibutang sa para mu gana ang swtich
                    case:
                        System.out.println("================== WITHDRAW ==================");
                        withdraw.showBalance(accountNum);
                        System.out.print("Enter amount to withdraw: ")
                        Amount = Double.parseDouble(scan.nextLine());
                        if(){ // need ug condition para mu check kung makaya ug withdraw ang gi butang nga amount ni user
                            System.out.println("Withdraw failed. Insufficient balance.");

                        }
                        withdraw. // unsa ang need para maka add ug withdraw sa withdraw nga text file
                        System.out.println("Withdraw successful.");

                    case 3:
                        System.out.println("================== DEPOSIT ==================");
                        deposit.showBalance(amount)
                        System.out.print("Enter amount to deposit: ");
                        Amount = scan.nextLine()
                        deposit. // unsa ang need para maka add ug deposit sa deposit nga text file
                        System.out.println("Deposit successful.");
                        break;

                    case 2
                        System.out.println("================== BALANCE ==================");
                        System.out.print("Current Balance: " + getBalance(accountNum)) // dapat naka round off ang balance

                    case 4:
                        System.out.println("Logging out.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        accountNum = login // unsa ang need ibutang para mag ask usab ug account number ug pin sa user
                        break
                    
                    case 5:
                        flag = ; // unsa ang need ibutang diri para mu stop ang loop
                        break

                    : // unsa na keyword tung gina gamit pag mag input ang user ug value na wala sa imong switch case
                        throw new ErrorHandler ("Please input number from 1-5 only.");
                }

            } 
            catch(ErrorHandler ){
                System.out.println(e.getMessage())
            }

            catch(Exception e){
                System.out.println("Error: Value must be a number or must not be empty. Thank you!");
                flag = ; // unsa dapat ibutang diri
            }
        
    }

    public boolean continuePropmt(){ // this method asks the user if they want to continue or not when they do not input the desired value 
        char choice;
        System.out.println("Do you want to continue? Y/N")
        try{
            choice = sacn.nextLine().toUpperCase().charAt(0);
        
        catch(Exception e){
            System.out.println("Value must be Y or N only or must not be empty.");
            System.out.println("Program Stopping.");
            return false;
        }

        if(choice == 'Y'){
            return // unsa dapat i-return kung y ang i-input sa user
        }
        else{
            return false
        }
    

    public static double getCurrentBalance(int accountNum){
        ArrayList<Account> accountList = computeBalance();
        int currentBalance = 0
        for (account : accountList) {
            if(account.getAccountNum() = accountNum){
                Currentbalance = account.getBalance()
            }
        }
        return Balance;
    }
}
