package facade;

public class Demo {
  public static void main(String[] args) {
    var twitterService = new TwitterService();
  
    twitterService.getTweets();
  }
}
