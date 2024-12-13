package JavaTpoint.StructuralDesignPattern.ProxyPattern.VideoDownloaderWithCacheProxy;

public class Demo
{
    public static void main(String[] args)
    {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");
    }
}
