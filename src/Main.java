import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* A little about how the project is structured.
  0. Main is the driver class, responsible for invoking all the leetcode problems and their test-cases
  1. The leetcode problems are placed inside `Algos` package.
  2. Each package more or less corresponds to the name of the problem in leetcode (obviously without spaces `We don't do that here`)
  3.
* */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        //Each package is a leetcode problem
        //We are reading their names, because we want to run automatic unit tests on them
        //Else we would have to modify and update the junit.run() code everytime we add a new problem
        String[] sub_packages = getLeetCodeProblemsSubPackages();

        //update the subpackage names with fully qualified names that point to SolutionTest classes
        String[] reformated_package_paths = Stream.of(sub_packages).map(s -> {
            String[] parts = s.split("/");
            String reformated_package_path = String.join(".", parts);
            return String.format("%s.SolutionTest", reformated_package_path);
        }).toArray(String[]::new);

        for (String package_path :
                reformated_package_paths) {
            Result result = junit.run(Class.forName(package_path));
            PrintJUnitTestReport(result);
        }
    }

    //Get all the available packages/leetcode problems inside Algos
    private static String[] getLeetCodeProblemsSubPackages() throws IOException {
        List<String> dir_names = new ArrayList<>();

        Path path_to_algo_package = Paths.get(System.getProperty("user.home"), "github", "DSA-java-practice/src/Algos");

        try(DirectoryStream<Path> pathStream = Files.newDirectoryStream(path_to_algo_package)){
            for (Path p :
                    pathStream) {
                if (Files.isDirectory(p)){
                    String package_path = p.toString().split("src/")[1];
                    //If a Test Suit exist within the package
                    if (Files.exists(Paths.get(package_path, "SolutionTest.java"))){
                        dir_names.add(package_path); //TODO, potential IndexOutOfBound when no dirs present
                    }
                }
            }
        }

        String[] dirs_arr = new String[dir_names.size()];
        return dir_names.toArray(dirs_arr);
    }
    private static void PrintJUnitTestReport(Result result){
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getMessage());
        }

        System.out.println("Number of tests run: " + result.getRunCount());
        System.out.println("Number of tests failed: " + result.getFailureCount());

        System.out.println("----------------------------------");
        System.out.printf("Total Runtime %dms", result.getRunTime());

    }
}