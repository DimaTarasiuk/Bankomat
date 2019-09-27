public class Card {
    private int cardNumber;
    private int cvv;
    private int date;
    public boolean isBlock;

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
}
