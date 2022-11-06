import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SubscriberServiceImpl service = new SubscriberServiceImpl();
        Subscriber[] subMass = new Subscriber[]{
                new Subscriber(1,"Pavlo","Drenin","Sergeevich","Kyiv","+380674045165","008"),
                new Subscriber(2,"Dima","Drenin","Sergeevich","Kyiv","+380673222233","009")};

        subMass[0].setBalance(new BigDecimal(10000.00));
        subMass[0].setTimeCityMinutes(25.5);
        subMass[0].setTimeMiddleCityMinutes(30.0);
        subMass[0].setTraficInternetGb(23.54);

        subMass[1].setBalance(new BigDecimal(-5000.00));
        subMass[1].setTimeCityMinutes(25.5);
        subMass[1].setTimeMiddleCityMinutes(0.1);
        subMass[1].setTraficInternetGb(2.54);

        service.exceedsMiddleCityMinutes(subMass,2d);
        service.useMiddleCityMinutes(subMass);
        service.firstLetterSecondName(subMass,'d');
        service.sumTraficForCity(subMass, "Kyiv");
        service.negativeBalance(subMass);

    }
}