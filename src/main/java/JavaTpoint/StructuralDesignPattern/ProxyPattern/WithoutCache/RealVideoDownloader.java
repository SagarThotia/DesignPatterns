package JavaTpoint.StructuralDesignPattern.ProxyPattern.WithoutCache;

import JavaTpoint.StructuralDesignPattern.ProxyPattern.VideoDownloaderWithCacheProxy.Video;

public class RealVideoDownloader implements Videodownloader
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
