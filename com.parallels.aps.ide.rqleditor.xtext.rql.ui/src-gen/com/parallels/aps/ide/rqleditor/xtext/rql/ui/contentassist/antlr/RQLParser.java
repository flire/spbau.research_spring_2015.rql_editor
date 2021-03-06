/*
* generated by Xtext
*/
package com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;

public class RQLParser extends AbstractContentAssistParser {
	
	@Inject
	private RQLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser createParser() {
		com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser result = new com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_1_0(), "rule__Model__Alternatives_1_0");
					put(grammarAccess.getOrAccess().getAlternatives_0(), "rule__Or__Alternatives_0");
					put(grammarAccess.getHo_operandAccess().getAlternatives_1(), "rule__Ho_operand__Alternatives_1");
					put(grammarAccess.getHo_operandAccess().getAlternatives_1_4_2(), "rule__Ho_operand__Alternatives_1_4_2");
					put(grammarAccess.getLogical_op_aliasesAccess().getAlternatives(), "rule__Logical_op_aliases__Alternatives");
					put(grammarAccess.getBinary_op_aliasesAccess().getAlternatives(), "rule__Binary_op_aliases__Alternatives");
					put(grammarAccess.getComp_opsAccess().getAlternatives(), "rule__Comp_ops__Alternatives");
					put(grammarAccess.getComparisonAccess().getAlternatives_2(), "rule__Comparison__Alternatives_2");
					put(grammarAccess.getCall_operatorAccess().getAlternatives_0(), "rule__Call_operator__Alternatives_0");
					put(grammarAccess.getPred_tblAccess().getAlternatives(), "rule__Pred_tbl__Alternatives");
					put(grammarAccess.getPrimary_exprAccess().getAlternatives_1(), "rule__Primary_expr__Alternatives_1");
					put(grammarAccess.getFunctions_tblAccess().getAlternatives(), "rule__Functions_tbl__Alternatives");
					put(grammarAccess.getConst_func_tblAccess().getAlternatives(), "rule__Const_func_tbl__Alternatives");
					put(grammarAccess.getNcharAccess().getAlternatives(), "rule__Nchar__Alternatives");
					put(grammarAccess.getStrvalAccess().getAlternatives_1(), "rule__Strval__Alternatives_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getHo_operandAccess().getGroup(), "rule__Ho_operand__Group__0");
					put(grammarAccess.getHo_operandAccess().getGroup_1_4(), "rule__Ho_operand__Group_1_4__0");
					put(grammarAccess.getHigher_order_callAccess().getGroup(), "rule__Higher_order_call__Group__0");
					put(grammarAccess.getHigher_order_callAccess().getGroup_3(), "rule__Higher_order_call__Group_3__0");
					put(grammarAccess.getHigher_order_callAccess().getGroup_3_1(), "rule__Higher_order_call__Group_3_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_2_0(), "rule__Comparison__Group_2_0__0");
					put(grammarAccess.getCall_operatorAccess().getGroup(), "rule__Call_operator__Group__0");
					put(grammarAccess.getCall_operatorAccess().getGroup_3(), "rule__Call_operator__Group_3__0");
					put(grammarAccess.getCall_operatorAccess().getGroup_3_1(), "rule__Call_operator__Group_3_1__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup_3(), "rule__Predicate__Group_3__0");
					put(grammarAccess.getPredicateAccess().getGroup_3_1(), "rule__Predicate__Group_3_1__0");
					put(grammarAccess.getPrimary_exprAccess().getGroup(), "rule__Primary_expr__Group__0");
					put(grammarAccess.getPrimary_exprAccess().getGroup_1_0(), "rule__Primary_expr__Group_1_0__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getArrayAccess().getGroup_4(), "rule__Array__Group_4__0");
					put(grammarAccess.getPct_encodedAccess().getGroup(), "rule__Pct_encoded__Group__0");
					put(grammarAccess.getStrvalAccess().getGroup(), "rule__Strval__Group__0");
					put(grammarAccess.getModelAccess().getOperandsAssignment_0(), "rule__Model__OperandsAssignment_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser typedParser = (com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public RQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
