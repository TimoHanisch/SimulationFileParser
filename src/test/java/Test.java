import de.dailab.simulator.parser.SimulationFileTreeWalker;
import de.dailab.simulator.parser.generated.SimulationFileLexer;
import de.dailab.simulator.parser.generated.SimulationFileParser;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 07.05.2015
 */
public class Test {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Timo\\IdeaProjects\\SimulationFileParser\\TestSimNew.mmsim";
        SimulationFileLexer lexer = new SimulationFileLexer(new ANTLRFileStream(filePath));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimulationFileParser parser = new SimulationFileParser(tokens);

        SimulationFileParser.ParseContext drinkSentenceContext = parser.parse();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        SimulationFileTreeWalker listener = new SimulationFileTreeWalker();
        walker.walk(listener, drinkSentenceContext);
        SimulationScope simulationScope = listener.getSimulation();
        if (simulationScope.execute()) {
            System.out.println(simulationScope.toString());
        } else {
            System.out.println("An error occurred");
        }
    }
}
