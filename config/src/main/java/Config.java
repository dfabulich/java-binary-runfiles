import java.nio.file.*;

public class Config {
	public static String getConfig() throws Exception {
		Path path = Paths.get("./data.txt").toAbsolutePath();
		return new String(Files.readAllBytes(path), "UTF-8");
	}
}