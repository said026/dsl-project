/*
 * generated by Xtext 2.12.0
 */
grammar InternalFM;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.FMGrammarAccess;

}
@parser::members {
	private FMGrammarAccess grammarAccess;

	public void setGrammarAccess(FMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFeatureModel
entryRuleFeatureModel
:
{ before(grammarAccess.getFeatureModelRule()); }
	 ruleFeatureModel
{ after(grammarAccess.getFeatureModelRule()); } 
	 EOF 
;

// Rule FeatureModel
ruleFeatureModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureModelAccess().getGroup()); }
		(rule__FeatureModel__Group__0)
		{ after(grammarAccess.getFeatureModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureDiagram
entryRuleFeatureDiagram
:
{ before(grammarAccess.getFeatureDiagramRule()); }
	 ruleFeatureDiagram
{ after(grammarAccess.getFeatureDiagramRule()); } 
	 EOF 
;

// Rule FeatureDiagram
ruleFeatureDiagram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureDiagramAccess().getGroup()); }
		(rule__FeatureDiagram__Group__0)
		{ after(grammarAccess.getFeatureDiagramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild
entryRuleChild
:
{ before(grammarAccess.getChildRule()); }
	 ruleChild
{ after(grammarAccess.getChildRule()); } 
	 EOF 
;

// Rule Child
ruleChild 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildAccess().getAlternatives()); }
		(rule__Child__Alternatives)
		{ after(grammarAccess.getChildAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLeaf
entryRuleLeaf
:
{ before(grammarAccess.getLeafRule()); }
	 ruleLeaf
{ after(grammarAccess.getLeafRule()); } 
	 EOF 
;

// Rule Leaf
ruleLeaf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLeafAccess().getGroup()); }
		(rule__Leaf__Group__0)
		{ after(grammarAccess.getLeafAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNode
entryRuleNode
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNodeAccess().getGroup()); }
		(rule__Node__Group__0)
		{ after(grammarAccess.getNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstraints
entryRuleConstraints
:
{ before(grammarAccess.getConstraintsRule()); }
	 ruleConstraints
{ after(grammarAccess.getConstraintsRule()); } 
	 EOF 
;

// Rule Constraints
ruleConstraints 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstraintsAccess().getGroup()); }
		(rule__Constraints__Group__0)
		{ after(grammarAccess.getConstraintsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRuleElement
entryRuleRuleElement
:
{ before(grammarAccess.getRuleElementRule()); }
	 ruleRuleElement
{ after(grammarAccess.getRuleElementRule()); } 
	 EOF 
;

// Rule RuleElement
ruleRuleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleElementAccess().getGroup()); }
		(rule__RuleElement__Group__0)
		{ after(grammarAccess.getRuleElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFormula
entryRuleFormula
:
{ before(grammarAccess.getFormulaRule()); }
	 ruleFormula
{ after(grammarAccess.getFormulaRule()); } 
	 EOF 
;

// Rule Formula
ruleFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormulaAccess().getAlternatives()); }
		(rule__Formula__Alternatives)
		{ after(grammarAccess.getFormulaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar
entryRuleVar
:
{ before(grammarAccess.getVarRule()); }
	 ruleVar
{ after(grammarAccess.getVarRule()); } 
	 EOF 
;

// Rule Var
ruleVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarAccess().getGroup()); }
		(rule__Var__Group__0)
		{ after(grammarAccess.getVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildAccess().getNodeParserRuleCall_0()); }
		ruleNode
		{ after(grammarAccess.getChildAccess().getNodeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getChildAccess().getLeafParserRuleCall_1()); }
		ruleLeaf
		{ after(grammarAccess.getChildAccess().getLeafParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getVarParserRuleCall_0()); }
		ruleVar
		{ after(grammarAccess.getFormulaAccess().getVarParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFormulaAccess().getRuleElementParserRuleCall_1()); }
		ruleRuleElement
		{ after(grammarAccess.getFormulaAccess().getRuleElementParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureModel__Group__0__Impl
	rule__FeatureModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_0()); }
	'<featureModel>'
	{ after(grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureModel__Group__1__Impl
	rule__FeatureModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureModelAccess().getDiagramAssignment_1()); }
	(rule__FeatureModel__DiagramAssignment_1)
	{ after(grammarAccess.getFeatureModelAccess().getDiagramAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureModel__Group__2__Impl
	rule__FeatureModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureModelAccess().getConstraintsAssignment_2()); }
	(rule__FeatureModel__ConstraintsAssignment_2)
	{ after(grammarAccess.getFeatureModelAccess().getConstraintsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureModel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_3()); }
	'</featureModel>'
	{ after(grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureDiagram__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureDiagram__Group__0__Impl
	rule__FeatureDiagram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_0()); }
	'<featureDiagram>'
	{ after(grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureDiagram__Group__1__Impl
	rule__FeatureDiagram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureDiagramAccess().getRootAssignment_1()); }
	(rule__FeatureDiagram__RootAssignment_1)
	{ after(grammarAccess.getFeatureDiagramAccess().getRootAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureDiagram__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_2()); }
	'</featureDiagram>'
	{ after(grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Leaf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__0__Impl
	rule__Leaf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getFeatureKeyword_0()); }
	'<feature'
	{ after(grammarAccess.getLeafAccess().getFeatureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__1__Impl
	rule__Leaf__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getMandatoryAssignment_1()); }
	(rule__Leaf__MandatoryAssignment_1)?
	{ after(grammarAccess.getLeafAccess().getMandatoryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__2__Impl
	rule__Leaf__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getNameKeyword_2()); }
	'name='
	{ after(grammarAccess.getLeafAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__3__Impl
	rule__Leaf__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getQuotationMarkKeyword_3()); }
	'"'
	{ after(grammarAccess.getLeafAccess().getQuotationMarkKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__4__Impl
	rule__Leaf__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getNameAssignment_4()); }
	(rule__Leaf__NameAssignment_4)
	{ after(grammarAccess.getLeafAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__5__Impl
	rule__Leaf__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getQuotationMarkKeyword_5()); }
	'"'
	{ after(grammarAccess.getLeafAccess().getQuotationMarkKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaf__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeafAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getLeafAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLessThanSignKeyword_0()); }
	'<'
	{ after(grammarAccess.getNodeAccess().getLessThanSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__1__Impl
	rule__Node__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getOpen_relationAssignment_1()); }
	(rule__Node__Open_relationAssignment_1)
	{ after(grammarAccess.getNodeAccess().getOpen_relationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__2__Impl
	rule__Node__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getMandatoryAssignment_2()); }
	(rule__Node__MandatoryAssignment_2)?
	{ after(grammarAccess.getNodeAccess().getMandatoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__3__Impl
	rule__Node__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameKeyword_3()); }
	'name='
	{ after(grammarAccess.getNodeAccess().getNameKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__4__Impl
	rule__Node__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getQuotationMarkKeyword_4()); }
	'"'
	{ after(grammarAccess.getNodeAccess().getQuotationMarkKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__5__Impl
	rule__Node__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameAssignment_5()); }
	(rule__Node__NameAssignment_5)
	{ after(grammarAccess.getNodeAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__6__Impl
	rule__Node__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getQuotationMarkKeyword_6()); }
	'"'
	{ after(grammarAccess.getNodeAccess().getQuotationMarkKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__7__Impl
	rule__Node__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGreaterThanSignKeyword_7()); }
	'>'
	{ after(grammarAccess.getNodeAccess().getGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__8__Impl
	rule__Node__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNodeAccess().getChildrenAssignment_8()); }
		(rule__Node__ChildrenAssignment_8)
		{ after(grammarAccess.getNodeAccess().getChildrenAssignment_8()); }
	)
	(
		{ before(grammarAccess.getNodeAccess().getChildrenAssignment_8()); }
		(rule__Node__ChildrenAssignment_8)*
		{ after(grammarAccess.getNodeAccess().getChildrenAssignment_8()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__9__Impl
	rule__Node__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLessThanSignSolidusKeyword_9()); }
	'</'
	{ after(grammarAccess.getNodeAccess().getLessThanSignSolidusKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__10__Impl
	rule__Node__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getClose_relationAssignment_10()); }
	(rule__Node__Close_relationAssignment_10)
	{ after(grammarAccess.getNodeAccess().getClose_relationAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getNodeAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Constraints__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__0__Impl
	rule__Constraints__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); }
	'<constraints>'
	{ after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__1__Impl
	rule__Constraints__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getConstraintsAccess().getRulesAssignment_1()); }
		(rule__Constraints__RulesAssignment_1)
		{ after(grammarAccess.getConstraintsAccess().getRulesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getConstraintsAccess().getRulesAssignment_1()); }
		(rule__Constraints__RulesAssignment_1)*
		{ after(grammarAccess.getConstraintsAccess().getRulesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_2()); }
	'</constraints>'
	{ after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
	'<rule>'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRuleAccess().getElementsAssignment_1()); }
		(rule__Rule__ElementsAssignment_1)
		{ after(grammarAccess.getRuleAccess().getElementsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getRuleAccess().getElementsAssignment_1()); }
		(rule__Rule__ElementsAssignment_1)*
		{ after(grammarAccess.getRuleAccess().getElementsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_2()); }
	'</rule>'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RuleElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__0__Impl
	rule__RuleElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getLessThanSignKeyword_0()); }
	'<'
	{ after(grammarAccess.getRuleElementAccess().getLessThanSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__1__Impl
	rule__RuleElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getOpen_operatorAssignment_1()); }
	(rule__RuleElement__Open_operatorAssignment_1)
	{ after(grammarAccess.getRuleElementAccess().getOpen_operatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__2__Impl
	rule__RuleElement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_2()); }
	'>'
	{ after(grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__3__Impl
	rule__RuleElement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getLeft_sideAssignment_3()); }
	(rule__RuleElement__Left_sideAssignment_3)
	{ after(grammarAccess.getRuleElementAccess().getLeft_sideAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__4__Impl
	rule__RuleElement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getRight_sideAssignment_4()); }
	(rule__RuleElement__Right_sideAssignment_4)
	{ after(grammarAccess.getRuleElementAccess().getRight_sideAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__5__Impl
	rule__RuleElement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getLessThanSignSolidusKeyword_5()); }
	'</'
	{ after(grammarAccess.getRuleElementAccess().getLessThanSignSolidusKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__6__Impl
	rule__RuleElement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getClose_operatorAssignment_6()); }
	(rule__RuleElement__Close_operatorAssignment_6)
	{ after(grammarAccess.getRuleElementAccess().getClose_operatorAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleElement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_7()); }
	'>'
	{ after(grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__0__Impl
	rule__Var__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getVarKeyword_0()); }
	'<var'
	{ after(grammarAccess.getVarAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__1__Impl
	rule__Var__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getNotAssignment_1()); }
	(rule__Var__NotAssignment_1)?
	{ after(grammarAccess.getVarAccess().getNotAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__2__Impl
	rule__Var__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getNameKeyword_2()); }
	'name='
	{ after(grammarAccess.getVarAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__3__Impl
	rule__Var__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getQuotationMarkKeyword_3()); }
	'"'
	{ after(grammarAccess.getVarAccess().getQuotationMarkKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__4__Impl
	rule__Var__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getNameAssignment_4()); }
	(rule__Var__NameAssignment_4)
	{ after(grammarAccess.getVarAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__5__Impl
	rule__Var__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getQuotationMarkKeyword_5()); }
	'"'
	{ after(grammarAccess.getVarAccess().getQuotationMarkKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getVarAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureModel__DiagramAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureModelAccess().getDiagramFeatureDiagramParserRuleCall_1_0()); }
		ruleFeatureDiagram
		{ after(grammarAccess.getFeatureModelAccess().getDiagramFeatureDiagramParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureModel__ConstraintsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureModelAccess().getConstraintsConstraintsParserRuleCall_2_0()); }
		ruleConstraints
		{ after(grammarAccess.getFeatureModelAccess().getConstraintsConstraintsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDiagram__RootAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureDiagramAccess().getRootChildParserRuleCall_1_0()); }
		ruleChild
		{ after(grammarAccess.getFeatureDiagramAccess().getRootChildParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__MandatoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0()); }
		(
			{ before(grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0()); }
			'mandatory'
			{ after(grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0()); }
		)
		{ after(grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaf__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Open_relationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getOpen_relationRELATIONTerminalRuleCall_1_0()); }
		RULE_RELATION
		{ after(grammarAccess.getNodeAccess().getOpen_relationRELATIONTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__MandatoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0()); }
			'mandatory'
			{ after(grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0()); }
		)
		{ after(grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ChildrenAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getChildrenChildParserRuleCall_8_0()); }
		ruleChild
		{ after(grammarAccess.getNodeAccess().getChildrenChildParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Close_relationAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getClose_relationRELATIONTerminalRuleCall_10_0()); }
		RULE_RELATION
		{ after(grammarAccess.getNodeAccess().getClose_relationRELATIONTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__RulesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstraintsAccess().getRulesRuleParserRuleCall_1_0()); }
		ruleRule
		{ after(grammarAccess.getConstraintsAccess().getRulesRuleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ElementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getElementsFormulaParserRuleCall_1_0()); }
		ruleFormula
		{ after(grammarAccess.getRuleAccess().getElementsFormulaParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Open_operatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleElementAccess().getOpen_operatorOPERATORTerminalRuleCall_1_0()); }
		RULE_OPERATOR
		{ after(grammarAccess.getRuleElementAccess().getOpen_operatorOPERATORTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Left_sideAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleElementAccess().getLeft_sideVarParserRuleCall_3_0()); }
		ruleVar
		{ after(grammarAccess.getRuleElementAccess().getLeft_sideVarParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Right_sideAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleElementAccess().getRight_sideVarParserRuleCall_4_0()); }
		ruleVar
		{ after(grammarAccess.getRuleElementAccess().getRight_sideVarParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleElement__Close_operatorAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleElementAccess().getClose_operatorOPERATORTerminalRuleCall_6_0()); }
		RULE_OPERATOR
		{ after(grammarAccess.getRuleElementAccess().getClose_operatorOPERATORTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__NotAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getNotNotKeyword_1_0()); }
		(
			{ before(grammarAccess.getVarAccess().getNotNotKeyword_1_0()); }
			'not'
			{ after(grammarAccess.getVarAccess().getNotNotKeyword_1_0()); }
		)
		{ after(grammarAccess.getVarAccess().getNotNotKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_RELATION : ('and'|'or'|'alt');

RULE_OPERATOR : 'imp';

RULE_STRING : '@@@@@@willnenverbecalled@@@@@';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
