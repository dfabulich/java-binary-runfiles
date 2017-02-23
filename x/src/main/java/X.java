import java.nio.file.*;

public class X {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("./data.txt").toAbsolutePath();
		String content = new String(Files.readAllBytes(path), "UTF-8");
		System.out.println(content);
	}
}