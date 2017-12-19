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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATION", "RULE_OPERATOR", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<featureModel>'", "'</featureModel>'", "'<featureDiagram>'", "'</featureDiagram>'", "'<feature'", "'mandatory'", "'name='", "'\"'", "'/>'", "'<'", "'>'", "'</'", "'<constraints>'", "'</constraints>'", "'<rule>'", "'</rule>'", "'<var'", "'not'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OPERATOR=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATION=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFM.g"; }



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




    // $ANTLR start "entryRuleFeatureModel"
    // InternalFM.g:64:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalFM.g:64:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalFM.g:65:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
             newCompositeNode(grammarAccess.getFeatureModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;

             current =iv_ruleFeatureModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalFM.g:71:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= '<featureModel>' ( (lv_diagram_1_0= ruleFeatureDiagram ) ) ( (lv_constraints_2_0= ruleConstraints ) ) otherlv_3= '</featureModel>' ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_diagram_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalFM.g:77:2: ( (otherlv_0= '<featureModel>' ( (lv_diagram_1_0= ruleFeatureDiagram ) ) ( (lv_constraints_2_0= ruleConstraints ) ) otherlv_3= '</featureModel>' ) )
            // InternalFM.g:78:2: (otherlv_0= '<featureModel>' ( (lv_diagram_1_0= ruleFeatureDiagram ) ) ( (lv_constraints_2_0= ruleConstraints ) ) otherlv_3= '</featureModel>' )
            {
            // InternalFM.g:78:2: (otherlv_0= '<featureModel>' ( (lv_diagram_1_0= ruleFeatureDiagram ) ) ( (lv_constraints_2_0= ruleConstraints ) ) otherlv_3= '</featureModel>' )
            // InternalFM.g:79:3: otherlv_0= '<featureModel>' ( (lv_diagram_1_0= ruleFeatureDiagram ) ) ( (lv_constraints_2_0= ruleConstraints ) ) otherlv_3= '</featureModel>'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_0());
            		
            // InternalFM.g:83:3: ( (lv_diagram_1_0= ruleFeatureDiagram ) )
            // InternalFM.g:84:4: (lv_diagram_1_0= ruleFeatureDiagram )
            {
            // InternalFM.g:84:4: (lv_diagram_1_0= ruleFeatureDiagram )
            // InternalFM.g:85:5: lv_diagram_1_0= ruleFeatureDiagram
            {

            					newCompositeNode(grammarAccess.getFeatureModelAccess().getDiagramFeatureDiagramParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_diagram_1_0=ruleFeatureDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_1_0,
            						"org.xtext.FM.FeatureDiagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFM.g:102:3: ( (lv_constraints_2_0= ruleConstraints ) )
            // InternalFM.g:103:4: (lv_constraints_2_0= ruleConstraints )
            {
            // InternalFM.g:103:4: (lv_constraints_2_0= ruleConstraints )
            // InternalFM.g:104:5: lv_constraints_2_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getFeatureModelAccess().getConstraintsConstraintsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_constraints_2_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"org.xtext.FM.Constraints");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureModelAccess().getFeatureModelKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleFeatureDiagram"
    // InternalFM.g:129:1: entryRuleFeatureDiagram returns [EObject current=null] : iv_ruleFeatureDiagram= ruleFeatureDiagram EOF ;
    public final EObject entryRuleFeatureDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDiagram = null;


        try {
            // InternalFM.g:129:55: (iv_ruleFeatureDiagram= ruleFeatureDiagram EOF )
            // InternalFM.g:130:2: iv_ruleFeatureDiagram= ruleFeatureDiagram EOF
            {
             newCompositeNode(grammarAccess.getFeatureDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDiagram=ruleFeatureDiagram();

            state._fsp--;

             current =iv_ruleFeatureDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureDiagram"


    // $ANTLR start "ruleFeatureDiagram"
    // InternalFM.g:136:1: ruleFeatureDiagram returns [EObject current=null] : (otherlv_0= '<featureDiagram>' ( (lv_root_1_0= ruleChild ) ) otherlv_2= '</featureDiagram>' ) ;
    public final EObject ruleFeatureDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_root_1_0 = null;



        	enterRule();

        try {
            // InternalFM.g:142:2: ( (otherlv_0= '<featureDiagram>' ( (lv_root_1_0= ruleChild ) ) otherlv_2= '</featureDiagram>' ) )
            // InternalFM.g:143:2: (otherlv_0= '<featureDiagram>' ( (lv_root_1_0= ruleChild ) ) otherlv_2= '</featureDiagram>' )
            {
            // InternalFM.g:143:2: (otherlv_0= '<featureDiagram>' ( (lv_root_1_0= ruleChild ) ) otherlv_2= '</featureDiagram>' )
            // InternalFM.g:144:3: otherlv_0= '<featureDiagram>' ( (lv_root_1_0= ruleChild ) ) otherlv_2= '</featureDiagram>'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_0());
            		
            // InternalFM.g:148:3: ( (lv_root_1_0= ruleChild ) )
            // InternalFM.g:149:4: (lv_root_1_0= ruleChild )
            {
            // InternalFM.g:149:4: (lv_root_1_0= ruleChild )
            // InternalFM.g:150:5: lv_root_1_0= ruleChild
            {

            					newCompositeNode(grammarAccess.getFeatureDiagramAccess().getRootChildParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_root_1_0=ruleChild();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureDiagramRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_1_0,
            						"org.xtext.FM.Child");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureDiagramAccess().getFeatureDiagramKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureDiagram"


    // $ANTLR start "entryRuleChild"
    // InternalFM.g:175:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalFM.g:175:46: (iv_ruleChild= ruleChild EOF )
            // InternalFM.g:176:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalFM.g:182:1: ruleChild returns [EObject current=null] : (this_Node_0= ruleNode | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Leaf_1 = null;



        	enterRule();

        try {
            // InternalFM.g:188:2: ( (this_Node_0= ruleNode | this_Leaf_1= ruleLeaf ) )
            // InternalFM.g:189:2: (this_Node_0= ruleNode | this_Leaf_1= ruleLeaf )
            {
            // InternalFM.g:189:2: (this_Node_0= ruleNode | this_Leaf_1= ruleLeaf )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFM.g:190:3: this_Node_0= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getChildAccess().getNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;


                    			current = this_Node_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFM.g:199:3: this_Leaf_1= ruleLeaf
                    {

                    			newCompositeNode(grammarAccess.getChildAccess().getLeafParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Leaf_1=ruleLeaf();

                    state._fsp--;


                    			current = this_Leaf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleLeaf"
    // InternalFM.g:211:1: entryRuleLeaf returns [EObject current=null] : iv_ruleLeaf= ruleLeaf EOF ;
    public final EObject entryRuleLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaf = null;


        try {
            // InternalFM.g:211:45: (iv_ruleLeaf= ruleLeaf EOF )
            // InternalFM.g:212:2: iv_ruleLeaf= ruleLeaf EOF
            {
             newCompositeNode(grammarAccess.getLeafRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeaf=ruleLeaf();

            state._fsp--;

             current =iv_ruleLeaf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeaf"


    // $ANTLR start "ruleLeaf"
    // InternalFM.g:218:1: ruleLeaf returns [EObject current=null] : (otherlv_0= '<feature' ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' ) ;
    public final EObject ruleLeaf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalFM.g:224:2: ( (otherlv_0= '<feature' ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' ) )
            // InternalFM.g:225:2: (otherlv_0= '<feature' ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' )
            {
            // InternalFM.g:225:2: (otherlv_0= '<feature' ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' )
            // InternalFM.g:226:3: otherlv_0= '<feature' ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLeafAccess().getFeatureKeyword_0());
            		
            // InternalFM.g:230:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFM.g:231:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFM.g:231:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFM.g:232:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getLeafAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", true, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLeafAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLeafAccess().getQuotationMarkKeyword_3());
            		
            // InternalFM.g:252:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFM.g:253:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFM.g:253:4: (lv_name_4_0= RULE_ID )
            // InternalFM.g:254:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeafRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getLeafAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLeafAccess().getSolidusGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeaf"


    // $ANTLR start "entryRuleNode"
    // InternalFM.g:282:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalFM.g:282:45: (iv_ruleNode= ruleNode EOF )
            // InternalFM.g:283:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalFM.g:289:1: ruleNode returns [EObject current=null] : (otherlv_0= '<' ( (lv_open_relation_1_0= RULE_RELATION ) ) ( (lv_mandatory_2_0= 'mandatory' ) )? otherlv_3= 'name=' otherlv_4= '\"' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '\"' otherlv_7= '>' ( (lv_children_8_0= ruleChild ) )+ otherlv_9= '</' ( (lv_close_relation_10_0= RULE_RELATION ) ) otherlv_11= '>' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_open_relation_1_0=null;
        Token lv_mandatory_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_close_relation_10_0=null;
        Token otherlv_11=null;
        EObject lv_children_8_0 = null;



        	enterRule();

        try {
            // InternalFM.g:295:2: ( (otherlv_0= '<' ( (lv_open_relation_1_0= RULE_RELATION ) ) ( (lv_mandatory_2_0= 'mandatory' ) )? otherlv_3= 'name=' otherlv_4= '\"' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '\"' otherlv_7= '>' ( (lv_children_8_0= ruleChild ) )+ otherlv_9= '</' ( (lv_close_relation_10_0= RULE_RELATION ) ) otherlv_11= '>' ) )
            // InternalFM.g:296:2: (otherlv_0= '<' ( (lv_open_relation_1_0= RULE_RELATION ) ) ( (lv_mandatory_2_0= 'mandatory' ) )? otherlv_3= 'name=' otherlv_4= '\"' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '\"' otherlv_7= '>' ( (lv_children_8_0= ruleChild ) )+ otherlv_9= '</' ( (lv_close_relation_10_0= RULE_RELATION ) ) otherlv_11= '>' )
            {
            // InternalFM.g:296:2: (otherlv_0= '<' ( (lv_open_relation_1_0= RULE_RELATION ) ) ( (lv_mandatory_2_0= 'mandatory' ) )? otherlv_3= 'name=' otherlv_4= '\"' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '\"' otherlv_7= '>' ( (lv_children_8_0= ruleChild ) )+ otherlv_9= '</' ( (lv_close_relation_10_0= RULE_RELATION ) ) otherlv_11= '>' )
            // InternalFM.g:297:3: otherlv_0= '<' ( (lv_open_relation_1_0= RULE_RELATION ) ) ( (lv_mandatory_2_0= 'mandatory' ) )? otherlv_3= 'name=' otherlv_4= '\"' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '\"' otherlv_7= '>' ( (lv_children_8_0= ruleChild ) )+ otherlv_9= '</' ( (lv_close_relation_10_0= RULE_RELATION ) ) otherlv_11= '>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getLessThanSignKeyword_0());
            		
            // InternalFM.g:301:3: ( (lv_open_relation_1_0= RULE_RELATION ) )
            // InternalFM.g:302:4: (lv_open_relation_1_0= RULE_RELATION )
            {
            // InternalFM.g:302:4: (lv_open_relation_1_0= RULE_RELATION )
            // InternalFM.g:303:5: lv_open_relation_1_0= RULE_RELATION
            {
            lv_open_relation_1_0=(Token)match(input,RULE_RELATION,FOLLOW_8); 

            					newLeafNode(lv_open_relation_1_0, grammarAccess.getNodeAccess().getOpen_relationRELATIONTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"open_relation",
            						lv_open_relation_1_0,
            						"org.xtext.FM.RELATION");
            				

            }


            }

            // InternalFM.g:319:3: ( (lv_mandatory_2_0= 'mandatory' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFM.g:320:4: (lv_mandatory_2_0= 'mandatory' )
                    {
                    // InternalFM.g:320:4: (lv_mandatory_2_0= 'mandatory' )
                    // InternalFM.g:321:5: lv_mandatory_2_0= 'mandatory'
                    {
                    lv_mandatory_2_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_mandatory_2_0, grammarAccess.getNodeAccess().getMandatoryMandatoryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", true, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getQuotationMarkKeyword_4());
            		
            // InternalFM.g:341:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFM.g:342:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFM.g:342:4: (lv_name_5_0= RULE_ID )
            // InternalFM.g:343:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getQuotationMarkKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getGreaterThanSignKeyword_7());
            		
            // InternalFM.g:367:3: ( (lv_children_8_0= ruleChild ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFM.g:368:4: (lv_children_8_0= ruleChild )
            	    {
            	    // InternalFM.g:368:4: (lv_children_8_0= ruleChild )
            	    // InternalFM.g:369:5: lv_children_8_0= ruleChild
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getChildrenChildParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_children_8_0=ruleChild();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_8_0,
            	    						"org.xtext.FM.Child");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getLessThanSignSolidusKeyword_9());
            		
            // InternalFM.g:390:3: ( (lv_close_relation_10_0= RULE_RELATION ) )
            // InternalFM.g:391:4: (lv_close_relation_10_0= RULE_RELATION )
            {
            // InternalFM.g:391:4: (lv_close_relation_10_0= RULE_RELATION )
            // InternalFM.g:392:5: lv_close_relation_10_0= RULE_RELATION
            {
            lv_close_relation_10_0=(Token)match(input,RULE_RELATION,FOLLOW_14); 

            					newLeafNode(lv_close_relation_10_0, grammarAccess.getNodeAccess().getClose_relationRELATIONTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"close_relation",
            						lv_close_relation_10_0,
            						"org.xtext.FM.RELATION");
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getGreaterThanSignKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleConstraints"
    // InternalFM.g:416:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalFM.g:416:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalFM.g:417:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalFM.g:423:1: ruleConstraints returns [EObject current=null] : (otherlv_0= '<constraints>' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= '</constraints>' ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalFM.g:429:2: ( (otherlv_0= '<constraints>' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= '</constraints>' ) )
            // InternalFM.g:430:2: (otherlv_0= '<constraints>' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= '</constraints>' )
            {
            // InternalFM.g:430:2: (otherlv_0= '<constraints>' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= '</constraints>' )
            // InternalFM.g:431:3: otherlv_0= '<constraints>' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= '</constraints>'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
            		
            // InternalFM.g:435:3: ( (lv_rules_1_0= ruleRule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFM.g:436:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalFM.g:436:4: (lv_rules_1_0= ruleRule )
            	    // InternalFM.g:437:5: lv_rules_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"org.xtext.FM.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintsAccess().getConstraintsKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleRule"
    // InternalFM.g:462:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalFM.g:462:45: (iv_ruleRule= ruleRule EOF )
            // InternalFM.g:463:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalFM.g:469:1: ruleRule returns [EObject current=null] : (otherlv_0= '<rule>' ( (lv_elements_1_0= ruleFormula ) )+ otherlv_2= '</rule>' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalFM.g:475:2: ( (otherlv_0= '<rule>' ( (lv_elements_1_0= ruleFormula ) )+ otherlv_2= '</rule>' ) )
            // InternalFM.g:476:2: (otherlv_0= '<rule>' ( (lv_elements_1_0= ruleFormula ) )+ otherlv_2= '</rule>' )
            {
            // InternalFM.g:476:2: (otherlv_0= '<rule>' ( (lv_elements_1_0= ruleFormula ) )+ otherlv_2= '</rule>' )
            // InternalFM.g:477:3: otherlv_0= '<rule>' ( (lv_elements_1_0= ruleFormula ) )+ otherlv_2= '</rule>'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalFM.g:481:3: ( (lv_elements_1_0= ruleFormula ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFM.g:482:4: (lv_elements_1_0= ruleFormula )
            	    {
            	    // InternalFM.g:482:4: (lv_elements_1_0= ruleFormula )
            	    // InternalFM.g:483:5: lv_elements_1_0= ruleFormula
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getElementsFormulaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_elements_1_0=ruleFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.FM.Formula");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getRuleKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleElement"
    // InternalFM.g:508:1: entryRuleRuleElement returns [EObject current=null] : iv_ruleRuleElement= ruleRuleElement EOF ;
    public final EObject entryRuleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleElement = null;


        try {
            // InternalFM.g:508:52: (iv_ruleRuleElement= ruleRuleElement EOF )
            // InternalFM.g:509:2: iv_ruleRuleElement= ruleRuleElement EOF
            {
             newCompositeNode(grammarAccess.getRuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleElement=ruleRuleElement();

            state._fsp--;

             current =iv_ruleRuleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleElement"


    // $ANTLR start "ruleRuleElement"
    // InternalFM.g:515:1: ruleRuleElement returns [EObject current=null] : (otherlv_0= '<' ( (lv_open_operator_1_0= RULE_OPERATOR ) ) otherlv_2= '>' ( (lv_left_side_3_0= ruleVar ) ) ( (lv_right_side_4_0= ruleVar ) ) otherlv_5= '</' ( (lv_close_operator_6_0= RULE_OPERATOR ) ) otherlv_7= '>' ) ;
    public final EObject ruleRuleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_open_operator_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_close_operator_6_0=null;
        Token otherlv_7=null;
        EObject lv_left_side_3_0 = null;

        EObject lv_right_side_4_0 = null;



        	enterRule();

        try {
            // InternalFM.g:521:2: ( (otherlv_0= '<' ( (lv_open_operator_1_0= RULE_OPERATOR ) ) otherlv_2= '>' ( (lv_left_side_3_0= ruleVar ) ) ( (lv_right_side_4_0= ruleVar ) ) otherlv_5= '</' ( (lv_close_operator_6_0= RULE_OPERATOR ) ) otherlv_7= '>' ) )
            // InternalFM.g:522:2: (otherlv_0= '<' ( (lv_open_operator_1_0= RULE_OPERATOR ) ) otherlv_2= '>' ( (lv_left_side_3_0= ruleVar ) ) ( (lv_right_side_4_0= ruleVar ) ) otherlv_5= '</' ( (lv_close_operator_6_0= RULE_OPERATOR ) ) otherlv_7= '>' )
            {
            // InternalFM.g:522:2: (otherlv_0= '<' ( (lv_open_operator_1_0= RULE_OPERATOR ) ) otherlv_2= '>' ( (lv_left_side_3_0= ruleVar ) ) ( (lv_right_side_4_0= ruleVar ) ) otherlv_5= '</' ( (lv_close_operator_6_0= RULE_OPERATOR ) ) otherlv_7= '>' )
            // InternalFM.g:523:3: otherlv_0= '<' ( (lv_open_operator_1_0= RULE_OPERATOR ) ) otherlv_2= '>' ( (lv_left_side_3_0= ruleVar ) ) ( (lv_right_side_4_0= ruleVar ) ) otherlv_5= '</' ( (lv_close_operator_6_0= RULE_OPERATOR ) ) otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleElementAccess().getLessThanSignKeyword_0());
            		
            // InternalFM.g:527:3: ( (lv_open_operator_1_0= RULE_OPERATOR ) )
            // InternalFM.g:528:4: (lv_open_operator_1_0= RULE_OPERATOR )
            {
            // InternalFM.g:528:4: (lv_open_operator_1_0= RULE_OPERATOR )
            // InternalFM.g:529:5: lv_open_operator_1_0= RULE_OPERATOR
            {
            lv_open_operator_1_0=(Token)match(input,RULE_OPERATOR,FOLLOW_14); 

            					newLeafNode(lv_open_operator_1_0, grammarAccess.getRuleElementAccess().getOpen_operatorOPERATORTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"open_operator",
            						lv_open_operator_1_0,
            						"org.xtext.FM.OPERATOR");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_2());
            		
            // InternalFM.g:549:3: ( (lv_left_side_3_0= ruleVar ) )
            // InternalFM.g:550:4: (lv_left_side_3_0= ruleVar )
            {
            // InternalFM.g:550:4: (lv_left_side_3_0= ruleVar )
            // InternalFM.g:551:5: lv_left_side_3_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getRuleElementAccess().getLeft_sideVarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_left_side_3_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleElementRule());
            					}
            					set(
            						current,
            						"left_side",
            						lv_left_side_3_0,
            						"org.xtext.FM.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFM.g:568:3: ( (lv_right_side_4_0= ruleVar ) )
            // InternalFM.g:569:4: (lv_right_side_4_0= ruleVar )
            {
            // InternalFM.g:569:4: (lv_right_side_4_0= ruleVar )
            // InternalFM.g:570:5: lv_right_side_4_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getRuleElementAccess().getRight_sideVarParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_right_side_4_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleElementRule());
            					}
            					set(
            						current,
            						"right_side",
            						lv_right_side_4_0,
            						"org.xtext.FM.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleElementAccess().getLessThanSignSolidusKeyword_5());
            		
            // InternalFM.g:591:3: ( (lv_close_operator_6_0= RULE_OPERATOR ) )
            // InternalFM.g:592:4: (lv_close_operator_6_0= RULE_OPERATOR )
            {
            // InternalFM.g:592:4: (lv_close_operator_6_0= RULE_OPERATOR )
            // InternalFM.g:593:5: lv_close_operator_6_0= RULE_OPERATOR
            {
            lv_close_operator_6_0=(Token)match(input,RULE_OPERATOR,FOLLOW_14); 

            					newLeafNode(lv_close_operator_6_0, grammarAccess.getRuleElementAccess().getClose_operatorOPERATORTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"close_operator",
            						lv_close_operator_6_0,
            						"org.xtext.FM.OPERATOR");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleElementAccess().getGreaterThanSignKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleElement"


    // $ANTLR start "entryRuleFormula"
    // InternalFM.g:617:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalFM.g:617:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalFM.g:618:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalFM.g:624:1: ruleFormula returns [EObject current=null] : (this_Var_0= ruleVar | this_RuleElement_1= ruleRuleElement ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;

        EObject this_RuleElement_1 = null;



        	enterRule();

        try {
            // InternalFM.g:630:2: ( (this_Var_0= ruleVar | this_RuleElement_1= ruleRuleElement ) )
            // InternalFM.g:631:2: (this_Var_0= ruleVar | this_RuleElement_1= ruleRuleElement )
            {
            // InternalFM.g:631:2: (this_Var_0= ruleVar | this_RuleElement_1= ruleRuleElement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFM.g:632:3: this_Var_0= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getFormulaAccess().getVarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;


                    			current = this_Var_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFM.g:641:3: this_RuleElement_1= ruleRuleElement
                    {

                    			newCompositeNode(grammarAccess.getFormulaAccess().getRuleElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleElement_1=ruleRuleElement();

                    state._fsp--;


                    			current = this_RuleElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleVar"
    // InternalFM.g:653:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalFM.g:653:44: (iv_ruleVar= ruleVar EOF )
            // InternalFM.g:654:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalFM.g:660:1: ruleVar returns [EObject current=null] : (otherlv_0= '<var' ( (lv_not_1_0= 'not' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalFM.g:666:2: ( (otherlv_0= '<var' ( (lv_not_1_0= 'not' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' ) )
            // InternalFM.g:667:2: (otherlv_0= '<var' ( (lv_not_1_0= 'not' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' )
            {
            // InternalFM.g:667:2: (otherlv_0= '<var' ( (lv_not_1_0= 'not' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>' )
            // InternalFM.g:668:3: otherlv_0= '<var' ( (lv_not_1_0= 'not' ) )? otherlv_2= 'name=' otherlv_3= '\"' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '\"' otherlv_6= '/>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
            		
            // InternalFM.g:672:3: ( (lv_not_1_0= 'not' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFM.g:673:4: (lv_not_1_0= 'not' )
                    {
                    // InternalFM.g:673:4: (lv_not_1_0= 'not' )
                    // InternalFM.g:674:5: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,30,FOLLOW_9); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getVarAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVarAccess().getQuotationMarkKeyword_3());
            		
            // InternalFM.g:694:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFM.g:695:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFM.g:695:4: (lv_name_4_0= RULE_ID )
            // InternalFM.g:696:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_4_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getVarAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVarAccess().getSolidusGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001420000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040080000L});

}