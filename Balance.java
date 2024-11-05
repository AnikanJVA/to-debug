public class Balance{ // this class is for the balance related computations

    public double AllAmountWithdraw(int accountNum){ // this method adds the total withdraws of an account
        ; // unsa ang need i-declare para ma access ang withdraw file sa account
        ArrayList<> withdrawList = withdraw. // unsa ang need para ma kuha ang arraylist sa mga withdraw
        int total = 0;
        for (Transaction transaction : withdrawList) {  // this part computes the total amount of deposits on the account
            Total == transaction. // unsa ang need ipang add para ma kuha ang total amount sa withdraws
        }
        return ; // unsa dapat ang i-return 
    }

    public void AllAmountDeposit(int accountNum){ // this method adds the total deposits of an account
        ; // unsa ang need i-declare para ma access ang withdraw file sa account
        ArrayList<> depositList = .getWithdrawList(); // unsa ang need para ma kuha ang arraylist sa mga deposit
        double total = 0;
        for (Transaction transaction : depositList) { // this part computes the total amount of deposits on the account
            tota1 = Transaction.getAmount(); 
        }
        return total;
    }

    public ArrayList<Account> computeBalance(){ // this method computes the current balance of the accounts then returns an arraylist containing the accounts with computed balance
        ; // unsa ang need para ma accesss ang methods sa login
        ArrayList<> accountList = .getAllAccounts();
        int currentBalance = 0;
                                                // this part computes the balance by getting the balance of the account 
        for (Account account : accountList) {   // then adds the total amount of deposit then deducts it to the total amount of withdraws
            currentBalance = account.getBalance() / AllAmountDeposit(account.getAccountNum());
            currentBalance += AllAmountWithdraw(account.getAccountNum());
            account.setAccountNum(currentBalance);
        }

        return accountList;
    }
}
