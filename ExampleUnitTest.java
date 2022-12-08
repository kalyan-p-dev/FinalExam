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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DataFile1 {

    String title;
    String page;
    String isbn;
    String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

public class Example {

    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(
                Paths.get((args[0])).toAbsolutePath()
        ).skip(1);
        List<DataFile1> list = lines.map(Example::extracted).collect(Collectors.toList());
        System.out.print(list.stream().filter(movie->movie.getTitle().contains("Java"))
                .collect(Collectors.toList()));



    }

    private static DataFile1 extracted(String str) {
        String[] words = str.split(",");
        DataFile1 data = new DataFile1();
        data.setTitle(words[0]);
        data.setPage((words[1]));
        data.setIsbn(words[2]);
        data.setCategory(String.valueOf((words[3])));
        return data;
    }
}
