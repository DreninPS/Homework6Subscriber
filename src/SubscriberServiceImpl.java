import java.math.BigDecimal;
import java.util.Locale;

public class SubscriberServiceImpl implements SubscriberService{
    @Override
    public void exceedsMiddleCityMinutes(Subscriber[] subscribers, Double timeCityMinutes) {
        for (Subscriber s: subscribers) {
            if (s.getTimeCityMinutes()>timeCityMinutes) System.out.println("exceeds MiddleCity Minutes for "+ timeCityMinutes + "min" + s);
        }
    }
    @Override
    public void useMiddleCityMinutes(Subscriber[] subscribers) {
        for (Subscriber s: subscribers) {
           if(s.getTimeMiddleCityMinutes()>0) System.out.println("use MiddleCity Minutes "+s);
        }
    }
    @Override
    public void firstLetterSecondName(Subscriber[] subscribers, char letter) {
        for (Subscriber s: subscribers) {
           Character firstLetterSecondName = s.getSecondName().toUpperCase(Locale.ROOT).charAt(0);
           if (firstLetterSecondName.equals(Character.toUpperCase(letter))) {
               System.out.println("First name: " + s.getFirstName()+", Second name: " + s.getSecondName()+ ", Phone number: " + s.getPhoneNumber() + ", Balance: " +s.getBalance());
           }
        }
    }
    @Override
    public void sumTraficForCity(Subscriber[] subscribers, String city) {
        Double count = 0.0d;
        for (Subscriber s: subscribers) {
            if(s.getCity().equals(city)) count = count + s.getTraficInternetGb();
        }
        System.out.println("Sum trafic in " + city+ " = " +count +"Gb");
    }
    @Override
    public void negativeBalance(Subscriber[] subscribers) {
        for (Subscriber s: subscribers) {
            if(s.getBalance().compareTo(new BigDecimal(0)) < 0) {
                System.out.println("Negative balance " + s);
            }
        }
    }
}
