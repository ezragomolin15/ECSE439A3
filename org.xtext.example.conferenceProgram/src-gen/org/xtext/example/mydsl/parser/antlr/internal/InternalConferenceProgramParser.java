package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ConferenceProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConferenceProgramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'Track'", "'{'", "'}'", "'Session'", "'Paper'", "'IndustryPaper'", "'DemoAndPoster'", "'Panel'", "'Location'", "'Room'", "'Keynote'", "'Break'", "'Lunch'", "'SocialEvent'", "'Directions'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConferenceProgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConferenceProgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConferenceProgramParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConferenceProgram.g"; }



     	private ConferenceProgramGrammarAccess grammarAccess;

        public InternalConferenceProgramParser(TokenStream input, ConferenceProgramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConferenceProgram";
       	}

       	@Override
       	protected ConferenceProgramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConferenceProgram"
    // InternalConferenceProgram.g:64:1: entryRuleConferenceProgram returns [EObject current=null] : iv_ruleConferenceProgram= ruleConferenceProgram EOF ;
    public final EObject entryRuleConferenceProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConferenceProgram = null;


        try {
            // InternalConferenceProgram.g:64:58: (iv_ruleConferenceProgram= ruleConferenceProgram EOF )
            // InternalConferenceProgram.g:65:2: iv_ruleConferenceProgram= ruleConferenceProgram EOF
            {
             newCompositeNode(grammarAccess.getConferenceProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConferenceProgram=ruleConferenceProgram();

            state._fsp--;

             current =iv_ruleConferenceProgram; 
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
    // $ANTLR end "entryRuleConferenceProgram"


    // $ANTLR start "ruleConferenceProgram"
    // InternalConferenceProgram.g:71:1: ruleConferenceProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_tracks_3_0= ruleTrack ) )+ ( (lv_socialEvents_4_0= ruleSocialEvent ) )* ( (lv_keynotes_5_0= ruleKeynote ) )* ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )* ( (lv_lunches_7_0= ruleLunch ) )* ) ;
    public final EObject ruleConferenceProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_date_2_0=null;
        EObject lv_tracks_3_0 = null;

        EObject lv_socialEvents_4_0 = null;

        EObject lv_keynotes_5_0 = null;

        EObject lv_coffebreaks_6_0 = null;

        EObject lv_lunches_7_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:77:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_tracks_3_0= ruleTrack ) )+ ( (lv_socialEvents_4_0= ruleSocialEvent ) )* ( (lv_keynotes_5_0= ruleKeynote ) )* ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )* ( (lv_lunches_7_0= ruleLunch ) )* ) )
            // InternalConferenceProgram.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_tracks_3_0= ruleTrack ) )+ ( (lv_socialEvents_4_0= ruleSocialEvent ) )* ( (lv_keynotes_5_0= ruleKeynote ) )* ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )* ( (lv_lunches_7_0= ruleLunch ) )* )
            {
            // InternalConferenceProgram.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_tracks_3_0= ruleTrack ) )+ ( (lv_socialEvents_4_0= ruleSocialEvent ) )* ( (lv_keynotes_5_0= ruleKeynote ) )* ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )* ( (lv_lunches_7_0= ruleLunch ) )* )
            // InternalConferenceProgram.g:79:3: otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_tracks_3_0= ruleTrack ) )+ ( (lv_socialEvents_4_0= ruleSocialEvent ) )* ( (lv_keynotes_5_0= ruleKeynote ) )* ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )* ( (lv_lunches_7_0= ruleLunch ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConferenceProgramAccess().getProgramKeyword_0());
            		
            // InternalConferenceProgram.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConferenceProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConferenceProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalConferenceProgram.g:101:3: ( (lv_date_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:102:4: (lv_date_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:102:4: (lv_date_2_0= RULE_STRING )
            // InternalConferenceProgram.g:103:5: lv_date_2_0= RULE_STRING
            {
            lv_date_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_date_2_0, grammarAccess.getConferenceProgramAccess().getDateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConferenceProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:119:3: ( (lv_tracks_3_0= ruleTrack ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConferenceProgram.g:120:4: (lv_tracks_3_0= ruleTrack )
            	    {
            	    // InternalConferenceProgram.g:120:4: (lv_tracks_3_0= ruleTrack )
            	    // InternalConferenceProgram.g:121:5: lv_tracks_3_0= ruleTrack
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getTracksTrackParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tracks_3_0=ruleTrack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tracks",
            	    						lv_tracks_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Track");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalConferenceProgram.g:138:3: ( (lv_socialEvents_4_0= ruleSocialEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalConferenceProgram.g:139:4: (lv_socialEvents_4_0= ruleSocialEvent )
            	    {
            	    // InternalConferenceProgram.g:139:4: (lv_socialEvents_4_0= ruleSocialEvent )
            	    // InternalConferenceProgram.g:140:5: lv_socialEvents_4_0= ruleSocialEvent
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_socialEvents_4_0=ruleSocialEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"socialEvents",
            	    						lv_socialEvents_4_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.SocialEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalConferenceProgram.g:157:3: ( (lv_keynotes_5_0= ruleKeynote ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalConferenceProgram.g:158:4: (lv_keynotes_5_0= ruleKeynote )
            	    {
            	    // InternalConferenceProgram.g:158:4: (lv_keynotes_5_0= ruleKeynote )
            	    // InternalConferenceProgram.g:159:5: lv_keynotes_5_0= ruleKeynote
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_keynotes_5_0=ruleKeynote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"keynotes",
            	    						lv_keynotes_5_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Keynote");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalConferenceProgram.g:176:3: ( (lv_coffebreaks_6_0= ruleCoffeBreak ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalConferenceProgram.g:177:4: (lv_coffebreaks_6_0= ruleCoffeBreak )
            	    {
            	    // InternalConferenceProgram.g:177:4: (lv_coffebreaks_6_0= ruleCoffeBreak )
            	    // InternalConferenceProgram.g:178:5: lv_coffebreaks_6_0= ruleCoffeBreak
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_coffebreaks_6_0=ruleCoffeBreak();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"coffebreaks",
            	    						lv_coffebreaks_6_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.CoffeBreak");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalConferenceProgram.g:195:3: ( (lv_lunches_7_0= ruleLunch ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConferenceProgram.g:196:4: (lv_lunches_7_0= ruleLunch )
            	    {
            	    // InternalConferenceProgram.g:196:4: (lv_lunches_7_0= ruleLunch )
            	    // InternalConferenceProgram.g:197:5: lv_lunches_7_0= ruleLunch
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_lunches_7_0=ruleLunch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lunches",
            	    						lv_lunches_7_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Lunch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleConferenceProgram"


    // $ANTLR start "entryRuleTrack"
    // InternalConferenceProgram.g:218:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalConferenceProgram.g:218:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalConferenceProgram.g:219:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
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
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalConferenceProgram.g:225:1: ruleTrack returns [EObject current=null] : (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_session_3_0= ruleSession ) )+ otherlv_4= '}' ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_session_3_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:231:2: ( (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_session_3_0= ruleSession ) )+ otherlv_4= '}' ) )
            // InternalConferenceProgram.g:232:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_session_3_0= ruleSession ) )+ otherlv_4= '}' )
            {
            // InternalConferenceProgram.g:232:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_session_3_0= ruleSession ) )+ otherlv_4= '}' )
            // InternalConferenceProgram.g:233:3: otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_session_3_0= ruleSession ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTrackKeyword_0());
            		
            // InternalConferenceProgram.g:237:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:238:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:238:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:239:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:259:3: ( (lv_session_3_0= ruleSession ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalConferenceProgram.g:260:4: (lv_session_3_0= ruleSession )
            	    {
            	    // InternalConferenceProgram.g:260:4: (lv_session_3_0= ruleSession )
            	    // InternalConferenceProgram.g:261:5: lv_session_3_0= ruleSession
            	    {

            	    					newCompositeNode(grammarAccess.getTrackAccess().getSessionSessionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_session_3_0=ruleSession();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"session",
            	    						lv_session_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Session");
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleSession"
    // InternalConferenceProgram.g:286:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalConferenceProgram.g:286:48: (iv_ruleSession= ruleSession EOF )
            // InternalConferenceProgram.g:287:2: iv_ruleSession= ruleSession EOF
            {
             newCompositeNode(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSession=ruleSession();

            state._fsp--;

             current =iv_ruleSession; 
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
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalConferenceProgram.g:293:1: ruleSession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )* ( (lv_industrypaper_4_0= ruleIndustryPaper ) )* ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )* ( (lv_panel_6_0= rulePanel ) )* ( (lv_location_7_0= ruleLocation ) )? ( (lv_startTime_8_0= RULE_STRING ) ) ( (lv_endTime_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_8_0=null;
        Token lv_endTime_9_0=null;
        Token otherlv_10=null;
        EObject lv_researchpaper_3_0 = null;

        EObject lv_industrypaper_4_0 = null;

        EObject lv_demoandposter_5_0 = null;

        EObject lv_panel_6_0 = null;

        EObject lv_location_7_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:299:2: ( (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )* ( (lv_industrypaper_4_0= ruleIndustryPaper ) )* ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )* ( (lv_panel_6_0= rulePanel ) )* ( (lv_location_7_0= ruleLocation ) )? ( (lv_startTime_8_0= RULE_STRING ) ) ( (lv_endTime_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalConferenceProgram.g:300:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )* ( (lv_industrypaper_4_0= ruleIndustryPaper ) )* ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )* ( (lv_panel_6_0= rulePanel ) )* ( (lv_location_7_0= ruleLocation ) )? ( (lv_startTime_8_0= RULE_STRING ) ) ( (lv_endTime_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalConferenceProgram.g:300:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )* ( (lv_industrypaper_4_0= ruleIndustryPaper ) )* ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )* ( (lv_panel_6_0= rulePanel ) )* ( (lv_location_7_0= ruleLocation ) )? ( (lv_startTime_8_0= RULE_STRING ) ) ( (lv_endTime_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalConferenceProgram.g:301:3: otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )* ( (lv_industrypaper_4_0= ruleIndustryPaper ) )* ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )* ( (lv_panel_6_0= rulePanel ) )* ( (lv_location_7_0= ruleLocation ) )? ( (lv_startTime_8_0= RULE_STRING ) ) ( (lv_endTime_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
            		
            // InternalConferenceProgram.g:305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:306:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:327:3: ( (lv_researchpaper_3_0= ruleResearchPaper ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConferenceProgram.g:328:4: (lv_researchpaper_3_0= ruleResearchPaper )
            	    {
            	    // InternalConferenceProgram.g:328:4: (lv_researchpaper_3_0= ruleResearchPaper )
            	    // InternalConferenceProgram.g:329:5: lv_researchpaper_3_0= ruleResearchPaper
            	    {

            	    					newCompositeNode(grammarAccess.getSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_researchpaper_3_0=ruleResearchPaper();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"researchpaper",
            	    						lv_researchpaper_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.ResearchPaper");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalConferenceProgram.g:346:3: ( (lv_industrypaper_4_0= ruleIndustryPaper ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConferenceProgram.g:347:4: (lv_industrypaper_4_0= ruleIndustryPaper )
            	    {
            	    // InternalConferenceProgram.g:347:4: (lv_industrypaper_4_0= ruleIndustryPaper )
            	    // InternalConferenceProgram.g:348:5: lv_industrypaper_4_0= ruleIndustryPaper
            	    {

            	    					newCompositeNode(grammarAccess.getSessionAccess().getIndustrypaperIndustryPaperParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_industrypaper_4_0=ruleIndustryPaper();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"industrypaper",
            	    						lv_industrypaper_4_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.IndustryPaper");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalConferenceProgram.g:365:3: ( (lv_demoandposter_5_0= ruleDemoAndPoster ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConferenceProgram.g:366:4: (lv_demoandposter_5_0= ruleDemoAndPoster )
            	    {
            	    // InternalConferenceProgram.g:366:4: (lv_demoandposter_5_0= ruleDemoAndPoster )
            	    // InternalConferenceProgram.g:367:5: lv_demoandposter_5_0= ruleDemoAndPoster
            	    {

            	    					newCompositeNode(grammarAccess.getSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_demoandposter_5_0=ruleDemoAndPoster();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"demoandposter",
            	    						lv_demoandposter_5_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.DemoAndPoster");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalConferenceProgram.g:384:3: ( (lv_panel_6_0= rulePanel ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConferenceProgram.g:385:4: (lv_panel_6_0= rulePanel )
            	    {
            	    // InternalConferenceProgram.g:385:4: (lv_panel_6_0= rulePanel )
            	    // InternalConferenceProgram.g:386:5: lv_panel_6_0= rulePanel
            	    {

            	    					newCompositeNode(grammarAccess.getSessionAccess().getPanelPanelParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_panel_6_0=rulePanel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"panel",
            	    						lv_panel_6_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Panel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalConferenceProgram.g:403:3: ( (lv_location_7_0= ruleLocation ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConferenceProgram.g:404:4: (lv_location_7_0= ruleLocation )
                    {
                    // InternalConferenceProgram.g:404:4: (lv_location_7_0= ruleLocation )
                    // InternalConferenceProgram.g:405:5: lv_location_7_0= ruleLocation
                    {

                    					newCompositeNode(grammarAccess.getSessionAccess().getLocationLocationParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_location_7_0=ruleLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSessionRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_7_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.Location");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:422:3: ( (lv_startTime_8_0= RULE_STRING ) )
            // InternalConferenceProgram.g:423:4: (lv_startTime_8_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:423:4: (lv_startTime_8_0= RULE_STRING )
            // InternalConferenceProgram.g:424:5: lv_startTime_8_0= RULE_STRING
            {
            lv_startTime_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_8_0, grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:440:3: ( (lv_endTime_9_0= RULE_STRING ) )
            // InternalConferenceProgram.g:441:4: (lv_endTime_9_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:441:4: (lv_endTime_9_0= RULE_STRING )
            // InternalConferenceProgram.g:442:5: lv_endTime_9_0= RULE_STRING
            {
            lv_endTime_9_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_endTime_9_0, grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleResearchPaper"
    // InternalConferenceProgram.g:466:1: entryRuleResearchPaper returns [EObject current=null] : iv_ruleResearchPaper= ruleResearchPaper EOF ;
    public final EObject entryRuleResearchPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchPaper = null;


        try {
            // InternalConferenceProgram.g:466:54: (iv_ruleResearchPaper= ruleResearchPaper EOF )
            // InternalConferenceProgram.g:467:2: iv_ruleResearchPaper= ruleResearchPaper EOF
            {
             newCompositeNode(grammarAccess.getResearchPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResearchPaper=ruleResearchPaper();

            state._fsp--;

             current =iv_ruleResearchPaper; 
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
    // $ANTLR end "entryRuleResearchPaper"


    // $ANTLR start "ruleResearchPaper"
    // InternalConferenceProgram.g:473:1: ruleResearchPaper returns [EObject current=null] : (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResearchPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:479:2: ( (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:480:2: (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:480:2: (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:481:3: otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResearchPaperAccess().getPaperKeyword_0());
            		
            // InternalConferenceProgram.g:485:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:486:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:486:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:487:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResearchPaperAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchPaperRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleResearchPaper"


    // $ANTLR start "entryRuleIndustryPaper"
    // InternalConferenceProgram.g:507:1: entryRuleIndustryPaper returns [EObject current=null] : iv_ruleIndustryPaper= ruleIndustryPaper EOF ;
    public final EObject entryRuleIndustryPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndustryPaper = null;


        try {
            // InternalConferenceProgram.g:507:54: (iv_ruleIndustryPaper= ruleIndustryPaper EOF )
            // InternalConferenceProgram.g:508:2: iv_ruleIndustryPaper= ruleIndustryPaper EOF
            {
             newCompositeNode(grammarAccess.getIndustryPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndustryPaper=ruleIndustryPaper();

            state._fsp--;

             current =iv_ruleIndustryPaper; 
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
    // $ANTLR end "entryRuleIndustryPaper"


    // $ANTLR start "ruleIndustryPaper"
    // InternalConferenceProgram.g:514:1: ruleIndustryPaper returns [EObject current=null] : (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIndustryPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:520:2: ( (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:521:2: (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:521:2: (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:522:3: otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndustryPaperAccess().getIndustryPaperKeyword_0());
            		
            // InternalConferenceProgram.g:526:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:527:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:527:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:528:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndustryPaperAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndustryPaperRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleIndustryPaper"


    // $ANTLR start "entryRuleDemoAndPoster"
    // InternalConferenceProgram.g:548:1: entryRuleDemoAndPoster returns [EObject current=null] : iv_ruleDemoAndPoster= ruleDemoAndPoster EOF ;
    public final EObject entryRuleDemoAndPoster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemoAndPoster = null;


        try {
            // InternalConferenceProgram.g:548:54: (iv_ruleDemoAndPoster= ruleDemoAndPoster EOF )
            // InternalConferenceProgram.g:549:2: iv_ruleDemoAndPoster= ruleDemoAndPoster EOF
            {
             newCompositeNode(grammarAccess.getDemoAndPosterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDemoAndPoster=ruleDemoAndPoster();

            state._fsp--;

             current =iv_ruleDemoAndPoster; 
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
    // $ANTLR end "entryRuleDemoAndPoster"


    // $ANTLR start "ruleDemoAndPoster"
    // InternalConferenceProgram.g:555:1: ruleDemoAndPoster returns [EObject current=null] : (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDemoAndPoster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:561:2: ( (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:562:2: (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:562:2: (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:563:3: otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDemoAndPosterAccess().getDemoAndPosterKeyword_0());
            		
            // InternalConferenceProgram.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDemoAndPosterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemoAndPosterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleDemoAndPoster"


    // $ANTLR start "entryRulePanel"
    // InternalConferenceProgram.g:589:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalConferenceProgram.g:589:46: (iv_rulePanel= rulePanel EOF )
            // InternalConferenceProgram.g:590:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalConferenceProgram.g:596:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:602:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:603:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:603:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:604:3: otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalConferenceProgram.g:608:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:609:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:609:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:610:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleLocation"
    // InternalConferenceProgram.g:630:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalConferenceProgram.g:630:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalConferenceProgram.g:631:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalConferenceProgram.g:637:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_room_2_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:643:2: ( (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' ) )
            // InternalConferenceProgram.g:644:2: (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' )
            {
            // InternalConferenceProgram.g:644:2: (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' )
            // InternalConferenceProgram.g:645:3: otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalConferenceProgram.g:653:3: ( (lv_room_2_0= ruleRoom ) )
            // InternalConferenceProgram.g:654:4: (lv_room_2_0= ruleRoom )
            {
            // InternalConferenceProgram.g:654:4: (lv_room_2_0= ruleRoom )
            // InternalConferenceProgram.g:655:5: lv_room_2_0= ruleRoom
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getRoomRoomParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_room_2_0=ruleRoom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"room",
            						lv_room_2_0,
            						"org.xtext.example.mydsl.ConferenceProgram.Room");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleRoom"
    // InternalConferenceProgram.g:680:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalConferenceProgram.g:680:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalConferenceProgram.g:681:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalConferenceProgram.g:687:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:693:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:694:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:694:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:695:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalConferenceProgram.g:699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:700:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:701:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleKeynote"
    // InternalConferenceProgram.g:721:1: entryRuleKeynote returns [EObject current=null] : iv_ruleKeynote= ruleKeynote EOF ;
    public final EObject entryRuleKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeynote = null;


        try {
            // InternalConferenceProgram.g:721:48: (iv_ruleKeynote= ruleKeynote EOF )
            // InternalConferenceProgram.g:722:2: iv_ruleKeynote= ruleKeynote EOF
            {
             newCompositeNode(grammarAccess.getKeynoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeynote=ruleKeynote();

            state._fsp--;

             current =iv_ruleKeynote; 
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
    // $ANTLR end "entryRuleKeynote"


    // $ANTLR start "ruleKeynote"
    // InternalConferenceProgram.g:728:1: ruleKeynote returns [EObject current=null] : (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_startTime_2_0=null;
        Token lv_endTime_3_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:734:2: ( (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) )
            // InternalConferenceProgram.g:735:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            {
            // InternalConferenceProgram.g:735:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            // InternalConferenceProgram.g:736:3: otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKeynoteAccess().getKeynoteKeyword_0());
            		
            // InternalConferenceProgram.g:740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:741:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:742:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKeynoteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeynoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalConferenceProgram.g:758:3: ( (lv_startTime_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:759:4: (lv_startTime_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:759:4: (lv_startTime_2_0= RULE_STRING )
            // InternalConferenceProgram.g:760:5: lv_startTime_2_0= RULE_STRING
            {
            lv_startTime_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_2_0, grammarAccess.getKeynoteAccess().getStartTimeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeynoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:776:3: ( (lv_endTime_3_0= RULE_STRING ) )
            // InternalConferenceProgram.g:777:4: (lv_endTime_3_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:777:4: (lv_endTime_3_0= RULE_STRING )
            // InternalConferenceProgram.g:778:5: lv_endTime_3_0= RULE_STRING
            {
            lv_endTime_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_endTime_3_0, grammarAccess.getKeynoteAccess().getEndTimeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeynoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleKeynote"


    // $ANTLR start "entryRuleCoffeBreak"
    // InternalConferenceProgram.g:798:1: entryRuleCoffeBreak returns [EObject current=null] : iv_ruleCoffeBreak= ruleCoffeBreak EOF ;
    public final EObject entryRuleCoffeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeBreak = null;


        try {
            // InternalConferenceProgram.g:798:51: (iv_ruleCoffeBreak= ruleCoffeBreak EOF )
            // InternalConferenceProgram.g:799:2: iv_ruleCoffeBreak= ruleCoffeBreak EOF
            {
             newCompositeNode(grammarAccess.getCoffeBreakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoffeBreak=ruleCoffeBreak();

            state._fsp--;

             current =iv_ruleCoffeBreak; 
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
    // $ANTLR end "entryRuleCoffeBreak"


    // $ANTLR start "ruleCoffeBreak"
    // InternalConferenceProgram.g:805:1: ruleCoffeBreak returns [EObject current=null] : (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCoffeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_startTime_2_0=null;
        Token lv_endTime_3_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:811:2: ( (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) )
            // InternalConferenceProgram.g:812:2: (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            {
            // InternalConferenceProgram.g:812:2: (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            // InternalConferenceProgram.g:813:3: otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeBreakAccess().getBreakKeyword_0());
            		
            // InternalConferenceProgram.g:817:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:818:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:818:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:819:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoffeBreakAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoffeBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalConferenceProgram.g:835:3: ( (lv_startTime_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:836:4: (lv_startTime_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:836:4: (lv_startTime_2_0= RULE_STRING )
            // InternalConferenceProgram.g:837:5: lv_startTime_2_0= RULE_STRING
            {
            lv_startTime_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_2_0, grammarAccess.getCoffeBreakAccess().getStartTimeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoffeBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:853:3: ( (lv_endTime_3_0= RULE_STRING ) )
            // InternalConferenceProgram.g:854:4: (lv_endTime_3_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:854:4: (lv_endTime_3_0= RULE_STRING )
            // InternalConferenceProgram.g:855:5: lv_endTime_3_0= RULE_STRING
            {
            lv_endTime_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_endTime_3_0, grammarAccess.getCoffeBreakAccess().getEndTimeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoffeBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleCoffeBreak"


    // $ANTLR start "entryRuleLunch"
    // InternalConferenceProgram.g:875:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalConferenceProgram.g:875:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalConferenceProgram.g:876:2: iv_ruleLunch= ruleLunch EOF
            {
             newCompositeNode(grammarAccess.getLunchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLunch=ruleLunch();

            state._fsp--;

             current =iv_ruleLunch; 
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
    // $ANTLR end "entryRuleLunch"


    // $ANTLR start "ruleLunch"
    // InternalConferenceProgram.g:882:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_startTime_2_0=null;
        Token lv_endTime_3_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:888:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) ) )
            // InternalConferenceProgram.g:889:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            {
            // InternalConferenceProgram.g:889:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) ) )
            // InternalConferenceProgram.g:890:3: otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_startTime_2_0= RULE_STRING ) ) ( (lv_endTime_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalConferenceProgram.g:894:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:895:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:895:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:896:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLunchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLunchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalConferenceProgram.g:912:3: ( (lv_startTime_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:913:4: (lv_startTime_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:913:4: (lv_startTime_2_0= RULE_STRING )
            // InternalConferenceProgram.g:914:5: lv_startTime_2_0= RULE_STRING
            {
            lv_startTime_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_2_0, grammarAccess.getLunchAccess().getStartTimeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLunchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:930:3: ( (lv_endTime_3_0= RULE_STRING ) )
            // InternalConferenceProgram.g:931:4: (lv_endTime_3_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:931:4: (lv_endTime_3_0= RULE_STRING )
            // InternalConferenceProgram.g:932:5: lv_endTime_3_0= RULE_STRING
            {
            lv_endTime_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_endTime_3_0, grammarAccess.getLunchAccess().getEndTimeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLunchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleLunch"


    // $ANTLR start "entryRuleSocialEvent"
    // InternalConferenceProgram.g:952:1: entryRuleSocialEvent returns [EObject current=null] : iv_ruleSocialEvent= ruleSocialEvent EOF ;
    public final EObject entryRuleSocialEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocialEvent = null;


        try {
            // InternalConferenceProgram.g:952:52: (iv_ruleSocialEvent= ruleSocialEvent EOF )
            // InternalConferenceProgram.g:953:2: iv_ruleSocialEvent= ruleSocialEvent EOF
            {
             newCompositeNode(grammarAccess.getSocialEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSocialEvent=ruleSocialEvent();

            state._fsp--;

             current =iv_ruleSocialEvent; 
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
    // $ANTLR end "entryRuleSocialEvent"


    // $ANTLR start "ruleSocialEvent"
    // InternalConferenceProgram.g:959:1: ruleSocialEvent returns [EObject current=null] : (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' ) ;
    public final EObject ruleSocialEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_4_0=null;
        Token lv_endTime_5_0=null;
        Token otherlv_7=null;
        EObject lv_location_3_0 = null;

        EObject lv_directions_6_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:965:2: ( (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:966:2: (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:966:2: (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:967:3: otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSocialEventAccess().getSocialEventKeyword_0());
            		
            // InternalConferenceProgram.g:971:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:972:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:972:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:973:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSocialEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSocialEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSocialEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:993:3: ( (lv_location_3_0= ruleLocation ) )
            // InternalConferenceProgram.g:994:4: (lv_location_3_0= ruleLocation )
            {
            // InternalConferenceProgram.g:994:4: (lv_location_3_0= ruleLocation )
            // InternalConferenceProgram.g:995:5: lv_location_3_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getSocialEventAccess().getLocationLocationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_location_3_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSocialEventRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_3_0,
            						"org.xtext.example.mydsl.ConferenceProgram.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConferenceProgram.g:1012:3: ( (lv_startTime_4_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1013:4: (lv_startTime_4_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1013:4: (lv_startTime_4_0= RULE_STRING )
            // InternalConferenceProgram.g:1014:5: lv_startTime_4_0= RULE_STRING
            {
            lv_startTime_4_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_4_0, grammarAccess.getSocialEventAccess().getStartTimeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSocialEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:1030:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1031:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1031:4: (lv_endTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:1032:5: lv_endTime_5_0= RULE_STRING
            {
            lv_endTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_endTime_5_0, grammarAccess.getSocialEventAccess().getEndTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSocialEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:1048:3: ( (lv_directions_6_0= ruleGoogleMapsDirections ) )
            // InternalConferenceProgram.g:1049:4: (lv_directions_6_0= ruleGoogleMapsDirections )
            {
            // InternalConferenceProgram.g:1049:4: (lv_directions_6_0= ruleGoogleMapsDirections )
            // InternalConferenceProgram.g:1050:5: lv_directions_6_0= ruleGoogleMapsDirections
            {

            					newCompositeNode(grammarAccess.getSocialEventAccess().getDirectionsGoogleMapsDirectionsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_directions_6_0=ruleGoogleMapsDirections();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSocialEventRule());
            					}
            					set(
            						current,
            						"directions",
            						lv_directions_6_0,
            						"org.xtext.example.mydsl.ConferenceProgram.GoogleMapsDirections");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSocialEventAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSocialEvent"


    // $ANTLR start "entryRuleGoogleMapsDirections"
    // InternalConferenceProgram.g:1075:1: entryRuleGoogleMapsDirections returns [EObject current=null] : iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF ;
    public final EObject entryRuleGoogleMapsDirections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoogleMapsDirections = null;


        try {
            // InternalConferenceProgram.g:1075:61: (iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF )
            // InternalConferenceProgram.g:1076:2: iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF
            {
             newCompositeNode(grammarAccess.getGoogleMapsDirectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoogleMapsDirections=ruleGoogleMapsDirections();

            state._fsp--;

             current =iv_ruleGoogleMapsDirections; 
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
    // $ANTLR end "entryRuleGoogleMapsDirections"


    // $ANTLR start "ruleGoogleMapsDirections"
    // InternalConferenceProgram.g:1082:1: ruleGoogleMapsDirections returns [EObject current=null] : (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleGoogleMapsDirections() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1088:2: ( (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalConferenceProgram.g:1089:2: (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalConferenceProgram.g:1089:2: (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalConferenceProgram.g:1090:3: otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGoogleMapsDirectionsAccess().getDirectionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGoogleMapsDirectionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalConferenceProgram.g:1098:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1099:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1099:4: (lv_url_2_0= RULE_STRING )
            // InternalConferenceProgram.g:1100:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_url_2_0, grammarAccess.getGoogleMapsDirectionsAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoogleMapsDirectionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGoogleMapsDirectionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGoogleMapsDirections"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C01002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001F0020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001E0020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}