public class Video {
    private String titleName;
    private String length;
    private String channelName;

    Video(String titleName, String length, String channelName) {
        this.titleName = titleName;
        this.length = length;
        this.channelName = channelName;
    }

    void getDetails() {
        System.out.println("-------------Video Details---------------");
        System.out.println("Name : " + titleName);
        System.out.println("Video Length : " + length);
        System.out.println("Channel Name : " + channelName);
    }

    String getTitleName() {
        return titleName;
    }
}
