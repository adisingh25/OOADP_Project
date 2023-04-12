
import java.util.ArrayList;


public class Channel implements Subject{
    public String channelName;
    private String creatorName;
    private ArrayList<Observer> subscriberList;
    private ArrayList<Video> videoList;

    Channel(String channelName, String creatorName) {
        this.channelName = channelName;
        this.creatorName = creatorName;
        subscriberList = new ArrayList<Observer>();
        videoList = new ArrayList<Video>();
    }

    public void details() {
        System.out.println("-----------Channel Details-------------");
        System.out.println("Channel Name : " + channelName);
        System.out.println("Creator Name : " + creatorName);
        System.out.println("Subscriber Count : " + subscriberList.size());
        System.out.println("Number of Videos : " + videoList.size());
        System.out.println("------------------------------------------");
    }

    public void getName() {
        System.out.println(channelName);
    }


    @Override
    public void subscribe(Observer O) {
        subscriberList.add(O);
        O.addChannel(this);
    }

    @Override
    public void unsubscribe(Observer O) {
        subscriberList.remove(O);
        O.removeChannel(this);
    }

    @Override
    public void notify(Video v) {
        videoList.add(v);
        for(Observer o : subscriberList) {
            o.getUpdate(channelName, v);
        }
    }


}
