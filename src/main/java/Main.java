import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;

public class Main {


    public static void dfs(ParseTree root) {


        if (root.equals(null)) return;

        if (root.getChildCount() == 1) {


            System.out.print("> ");
            System.out.print(root.getChild(0));
            dfs(root.getChild(0));
            System.out.println();
        } else {


            for (int i = 0; i < root.getChildCount(); i++) {

                System.out.print("> ");
                System.out.print(root.getChild(0).getText());
                dfs(root.getChild(i));
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString(
                "UNWIND [1.0, NULL, 3.0] as v1 RETURN v1, coalesce(v1, gds.util.NaN()) as v2;");


        inputStream = CharStreams.fromString("MATCH (a:University) RETURN a.url ORDER BY a.url LIMIT 100");
        CypherLexer markupLexer = new CypherLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        CypherParser parser = new CypherParser(commonTokenStream);

        ParseTree tree = parser.oC_Cypher();




//        dfs(tree);




//        ParseTreeWalker.DEFAULT.walk(new CypherListenerBaseImpl(), tree);
        ParseTreeWalker.DEFAULT.walk(new CypherListnerImpl(), tree);


//        System.out.println(tree);

        //show AST in GUI
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewer.open();
    }
}