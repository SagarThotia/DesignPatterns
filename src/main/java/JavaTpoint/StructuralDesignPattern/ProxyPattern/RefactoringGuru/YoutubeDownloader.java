package JavaTpoint.StructuralDesignPattern.ProxyPattern.RefactoringGuru;

import java.util.HashMap;

public class YoutubeDownloader
{
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api)
    {
        this.api = api;
    }

    public void renderingVideoPage(String videoId)
    {
        Video video = api.getVideo(videoId);
        System.out.println("_________________________________________");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("__________________________________________");
    }

    public void renderPopularVideos()
    {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("___________________________________________");
        System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
        for (Video video: list.values())
        {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("____________________________________________");
    }
}
