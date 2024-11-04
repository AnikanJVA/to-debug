public class Login{ // kani nga class kay para mu gana ang login nga feature
    private Scanner input = new Scanner(System.in); // unsa ang need para ma gamit ang scanner ug ang file nga class
    private File accountFile; // this is the File variable used to access/read the text file
    
    public (){ // to fix, this is the constructor that access/read the text file
         = new File("accounts.txt"); // unsa na variable ang need para ma access/read ang file
    }
            // unsa na data type ang dapat dawaton sa arraylist
    public ArrayList<> getAllAccounts(){ // this method puts the contents of the text file into an arraylist
        ArrayList<> accountList = ; // unsa ang need para mag declare ug arraylist
        try{ // this part reads what's inside the text file then adds it into the arraylist
            scanner scan = new scanner(new FileReader(/* unsa dapat ibutang diri para ma read ang file*/))
            while(){ // unsa na condition ang need para magpadayon ug loop
                try{
                    account account = // unsaon ang proper declaration sa object nga Account
                    account.setAccountNum(.nextInt());
                    account.setPin(scan.())
                    account. // unsa na value ang kulang ug unsa ang buhaton para ma butang sa account na object
                    accountList.add() // naa pa ni kulang kung unsa ang atong ibutang sa arraylist
                }
                (Exception){ // naa kulang diri para mu gana ang exception handling
                    continue;
                }
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return ; // unsa atong i-return diri
    }

    public int runLogin(){ // this method asks the user to input the account number and pin
        int // unsa atong need i-declare diri
        (true){ // need atong key word pang loop 
            System.out.print("Enter account number: ");
            try{
                accountNum = // unsay need para ma kuha ang user input dapat naka parse siya para iwas error
                System.out.print("Enter pin: ");
                pin = // unsay need para ma kuha ang user input dapat naka parse siya para iwas error

                if(){ // unsa na method atong need tawagon para ma check ang account number ug pin
                    return accountNum; // need to return accountNum for Main
                }
            }
            catch(Exception e){ // this code runs if the user input is not a number and asks for the account nubmer and pin again
                System.out.println("Enter only numbers. Please try again.");
                ; // unsa ang buhaton para mag recursion
            }
        }
    }

    public boolean isPinCorrect(){ // this method checks if the account number and its pin is correct. Unsa dapat ang dawaton niya nga variables para mu gana
        ArrayList<> accountList = // dapat ang sulod sa arraylist kay ang tanan accounts naa sa text file
        for () { // unsa ang syntax para sa for each
            if(account.getAccountNum() __ accountNum __ account.getPin() __ pin){ // this is the condition that checks if the account number and its pin is correct. 
                //Unsa na operators atong need diri para ma compare mga value
                System.out.println("Login successfull.");
                return true;
            }
        }
        System.out.println("Login failed. Please try again.");
        return ; // unsa ang need i-return kung dili tama ang pin sa iyang account
    }
}