
import java.util.ArrayList;
import java.util.Scanner;


public class Youtube {
    public static void main(String[] args) {

        ArrayList<Channel> allChannels = new ArrayList<Channel>();
        ArrayList<Subscriber> allSubscriber = new ArrayList<Subscriber>();
        Channel c;
        Subscriber s;
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while(true) {
            System.out.println("1. Create a new Channel");
            System.out.println("2. Create a new Subscriber");
            System.out.println("3. Get the details of a Channel");
            System.out.println("4. Get the details of a Subscriber");
            System.out.println("5. Add a new video and notify the subscribers");
            System.out.println("6. Subscribe a channel");
            System.out.println("7. Unsubscribe a channel");
            System.out.println("8. Close the application");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            if(choice==1) {
                String channelName;
                System.out.println("Enter the name for the channel : ");
                channelName = scan.next();
                String creatorName;
                System.out.println("Enter the name of the creator : ");
                creatorName = scan.next();
                c = new Channel(channelName, creatorName);
                allChannels.add(c);
            }
            if(choice==2) {
                int age ;
                System.out.println("Enter the age of the person : ");
                age = scan.nextInt();
                String personName;
                System.out.println("Enter the name of the subscriber : ");
                personName = scan.next();
                s = new Subscriber(personName, age);
                allSubscriber.add(s);
            }
            if(choice==3) {
                String cName;
                System.out.println("Enter the name for the channel : ");
                cName = scan.next();
                for(Channel c1: allChannels) {
                    if(c1.channelName.equals(cName) ) {
                        c1.details();
                        break;
                    }
                }
            }
            if(choice==4) {
                String pName;
                System.out.println("Enter the name of the subscriber : ");
                pName = scan.next();
                for(Subscriber s1: allSubscriber) {
                    if(s1.name.equals(pName) ) {
                        s1.getDetails();
                        break;
                    }
                }
            }
            if(choice==5) {
                String cName;
                System.out.println("Enter the name for the channel : ");
                cName = scan.next();
                String videoName;
                System.out.println("Enter the title for the video : ");
                videoName = scan.next();
                for(Channel c1: allChannels) {
                    if (c1.channelName.equals(cName)) {
                        c1.notify(new Video(videoName, "10:00", c1.channelName));
                        break;
                    }
                }
            }
            if(choice==6) {
                String cName;
                System.out.println("Enter the name for the channel : ");
                cName = scan.next();
                String pName;
                System.out.println("Enter the name of the subscriber : ");
                pName = scan.next();
                Observer ob = null;
                for(Subscriber s1: allSubscriber) {
                    if(s1.name.equals(pName) ) {
                        ob=s1;
                        break;
                    }
                }
                for(Channel c1: allChannels) {
                    if (c1.channelName.equals(cName)) {
                        c1.subscribe(ob);
                        break;
                    }
                }
            }
            if(choice==7){
                String cName;
                System.out.println("Enter the name for the channel : ");
                cName = scan.next();
                String pName;
                System.out.println("Enter the name of the subscriber : ");
                pName = scan.next();
                Observer ob = null;
                for(Subscriber s1: allSubscriber) {
                    if(s1.name.equals(pName) ) {
                        ob=s1;
                        break;
                    }
                }
                for(Channel c1: allChannels) {
                    if (c1.channelName.equals(cName)) {
                        c1.unsubscribe(ob);
                        break;
                    }
                }
            }
            if(choice==8) {
                System.exit(1);
            }
        }
    }

}
