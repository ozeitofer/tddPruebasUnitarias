package tdd;

public class UrlShortener {

	public String shorter(String url) {
		// TODO Auto-generated method stub
		return this.cacheController.shortUrl(url);
	}

	public String reverseUrl(String shortenUrl) {
		// TODO Auto-generated method stub
		return this.cacheController.reverseUrl(shortenUrl);
	}
	
	private CacheController cacheController;

}
