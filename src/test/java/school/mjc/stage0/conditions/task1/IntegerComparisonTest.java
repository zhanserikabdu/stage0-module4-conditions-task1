package school.mjc.stage0.conditions.task1;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerComparisonTest extends BaseIOTest {

    @Test
    void mainPrintsHelloWorld() {
        IntegerComparison.main(null);

        assertEquals("Hello, World!\n", updateLineSpliterators(outContent.toString()));
    }


    @Test
    void containsIfConditionCheck() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task1/IntegerComparison.java");
        List<String> strings = Files.readAllLines(path);
        List<String> declarationResult = strings.stream()
                .filter(line -> line.contains("if") && (line.contains("==") || line.contains(">=") || line.contains("<=")))
                .collect(Collectors.toList());


        assertEquals(1, declarationResult.size());
    }

}