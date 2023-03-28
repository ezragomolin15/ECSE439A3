/*
 * generated by Xtext 2.30.0
 */
grammar InternalConferenceProgram;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleConferenceProgram
entryRuleConferenceProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConferenceProgramRule()); }
	iv_ruleConferenceProgram=ruleConferenceProgram
	{ $current=$iv_ruleConferenceProgram.current; }
	EOF;

// Rule ConferenceProgram
ruleConferenceProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Program'
		{
			newLeafNode(otherlv_0, grammarAccess.getConferenceProgramAccess().getProgramKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConferenceProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConferenceProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_date_2_0=RULE_STRING
				{
					newLeafNode(lv_date_2_0, grammarAccess.getConferenceProgramAccess().getDateSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConferenceProgramRule());
					}
					setWithLastConsumed(
						$current,
						"date",
						lv_date_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getResearchtracksResearchTrackParserRuleCall_3_0());
				}
				lv_researchtracks_3_0=ruleResearchTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					set(
						$current,
						"researchtracks",
						lv_researchtracks_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.ResearchTrack");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getIndustrytracksIndustryTrackParserRuleCall_4_0());
				}
				lv_industrytracks_4_0=ruleIndustryTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"industrytracks",
						lv_industrytracks_4_0,
						"org.xtext.example.mydsl.ConferenceProgram.IndustryTrack");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackDemosAndPosterTrackParserRuleCall_5_0());
				}
				lv_demosandposterstrack_5_0=ruleDemosAndPosterTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"demosandposterstrack",
						lv_demosandposterstrack_5_0,
						"org.xtext.example.mydsl.ConferenceProgram.DemosAndPosterTrack");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getPanelstrackPanelTrackParserRuleCall_6_0());
				}
				lv_panelstrack_6_0=rulePanelTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"panelstrack",
						lv_panelstrack_6_0,
						"org.xtext.example.mydsl.ConferenceProgram.PanelTrack");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_7_0());
				}
				lv_socialEvents_7_0=ruleSocialEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"socialEvents",
						lv_socialEvents_7_0,
						"org.xtext.example.mydsl.ConferenceProgram.SocialEvent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_8_0());
				}
				lv_keynotes_8_0=ruleKeynote
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"keynotes",
						lv_keynotes_8_0,
						"org.xtext.example.mydsl.ConferenceProgram.Keynote");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_9_0());
				}
				lv_coffebreaks_9_0=ruleCoffeBreak
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"coffebreaks",
						lv_coffebreaks_9_0,
						"org.xtext.example.mydsl.ConferenceProgram.CoffeBreak");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_10_0());
				}
				lv_lunches_10_0=ruleLunch
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConferenceProgramRule());
					}
					add(
						$current,
						"lunches",
						lv_lunches_10_0,
						"org.xtext.example.mydsl.ConferenceProgram.Lunch");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleResearchTrack
entryRuleResearchTrack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResearchTrackRule()); }
	iv_ruleResearchTrack=ruleResearchTrack
	{ $current=$iv_ruleResearchTrack.current; }
	EOF;

// Rule ResearchTrack
ruleResearchTrack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Track'
		{
			newLeafNode(otherlv_0, grammarAccess.getResearchTrackAccess().getTrackKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResearchTrackAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResearchTrackRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getResearchTrackAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResearchTrackAccess().getResearchsessionResearchSessionParserRuleCall_3_0());
				}
				lv_researchsession_3_0=ruleResearchSession
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResearchTrackRule());
					}
					add(
						$current,
						"researchsession",
						lv_researchsession_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.ResearchSession");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getResearchTrackAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleIndustryTrack
entryRuleIndustryTrack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIndustryTrackRule()); }
	iv_ruleIndustryTrack=ruleIndustryTrack
	{ $current=$iv_ruleIndustryTrack.current; }
	EOF;

