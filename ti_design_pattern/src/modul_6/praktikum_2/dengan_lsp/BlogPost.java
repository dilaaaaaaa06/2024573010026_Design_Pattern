package modul_6.praktikum_2.dengan_lsp;

public class BlogPost extends SocialPost {

    private boolean published = false;

    public BlogPost(String content) {
        super(content);
    }

    @Override
    public void publish() {
        if (published) {
            System.out.println("Blog post already published.");
            return;
        }

        System.out.println("Publishing blog: " + content);
        published = true;
    }

    @Override
    public boolean canPublish() {
        return !published;
    }

    public void editContent(String newContent) {
        if (published) {
            System.out.println("Cannot edit a published blog post.");
        } else {
            content = newContent;
            System.out.println("Blog content updated.");
        }
    }
}