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
    // InternalConferenceProgram.g:71:1: ruleConferenceProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_researchtracks_3_0= ruleResearchTrack ) ) ( (lv_industrytracks_4_0= ruleIndustryTrack ) )? ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )? ( (lv_panelstrack_6_0= rulePanelTrack ) )? ( (lv_socialEvents_7_0= ruleSocialEvent ) )* ( (lv_keynotes_8_0= ruleKeynote ) )* ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )* ( (lv_lunches_10_0= ruleLunch ) )* ) ;
    public final EObject ruleConferenceProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_date_2_0=null;
        EObject lv_researchtracks_3_0 = null;

        EObject lv_industrytracks_4_0 = null;

        EObject lv_demosandposterstrack_5_0 = null;

        EObject lv_panelstrack_6_0 = null;

        EObject lv_socialEvents_7_0 = null;

        EObject lv_keynotes_8_0 = null;

        EObject lv_coffebreaks_9_0 = null;

        EObject lv_lunches_10_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:77:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_researchtracks_3_0= ruleResearchTrack ) ) ( (lv_industrytracks_4_0= ruleIndustryTrack ) )? ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )? ( (lv_panelstrack_6_0= rulePanelTrack ) )? ( (lv_socialEvents_7_0= ruleSocialEvent ) )* ( (lv_keynotes_8_0= ruleKeynote ) )* ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )* ( (lv_lunches_10_0= ruleLunch ) )* ) )
            // InternalConferenceProgram.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_researchtracks_3_0= ruleResearchTrack ) ) ( (lv_industrytracks_4_0= ruleIndustryTrack ) )? ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )? ( (lv_panelstrack_6_0= rulePanelTrack ) )? ( (lv_socialEvents_7_0= ruleSocialEvent ) )* ( (lv_keynotes_8_0= ruleKeynote ) )* ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )* ( (lv_lunches_10_0= ruleLunch ) )* )
            {
            // InternalConferenceProgram.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_researchtracks_3_0= ruleResearchTrack ) ) ( (lv_industrytracks_4_0= ruleIndustryTrack ) )? ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )? ( (lv_panelstrack_6_0= rulePanelTrack ) )? ( (lv_socialEvents_7_0= ruleSocialEvent ) )* ( (lv_keynotes_8_0= ruleKeynote ) )* ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )* ( (lv_lunches_10_0= ruleLunch ) )* )
            // InternalConferenceProgram.g:79:3: otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_date_2_0= RULE_STRING ) ) ( (lv_researchtracks_3_0= ruleResearchTrack ) ) ( (lv_industrytracks_4_0= ruleIndustryTrack ) )? ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )? ( (lv_panelstrack_6_0= rulePanelTrack ) )? ( (lv_socialEvents_7_0= ruleSocialEvent ) )* ( (lv_keynotes_8_0= ruleKeynote ) )* ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )* ( (lv_lunches_10_0= ruleLunch ) )*
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

            // InternalConferenceProgram.g:119:3: ( (lv_researchtracks_3_0= ruleResearchTrack ) )
            // InternalConferenceProgram.g:120:4: (lv_researchtracks_3_0= ruleResearchTrack )
            {
            // InternalConferenceProgram.g:120:4: (lv_researchtracks_3_0= ruleResearchTrack )
            // InternalConferenceProgram.g:121:5: lv_researchtracks_3_0= ruleResearchTrack
            {

            					newCompositeNode(grammarAccess.getConferenceProgramAccess().getResearchtracksResearchTrackParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_researchtracks_3_0=ruleResearchTrack();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            					}
            					set(
            						current,
            						"researchtracks",
            						lv_researchtracks_3_0,
            						"org.xtext.example.mydsl.ConferenceProgram.ResearchTrack");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConferenceProgram.g:138:3: ( (lv_industrytracks_4_0= ruleIndustryTrack ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==13) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==15) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==RULE_ID) ) {
                                int LA1_6 = input.LA(6);

                                if ( (LA1_6==13) ) {
                                    int LA1_7 = input.LA(7);

                                    if ( (LA1_7==17) ) {
                                        alt1=1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            switch (alt1) {
                case 1 :
                    // InternalConferenceProgram.g:139:4: (lv_industrytracks_4_0= ruleIndustryTrack )
                    {
                    // InternalConferenceProgram.g:139:4: (lv_industrytracks_4_0= ruleIndustryTrack )
                    // InternalConferenceProgram.g:140:5: lv_industrytracks_4_0= ruleIndustryTrack
                    {

                    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getIndustrytracksIndustryTrackParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_industrytracks_4_0=ruleIndustryTrack();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
                    					}
                    					add(
                    						current,
                    						"industrytracks",
                    						lv_industrytracks_4_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.IndustryTrack");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:157:3: ( (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==13) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==15) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==RULE_ID) ) {
                                int LA2_6 = input.LA(6);

                                if ( (LA2_6==13) ) {
                                    int LA2_7 = input.LA(7);

                                    if ( (LA2_7==18) ) {
                                        alt2=1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalConferenceProgram.g:158:4: (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack )
                    {
                    // InternalConferenceProgram.g:158:4: (lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack )
                    // InternalConferenceProgram.g:159:5: lv_demosandposterstrack_5_0= ruleDemosAndPosterTrack
                    {

                    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackDemosAndPosterTrackParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_demosandposterstrack_5_0=ruleDemosAndPosterTrack();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
                    					}
                    					add(
                    						current,
                    						"demosandposterstrack",
                    						lv_demosandposterstrack_5_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.DemosAndPosterTrack");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:176:3: ( (lv_panelstrack_6_0= rulePanelTrack ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConferenceProgram.g:177:4: (lv_panelstrack_6_0= rulePanelTrack )
                    {
                    // InternalConferenceProgram.g:177:4: (lv_panelstrack_6_0= rulePanelTrack )
                    // InternalConferenceProgram.g:178:5: lv_panelstrack_6_0= rulePanelTrack
                    {

                    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getPanelstrackPanelTrackParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_panelstrack_6_0=rulePanelTrack();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
                    					}
                    					add(
                    						current,
                    						"panelstrack",
                    						lv_panelstrack_6_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.PanelTrack");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:195:3: ( (lv_socialEvents_7_0= ruleSocialEvent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalConferenceProgram.g:196:4: (lv_socialEvents_7_0= ruleSocialEvent )
            	    {
            	    // InternalConferenceProgram.g:196:4: (lv_socialEvents_7_0= ruleSocialEvent )
            	    // InternalConferenceProgram.g:197:5: lv_socialEvents_7_0= ruleSocialEvent
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_socialEvents_7_0=ruleSocialEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"socialEvents",
            	    						lv_socialEvents_7_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.SocialEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalConferenceProgram.g:214:3: ( (lv_keynotes_8_0= ruleKeynote ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConferenceProgram.g:215:4: (lv_keynotes_8_0= ruleKeynote )
            	    {
            	    // InternalConferenceProgram.g:215:4: (lv_keynotes_8_0= ruleKeynote )
            	    // InternalConferenceProgram.g:216:5: lv_keynotes_8_0= ruleKeynote
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_keynotes_8_0=ruleKeynote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"keynotes",
            	    						lv_keynotes_8_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Keynote");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalConferenceProgram.g:233:3: ( (lv_coffebreaks_9_0= ruleCoffeBreak ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalConferenceProgram.g:234:4: (lv_coffebreaks_9_0= ruleCoffeBreak )
            	    {
            	    // InternalConferenceProgram.g:234:4: (lv_coffebreaks_9_0= ruleCoffeBreak )
            	    // InternalConferenceProgram.g:235:5: lv_coffebreaks_9_0= ruleCoffeBreak
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_coffebreaks_9_0=ruleCoffeBreak();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"coffebreaks",
            	    						lv_coffebreaks_9_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.CoffeBreak");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalConferenceProgram.g:252:3: ( (lv_lunches_10_0= ruleLunch ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConferenceProgram.g:253:4: (lv_lunches_10_0= ruleLunch )
            	    {
            	    // InternalConferenceProgram.g:253:4: (lv_lunches_10_0= ruleLunch )
            	    // InternalConferenceProgram.g:254:5: lv_lunches_10_0= ruleLunch
            	    {

            	    					newCompositeNode(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_lunches_10_0=ruleLunch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lunches",
            	    						lv_lunches_10_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Lunch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleResearchTrack"
    // InternalConferenceProgram.g:275:1: entryRuleResearchTrack returns [EObject current=null] : iv_ruleResearchTrack= ruleResearchTrack EOF ;
    public final EObject entryRuleResearchTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchTrack = null;


        try {
            // InternalConferenceProgram.g:275:54: (iv_ruleResearchTrack= ruleResearchTrack EOF )
            // InternalConferenceProgram.g:276:2: iv_ruleResearchTrack= ruleResearchTrack EOF
            {
             newCompositeNode(grammarAccess.getResearchTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResearchTrack=ruleResearchTrack();

            state._fsp--;

             current =iv_ruleResearchTrack; 
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
    // $ANTLR end "entryRuleResearchTrack"


    // $ANTLR start "ruleResearchTrack"
    // InternalConferenceProgram.g:282:1: ruleResearchTrack returns [EObject current=null] : (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchsession_3_0= ruleResearchSession ) )+ otherlv_4= '}' ) ;
    public final EObject ruleResearchTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_researchsession_3_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:288:2: ( (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchsession_3_0= ruleResearchSession ) )+ otherlv_4= '}' ) )
            // InternalConferenceProgram.g:289:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchsession_3_0= ruleResearchSession ) )+ otherlv_4= '}' )
            {
            // InternalConferenceProgram.g:289:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchsession_3_0= ruleResearchSession ) )+ otherlv_4= '}' )
            // InternalConferenceProgram.g:290:3: otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchsession_3_0= ruleResearchSession ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResearchTrackAccess().getTrackKeyword_0());
            		
            // InternalConferenceProgram.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResearchTrackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchTrackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getResearchTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:316:3: ( (lv_researchsession_3_0= ruleResearchSession ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConferenceProgram.g:317:4: (lv_researchsession_3_0= ruleResearchSession )
            	    {
            	    // InternalConferenceProgram.g:317:4: (lv_researchsession_3_0= ruleResearchSession )
            	    // InternalConferenceProgram.g:318:5: lv_researchsession_3_0= ruleResearchSession
            	    {

            	    					newCompositeNode(grammarAccess.getResearchTrackAccess().getResearchsessionResearchSessionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_researchsession_3_0=ruleResearchSession();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResearchTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"researchsession",
            	    						lv_researchsession_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.ResearchSession");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getResearchTrackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleResearchTrack"


    // $ANTLR start "entryRuleIndustryTrack"
    // InternalConferenceProgram.g:343:1: entryRuleIndustryTrack returns [EObject current=null] : iv_ruleIndustryTrack= ruleIndustryTrack EOF ;
    public final EObject entryRuleIndustryTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndustryTrack = null;


        try {
            // InternalConferenceProgram.g:343:54: (iv_ruleIndustryTrack= ruleIndustryTrack EOF )
            // InternalConferenceProgram.g:344:2: iv_ruleIndustryTrack= ruleIndustryTrack EOF
            {
             newCompositeNode(grammarAccess.getIndustryTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndustryTrack=ruleIndustryTrack();

            state._fsp--;

             current =iv_ruleIndustryTrack; 
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
    // $ANTLR end "entryRuleIndustryTrack"


    // $ANTLR start "ruleIndustryTrack"
    // InternalConferenceProgram.g:350:1: ruleIndustryTrack returns [EObject current=null] : (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_indutrysession_3_0= ruleIndustrySession ) )+ otherlv_4= '}' ) ;
    public final EObject ruleIndustryTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_indutrysession_3_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:356:2: ( (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_indutrysession_3_0= ruleIndustrySession ) )+ otherlv_4= '}' ) )
            // InternalConferenceProgram.g:357:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_indutrysession_3_0= ruleIndustrySession ) )+ otherlv_4= '}' )
            {
            // InternalConferenceProgram.g:357:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_indutrysession_3_0= ruleIndustrySession ) )+ otherlv_4= '}' )
            // InternalConferenceProgram.g:358:3: otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_indutrysession_3_0= ruleIndustrySession ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndustryTrackAccess().getTrackKeyword_0());
            		
            // InternalConferenceProgram.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndustryTrackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndustryTrackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIndustryTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:384:3: ( (lv_indutrysession_3_0= ruleIndustrySession ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConferenceProgram.g:385:4: (lv_indutrysession_3_0= ruleIndustrySession )
            	    {
            	    // InternalConferenceProgram.g:385:4: (lv_indutrysession_3_0= ruleIndustrySession )
            	    // InternalConferenceProgram.g:386:5: lv_indutrysession_3_0= ruleIndustrySession
            	    {

            	    					newCompositeNode(grammarAccess.getIndustryTrackAccess().getIndutrysessionIndustrySessionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_indutrysession_3_0=ruleIndustrySession();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIndustryTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"indutrysession",
            	    						lv_indutrysession_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.IndustrySession");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIndustryTrackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIndustryTrack"


    // $ANTLR start "entryRuleDemosAndPosterTrack"
    // InternalConferenceProgram.g:411:1: entryRuleDemosAndPosterTrack returns [EObject current=null] : iv_ruleDemosAndPosterTrack= ruleDemosAndPosterTrack EOF ;
    public final EObject entryRuleDemosAndPosterTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemosAndPosterTrack = null;


        try {
            // InternalConferenceProgram.g:411:60: (iv_ruleDemosAndPosterTrack= ruleDemosAndPosterTrack EOF )
            // InternalConferenceProgram.g:412:2: iv_ruleDemosAndPosterTrack= ruleDemosAndPosterTrack EOF
            {
             newCompositeNode(grammarAccess.getDemosAndPosterTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDemosAndPosterTrack=ruleDemosAndPosterTrack();

            state._fsp--;

             current =iv_ruleDemosAndPosterTrack; 
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
    // $ANTLR end "entryRuleDemosAndPosterTrack"


    // $ANTLR start "ruleDemosAndPosterTrack"
    // InternalConferenceProgram.g:418:1: ruleDemosAndPosterTrack returns [EObject current=null] : (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demosession_3_0= ruleDemoSession ) )+ otherlv_4= '}' ) ;
    public final EObject ruleDemosAndPosterTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_demosession_3_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:424:2: ( (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demosession_3_0= ruleDemoSession ) )+ otherlv_4= '}' ) )
            // InternalConferenceProgram.g:425:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demosession_3_0= ruleDemoSession ) )+ otherlv_4= '}' )
            {
            // InternalConferenceProgram.g:425:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demosession_3_0= ruleDemoSession ) )+ otherlv_4= '}' )
            // InternalConferenceProgram.g:426:3: otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demosession_3_0= ruleDemoSession ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDemosAndPosterTrackAccess().getTrackKeyword_0());
            		
            // InternalConferenceProgram.g:430:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:431:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:431:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:432:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDemosAndPosterTrackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemosAndPosterTrackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDemosAndPosterTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:452:3: ( (lv_demosession_3_0= ruleDemoSession ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConferenceProgram.g:453:4: (lv_demosession_3_0= ruleDemoSession )
            	    {
            	    // InternalConferenceProgram.g:453:4: (lv_demosession_3_0= ruleDemoSession )
            	    // InternalConferenceProgram.g:454:5: lv_demosession_3_0= ruleDemoSession
            	    {

            	    					newCompositeNode(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionDemoSessionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_demosession_3_0=ruleDemoSession();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDemosAndPosterTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"demosession",
            	    						lv_demosession_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.DemoSession");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDemosAndPosterTrackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDemosAndPosterTrack"


    // $ANTLR start "entryRulePanelTrack"
    // InternalConferenceProgram.g:479:1: entryRulePanelTrack returns [EObject current=null] : iv_rulePanelTrack= rulePanelTrack EOF ;
    public final EObject entryRulePanelTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanelTrack = null;


        try {
            // InternalConferenceProgram.g:479:51: (iv_rulePanelTrack= rulePanelTrack EOF )
            // InternalConferenceProgram.g:480:2: iv_rulePanelTrack= rulePanelTrack EOF
            {
             newCompositeNode(grammarAccess.getPanelTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanelTrack=rulePanelTrack();

            state._fsp--;

             current =iv_rulePanelTrack; 
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
    // $ANTLR end "entryRulePanelTrack"


    // $ANTLR start "rulePanelTrack"
    // InternalConferenceProgram.g:486:1: rulePanelTrack returns [EObject current=null] : (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panelsession_3_0= rulePanelSession ) )+ otherlv_4= '}' ) ;
    public final EObject rulePanelTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_panelsession_3_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:492:2: ( (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panelsession_3_0= rulePanelSession ) )+ otherlv_4= '}' ) )
            // InternalConferenceProgram.g:493:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panelsession_3_0= rulePanelSession ) )+ otherlv_4= '}' )
            {
            // InternalConferenceProgram.g:493:2: (otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panelsession_3_0= rulePanelSession ) )+ otherlv_4= '}' )
            // InternalConferenceProgram.g:494:3: otherlv_0= 'Track' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panelsession_3_0= rulePanelSession ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelTrackAccess().getTrackKeyword_0());
            		
            // InternalConferenceProgram.g:498:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:499:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:499:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:500:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPanelTrackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelTrackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPanelTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:520:3: ( (lv_panelsession_3_0= rulePanelSession ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalConferenceProgram.g:521:4: (lv_panelsession_3_0= rulePanelSession )
            	    {
            	    // InternalConferenceProgram.g:521:4: (lv_panelsession_3_0= rulePanelSession )
            	    // InternalConferenceProgram.g:522:5: lv_panelsession_3_0= rulePanelSession
            	    {

            	    					newCompositeNode(grammarAccess.getPanelTrackAccess().getPanelsessionPanelSessionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_panelsession_3_0=rulePanelSession();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPanelTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"panelsession",
            	    						lv_panelsession_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.PanelSession");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPanelTrackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePanelTrack"


    // $ANTLR start "entryRuleResearchSession"
    // InternalConferenceProgram.g:547:1: entryRuleResearchSession returns [EObject current=null] : iv_ruleResearchSession= ruleResearchSession EOF ;
    public final EObject entryRuleResearchSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchSession = null;


        try {
            // InternalConferenceProgram.g:547:56: (iv_ruleResearchSession= ruleResearchSession EOF )
            // InternalConferenceProgram.g:548:2: iv_ruleResearchSession= ruleResearchSession EOF
            {
             newCompositeNode(grammarAccess.getResearchSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResearchSession=ruleResearchSession();

            state._fsp--;

             current =iv_ruleResearchSession; 
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
    // $ANTLR end "entryRuleResearchSession"


    // $ANTLR start "ruleResearchSession"
    // InternalConferenceProgram.g:554:1: ruleResearchSession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleResearchSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_5_0=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        EObject lv_researchpaper_3_0 = null;

        EObject lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:560:2: ( (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:561:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:561:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:562:3: otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_researchpaper_3_0= ruleResearchPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResearchSessionAccess().getSessionKeyword_0());
            		
            // InternalConferenceProgram.g:566:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:567:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:567:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:568:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResearchSessionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getResearchSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:588:3: ( (lv_researchpaper_3_0= ruleResearchPaper ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalConferenceProgram.g:589:4: (lv_researchpaper_3_0= ruleResearchPaper )
            	    {
            	    // InternalConferenceProgram.g:589:4: (lv_researchpaper_3_0= ruleResearchPaper )
            	    // InternalConferenceProgram.g:590:5: lv_researchpaper_3_0= ruleResearchPaper
            	    {

            	    					newCompositeNode(grammarAccess.getResearchSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_researchpaper_3_0=ruleResearchPaper();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResearchSessionRule());
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalConferenceProgram.g:607:3: ( (lv_location_4_0= ruleLocation ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConferenceProgram.g:608:4: (lv_location_4_0= ruleLocation )
                    {
                    // InternalConferenceProgram.g:608:4: (lv_location_4_0= ruleLocation )
                    // InternalConferenceProgram.g:609:5: lv_location_4_0= ruleLocation
                    {

                    					newCompositeNode(grammarAccess.getResearchSessionAccess().getLocationLocationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_location_4_0=ruleLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getResearchSessionRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_4_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.Location");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:626:3: ( (lv_startTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:627:4: (lv_startTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:627:4: (lv_startTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:628:5: lv_startTime_5_0= RULE_STRING
            {
            lv_startTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_5_0, grammarAccess.getResearchSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:644:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalConferenceProgram.g:645:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:645:4: (lv_endTime_6_0= RULE_STRING )
            // InternalConferenceProgram.g:646:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getResearchSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getResearchSessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleResearchSession"


    // $ANTLR start "entryRuleIndustrySession"
    // InternalConferenceProgram.g:670:1: entryRuleIndustrySession returns [EObject current=null] : iv_ruleIndustrySession= ruleIndustrySession EOF ;
    public final EObject entryRuleIndustrySession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndustrySession = null;


        try {
            // InternalConferenceProgram.g:670:56: (iv_ruleIndustrySession= ruleIndustrySession EOF )
            // InternalConferenceProgram.g:671:2: iv_ruleIndustrySession= ruleIndustrySession EOF
            {
             newCompositeNode(grammarAccess.getIndustrySessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndustrySession=ruleIndustrySession();

            state._fsp--;

             current =iv_ruleIndustrySession; 
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
    // $ANTLR end "entryRuleIndustrySession"


    // $ANTLR start "ruleIndustrySession"
    // InternalConferenceProgram.g:677:1: ruleIndustrySession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleIndustrySession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_5_0=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        EObject lv_industrypaper_3_0 = null;

        EObject lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:683:2: ( (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:684:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:684:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:685:3: otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndustrySessionAccess().getSessionKeyword_0());
            		
            // InternalConferenceProgram.g:689:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:690:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:690:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:691:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndustrySessionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndustrySessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getIndustrySessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:711:3: ( (lv_industrypaper_3_0= ruleIndustryPaper ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalConferenceProgram.g:712:4: (lv_industrypaper_3_0= ruleIndustryPaper )
            	    {
            	    // InternalConferenceProgram.g:712:4: (lv_industrypaper_3_0= ruleIndustryPaper )
            	    // InternalConferenceProgram.g:713:5: lv_industrypaper_3_0= ruleIndustryPaper
            	    {

            	    					newCompositeNode(grammarAccess.getIndustrySessionAccess().getIndustrypaperIndustryPaperParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_industrypaper_3_0=ruleIndustryPaper();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIndustrySessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"industrypaper",
            	    						lv_industrypaper_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.IndustryPaper");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalConferenceProgram.g:730:3: ( (lv_location_4_0= ruleLocation ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalConferenceProgram.g:731:4: (lv_location_4_0= ruleLocation )
                    {
                    // InternalConferenceProgram.g:731:4: (lv_location_4_0= ruleLocation )
                    // InternalConferenceProgram.g:732:5: lv_location_4_0= ruleLocation
                    {

                    					newCompositeNode(grammarAccess.getIndustrySessionAccess().getLocationLocationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_location_4_0=ruleLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIndustrySessionRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_4_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.Location");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:749:3: ( (lv_startTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:750:4: (lv_startTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:750:4: (lv_startTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:751:5: lv_startTime_5_0= RULE_STRING
            {
            lv_startTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_5_0, grammarAccess.getIndustrySessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndustrySessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:767:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalConferenceProgram.g:768:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:768:4: (lv_endTime_6_0= RULE_STRING )
            // InternalConferenceProgram.g:769:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getIndustrySessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndustrySessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIndustrySessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIndustrySession"


    // $ANTLR start "entryRuleDemoSession"
    // InternalConferenceProgram.g:793:1: entryRuleDemoSession returns [EObject current=null] : iv_ruleDemoSession= ruleDemoSession EOF ;
    public final EObject entryRuleDemoSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemoSession = null;


        try {
            // InternalConferenceProgram.g:793:52: (iv_ruleDemoSession= ruleDemoSession EOF )
            // InternalConferenceProgram.g:794:2: iv_ruleDemoSession= ruleDemoSession EOF
            {
             newCompositeNode(grammarAccess.getDemoSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDemoSession=ruleDemoSession();

            state._fsp--;

             current =iv_ruleDemoSession; 
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
    // $ANTLR end "entryRuleDemoSession"


    // $ANTLR start "ruleDemoSession"
    // InternalConferenceProgram.g:800:1: ruleDemoSession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleDemoSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_5_0=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        EObject lv_demoandposter_3_0 = null;

        EObject lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:806:2: ( (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:807:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:807:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:808:3: otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDemoSessionAccess().getSessionKeyword_0());
            		
            // InternalConferenceProgram.g:812:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:813:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:813:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:814:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDemoSessionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemoSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getDemoSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:834:3: ( (lv_demoandposter_3_0= ruleDemoAndPoster ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalConferenceProgram.g:835:4: (lv_demoandposter_3_0= ruleDemoAndPoster )
            	    {
            	    // InternalConferenceProgram.g:835:4: (lv_demoandposter_3_0= ruleDemoAndPoster )
            	    // InternalConferenceProgram.g:836:5: lv_demoandposter_3_0= ruleDemoAndPoster
            	    {

            	    					newCompositeNode(grammarAccess.getDemoSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_demoandposter_3_0=ruleDemoAndPoster();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDemoSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"demoandposter",
            	    						lv_demoandposter_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.DemoAndPoster");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalConferenceProgram.g:853:3: ( (lv_location_4_0= ruleLocation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalConferenceProgram.g:854:4: (lv_location_4_0= ruleLocation )
                    {
                    // InternalConferenceProgram.g:854:4: (lv_location_4_0= ruleLocation )
                    // InternalConferenceProgram.g:855:5: lv_location_4_0= ruleLocation
                    {

                    					newCompositeNode(grammarAccess.getDemoSessionAccess().getLocationLocationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_location_4_0=ruleLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDemoSessionRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_4_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.Location");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:872:3: ( (lv_startTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:873:4: (lv_startTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:873:4: (lv_startTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:874:5: lv_startTime_5_0= RULE_STRING
            {
            lv_startTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_5_0, grammarAccess.getDemoSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemoSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:890:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalConferenceProgram.g:891:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:891:4: (lv_endTime_6_0= RULE_STRING )
            // InternalConferenceProgram.g:892:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getDemoSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemoSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDemoSessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDemoSession"


    // $ANTLR start "entryRulePanelSession"
    // InternalConferenceProgram.g:916:1: entryRulePanelSession returns [EObject current=null] : iv_rulePanelSession= rulePanelSession EOF ;
    public final EObject entryRulePanelSession() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanelSession = null;


        try {
            // InternalConferenceProgram.g:916:53: (iv_rulePanelSession= rulePanelSession EOF )
            // InternalConferenceProgram.g:917:2: iv_rulePanelSession= rulePanelSession EOF
            {
             newCompositeNode(grammarAccess.getPanelSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanelSession=rulePanelSession();

            state._fsp--;

             current =iv_rulePanelSession; 
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
    // $ANTLR end "entryRulePanelSession"


    // $ANTLR start "rulePanelSession"
    // InternalConferenceProgram.g:923:1: rulePanelSession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject rulePanelSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_5_0=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        EObject lv_panel_3_0 = null;

        EObject lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:929:2: ( (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:930:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:930:2: (otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:931:3: otherlv_0= 'Session' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) )+ ( (lv_location_4_0= ruleLocation ) )? ( (lv_startTime_5_0= RULE_STRING ) ) ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelSessionAccess().getSessionKeyword_0());
            		
            // InternalConferenceProgram.g:935:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:936:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:936:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:937:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPanelSessionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPanelSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:957:3: ( (lv_panel_3_0= rulePanel ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalConferenceProgram.g:958:4: (lv_panel_3_0= rulePanel )
            	    {
            	    // InternalConferenceProgram.g:958:4: (lv_panel_3_0= rulePanel )
            	    // InternalConferenceProgram.g:959:5: lv_panel_3_0= rulePanel
            	    {

            	    					newCompositeNode(grammarAccess.getPanelSessionAccess().getPanelPanelParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_panel_3_0=rulePanel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPanelSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"panel",
            	    						lv_panel_3_0,
            	    						"org.xtext.example.mydsl.ConferenceProgram.Panel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalConferenceProgram.g:976:3: ( (lv_location_4_0= ruleLocation ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalConferenceProgram.g:977:4: (lv_location_4_0= ruleLocation )
                    {
                    // InternalConferenceProgram.g:977:4: (lv_location_4_0= ruleLocation )
                    // InternalConferenceProgram.g:978:5: lv_location_4_0= ruleLocation
                    {

                    					newCompositeNode(grammarAccess.getPanelSessionAccess().getLocationLocationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_location_4_0=ruleLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPanelSessionRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_4_0,
                    						"org.xtext.example.mydsl.ConferenceProgram.Location");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalConferenceProgram.g:995:3: ( (lv_startTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:996:4: (lv_startTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:996:4: (lv_startTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:997:5: lv_startTime_5_0= RULE_STRING
            {
            lv_startTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_startTime_5_0, grammarAccess.getPanelSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalConferenceProgram.g:1013:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1014:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1014:4: (lv_endTime_6_0= RULE_STRING )
            // InternalConferenceProgram.g:1015:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getPanelSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPanelSessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePanelSession"


    // $ANTLR start "entryRuleResearchPaper"
    // InternalConferenceProgram.g:1039:1: entryRuleResearchPaper returns [EObject current=null] : iv_ruleResearchPaper= ruleResearchPaper EOF ;
    public final EObject entryRuleResearchPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchPaper = null;


        try {
            // InternalConferenceProgram.g:1039:54: (iv_ruleResearchPaper= ruleResearchPaper EOF )
            // InternalConferenceProgram.g:1040:2: iv_ruleResearchPaper= ruleResearchPaper EOF
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
    // InternalConferenceProgram.g:1046:1: ruleResearchPaper returns [EObject current=null] : (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResearchPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1052:2: ( (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1053:2: (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1053:2: (otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1054:3: otherlv_0= 'Paper' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResearchPaperAccess().getPaperKeyword_0());
            		
            // InternalConferenceProgram.g:1058:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1059:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1059:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1060:5: lv_name_1_0= RULE_ID
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
    // InternalConferenceProgram.g:1080:1: entryRuleIndustryPaper returns [EObject current=null] : iv_ruleIndustryPaper= ruleIndustryPaper EOF ;
    public final EObject entryRuleIndustryPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndustryPaper = null;


        try {
            // InternalConferenceProgram.g:1080:54: (iv_ruleIndustryPaper= ruleIndustryPaper EOF )
            // InternalConferenceProgram.g:1081:2: iv_ruleIndustryPaper= ruleIndustryPaper EOF
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
    // InternalConferenceProgram.g:1087:1: ruleIndustryPaper returns [EObject current=null] : (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIndustryPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1093:2: ( (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1094:2: (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1094:2: (otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1095:3: otherlv_0= 'IndustryPaper' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndustryPaperAccess().getIndustryPaperKeyword_0());
            		
            // InternalConferenceProgram.g:1099:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1100:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1101:5: lv_name_1_0= RULE_ID
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
    // InternalConferenceProgram.g:1121:1: entryRuleDemoAndPoster returns [EObject current=null] : iv_ruleDemoAndPoster= ruleDemoAndPoster EOF ;
    public final EObject entryRuleDemoAndPoster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemoAndPoster = null;


        try {
            // InternalConferenceProgram.g:1121:54: (iv_ruleDemoAndPoster= ruleDemoAndPoster EOF )
            // InternalConferenceProgram.g:1122:2: iv_ruleDemoAndPoster= ruleDemoAndPoster EOF
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
    // InternalConferenceProgram.g:1128:1: ruleDemoAndPoster returns [EObject current=null] : (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDemoAndPoster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1134:2: ( (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1135:2: (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1135:2: (otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1136:3: otherlv_0= 'DemoAndPoster' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDemoAndPosterAccess().getDemoAndPosterKeyword_0());
            		
            // InternalConferenceProgram.g:1140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1141:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1142:5: lv_name_1_0= RULE_ID
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
    // InternalConferenceProgram.g:1162:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalConferenceProgram.g:1162:46: (iv_rulePanel= rulePanel EOF )
            // InternalConferenceProgram.g:1163:2: iv_rulePanel= rulePanel EOF
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
    // InternalConferenceProgram.g:1169:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1175:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1176:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1176:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1177:3: otherlv_0= 'Panel' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalConferenceProgram.g:1181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1182:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1183:5: lv_name_1_0= RULE_ID
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
    // InternalConferenceProgram.g:1203:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalConferenceProgram.g:1203:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalConferenceProgram.g:1204:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalConferenceProgram.g:1210:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_room_2_0 = null;



        	enterRule();

        try {
            // InternalConferenceProgram.g:1216:2: ( (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' ) )
            // InternalConferenceProgram.g:1217:2: (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' )
            {
            // InternalConferenceProgram.g:1217:2: (otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}' )
            // InternalConferenceProgram.g:1218:3: otherlv_0= 'Location' otherlv_1= '{' ( (lv_room_2_0= ruleRoom ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalConferenceProgram.g:1226:3: ( (lv_room_2_0= ruleRoom ) )
            // InternalConferenceProgram.g:1227:4: (lv_room_2_0= ruleRoom )
            {
            // InternalConferenceProgram.g:1227:4: (lv_room_2_0= ruleRoom )
            // InternalConferenceProgram.g:1228:5: lv_room_2_0= ruleRoom
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getRoomRoomParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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
    // InternalConferenceProgram.g:1253:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalConferenceProgram.g:1253:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalConferenceProgram.g:1254:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalConferenceProgram.g:1260:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1266:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1267:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1267:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1268:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalConferenceProgram.g:1272:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1273:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1273:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1274:5: lv_name_1_0= RULE_ID
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
    // InternalConferenceProgram.g:1294:1: entryRuleKeynote returns [EObject current=null] : iv_ruleKeynote= ruleKeynote EOF ;
    public final EObject entryRuleKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeynote = null;


        try {
            // InternalConferenceProgram.g:1294:48: (iv_ruleKeynote= ruleKeynote EOF )
            // InternalConferenceProgram.g:1295:2: iv_ruleKeynote= ruleKeynote EOF
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
    // InternalConferenceProgram.g:1301:1: ruleKeynote returns [EObject current=null] : (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1307:2: ( (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1308:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1308:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1309:3: otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKeynoteAccess().getKeynoteKeyword_0());
            		
            // InternalConferenceProgram.g:1313:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1314:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1314:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1315:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalConferenceProgram.g:1335:1: entryRuleCoffeBreak returns [EObject current=null] : iv_ruleCoffeBreak= ruleCoffeBreak EOF ;
    public final EObject entryRuleCoffeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeBreak = null;


        try {
            // InternalConferenceProgram.g:1335:51: (iv_ruleCoffeBreak= ruleCoffeBreak EOF )
            // InternalConferenceProgram.g:1336:2: iv_ruleCoffeBreak= ruleCoffeBreak EOF
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
    // InternalConferenceProgram.g:1342:1: ruleCoffeBreak returns [EObject current=null] : (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCoffeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1348:2: ( (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1349:2: (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1349:2: (otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1350:3: otherlv_0= 'Break' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeBreakAccess().getBreakKeyword_0());
            		
            // InternalConferenceProgram.g:1354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1355:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalConferenceProgram.g:1376:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalConferenceProgram.g:1376:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalConferenceProgram.g:1377:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalConferenceProgram.g:1383:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1389:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalConferenceProgram.g:1390:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalConferenceProgram.g:1390:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalConferenceProgram.g:1391:3: otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalConferenceProgram.g:1395:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1396:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1396:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1397:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalConferenceProgram.g:1417:1: entryRuleSocialEvent returns [EObject current=null] : iv_ruleSocialEvent= ruleSocialEvent EOF ;
    public final EObject entryRuleSocialEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocialEvent = null;


        try {
            // InternalConferenceProgram.g:1417:52: (iv_ruleSocialEvent= ruleSocialEvent EOF )
            // InternalConferenceProgram.g:1418:2: iv_ruleSocialEvent= ruleSocialEvent EOF
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
    // InternalConferenceProgram.g:1424:1: ruleSocialEvent returns [EObject current=null] : (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' ) ;
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
            // InternalConferenceProgram.g:1430:2: ( (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' ) )
            // InternalConferenceProgram.g:1431:2: (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' )
            {
            // InternalConferenceProgram.g:1431:2: (otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}' )
            // InternalConferenceProgram.g:1432:3: otherlv_0= 'SocialEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_location_3_0= ruleLocation ) ) ( (lv_startTime_4_0= RULE_STRING ) ) ( (lv_endTime_5_0= RULE_STRING ) ) ( (lv_directions_6_0= ruleGoogleMapsDirections ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSocialEventAccess().getSocialEventKeyword_0());
            		
            // InternalConferenceProgram.g:1436:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConferenceProgram.g:1437:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConferenceProgram.g:1437:4: (lv_name_1_0= RULE_ID )
            // InternalConferenceProgram.g:1438:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSocialEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConferenceProgram.g:1458:3: ( (lv_location_3_0= ruleLocation ) )
            // InternalConferenceProgram.g:1459:4: (lv_location_3_0= ruleLocation )
            {
            // InternalConferenceProgram.g:1459:4: (lv_location_3_0= ruleLocation )
            // InternalConferenceProgram.g:1460:5: lv_location_3_0= ruleLocation
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

            // InternalConferenceProgram.g:1477:3: ( (lv_startTime_4_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1478:4: (lv_startTime_4_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1478:4: (lv_startTime_4_0= RULE_STRING )
            // InternalConferenceProgram.g:1479:5: lv_startTime_4_0= RULE_STRING
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

            // InternalConferenceProgram.g:1495:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1496:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1496:4: (lv_endTime_5_0= RULE_STRING )
            // InternalConferenceProgram.g:1497:5: lv_endTime_5_0= RULE_STRING
            {
            lv_endTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalConferenceProgram.g:1513:3: ( (lv_directions_6_0= ruleGoogleMapsDirections ) )
            // InternalConferenceProgram.g:1514:4: (lv_directions_6_0= ruleGoogleMapsDirections )
            {
            // InternalConferenceProgram.g:1514:4: (lv_directions_6_0= ruleGoogleMapsDirections )
            // InternalConferenceProgram.g:1515:5: lv_directions_6_0= ruleGoogleMapsDirections
            {

            					newCompositeNode(grammarAccess.getSocialEventAccess().getDirectionsGoogleMapsDirectionsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
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
    // InternalConferenceProgram.g:1540:1: entryRuleGoogleMapsDirections returns [EObject current=null] : iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF ;
    public final EObject entryRuleGoogleMapsDirections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoogleMapsDirections = null;


        try {
            // InternalConferenceProgram.g:1540:61: (iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF )
            // InternalConferenceProgram.g:1541:2: iv_ruleGoogleMapsDirections= ruleGoogleMapsDirections EOF
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
    // InternalConferenceProgram.g:1547:1: ruleGoogleMapsDirections returns [EObject current=null] : (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleGoogleMapsDirections() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalConferenceProgram.g:1553:2: ( (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalConferenceProgram.g:1554:2: (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalConferenceProgram.g:1554:2: (otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalConferenceProgram.g:1555:3: otherlv_0= 'Directions' otherlv_1= '{' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGoogleMapsDirectionsAccess().getDirectionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGoogleMapsDirectionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalConferenceProgram.g:1563:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalConferenceProgram.g:1564:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalConferenceProgram.g:1564:4: (lv_url_2_0= RULE_STRING )
            // InternalConferenceProgram.g:1565:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000120020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});

}