package HashSet;

public class Customer {
    private int customer_id;
    private String custName;
    private String address;
    private String mobNo;
    private int rating ;

    public Customer() {
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    private String feedback;

    public Customer(int customer_id, String custName, String address, String mobNo, int rating, String feedback) {
        this.customer_id = customer_id;
        this.custName = custName;
        this.address = address;
        this.mobNo = mobNo;
        this.rating = rating;
        this.feedback = feedback;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustName() {
        return custName;
    }

    public String setCustName(String custName) {
        this.custName = custName;
        return custName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

   // @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return customer_id == customer.customer_id && mobNo == customer.mobNo && rating == customer.rating && Objects.equals(custName, customer.custName) && Objects.equals(address, customer.address) && Objects.equals(feedback, customer.feedback);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(customer_id, custName, address, mobNo, rating, feedback);
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", custName='" + custName + '\'' +
                ", address='" + address + '\'' +
                ", mobNo=" + mobNo +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
    // public void updateDetails()
}
