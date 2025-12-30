import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {

    public static void main(String[] args) {

        int currentYear = Year.now().getValue();

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java Basics", 2024, 60, "HD"));
        items.add(new VideoLecture("OOP Advanced", 2022, 45, "4K"));
        items.add(new PodcastEpisode("Tech Talk", 2024, 30, "Alice"));
        items.add(new PodcastEpisode("Coding Stories", 2021, 40, "Bob"));

        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println(
                        "Max downloads per day: " +
                                d.getMaxDownloadsPerDay()
                );
            }

            System.out.println("----------------------------");
        }
    }
}


