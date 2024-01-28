
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> literacy = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]),
                            Double.valueOf(parts[5]))) // parts[3].replace("(%)", "").trim()
                    .sorted((x, y) -> Double.compare(x.getLiteracyPercentage(), y.getLiteracyPercentage()))
                    .forEach(x -> literacy.add(x));
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        literacy.stream()
                .forEach(x -> System.out.println(x.toString()));
        // literacy.stream().sorted((t1, t2) -> {
        // if (t1.getLiteracyPercentage() > t2.getLiteracyPercentage()) {
        // return 1;
        // }
        // if (t1.getLiteracyPercentage() < t2.getLiteracyPercentage()) {
        // return -1;
        // }
        // return 0;
        // }).forEach(t -> System.out.println(t));
    }
}
