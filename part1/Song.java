// In the exercise base there is a class called Song that can be used to 
// create new objects that represent songs. Add to that class the equals 
// method so that the similarity of songs can be examined.

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {

        // first check address
        if (this == compared) {
            return true;
        }

        // check type of obj
        if (!(compared instanceof Song)) {
            return false;
        }

        // cast type
        Song compareCast = (Song) compared;

        if (this.name.equals(compareCast.name) && this.artist.equals(compareCast.artist) && this.durationInSeconds == compareCast.durationInSeconds) {
            return true;
        }

        // else false
        return false;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
