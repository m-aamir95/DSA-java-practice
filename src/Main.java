import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/*
* A little about how the project is structured.
  0. Main is the driver class, responsible for invoking all the leetcode problems and their test-cases
  1. The leetcode problems are placed inside `Algos` package.
  2. Each package more or less corresponds to the name of the problem in leetcode (obviously without spaces `We don't do that here`)
  3.
* */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        //TODO, make the process of defining a test case for JUNIT simpler and cleaner
        //Because we will be adding test cases
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        Result result = junit.run(Class.forName("Algos.Merge_sorted_array.SolutionTest"),
                                  Class.forName("Algos.Longest_Palindrome_String.SolutionTest"));

        PrintJUnitTestReport(result);
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