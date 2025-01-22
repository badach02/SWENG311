import java.util.Date;

public class Transaction {
    private Customer renter;
    private Car carRented;
    private Date datePurchased;
    private Date returnDate;
    private int transactionId;
    private float price;

    public Transaction(Customer renter, Car carRented, Date datePurchased, Date returnDate, int transactionId, float price){
        this.renter = renter;
        this.carRented = carRented;
        this.datePurchased = datePurchased;
        this.returnDate = returnDate;
        this.transactionId = transactionId;
        this.price = price;
    }

    public void setRenter(Customer renter){
        this.renter = renter;
    }

    public void setCarRented(Car carRented){
        this.carRented = carRented;
    }

    public void setDatePurchased(Date datePurchased){
        this.datePurchased = datePurchased;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    public void setTransactionId(int transactionId){
        this.transactionId = transactionId;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getTransaction(int lookupId){
        return "";
    }
}
