import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CypherListnerImpl implements CypherListener {

    int depth = 0;

    void enter(String name) {
//        System.out.println(name.split("_"));
        String[] tokens = name.split("_");
        String nodeName = tokens[tokens.length - 1];

        depth++;
        for (int i = 0; i < depth; i++) {
            System.out.print("> ");
        }
        System.out.println(nodeName);

    }

    void exit() {
        depth--;

    }

    public void enterOC_Cypher(CypherParser.OC_CypherContext ctx) {
//        String name = new Object(){}.getClass().getEnclosingMethod().getName();
//        enter(name);
    }

    public void exitOC_Cypher(CypherParser.OC_CypherContext ctx) {
//        exit();
    }

    public void enterOC_Statement(CypherParser.OC_StatementContext ctx) {

    }

    public void exitOC_Statement(CypherParser.OC_StatementContext ctx) {

    }

    public void enterOC_Query(CypherParser.OC_QueryContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);


    }

    public void exitOC_Query(CypherParser.OC_QueryContext ctx) {
        exit();
    }

    public void enterOC_RegularQuery(CypherParser.OC_RegularQueryContext ctx) {

    }

    public void exitOC_RegularQuery(CypherParser.OC_RegularQueryContext ctx) {

    }

    public void enterOC_Union(CypherParser.OC_UnionContext ctx) {

    }

    public void exitOC_Union(CypherParser.OC_UnionContext ctx) {

    }

    public void enterOC_SingleQuery(CypherParser.OC_SingleQueryContext ctx) {

    }

    public void exitOC_SingleQuery(CypherParser.OC_SingleQueryContext ctx) {

    }

    public void enterOC_SinglePartQuery(CypherParser.OC_SinglePartQueryContext ctx) {

    }

    public void exitOC_SinglePartQuery(CypherParser.OC_SinglePartQueryContext ctx) {

    }

    public void enterOC_MultiPartQuery(CypherParser.OC_MultiPartQueryContext ctx) {

    }

    public void exitOC_MultiPartQuery(CypherParser.OC_MultiPartQueryContext ctx) {

    }

    public void enterOC_UpdatingClause(CypherParser.OC_UpdatingClauseContext ctx) {

    }

    public void exitOC_UpdatingClause(CypherParser.OC_UpdatingClauseContext ctx) {

    }

    public void enterOC_ReadingClause(CypherParser.OC_ReadingClauseContext ctx) {

    }

    public void exitOC_ReadingClause(CypherParser.OC_ReadingClauseContext ctx) {

    }

    public void enterOC_Match(CypherParser.OC_MatchContext ctx) {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);

    }

    public void exitOC_Match(CypherParser.OC_MatchContext ctx) {
        exit();
    }

    public void enterOC_Unwind(CypherParser.OC_UnwindContext ctx) {

    }

    public void exitOC_Unwind(CypherParser.OC_UnwindContext ctx) {

    }

    public void enterOC_Merge(CypherParser.OC_MergeContext ctx) {

    }

    public void exitOC_Merge(CypherParser.OC_MergeContext ctx) {

    }

    public void enterOC_MergeAction(CypherParser.OC_MergeActionContext ctx) {

    }

    public void exitOC_MergeAction(CypherParser.OC_MergeActionContext ctx) {

    }

    public void enterOC_Create(CypherParser.OC_CreateContext ctx) {

    }

    public void exitOC_Create(CypherParser.OC_CreateContext ctx) {

    }

    public void enterOC_Set(CypherParser.OC_SetContext ctx) {

    }

    public void exitOC_Set(CypherParser.OC_SetContext ctx) {

    }

    public void enterOC_SetItem(CypherParser.OC_SetItemContext ctx) {

    }

    public void exitOC_SetItem(CypherParser.OC_SetItemContext ctx) {

    }

    public void enterOC_Delete(CypherParser.OC_DeleteContext ctx) {

    }

    public void exitOC_Delete(CypherParser.OC_DeleteContext ctx) {

    }

    public void enterOC_Remove(CypherParser.OC_RemoveContext ctx) {

    }

    public void exitOC_Remove(CypherParser.OC_RemoveContext ctx) {

    }

    public void enterOC_RemoveItem(CypherParser.OC_RemoveItemContext ctx) {

    }

    public void exitOC_RemoveItem(CypherParser.OC_RemoveItemContext ctx) {

    }

    public void enterOC_InQueryCall(CypherParser.OC_InQueryCallContext ctx) {

    }

    public void exitOC_InQueryCall(CypherParser.OC_InQueryCallContext ctx) {

    }

    public void enterOC_StandaloneCall(CypherParser.OC_StandaloneCallContext ctx) {

    }

    public void exitOC_StandaloneCall(CypherParser.OC_StandaloneCallContext ctx) {

    }

    public void enterOC_YieldItems(CypherParser.OC_YieldItemsContext ctx) {

    }

    public void exitOC_YieldItems(CypherParser.OC_YieldItemsContext ctx) {

    }

    public void enterOC_YieldItem(CypherParser.OC_YieldItemContext ctx) {

    }

    public void exitOC_YieldItem(CypherParser.OC_YieldItemContext ctx) {

    }

    public void enterOC_With(CypherParser.OC_WithContext ctx) {

    }

    public void exitOC_With(CypherParser.OC_WithContext ctx) {

    }

    public void enterOC_Return(CypherParser.OC_ReturnContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_Return(CypherParser.OC_ReturnContext ctx) {
        exit();
    }

    public void enterOC_ProjectionBody(CypherParser.OC_ProjectionBodyContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_ProjectionBody(CypherParser.OC_ProjectionBodyContext ctx) {
        exit();
    }

    public void enterOC_ProjectionItems(CypherParser.OC_ProjectionItemsContext ctx) {

    }

    public void exitOC_ProjectionItems(CypherParser.OC_ProjectionItemsContext ctx) {

    }

    public void enterOC_ProjectionItem(CypherParser.OC_ProjectionItemContext ctx) {

    }

    public void exitOC_ProjectionItem(CypherParser.OC_ProjectionItemContext ctx) {

    }

    public void enterOC_Order(CypherParser.OC_OrderContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_Order(CypherParser.OC_OrderContext ctx) {
        exit();
    }

    public void enterOC_Skip(CypherParser.OC_SkipContext ctx) {

    }

    public void exitOC_Skip(CypherParser.OC_SkipContext ctx) {

    }

    public void enterOC_Limit(CypherParser.OC_LimitContext ctx) {

    }

    public void exitOC_Limit(CypherParser.OC_LimitContext ctx) {

    }

    public void enterOC_SortItem(CypherParser.OC_SortItemContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_SortItem(CypherParser.OC_SortItemContext ctx) {
        exit();
    }

    public void enterOC_Where(CypherParser.OC_WhereContext ctx) {

    }

    public void exitOC_Where(CypherParser.OC_WhereContext ctx) {

    }

    public void enterOC_Pattern(CypherParser.OC_PatternContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_Pattern(CypherParser.OC_PatternContext ctx) {
        exit();
    }

    public void enterOC_PatternPart(CypherParser.OC_PatternPartContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_PatternPart(CypherParser.OC_PatternPartContext ctx) {
        exit();
    }

    public void enterOC_AnonymousPatternPart(CypherParser.OC_AnonymousPatternPartContext ctx) {

    }

    public void exitOC_AnonymousPatternPart(CypherParser.OC_AnonymousPatternPartContext ctx) {

    }

    public void enterOC_PatternElement(CypherParser.OC_PatternElementContext ctx) {

    }

    public void exitOC_PatternElement(CypherParser.OC_PatternElementContext ctx) {

    }

    public void enterOC_NodePattern(CypherParser.OC_NodePatternContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_NodePattern(CypherParser.OC_NodePatternContext ctx) {
        exit();
    }

    public void enterOC_PatternElementChain(CypherParser.OC_PatternElementChainContext ctx) {

    }

    public void exitOC_PatternElementChain(CypherParser.OC_PatternElementChainContext ctx) {

    }

    public void enterOC_RelationshipPattern(CypherParser.OC_RelationshipPatternContext ctx) {

    }

    public void exitOC_RelationshipPattern(CypherParser.OC_RelationshipPatternContext ctx) {

    }

    public void enterOC_RelationshipDetail(CypherParser.OC_RelationshipDetailContext ctx) {

    }

    public void exitOC_RelationshipDetail(CypherParser.OC_RelationshipDetailContext ctx) {

    }

    public void enterOC_Properties(CypherParser.OC_PropertiesContext ctx) {

    }

    public void exitOC_Properties(CypherParser.OC_PropertiesContext ctx) {

    }

    public void enterOC_RelationshipTypes(CypherParser.OC_RelationshipTypesContext ctx) {

    }

    public void exitOC_RelationshipTypes(CypherParser.OC_RelationshipTypesContext ctx) {

    }

    public void enterOC_NodeLabels(CypherParser.OC_NodeLabelsContext ctx) {

    }

    public void exitOC_NodeLabels(CypherParser.OC_NodeLabelsContext ctx) {

    }

    public void enterOC_NodeLabel(CypherParser.OC_NodeLabelContext ctx) {

    }

    public void exitOC_NodeLabel(CypherParser.OC_NodeLabelContext ctx) {

    }

    public void enterOC_RangeLiteral(CypherParser.OC_RangeLiteralContext ctx) {

    }

    public void exitOC_RangeLiteral(CypherParser.OC_RangeLiteralContext ctx) {

    }

    public void enterOC_LabelName(CypherParser.OC_LabelNameContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_LabelName(CypherParser.OC_LabelNameContext ctx) {
        exit();
    }

    public void enterOC_RelTypeName(CypherParser.OC_RelTypeNameContext ctx) {

    }

    public void exitOC_RelTypeName(CypherParser.OC_RelTypeNameContext ctx) {

    }

    public void enterOC_Expression(CypherParser.OC_ExpressionContext ctx) {

    }

    public void exitOC_Expression(CypherParser.OC_ExpressionContext ctx) {

    }

    public void enterOC_OrExpression(CypherParser.OC_OrExpressionContext ctx) {

    }

    public void exitOC_OrExpression(CypherParser.OC_OrExpressionContext ctx) {

    }

    public void enterOC_XorExpression(CypherParser.OC_XorExpressionContext ctx) {

    }

    public void exitOC_XorExpression(CypherParser.OC_XorExpressionContext ctx) {

    }

    public void enterOC_AndExpression(CypherParser.OC_AndExpressionContext ctx) {

    }

    public void exitOC_AndExpression(CypherParser.OC_AndExpressionContext ctx) {

    }

    public void enterOC_NotExpression(CypherParser.OC_NotExpressionContext ctx) {

    }

    public void exitOC_NotExpression(CypherParser.OC_NotExpressionContext ctx) {

    }

    public void enterOC_ComparisonExpression(CypherParser.OC_ComparisonExpressionContext ctx) {

    }

    public void exitOC_ComparisonExpression(CypherParser.OC_ComparisonExpressionContext ctx) {

    }

    public void enterOC_AddOrSubtractExpression(CypherParser.OC_AddOrSubtractExpressionContext ctx) {

    }

    public void exitOC_AddOrSubtractExpression(CypherParser.OC_AddOrSubtractExpressionContext ctx) {

    }

    public void enterOC_MultiplyDivideModuloExpression(CypherParser.OC_MultiplyDivideModuloExpressionContext ctx) {

    }

    public void exitOC_MultiplyDivideModuloExpression(CypherParser.OC_MultiplyDivideModuloExpressionContext ctx) {

    }

    public void enterOC_PowerOfExpression(CypherParser.OC_PowerOfExpressionContext ctx) {

    }

    public void exitOC_PowerOfExpression(CypherParser.OC_PowerOfExpressionContext ctx) {

    }

    public void enterOC_UnaryAddOrSubtractExpression(CypherParser.OC_UnaryAddOrSubtractExpressionContext ctx) {

    }

    public void exitOC_UnaryAddOrSubtractExpression(CypherParser.OC_UnaryAddOrSubtractExpressionContext ctx) {

    }

    public void enterOC_StringListNullOperatorExpression(CypherParser.OC_StringListNullOperatorExpressionContext ctx) {

    }

    public void exitOC_StringListNullOperatorExpression(CypherParser.OC_StringListNullOperatorExpressionContext ctx) {

    }

    public void enterOC_ListOperatorExpression(CypherParser.OC_ListOperatorExpressionContext ctx) {

    }

    public void exitOC_ListOperatorExpression(CypherParser.OC_ListOperatorExpressionContext ctx) {

    }

    public void enterOC_StringOperatorExpression(CypherParser.OC_StringOperatorExpressionContext ctx) {

    }

    public void exitOC_StringOperatorExpression(CypherParser.OC_StringOperatorExpressionContext ctx) {

    }

    public void enterOC_NullOperatorExpression(CypherParser.OC_NullOperatorExpressionContext ctx) {

    }

    public void exitOC_NullOperatorExpression(CypherParser.OC_NullOperatorExpressionContext ctx) {

    }

    public void enterOC_PropertyOrLabelsExpression(CypherParser.OC_PropertyOrLabelsExpressionContext ctx) {

    }

    public void exitOC_PropertyOrLabelsExpression(CypherParser.OC_PropertyOrLabelsExpressionContext ctx) {

    }

    public void enterOC_Atom(CypherParser.OC_AtomContext ctx) {

    }

    public void exitOC_Atom(CypherParser.OC_AtomContext ctx) {

    }

    public void enterOC_Literal(CypherParser.OC_LiteralContext ctx) {

    }

    public void exitOC_Literal(CypherParser.OC_LiteralContext ctx) {

    }

    public void enterOC_BooleanLiteral(CypherParser.OC_BooleanLiteralContext ctx) {

    }

    public void exitOC_BooleanLiteral(CypherParser.OC_BooleanLiteralContext ctx) {

    }

    public void enterOC_ListLiteral(CypherParser.OC_ListLiteralContext ctx) {

    }

    public void exitOC_ListLiteral(CypherParser.OC_ListLiteralContext ctx) {

    }

    public void enterOC_PartialComparisonExpression(CypherParser.OC_PartialComparisonExpressionContext ctx) {

    }

    public void exitOC_PartialComparisonExpression(CypherParser.OC_PartialComparisonExpressionContext ctx) {

    }

    public void enterOC_ParenthesizedExpression(CypherParser.OC_ParenthesizedExpressionContext ctx) {

    }

    public void exitOC_ParenthesizedExpression(CypherParser.OC_ParenthesizedExpressionContext ctx) {

    }

    public void enterOC_RelationshipsPattern(CypherParser.OC_RelationshipsPatternContext ctx) {

    }

    public void exitOC_RelationshipsPattern(CypherParser.OC_RelationshipsPatternContext ctx) {

    }

    public void enterOC_FilterExpression(CypherParser.OC_FilterExpressionContext ctx) {

    }

    public void exitOC_FilterExpression(CypherParser.OC_FilterExpressionContext ctx) {

    }

    public void enterOC_IdInColl(CypherParser.OC_IdInCollContext ctx) {

    }

    public void exitOC_IdInColl(CypherParser.OC_IdInCollContext ctx) {

    }

    public void enterOC_FunctionInvocation(CypherParser.OC_FunctionInvocationContext ctx) {

    }

    public void exitOC_FunctionInvocation(CypherParser.OC_FunctionInvocationContext ctx) {

    }

    public void enterOC_FunctionName(CypherParser.OC_FunctionNameContext ctx) {

    }

    public void exitOC_FunctionName(CypherParser.OC_FunctionNameContext ctx) {

    }

    public void enterOC_ExplicitProcedureInvocation(CypherParser.OC_ExplicitProcedureInvocationContext ctx) {

    }

    public void exitOC_ExplicitProcedureInvocation(CypherParser.OC_ExplicitProcedureInvocationContext ctx) {

    }

    public void enterOC_ImplicitProcedureInvocation(CypherParser.OC_ImplicitProcedureInvocationContext ctx) {

    }

    public void exitOC_ImplicitProcedureInvocation(CypherParser.OC_ImplicitProcedureInvocationContext ctx) {

    }

    public void enterOC_ProcedureResultField(CypherParser.OC_ProcedureResultFieldContext ctx) {

    }

    public void exitOC_ProcedureResultField(CypherParser.OC_ProcedureResultFieldContext ctx) {

    }

    public void enterOC_ProcedureName(CypherParser.OC_ProcedureNameContext ctx) {

    }

    public void exitOC_ProcedureName(CypherParser.OC_ProcedureNameContext ctx) {

    }

    public void enterOC_Namespace(CypherParser.OC_NamespaceContext ctx) {

    }

    public void exitOC_Namespace(CypherParser.OC_NamespaceContext ctx) {

    }

    public void enterOC_ListComprehension(CypherParser.OC_ListComprehensionContext ctx) {

    }

    public void exitOC_ListComprehension(CypherParser.OC_ListComprehensionContext ctx) {

    }

    public void enterOC_PatternComprehension(CypherParser.OC_PatternComprehensionContext ctx) {

    }

    public void exitOC_PatternComprehension(CypherParser.OC_PatternComprehensionContext ctx) {

    }

    public void enterOC_PropertyLookup(CypherParser.OC_PropertyLookupContext ctx) {

    }

    public void exitOC_PropertyLookup(CypherParser.OC_PropertyLookupContext ctx) {

    }

    public void enterOC_CaseExpression(CypherParser.OC_CaseExpressionContext ctx) {

    }

    public void exitOC_CaseExpression(CypherParser.OC_CaseExpressionContext ctx) {

    }

    public void enterOC_CaseAlternatives(CypherParser.OC_CaseAlternativesContext ctx) {

    }

    public void exitOC_CaseAlternatives(CypherParser.OC_CaseAlternativesContext ctx) {

    }

    public void enterOC_Variable(CypherParser.OC_VariableContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_Variable(CypherParser.OC_VariableContext ctx) {
        exit();
    }

    public void enterOC_NumberLiteral(CypherParser.OC_NumberLiteralContext ctx) {

    }

    public void exitOC_NumberLiteral(CypherParser.OC_NumberLiteralContext ctx) {

    }

    public void enterOC_MapLiteral(CypherParser.OC_MapLiteralContext ctx) {

    }

    public void exitOC_MapLiteral(CypherParser.OC_MapLiteralContext ctx) {

    }

    public void enterOC_Parameter(CypherParser.OC_ParameterContext ctx) {

    }

    public void exitOC_Parameter(CypherParser.OC_ParameterContext ctx) {

    }

    public void enterOC_PropertyExpression(CypherParser.OC_PropertyExpressionContext ctx) {

    }

    public void exitOC_PropertyExpression(CypherParser.OC_PropertyExpressionContext ctx) {

    }

    public void enterOC_PropertyKeyName(CypherParser.OC_PropertyKeyNameContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_PropertyKeyName(CypherParser.OC_PropertyKeyNameContext ctx) {
        exit();
    }

    public void enterOC_IntegerLiteral(CypherParser.OC_IntegerLiteralContext ctx) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        enter(name);
    }

    public void exitOC_IntegerLiteral(CypherParser.OC_IntegerLiteralContext ctx) {
        exit();
    }

    public void enterOC_DoubleLiteral(CypherParser.OC_DoubleLiteralContext ctx) {

    }

    public void exitOC_DoubleLiteral(CypherParser.OC_DoubleLiteralContext ctx) {

    }

    public void enterOC_SchemaName(CypherParser.OC_SchemaNameContext ctx) {

    }

    public void exitOC_SchemaName(CypherParser.OC_SchemaNameContext ctx) {

    }

    public void enterOC_ReservedWord(CypherParser.OC_ReservedWordContext ctx) {

    }

    public void exitOC_ReservedWord(CypherParser.OC_ReservedWordContext ctx) {

    }

    public void enterOC_SymbolicName(CypherParser.OC_SymbolicNameContext ctx) {
//        String name = new Object() {
//        }.getClass().getEnclosingMethod().getName();
//
//        enter(name);
    }

    public void exitOC_SymbolicName(CypherParser.OC_SymbolicNameContext ctx) {
//        exit();
    }

    public void enterOC_LeftArrowHead(CypherParser.OC_LeftArrowHeadContext ctx) {

    }

    public void exitOC_LeftArrowHead(CypherParser.OC_LeftArrowHeadContext ctx) {

    }

    public void enterOC_RightArrowHead(CypherParser.OC_RightArrowHeadContext ctx) {

    }

    public void exitOC_RightArrowHead(CypherParser.OC_RightArrowHeadContext ctx) {

    }

    public void enterOC_Dash(CypherParser.OC_DashContext ctx) {

    }

    public void exitOC_Dash(CypherParser.OC_DashContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
