public class Customer {
    private String name;
    private int licenseNumber;
    private int customerId;

    public Customer(String name, int licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLicenseNumber(int licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public String getDetails(){
        return "";
    }
}
