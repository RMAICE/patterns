package adapter;

public class Demo {
    public static void main(String[] args) {
        var emailClient = new EmailClient();

        emailClient.addProvider(new GmailAdapter());

        emailClient.downloadEmails();
    }
}
