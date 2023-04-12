public interface Subject {
    void subscribe(Observer O);
    void unsubscribe(Observer O);
    void notify(Video v);
}
