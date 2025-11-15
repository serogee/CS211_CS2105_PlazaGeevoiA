public class ArtistDemo {
    public static void main(String[] args) {
        // Base Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        // Singer
        Singer singer = new Singer("Ariana Grande", "American", 31, "Vocals", Genre.POP);
        singer.displayInfo();

        System.out.println();

        // Painter
        Painter painter = new Painter("Leonardo Rivera", "Filipino", 27, "Visual Arts", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        // Writer
        Writer writer = new Writer("Haruki Sato", "Japanese", 45, "Literature", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        // Dancer
        Dancer dancer = new Dancer("Mia Rodriguez", "Spanish", 22, "Performance Arts", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}