// Rule IndustryTrack
ruleIndustryTrack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Track'
		{
			newLeafNode(otherlv_0, grammarAccess.getIndustryTrackAccess().getTrackKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIndustryTrackAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIndustryTrackRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getIndustryTrackAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIndustryTrackAccess().getIndutrysessionIndustrySessionParserRuleCall_3_0());
				}
				lv_indutrysession_3_0=ruleIndustrySession
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndustryTrackRule());
					}
					add(
						$current,
						"indutrysession",
						lv_indutrysession_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.IndustrySession");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getIndustryTrackAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDemosAndPosterTrack
entryRuleDemosAndPosterTrack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDemosAndPosterTrackRule()); }
	iv_ruleDemosAndPosterTrack=ruleDemosAndPosterTrack
	{ $current=$iv_ruleDemosAndPosterTrack.current; }
	EOF;

// Rule DemosAndPosterTrack
ruleDemosAndPosterTrack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Track'
		{
			newLeafNode(otherlv_0, grammarAccess.getDemosAndPosterTrackAccess().getTrackKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDemosAndPosterTrackAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDemosAndPosterTrackRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDemosAndPosterTrackAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionDemoSessionParserRuleCall_3_0());
				}
				lv_demosession_3_0=ruleDemoSession
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDemosAndPosterTrackRule());
					}
					add(
						$current,
						"demosession",
						lv_demosession_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.DemoSession");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDemosAndPosterTrackAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePanelTrack
entryRulePanelTrack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPanelTrackRule()); }
	iv_rulePanelTrack=rulePanelTrack
	{ $current=$iv_rulePanelTrack.current; }
	EOF;

// Rule PanelTrack
rulePanelTrack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Track'
		{
			newLeafNode(otherlv_0, grammarAccess.getPanelTrackAccess().getTrackKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPanelTrackAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPanelTrackRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPanelTrackAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPanelTrackAccess().getPanelsessionPanelSessionParserRuleCall_3_0());
				}
				lv_panelsession_3_0=rulePanelSession
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPanelTrackRule());
					}
					add(
						$current,
						"panelsession",
						lv_panelsession_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.PanelSession");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPanelTrackAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleResearchSession
entryRuleResearchSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResearchSessionRule()); }
	iv_ruleResearchSession=ruleResearchSession
	{ $current=$iv_ruleResearchSession.current; }
	EOF;

