package handleFilesAndPaths.GetDirectoriesAndFiles;

import java.nio.file.Paths;

public class GetDirectoriesAndFiles {
    private static final String src = "src",
            main = "main",
            java = "java",
            resources = "resources",
            configFileName = "config.properties";

    private static final String USER_DIR = System.getProperty("user.dir");

    public static String getConfigFile() {
        return Paths.get(USER_DIR, src, main, resources, configFileName).toString();
    }
}
