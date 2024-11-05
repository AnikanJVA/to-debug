public class Deposit{ // kani nga class kay para sa tanan related sa deposit
    private File depositFile; // this is the File variable used to access/read the text file 
    // Unsa atong need para ma gamit ang File nga class

    public { // this is the constructor that access/read the deposit text file of specific accounts
        = new File( + "_deposits.txt"); // unsa na variable ang need para ma access/read ang file
    }                                   // unsa atong need ibutang para unique ang deposit file sa isa ka account

            // unsa na data type ang dapat dawaton sa arraylist
    public ArrayList<> getDepositList(){ // this method puts the contents of the text file into an arraylist
        ArrayList<Transaction> depostiList = ; // unsa ang need para mag declare ug arraylist
        try{
            scanner scan = new scanner(new FileReader(/* unsa dapat ibutang diri para ma read ang file*/));
            while(){ // unsa na condition ang need para magpadayon ug loop
                try{
                    transaction transaction = // unsaon ang proper declaration sa object nga Transaction
                    transaction. // unsa na value ang kulang ug unsa ang buhaton para ma butang sa transaction na object 
                    transaction.setAmount(); // unsa ang need para ma set ang value nga naa sa sulod sa text file
                    depositList.add(); // naa pa ni kulang kung unsa ang atong ibutang sa arraylist
                }
                (Exception){ // naa kulang diri para mu gana ang exception handling
                    continue;
                }
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            // e.printStackTrace();
        }
        return ; // unsa dapat i-return diri
    }

    public void AmountDeposit(double amount){ // this method adds a deposit transaction into the file
        ArrayList<> depositList = // dapat ang sulod sa arraylist kay ang tanan deposit sa account nga naa sa text file
        FileWriter fw;
        BufferedWriter bw;
        int transactionId = 0;
        for (int i = 0; j < depositList.size(); j++) { // this part increments the transaction id 
            transId++; // <- ^^ Need to fix
        }

        try{ // this part writes the new deposit transaction into the file
            = new FileWriter(depositFile, true); // unsa ang names sa atong variable nga FileWriter
            = new BufferedWriter(fw); // unsa ang names sa atong variable nga BuffuredWriter
            .write(transId + " " + Amount); // BufferedWriter ang gamiton diri ug naa ni kulang i-add para mag next line ang sulat sa file
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

                    // unsa ang parameter (dawaton sa method) para ma specify account
    public void showBalance(){ // this method shows the balance of an account
        ; // unsa ang dapat i-declare para ma gamit ang methods sa Balance nga class
        ArrayList<Account> accountList = // unsa ang need para ma kuha ang arraylist nga naay accounts na computed na ang balance

        for (){ // unsa ang syntax para sa for each
            if (account. == accountNum) { // unsa ang need i-compare para ma tama ang condition
                System.out.println("Current Balance: " + .getBalance()); // dapat naka round off ang balance pagprint
            }
        }
    }
}
