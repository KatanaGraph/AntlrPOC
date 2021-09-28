public class CypherListenerBaseImpl extends CypherBaseListener {

    @Override public void enterOC_SortItem(CypherParser.OC_SortItemContext ctx) {


//        System.out.print("> enterOC_SortItem");
        System.out.println("> > > >  enterOC_SortItem");
    }

    @Override public void exitOC_SortItem(CypherParser.OC_SortItemContext ctx) {

        System.out.println("< < < <  exitOC_SortItem");
    }
}
