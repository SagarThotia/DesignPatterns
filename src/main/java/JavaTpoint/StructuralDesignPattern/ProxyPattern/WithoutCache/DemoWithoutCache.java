package JavaTpoint.StructuralDesignPattern.ProxyPattern.WithoutCache;

public class DemoWithoutCache
{
    public static void main(String[] args)
    {
        Videodownloader videodownloader = new RealVideoDownloader();
        videodownloader.getVideo("geekific");
        videodownloader.getVideo("geekific");
        videodownloader.getVideo("likeNsubscribe");
        videodownloader.getVideo("likeNsubscribe");
        videodownloader.getVideo("geekific");
    }
}
