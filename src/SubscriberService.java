public interface SubscriberService {
    void exceedsMiddleCityMinutes(Subscriber[] subscribers, Double timeCityMinutes);
    void useMiddleCityMinutes(Subscriber[] subscribers);

    void firstLetterSecondName(Subscriber[] subscribers, char letter);

    void sumTraficForCity (Subscriber[] subscribers, String city);

    void negativeBalance (Subscriber[] subscribers);

}
