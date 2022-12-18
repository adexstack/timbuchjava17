public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        //movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        //jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        //comedyMovie.watchComedy();

        //JDK10 var keyword. hence, no casting needed
        var airplane = Movie.getMovie("C", "Airplane");
        //airplane.watchMovie();

        var plane = new Comedy("Airplane");
        //plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Star Wars");
        // getting class name
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
            // using instanceof to detect instance class at runtime
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
            // JDK16 Pattern matching (no casting required)
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
