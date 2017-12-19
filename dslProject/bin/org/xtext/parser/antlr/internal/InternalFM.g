/*
 * generated by Xtext 2.12.0
 */
grammar InternalFM;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.FMGrammarAccess;

}

@parser::members {

 	private FMGrammarAccess grammarAccess;

    public InternalFMParser(TokenStream input, FMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FeatureModel";
   	}

   	@Override
   	protected FMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFeatureModel
entryRuleFeatureModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureModelRule()); }
	iv_ruleFeatureModel=ruleFeatureModel
	{ $current=$iv_ruleFeatureModel.current; }
	EOF;

// Rule FeatureModel
ruleFeatureModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<featureModel>'
		{
			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureModelAccess().getDiagramFeatureDiagramParserRuleCall_1_0());
				}
				lv_diagram_1_0=ruleFeatureDiagram
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureModelRule());
					}
					set(
						$current,
						"diagram",
						lv_diagram_1_0,
						"org.xtext.FM.FeatureDiagram");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureModelAccess().getConstraintsConstraintsParserRuleCall_2_0());
				}
				lv_constraints_2_0=ruleConstraints
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureModelRule());
					}
					set(
						$current,
						"constraints",
						lv_constraints_2_0,
						"org.xtext.FM.Constraints");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</featureModel>'
		{
			newLeafNode(otherlv_3, grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_3());
		}
	)
;

// Entry rule entryRuleFeatureDiagram
entryRuleFeatureDiagram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureDiagramRule()); }
	iv_ruleFeatureDiagram=ruleFeatureDiagram
	{ $current=$iv_ruleFeatureDiagram.current; }
	EOF;

// Rule FeatureDiagram
ruleFeatureDiagram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<featureDiagram>'
		{
			newLeafNode(otherlv_0, grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDiagramAccess().getRootChildParserRuleCall_1_0());
				}
				lv_root_1_0=ruleChild
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDiagramRule());
					}
					set(
						$current,
						"root",
						lv_root_1_0,
						"org.xtext.FM.Child");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='</featureDiagram>'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_2());
		}
	)
;

// Entry rule entryRuleChild
entryRuleChild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildRule()); }
	iv_ruleChild=ruleChild
	{ $current=$iv_ruleChild.current; }
	EOF;

// Rule Child
ruleChild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getChildAccess().getNodeParserRuleCall_0());
		}
		this_Node_0=ruleNode
		{
			$current = $this_Node_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getChildAccess().getLeafParserRuleCall_1());
		}
		this_Leaf_1=ruleLeaf
		{
			$current = $this_Leaf_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLeaf
entryRuleLeaf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeafRule()); }
	iv_ruleLeaf=ruleLeaf
	{ $current=$iv_ruleLeaf.current; }
	EOF;

// Rule Leaf
ruleLeaf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<feature'
		{
			newLeafNode(otherlv_0, grammarAccess.getLeafAccess().getFeatureKeyword_0());
		}
		(
			(
				lv_mandatory_1_0='mandatory'
				{
					newLeafNode(lv_mandatory_1_0, grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeafRule());
					}
					setWithLastConsumed($current, "mandatory", true, "mandatory");
				}
			)
		)?
		otherlv_2='name='
		{
			newLeafNode(otherlv_2, grammarAccess.getLeafAccess().getNameKeyword_2());
		}
		otherlv_3='"'
		{
			newLeafNode(otherlv_3, grammarAccess.getLeafAccess().getQuotationMarkKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeafRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='"'
		{
			newLeafNode(otherlv_5, grammarAccess.getLeafAccess().getQuotationMarkKeyword_5());
		}
		otherlv_6='/>'
		{
			newLeafNode(otherlv_6, grammarAccess.getLeafAccess().getSolidusGreaterThanSignKeyword_6());
		}
	)
;

// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	iv_ruleNode=ruleNode
	{ $current=$iv_ruleNode.current; }
	EOF;

// Rule Node
ruleNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<'
		{
			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getLessThanSignKeyword_0());
		}
		(
			(
				lv_open_relation_1_0=RULE_RELATION
				{
					newLeafNode(lv_open_relation_1_0, grammarAccess.getNodeAccess().getOpen_relationRELATIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed(
						$current,
						"open_relation",
						lv_open_relation_1_0,
						"org.xtext.FM.RELATION");
				}
			)
		)
		(
			(
				lv_mandatory_2_0='mandatory'
				{
					newLeafNode(lv_mandatory_2_0, grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed($current, "mandatory", true, "mandatory");
				}
			)
		)?
		otherlv_3='name='
		{
			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getNameKeyword_3());
		}
		otherlv_4='"'
		{
			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getQuotationMarkKeyword_4());
		}
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6='"'
		{
			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getQuotationMarkKeyword_6());
		}
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getGreaterThanSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeAccess().getChildrenChildParserRuleCall_8_0());
				}
				lv_children_8_0=ruleChild
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeRule());
					}
					add(
						$current,
						"children",
						lv_children_8_0,
						"org.xtext.FM.Child");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_9='</'
		{
			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getLessThanSignSolidusKeyword_9());
		}
		(
			(
				lv_close_relation_10_0=RULE_RELATION
				{
					newLeafNode(lv_close_relation_10_0, grammarAccess.getNodeAccess().getClose_relationRELATIONTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed(
						$current,
						"close_relation",
						lv_close_relation_10_0,
						"org.xtext.FM.RELATION");
				}
			)
		)
		otherlv_11='>'
		{
			newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getGreaterThanSignKeyword_11());
		}
	)
