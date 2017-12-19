package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFMLexer extends Lexer {
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

    public InternalFMLexer() {;} 
    public InternalFMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFM.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:11:7: ( '<featureModel>' )
            // InternalFM.g:11:9: '<featureModel>'
            {
            match("<featureModel>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:12:7: ( '</featureModel>' )
            // InternalFM.g:12:9: '</featureModel>'
            {
            match("</featureModel>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:13:7: ( '<featureDiagram>' )
            // InternalFM.g:13:9: '<featureDiagram>'
            {
            match("<featureDiagram>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:14:7: ( '</featureDiagram>' )
            // InternalFM.g:14:9: '</featureDiagram>'
            {
            match("</featureDiagram>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:15:7: ( '<feature' )
            // InternalFM.g:15:9: '<feature'
            {
            match("<feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:16:7: ( 'mandatory' )
            // InternalFM.g:16:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:17:7: ( 'name=' )
            // InternalFM.g:17:9: 'name='
            {
            match("name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:18:7: ( '\"' )
            // InternalFM.g:18:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:19:7: ( '/>' )
            // InternalFM.g:19:9: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:20:7: ( '<' )
            // InternalFM.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:21:7: ( '>' )
            // InternalFM.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:22:7: ( '</' )
            // InternalFM.g:22:9: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:23:7: ( '<constraints>' )
            // InternalFM.g:23:9: '<constraints>'
            {
            match("<constraints>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:24:7: ( '</constraints>' )
            // InternalFM.g:24:9: '</constraints>'
            {
            match("</constraints>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:25:7: ( '<rule>' )
            // InternalFM.g:25:9: '<rule>'
            {
            match("<rule>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:26:7: ( '</rule>' )
            // InternalFM.g:26:9: '</rule>'
            {
            match("</rule>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:27:7: ( '<var' )
            // InternalFM.g:27:9: '<var'
            {
            match("<var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:28:7: ( 'not' )
            // InternalFM.g:28:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_RELATION"
    public final void mRULE_RELATION() throws RecognitionException {
        try {
            int _type = RULE_RELATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:723:15: ( ( 'and' | 'or' | 'alt' ) )
            // InternalFM.g:723:17: ( 'and' | 'or' | 'alt' )
            {
            // InternalFM.g:723:17: ( 'and' | 'or' | 'alt' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='a') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='n') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='l') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='o') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFM.g:723:18: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // InternalFM.g:723:24: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // InternalFM.g:723:29: 'alt'
                    {
                    match("alt"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATION"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:725:15: ( 'imp' )
            // InternalFM.g:725:17: 'imp'
            {
            match("imp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:727:13: ( '@@@@@@willnenverbecalled@@@@@' )
            // InternalFM.g:727:15: '@@@@@@willnenverbecalled@@@@@'
            {
            match("@@@@@@willnenverbecalled@@@@@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:729:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFM.g:729:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFM.g:729:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFM.g:729:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFM.g:729:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:731:10: ( ( '0' .. '9' )+ )
            // InternalFM.g:731:12: ( '0' .. '9' )+
            {
            // InternalFM.g:731:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFM.g:731:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:733:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFM.g:733:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFM.g:733:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFM.g:733:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:735:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFM.g:735:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFM.g:735:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFM.g:735:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalFM.g:735:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFM.g:735:41: ( '\\r' )? '\\n'
                    {
                    // InternalFM.g:735:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalFM.g:735:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:737:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFM.g:737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFM.g:737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFM.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFM.g:739:16: ( . )
            // InternalFM.g:739:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalFM.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_RELATION | RULE_OPERATOR | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=27;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalFM.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalFM.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalFM.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalFM.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalFM.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalFM.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalFM.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalFM.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalFM.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalFM.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalFM.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalFM.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalFM.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalFM.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalFM.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalFM.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalFM.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalFM.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalFM.g:1:118: RULE_RELATION
                {
                mRULE_RELATION(); 

                }
                break;
            case 20 :
                // InternalFM.g:1:132: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 21 :
                // InternalFM.g:1:146: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalFM.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalFM.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalFM.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalFM.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalFM.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalFM.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\25\2\27\1\uffff\1\17\1\uffff\3\27\2\17\5\uffff\1\52\4\uffff\1\27\1\uffff\2\27\5\uffff\2\27\1\60\1\27\10\uffff\2\27\1\66\2\60\1\uffff\1\67\2\uffff\2\27\4\uffff\1\27\3\uffff\1\27\2\uffff\1\27\1\107\1\uffff\1\27\4\uffff\1\114\3\uffff";
    static final String DFA10_eofS =
        "\115\uffff";
    static final String DFA10_minS =
        "\1\0\1\57\2\141\1\uffff\1\52\1\uffff\1\154\1\162\1\155\1\100\1\101\4\uffff\1\145\1\143\4\uffff\1\156\1\uffff\1\155\1\164\5\uffff\1\144\1\164\1\60\1\160\3\uffff\1\141\1\145\3\uffff\1\144\1\145\3\60\1\uffff\1\60\1\164\2\141\1\75\2\uffff\1\165\2\164\1\uffff\1\162\1\165\1\157\1\145\2\162\1\104\1\145\1\171\3\uffff\1\104\1\60\3\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\166\1\141\1\157\1\uffff\1\76\1\uffff\1\156\1\162\1\155\1\100\1\172\4\uffff\1\145\1\162\4\uffff\1\156\1\uffff\1\155\1\164\5\uffff\1\144\1\164\1\172\1\160\3\uffff\1\141\1\145\3\uffff\1\144\1\145\3\172\1\uffff\1\172\1\164\2\141\1\75\2\uffff\1\165\2\164\1\uffff\1\162\1\165\1\157\1\145\2\162\1\115\1\145\1\171\3\uffff\1\115\1\172\3\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\10\1\uffff\1\13\5\uffff\1\26\1\27\1\32\1\33\2\uffff\1\15\1\17\1\21\1\12\1\uffff\1\26\2\uffff\1\10\1\11\1\30\1\31\1\13\4\uffff\1\25\1\27\1\32\2\uffff\1\16\1\20\1\14\5\uffff\1\23\5\uffff\1\22\1\24\3\uffff\1\7\11\uffff\1\1\1\3\1\5\2\uffff\1\2\1\4\1\6";
    static final String DFA10_specialS =
        "\1\0\114\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\4\14\17\1\5\12\15\2\17\1\1\1\17\1\6\1\17\1\12\32\14\3\17\1\13\1\14\1\17\1\7\7\14\1\11\3\14\1\2\1\3\1\10\13\14\uff85\17",
            "\1\21\63\uffff\1\22\2\uffff\1\20\13\uffff\1\23\3\uffff\1\24",
            "\1\26",
            "\1\30\15\uffff\1\31",
            "",
            "\1\34\4\uffff\1\35\16\uffff\1\33",
            "",
            "\1\40\1\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50\2\uffff\1\47\13\uffff\1\51",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\61",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\10\uffff\1\105",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\113\10\uffff\1\112",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_RELATION | RULE_OPERATOR | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='<') ) {s = 1;}

                        else if ( (LA10_0=='m') ) {s = 2;}

                        else if ( (LA10_0=='n') ) {s = 3;}

                        else if ( (LA10_0=='\"') ) {s = 4;}

                        else if ( (LA10_0=='/') ) {s = 5;}

                        else if ( (LA10_0=='>') ) {s = 6;}

                        else if ( (LA10_0=='a') ) {s = 7;}

                        else if ( (LA10_0=='o') ) {s = 8;}

                        else if ( (LA10_0=='i') ) {s = 9;}

                        else if ( (LA10_0=='@') ) {s = 10;}

                        else if ( (LA10_0=='^') ) {s = 11;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='b' && LA10_0<='h')||(LA10_0>='j' && LA10_0<='l')||(LA10_0>='p' && LA10_0<='z')) ) {s = 12;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 13;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 14;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='.')||(LA10_0>=':' && LA10_0<=';')||LA10_0=='='||LA10_0=='?'||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}