package paquete;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String json = FilmService.getMovie();
            CustomObjectMapper om =  new CustomObjectMapper();
            Film film = om.readValue(json,Film.class);
            System.out.println(film);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
