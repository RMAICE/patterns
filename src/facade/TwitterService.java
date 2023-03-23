package facade;

import java.util.List;

public class TwitterService {
    private String accessToken;

    private String getAccessToken() {
        if (accessToken != null)
            return accessToken;

        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");

        accessToken = oauth.getAccessToken(requestToken);

        return accessToken;
    }

    public List<Tweet> getTweets() {
        var twitterClient = new TwitterClient();

        return twitterClient.getRecentTweets(getAccessToken());
    };
}
