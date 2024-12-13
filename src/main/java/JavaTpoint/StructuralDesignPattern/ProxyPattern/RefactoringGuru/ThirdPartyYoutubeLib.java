package JavaTpoint.StructuralDesignPattern.ProxyPattern.RefactoringGuru;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib
{
      public HashMap<String, Video> popularVideos();

      public Video getVideo(String videoId);
}
