package modul_6.praktikum_2.dengan_lsp;

public class TwitterPost extends SocialPost {

    private static final int MAX_LENGTH = 200;

    public TwitterPost(String content) {
        super(content);
    }

    @Override
    public void publish() {
        System.out.println("Posting tweet: " + content);
    }

    @Override
    public int getMaxContentLength() {
        return MAX_LENGTH;
    }
}
