package JavaTpoint.StructuralDesignPattern.ProxyPattern.WithoutCache;

import JavaTpoint.StructuralDesignPattern.ProxyPattern.VideoDownloaderWithCacheProxy.Video;

public interface Videodownloader
{
    public Video getVideo(String videoName);
}
