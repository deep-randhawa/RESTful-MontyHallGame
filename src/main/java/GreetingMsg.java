/**
 * Created by deep on 11/3/14.
 */
public class GreetingMsg {

    private final long id;
    private final String content;

    public GreetingMsg(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
