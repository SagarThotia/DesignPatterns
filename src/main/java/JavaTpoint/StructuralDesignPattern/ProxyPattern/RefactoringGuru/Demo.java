package JavaTpoint.StructuralDesignPattern.ProxyPattern.RefactoringGuru;

public class Demo
{
    public static void main(String[] args)
    {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader)
    {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderingVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderingVideoPage("dancesvideoo");

        // Users might visit the same page quite often.
        downloader.renderingVideoPage("catzzzzzzzzz");
        downloader.renderingVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
     }
}
