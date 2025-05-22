import AST.TypeAnnotation;
import Visitor.BaseVisitor;
import antlr.AngulerLexer;
import antlr.AngulerParser;
import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        String source = "files/first_ui.txt";
        CharStream cs = fromFileName(source);
        AngulerLexer lexer = new AngulerLexer(cs);  // Fixed capitalization
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngulerParser parser = new AngulerParser(token);
        ParseTree tree = parser.type_annotation();

        // Create visitor instance first
        BaseVisitor visitor = new BaseVisitor();
        TypeAnnotation doc = (TypeAnnotation) visitor.visit(tree);



        // Print results
        System.out.println("=== Program Structure ===");
        System.out.println(doc);


    }
}