;

// Entry rule entryRuleConstraints
entryRuleConstraints returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintsRule()); }
	iv_ruleConstraints=ruleConstraints
	{ $current=$iv_ruleConstraints.current; }
	EOF;

// Rule Constraints
ruleConstraints returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<constraints>'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintsAccess().getRulesRuleParserRuleCall_1_0());
				}
				lv_rules_1_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintsRule());
					}
					add(
						$current,
						"rules",
						lv_rules_1_0,
						"org.xtext.FM.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</constraints>'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintsAccess().getConstraintsKeyword_2());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<rule>'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getElementsFormulaParserRuleCall_1_0());
				}
				lv_elements_1_0=ruleFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"elements",
						lv_elements_1_0,
						"org.xtext.FM.Formula");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</rule>'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getRuleKeyword_2());
		}
	)
;

// Entry rule entryRuleRuleElement
entryRuleRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleElementRule()); }
	iv_ruleRuleElement=ruleRuleElement
	{ $current=$iv_ruleRuleElement.current; }
	EOF;

// Rule RuleElement
ruleRuleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleElementAccess().getLessThanSignKeyword_0());
		}
		(
			(
				lv_open_operator_1_0=RULE_OPERATOR
				{
					newLeafNode(lv_open_operator_1_0, grammarAccess.getRuleElementAccess().getOpen_operatorOPERATORTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleElementRule());
					}
					setWithLastConsumed(
						$current,
						"open_operator",
						lv_open_operator_1_0,
						"org.xtext.FM.OPERATOR");
				}
			)
		)
		otherlv_2='>'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleElementAccess().getLeft_sideVarParserRuleCall_3_0());
				}
				lv_left_side_3_0=ruleVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleElementRule());
					}
					set(
						$current,
						"left_side",
						lv_left_side_3_0,
						"org.xtext.FM.Var");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleElementAccess().getRight_sideVarParserRuleCall_4_0());
				}
				lv_right_side_4_0=ruleVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleElementRule());
					}
					set(
						$current,
						"right_side",
						lv_right_side_4_0,
						"org.xtext.FM.Var");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</'
		{
			newLeafNode(otherlv_5, grammarAccess.getRuleElementAccess().getLessThanSignSolidusKeyword_5());
		}
		(
			(
				lv_close_operator_6_0=RULE_OPERATOR
				{
					newLeafNode(lv_close_operator_6_0, grammarAccess.getRuleElementAccess().getClose_operatorOPERATORTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleElementRule());
					}
					setWithLastConsumed(
						$current,
						"close_operator",
						lv_close_operator_6_0,
						"org.xtext.FM.OPERATOR");
				}
			)
		)
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleFormula
entryRuleFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormulaRule()); }
	iv_ruleFormula=ruleFormula
	{ $current=$iv_ruleFormula.current; }
	EOF;

// Rule Formula
ruleFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFormulaAccess().getVarParserRuleCall_0());
		}
		this_Var_0=ruleVar
		{
			$current = $this_Var_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFormulaAccess().getRuleElementParserRuleCall_1());
		}
		this_RuleElement_1=ruleRuleElement
		{
			$current = $this_RuleElement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVar
entryRuleVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarRule()); }
	iv_ruleVar=ruleVar
	{ $current=$iv_ruleVar.current; }
	EOF;

// Rule Var
ruleVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
		}
		(
			(
				lv_not_1_0='not'
				{
					newLeafNode(lv_not_1_0, grammarAccess.getVarAccess().getNotNotKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarRule());
					}
					setWithLastConsumed($current, "not", true, "not");
				}
			)
		)?
		otherlv_2='name='
		{
			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getNameKeyword_2());
		}
		otherlv_3='"'
		{
			newLeafNode(otherlv_3, grammarAccess.getVarAccess().getQuotationMarkKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='"'
		{
			newLeafNode(otherlv_5, grammarAccess.getVarAccess().getQuotationMarkKeyword_5());
		}
		otherlv_6='/>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVarAccess().getSolidusGreaterThanSignKeyword_6());
		}
	)
;

RULE_RELATION : ('and'|'or'|'alt');

RULE_OPERATOR : 'imp';

RULE_STRING : '@@@@@@willnenverbecalled@@@@@';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;