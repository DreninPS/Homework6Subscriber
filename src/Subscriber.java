import java.math.BigDecimal;

public class Subscriber {
    public Subscriber() {}
    public Subscriber(Integer id, String firstName, String secondName, String middleName, String city, String phoneNumber, String contractNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
    }

    private Integer id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private BigDecimal balance;
    private Double timeCityMinutes;
    private Double timeMiddleCityMinutes;
    private Double traficInternetGb;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getSecondName() {return secondName;}
    public void setSecondName(String secondName) {this.secondName = secondName;}

    public String getMiddleName() {return middleName;}
    public void setMiddleName(String middleName) {this.middleName = middleName;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getContractNumber() {return contractNumber;}
    public void setContractNumber(String contractNumber) {this.contractNumber = contractNumber;}

    public BigDecimal getBalance() {return balance;}
    public void setBalance(BigDecimal balance) {this.balance = balance;}

    public Double getTimeCityMinutes() {return timeCityMinutes;}
    public void setTimeCityMinutes(Double timeCityMinutes) {this.timeCityMinutes = timeCityMinutes;}

    public Double getTimeMiddleCityMinutes() {return timeMiddleCityMinutes;}
    public void setTimeMiddleCityMinutes(Double timeMiddleCityMinutes) {this.timeMiddleCityMinutes = timeMiddleCityMinutes;}

    public Double getTraficInternetGb() {return traficInternetGb;}
    public void setTraficInternetGb(Double traficInternetGb) {this.traficInternetGb = traficInternetGb;}

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", timeCityMinutes=" + timeCityMinutes +
                ", timeMiddleCityMinutes=" + timeMiddleCityMinutes +
                ", traficInternetGb=" + traficInternetGb +
                '}';
    }
}