// Rule ResearchSession
ruleResearchSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Session'
		{
			newLeafNode(otherlv_0, grammarAccess.getResearchSessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResearchSessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResearchSessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getResearchSessionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResearchSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0());
				}
				lv_researchpaper_3_0=ruleResearchPaper
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResearchSessionRule());
					}
					add(
						$current,
						"researchpaper",
						lv_researchpaper_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.ResearchPaper");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getResearchSessionAccess().getLocationLocationParserRuleCall_4_0());
				}
				lv_location_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResearchSessionRule());
					}
					set(
						$current,
						"location",
						lv_location_4_0,
						"org.xtext.example.mydsl.ConferenceProgram.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_startTime_5_0=RULE_STRING
				{
					newLeafNode(lv_startTime_5_0, grammarAccess.getResearchSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResearchSessionRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endTime_6_0=RULE_STRING
				{
					newLeafNode(lv_endTime_6_0, grammarAccess.getResearchSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResearchSessionRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getResearchSessionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleIndustrySession
entryRuleIndustrySession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIndustrySessionRule()); }
	iv_ruleIndustrySession=ruleIndustrySession
	{ $current=$iv_ruleIndustrySession.current; }
	EOF;

// Rule IndustrySession
ruleIndustrySession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Session'
		{
			newLeafNode(otherlv_0, grammarAccess.getIndustrySessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIndustrySessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIndustrySessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getIndustrySessionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIndustrySessionAccess().getIndustrypaperIndustryPaperParserRuleCall_3_0());
				}
				lv_industrypaper_3_0=ruleIndustryPaper
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndustrySessionRule());
					}
					add(
						$current,
						"industrypaper",
						lv_industrypaper_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.IndustryPaper");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getIndustrySessionAccess().getLocationLocationParserRuleCall_4_0());
				}
				lv_location_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndustrySessionRule());
					}
					set(
						$current,
						"location",
						lv_location_4_0,
						"org.xtext.example.mydsl.ConferenceProgram.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_startTime_5_0=RULE_STRING
				{
					newLeafNode(lv_startTime_5_0, grammarAccess.getIndustrySessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIndustrySessionRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endTime_6_0=RULE_STRING
				{
					newLeafNode(lv_endTime_6_0, grammarAccess.getIndustrySessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIndustrySessionRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getIndustrySessionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleDemoSession
entryRuleDemoSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDemoSessionRule()); }
	iv_ruleDemoSession=ruleDemoSession
	{ $current=$iv_ruleDemoSession.current; }
	EOF;

// Rule DemoSession
ruleDemoSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Session'
		{
			newLeafNode(otherlv_0, grammarAccess.getDemoSessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDemoSessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDemoSessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDemoSessionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDemoSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_3_0());
				}
				lv_demoandposter_3_0=ruleDemoAndPoster
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDemoSessionRule());
					}
					add(
						$current,
						"demoandposter",
						lv_demoandposter_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.DemoAndPoster");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getDemoSessionAccess().getLocationLocationParserRuleCall_4_0());
				}
				lv_location_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDemoSessionRule());
					}
					set(
						$current,
						"location",
						lv_location_4_0,
						"org.xtext.example.mydsl.ConferenceProgram.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_startTime_5_0=RULE_STRING
				{
					newLeafNode(lv_startTime_5_0, grammarAccess.getDemoSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDemoSessionRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endTime_6_0=RULE_STRING
				{
					newLeafNode(lv_endTime_6_0, grammarAccess.getDemoSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDemoSessionRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDemoSessionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRulePanelSession
entryRulePanelSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPanelSessionRule()); }
	iv_rulePanelSession=rulePanelSession
	{ $current=$iv_rulePanelSession.current; }
	EOF;

// Rule PanelSession
rulePanelSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Session'
		{
			newLeafNode(otherlv_0, grammarAccess.getPanelSessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPanelSessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPanelSessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPanelSessionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPanelSessionAccess().getPanelPanelParserRuleCall_3_0());
				}
				lv_panel_3_0=rulePanel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPanelSessionRule());
					}
					add(
						$current,
						"panel",
						lv_panel_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.Panel");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getPanelSessionAccess().getLocationLocationParserRuleCall_4_0());
				}
				lv_location_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPanelSessionRule());
					}
					set(
						$current,
						"location",
						lv_location_4_0,
						"org.xtext.example.mydsl.ConferenceProgram.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_startTime_5_0=RULE_STRING
				{
					newLeafNode(lv_startTime_5_0, grammarAccess.getPanelSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPanelSessionRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endTime_6_0=RULE_STRING
				{
					newLeafNode(lv_endTime_6_0, grammarAccess.getPanelSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPanelSessionRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPanelSessionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleResearchPaper
entryRuleResearchPaper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResearchPaperRule()); }
	iv_ruleResearchPaper=ruleResearchPaper
	{ $current=$iv_ruleResearchPaper.current; }
	EOF;

// Rule ResearchPaper
ruleResearchPaper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Paper'
		{
			newLeafNode(otherlv_0, grammarAccess.getResearchPaperAccess().getPaperKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResearchPaperAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResearchPaperRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleIndustryPaper
entryRuleIndustryPaper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIndustryPaperRule()); }
	iv_ruleIndustryPaper=ruleIndustryPaper
	{ $current=$iv_ruleIndustryPaper.current; }
	EOF;

// Rule IndustryPaper
ruleIndustryPaper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IndustryPaper'
		{
			newLeafNode(otherlv_0, grammarAccess.getIndustryPaperAccess().getIndustryPaperKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIndustryPaperAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIndustryPaperRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDemoAndPoster
entryRuleDemoAndPoster returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDemoAndPosterRule()); }
	iv_ruleDemoAndPoster=ruleDemoAndPoster
	{ $current=$iv_ruleDemoAndPoster.current; }
	EOF;

// Rule DemoAndPoster
ruleDemoAndPoster returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DemoAndPoster'
		{
			newLeafNode(otherlv_0, grammarAccess.getDemoAndPosterAccess().getDemoAndPosterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDemoAndPosterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDemoAndPosterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRulePanel
entryRulePanel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPanelRule()); }
	iv_rulePanel=rulePanel
	{ $current=$iv_rulePanel.current; }
	EOF;

// Rule Panel
rulePanel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Panel'
		{
			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPanelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_ruleLocation=ruleLocation
	{ $current=$iv_ruleLocation.current; }
	EOF;

// Rule Location
ruleLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Location'
		{
			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocationAccess().getRoomRoomParserRuleCall_2_0());
				}
				lv_room_2_0=ruleRoom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocationRule());
					}
					set(
						$current,
						"room",
						lv_room_2_0,
						"org.xtext.example.mydsl.ConferenceProgram.Room");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRoom
entryRuleRoom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomRule()); }
	iv_ruleRoom=ruleRoom
	{ $current=$iv_ruleRoom.current; }
	EOF;

