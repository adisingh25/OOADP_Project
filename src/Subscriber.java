import java.util.ArrayList;

public class Subscriber implements Observer{
    public String name;
    private int age;
    private ArrayList<Channel> channelList;

    Subscriber(String name, int age) {
        this.name = name;
        this.age = age;
        channelList = new ArrayList<Channel>();
    }

    void getDetails() {
        System.out.println("-------------Subscriber Details-----------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("---Channels Subscribed---");
        for(Channel c : channelList) {
            c.getName();
        }
        System.out.println("------------------------------------------");
    }

    @Override
    public void removeChannel(Channel c) {
        channelList.remove(c);
    }

    @Override
    public void addChannel(Channel c) {
        channelList.add(c);
    }


    @Override
    public void getUpdate(String cname, Video v) {
        System.out.print("------Notification-------");
        System.out.println("Hey, " + name + " " + cname + " just uploaded a video - " + v.getTitleName());
        System.out.println("-----------------------");
    }
}
