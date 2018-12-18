import java.util.ArrayList;
import java.util.List;

public class Runner
{
    public static void main(String[] args)
    {
        DownloadInfo song = new DownloadInfo("Toxic");
        DownloadInfo song1 = new DownloadInfo("Gimme More");
        DownloadInfo song2 = new DownloadInfo("Happy");
        DownloadInfo song3 = new DownloadInfo("Lights");
        DownloadInfo song4 = new DownloadInfo("Mambo No.5");

        MusicDownloads playlist = new MusicDownloads();
        List<String> a = new ArrayList<>();
        a.add(song.getTitle());
        a.add(song1.getTitle());
        a.add(song2.getTitle());
        a.add(song3.getTitle());
        a.add(song4.getTitle());

        playlist.updateDownloads(a);

        System.out.println(playlist);
    }
}