// Rule Room
ruleRoom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Room'
		{
			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoomRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleKeynote
entryRuleKeynote returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeynoteRule()); }
	iv_ruleKeynote=ruleKeynote
	{ $current=$iv_ruleKeynote.current; }
	EOF;

// Rule Keynote
ruleKeynote returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Keynote'
		{
			newLeafNode(otherlv_0, grammarAccess.getKeynoteAccess().getKeynoteKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getKeynoteAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeynoteRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCoffeBreak
entryRuleCoffeBreak returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoffeBreakRule()); }
	iv_ruleCoffeBreak=ruleCoffeBreak
	{ $current=$iv_ruleCoffeBreak.current; }
	EOF;

// Rule CoffeBreak
ruleCoffeBreak returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Break'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoffeBreakAccess().getBreakKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoffeBreakAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoffeBreakRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleLunch
entryRuleLunch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLunchRule()); }
	iv_ruleLunch=ruleLunch
	{ $current=$iv_ruleLunch.current; }
	EOF;

// Rule Lunch
ruleLunch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Lunch'
		{
			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLunchAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLunchRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSocialEvent
entryRuleSocialEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSocialEventRule()); }
	iv_ruleSocialEvent=ruleSocialEvent
	{ $current=$iv_ruleSocialEvent.current; }
	EOF;

// Rule SocialEvent
ruleSocialEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SocialEvent'
		{
			newLeafNode(otherlv_0, grammarAccess.getSocialEventAccess().getSocialEventKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSocialEventAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSocialEventRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSocialEventAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSocialEventAccess().getLocationLocationParserRuleCall_3_0());
				}
				lv_location_3_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSocialEventRule());
					}
					set(
						$current,
						"location",
						lv_location_3_0,
						"org.xtext.example.mydsl.ConferenceProgram.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_startTime_4_0=RULE_STRING
				{
					newLeafNode(lv_startTime_4_0, grammarAccess.getSocialEventAccess().getStartTimeSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSocialEventRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endTime_5_0=RULE_STRING
				{
					newLeafNode(lv_endTime_5_0, grammarAccess.getSocialEventAccess().getEndTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSocialEventRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSocialEventAccess().getDirectionsGoogleMapsDirectionsParserRuleCall_6_0());
				}
				lv_directions_6_0=ruleGoogleMapsDirections
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSocialEventRule());
					}
					set(
						$current,
						"directions",
						lv_directions_6_0,
						"org.xtext.example.mydsl.ConferenceProgram.GoogleMapsDirections");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSocialEventAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleGoogleMapsDirections
entryRuleGoogleMapsDirections returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoogleMapsDirectionsRule()); }
	iv_ruleGoogleMapsDirections=ruleGoogleMapsDirections
	{ $current=$iv_ruleGoogleMapsDirections.current; }
	EOF;

// Rule GoogleMapsDirections
ruleGoogleMapsDirections returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Directions'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoogleMapsDirectionsAccess().getDirectionsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGoogleMapsDirectionsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getGoogleMapsDirectionsAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoogleMapsDirectionsRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGoogleMapsDirectionsAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;