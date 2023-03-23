package adapter;

import adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
