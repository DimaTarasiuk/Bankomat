public class Card {
    private int cardNumber;
    private int cvv;
    private int date;
    private long balance;
    private int pinCode;
    public boolean isBlock;
    //TODO flag active


    public Card(boolean isBlock){
        isBlock = true;
    }

    // setters
    public void setCardNumber (int cardNumber){
        this.cardNumber = cardNumber;
    }
    public void setCvv(int cvv){
        this.cvv = cvv;
    }
    public void  setDate(int date){
        this.date = date;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    //getters
    public int getCardNumber(){
        return cardNumber;
    }
    public int getCvv(){
        return cvv;
    }
    public int getDate(){
        return date;
    }
    public long getBalance(){
        return balance;
    }
    public int getPinCode() {
        return pinCode;
    }
}
