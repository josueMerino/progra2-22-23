import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Concurrente> concurrentes = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Concurrente hilo = new Concurrente("Hilo " + i);

            concurrentes.add(hilo);
        }

        for (Concurrente con: concurrentes
             ) {
            con.run();
        }
    }
}