package JavaTpoint.StructuralDesignPattern.ProxyPattern.VideoDownloaderWithCacheProxy;

public class RealVideoDownloader implements VideoDownloader
{
    @Override
    public Video getVideo(String videoName)
    {
        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading Video");
        System.out.println("Retrying Video Metadata");
        return new Video(videoName);
    }
}
