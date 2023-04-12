public interface Observer {
    public void getUpdate(String name, Video v);
    public void removeChannel(Channel c);
    public void addChannel(Channel c);
}
