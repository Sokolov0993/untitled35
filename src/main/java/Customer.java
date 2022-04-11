public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String surname;
    private String address;
    private int creditCard;
    private int bankAcc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(int bankAcc) {
        this.bankAcc = bankAcc;
    }

    public Customer(int id, String name, String surname, int creditCard) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.creditCard = creditCard;
    }

    public String toString() {
        return name + " " + surname + " " + "(" + creditCard + ")";

    }

    @Override
    public int compareTo(Customer e) {
        return this.getSurname().compareTo(e.getSurname());

    }
}
