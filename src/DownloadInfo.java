public class DownloadInfo
{
    String title;
    int downloads;

    public DownloadInfo(String title)
    {
        this.title = title;
        downloads = 1;
    }

    public String getTitle()
    {
        return title;
    }

    public void incrementTimesDownloaded()
    {
        downloads++;
    }

}
