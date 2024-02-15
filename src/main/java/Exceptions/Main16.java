package main.java.Exceptions;

class TransactionException extends Exception {

    String errorMessage;
    String errorCode;
    TransactionException(String errorMessage, String errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}

class DigitalWallet {

    int walletId;
    int authCode;
    int balance;

    DigitalWallet(int walletId, int authCode ) {
        this.walletId = walletId;
        this.authCode = authCode;
    }

    void setBalance (int amount ){
        this.balance = amount;
    }

    int getBalance() {
        return this.balance;
    }

}

class TransactionWallet {

    void depositInWallet ( DigitalWallet digitalWallet, int amount) throws TransactionException {

        if ( amount <= 0 ) {
            throw new TransactionException("amount should be greater than 0","INVALID_AMOUNT");
        }
        int balance = digitalWallet.getBalance();
        balance+=amount;
        digitalWallet.setBalance(balance);
    }

    void withdrawWallet ( DigitalWallet digitalWallet, int amount ) throws TransactionException {

        int balance  = digitalWallet.getBalance();
        if ( amount > balance ) {
            throw new TransactionException("not enough funds", "INSUFFICIENT_FUNDS");
        }
    }


}


public class Main16 {

    public static void main ( String args[]) {
          try {
              DigitalWallet digitalWallet = new DigitalWallet(1,110);
              digitalWallet.setBalance(500);
              TransactionWallet transactionWallet = new TransactionWallet();
              transactionWallet.depositInWallet(digitalWallet, 200);
              transactionWallet.withdrawWallet(digitalWallet, 1000);
          }catch(TransactionException e ) {
              System.out.println("Error code "+e.errorCode+" error message "+e.errorMessage);
          }
    }
}
