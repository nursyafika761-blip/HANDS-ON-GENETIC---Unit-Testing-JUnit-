import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProdukWriterNew {

    public static void main(String[] args) {

        List<Produk<String, Double>> produkList =
                new ArrayList<>();

        produkList.add(
                new Produk<>("Laptop", 15000000.0, 5)
        );

        produkList.add(
                new Produk<>("Mouse", 150000.0, 10)
        );

        produkList.add(
                new Produk<>("Keyboard", 350000.0, 7)
        );

        Path filePath =
                Paths.get("produk_output.txt");

        try {

            List<String> lines = new ArrayList<>();

            for (Produk<String, Double> p : produkList) {
                lines.add(p.toString());
            }

            Files.write(filePath, lines);

            System.out.println(
                    "Data produk berhasil disimpan."
            );

            System.out.println("\nIsi file:");

            List<String> data =
                    Files.readAllLines(filePath);

            for (String line : data) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(
                    "Gagal menyimpan file: " +
                    e.getMessage()
            );
        }
    }
}