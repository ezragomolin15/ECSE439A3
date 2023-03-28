/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ConferenceProgramGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ConferenceProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.ConferenceProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDateSTRINGTerminalRuleCall_2_0 = (RuleCall)cDateAssignment_2.eContents().get(0);
		private final Assignment cTracksAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTracksTrackParserRuleCall_3_0 = (RuleCall)cTracksAssignment_3.eContents().get(0);
		private final Assignment cSocialEventsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSocialEventsSocialEventParserRuleCall_4_0 = (RuleCall)cSocialEventsAssignment_4.eContents().get(0);
		private final Assignment cKeynotesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cKeynotesKeynoteParserRuleCall_5_0 = (RuleCall)cKeynotesAssignment_5.eContents().get(0);
		private final Assignment cCoffebreaksAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCoffebreaksCoffeBreakParserRuleCall_6_0 = (RuleCall)cCoffebreaksAssignment_6.eContents().get(0);
		private final Assignment cLunchesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLunchesLunchParserRuleCall_7_0 = (RuleCall)cLunchesAssignment_7.eContents().get(0);
		
		//ConferenceProgram:
		//    'Program' name=ID
		//    date=STRING
		//    (tracks+=Track)+ //1 or more  track
		//    (socialEvents+=SocialEvent)* //zero or more social events
		//    (keynotes+=Keynote)* //zero or more keynotes
		//    (coffebreaks+=CoffeBreak)* //zeror or more coffee breaks
		//    (lunches+=Lunch)* //zeror or more lunch breaks
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'Program' name=ID
		//date=STRING
		//(tracks+=Track)+ //1 or more  track
		//(socialEvents+=SocialEvent)* //zero or more social events
		//(keynotes+=Keynote)* //zero or more keynotes
		//(coffebreaks+=CoffeBreak)* //zeror or more coffee breaks
		//(lunches+=Lunch)*
		public Group getGroup() { return cGroup; }
		
		//'Program'
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//date=STRING
		public Assignment getDateAssignment_2() { return cDateAssignment_2; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_2_0() { return cDateSTRINGTerminalRuleCall_2_0; }
		
		//(tracks+=Track)+
		public Assignment getTracksAssignment_3() { return cTracksAssignment_3; }
		
		//Track
		public RuleCall getTracksTrackParserRuleCall_3_0() { return cTracksTrackParserRuleCall_3_0; }
		
		////1 or more  track
		//   (socialEvents+=SocialEvent)*
		public Assignment getSocialEventsAssignment_4() { return cSocialEventsAssignment_4; }
		
		//SocialEvent
		public RuleCall getSocialEventsSocialEventParserRuleCall_4_0() { return cSocialEventsSocialEventParserRuleCall_4_0; }
		
		////zero or more social events
		//   (keynotes+=Keynote)*
		public Assignment getKeynotesAssignment_5() { return cKeynotesAssignment_5; }
		
		//Keynote
		public RuleCall getKeynotesKeynoteParserRuleCall_5_0() { return cKeynotesKeynoteParserRuleCall_5_0; }
		
		////zero or more keynotes
		//   (coffebreaks+=CoffeBreak)*
		public Assignment getCoffebreaksAssignment_6() { return cCoffebreaksAssignment_6; }
		
		//CoffeBreak
		public RuleCall getCoffebreaksCoffeBreakParserRuleCall_6_0() { return cCoffebreaksCoffeBreakParserRuleCall_6_0; }
		
		////zeror or more coffee breaks
		//   (lunches+=Lunch)*
		public Assignment getLunchesAssignment_7() { return cLunchesAssignment_7; }
		
		//Lunch
		public RuleCall getLunchesLunchParserRuleCall_7_0() { return cLunchesLunchParserRuleCall_7_0; }
	}
	public class TrackElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Track");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTrackKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSessionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSessionSessionParserRuleCall_3_0 = (RuleCall)cSessionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Track:
		//    'Track' name=ID '{'
		//    (session+=Session)+
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Track' name=ID '{'
		//(session+=Session)+
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Track'
		public Keyword getTrackKeyword_0() { return cTrackKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(session+=Session)+
		public Assignment getSessionAssignment_3() { return cSessionAssignment_3; }
		
		//Session
		public RuleCall getSessionSessionParserRuleCall_3_0() { return cSessionSessionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class SessionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Session");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSessionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResearchpaperAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResearchpaperResearchPaperParserRuleCall_3_0 = (RuleCall)cResearchpaperAssignment_3.eContents().get(0);
		private final Assignment cIndustrypaperAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIndustrypaperIndustryPaperParserRuleCall_4_0 = (RuleCall)cIndustrypaperAssignment_4.eContents().get(0);
		private final Assignment cDemoandposterAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDemoandposterDemoAndPosterParserRuleCall_5_0 = (RuleCall)cDemoandposterAssignment_5.eContents().get(0);
		private final Assignment cPanelAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPanelPanelParserRuleCall_6_0 = (RuleCall)cPanelAssignment_6.eContents().get(0);
		private final Assignment cLocationAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLocationLocationParserRuleCall_7_0 = (RuleCall)cLocationAssignment_7.eContents().get(0);
		private final Assignment cStartTimeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_8_0 = (RuleCall)cStartTimeAssignment_8.eContents().get(0);
		private final Assignment cEndTimeAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_9_0 = (RuleCall)cEndTimeAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Session:
		//    'Session' name=ID '{'
		//    (researchpaper+=ResearchPaper)*
		//    (industrypaper+=IndustryPaper)*
		//    (demoandposter+=DemoAndPoster)*
		//    (panel+=Panel)*
		//    (location=Location)?
		//    startTime=STRING
		//    endTime=STRING
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Session' name=ID '{'
		//(researchpaper+=ResearchPaper)*
		//(industrypaper+=IndustryPaper)*
		//(demoandposter+=DemoAndPoster)*
		//(panel+=Panel)*
		//(location=Location)?
		//startTime=STRING
		//endTime=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Session'
		public Keyword getSessionKeyword_0() { return cSessionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(researchpaper+=ResearchPaper)*
		public Assignment getResearchpaperAssignment_3() { return cResearchpaperAssignment_3; }
		
		//ResearchPaper
		public RuleCall getResearchpaperResearchPaperParserRuleCall_3_0() { return cResearchpaperResearchPaperParserRuleCall_3_0; }
		
		//(industrypaper+=IndustryPaper)*
		public Assignment getIndustrypaperAssignment_4() { return cIndustrypaperAssignment_4; }
		
		//IndustryPaper
		public RuleCall getIndustrypaperIndustryPaperParserRuleCall_4_0() { return cIndustrypaperIndustryPaperParserRuleCall_4_0; }
		
		//(demoandposter+=DemoAndPoster)*
		public Assignment getDemoandposterAssignment_5() { return cDemoandposterAssignment_5; }
		
		//DemoAndPoster
		public RuleCall getDemoandposterDemoAndPosterParserRuleCall_5_0() { return cDemoandposterDemoAndPosterParserRuleCall_5_0; }
		
		//(panel+=Panel)*
		public Assignment getPanelAssignment_6() { return cPanelAssignment_6; }
		
		//Panel
		public RuleCall getPanelPanelParserRuleCall_6_0() { return cPanelPanelParserRuleCall_6_0; }
		
		//(location=Location)?
		public Assignment getLocationAssignment_7() { return cLocationAssignment_7; }
		
		//Location
		public RuleCall getLocationLocationParserRuleCall_7_0() { return cLocationLocationParserRuleCall_7_0; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_8() { return cStartTimeAssignment_8; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_8_0() { return cStartTimeSTRINGTerminalRuleCall_8_0; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_9() { return cEndTimeAssignment_9; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_9_0() { return cEndTimeSTRINGTerminalRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class ResearchPaperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.ResearchPaper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPaperKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ResearchPaper:
		//    'Paper' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Paper' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Paper'
		public Keyword getPaperKeyword_0() { return cPaperKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class IndustryPaperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.IndustryPaper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIndustryPaperKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//IndustryPaper:
		//    'IndustryPaper' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'IndustryPaper' name=ID
		public Group getGroup() { return cGroup; }
		
		//'IndustryPaper'
		public Keyword getIndustryPaperKeyword_0() { return cIndustryPaperKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class DemoAndPosterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.DemoAndPoster");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDemoAndPosterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DemoAndPoster:
		//    'DemoAndPoster' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'DemoAndPoster' name=ID
		public Group getGroup() { return cGroup; }
		
		//'DemoAndPoster'
		public Keyword getDemoAndPosterKeyword_0() { return cDemoAndPosterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class PanelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Panel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPanelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Panel:
		//    'Panel' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Panel' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Panel'
		public Keyword getPanelKeyword_0() { return cPanelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class LocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Location");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLocationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRoomAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRoomRoomParserRuleCall_2_0 = (RuleCall)cRoomAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Location:
		//    'Location' '{'
		//    room=Room
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Location' '{'
		//room=Room
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Location'
		public Keyword getLocationKeyword_0() { return cLocationKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//room=Room
		public Assignment getRoomAssignment_2() { return cRoomAssignment_2; }
		
		//Room
		public RuleCall getRoomRoomParserRuleCall_2_0() { return cRoomRoomParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class RoomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Room");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRoomKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Room:
		//    'Room' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Room' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Room'
		public Keyword getRoomKeyword_0() { return cRoomKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class KeynoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Keynote");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKeynoteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStartTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_2_0 = (RuleCall)cStartTimeAssignment_2.eContents().get(0);
		private final Assignment cEndTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cEndTimeAssignment_3.eContents().get(0);
		
		//Keynote:
		//    'Keynote' name=ID
		//    startTime=STRING
		//    endTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Keynote' name=ID
		//startTime=STRING
		//endTime=STRING
		public Group getGroup() { return cGroup; }
		
		//'Keynote'
		public Keyword getKeynoteKeyword_0() { return cKeynoteKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_2() { return cStartTimeAssignment_2; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_2_0() { return cStartTimeSTRINGTerminalRuleCall_2_0; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_3() { return cEndTimeAssignment_3; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_3_0() { return cEndTimeSTRINGTerminalRuleCall_3_0; }
	}
	public class CoffeBreakElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.CoffeBreak");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBreakKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStartTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_2_0 = (RuleCall)cStartTimeAssignment_2.eContents().get(0);
		private final Assignment cEndTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cEndTimeAssignment_3.eContents().get(0);
		
		//CoffeBreak:
		//    'Break' name=ID
		//    startTime=STRING
		//    endTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Break' name=ID
		//startTime=STRING
		//endTime=STRING
		public Group getGroup() { return cGroup; }
		
		//'Break'
		public Keyword getBreakKeyword_0() { return cBreakKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_2() { return cStartTimeAssignment_2; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_2_0() { return cStartTimeSTRINGTerminalRuleCall_2_0; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_3() { return cEndTimeAssignment_3; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_3_0() { return cEndTimeSTRINGTerminalRuleCall_3_0; }
	}
	public class LunchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.Lunch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLunchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStartTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_2_0 = (RuleCall)cStartTimeAssignment_2.eContents().get(0);
		private final Assignment cEndTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cEndTimeAssignment_3.eContents().get(0);
		
		//Lunch:
		//    'Lunch' name=ID
		//    startTime=STRING
		//    endTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Lunch' name=ID
		//startTime=STRING
		//endTime=STRING
		public Group getGroup() { return cGroup; }
		
		//'Lunch'
		public Keyword getLunchKeyword_0() { return cLunchKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_2() { return cStartTimeAssignment_2; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_2_0() { return cStartTimeSTRINGTerminalRuleCall_2_0; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_3() { return cEndTimeAssignment_3; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_3_0() { return cEndTimeSTRINGTerminalRuleCall_3_0; }
	}
	public class SocialEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.SocialEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSocialEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLocationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLocationLocationParserRuleCall_3_0 = (RuleCall)cLocationAssignment_3.eContents().get(0);
		private final Assignment cStartTimeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_4_0 = (RuleCall)cStartTimeAssignment_4.eContents().get(0);
		private final Assignment cEndTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_5_0 = (RuleCall)cEndTimeAssignment_5.eContents().get(0);
		private final Assignment cDirectionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDirectionsGoogleMapsDirectionsParserRuleCall_6_0 = (RuleCall)cDirectionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SocialEvent:
		//    'SocialEvent' name=ID '{'
		//    location=Location
		//    startTime=STRING
		//    endTime=STRING
		//    directions=GoogleMapsDirections
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SocialEvent' name=ID '{'
		//location=Location
		//startTime=STRING
		//endTime=STRING
		//directions=GoogleMapsDirections
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'SocialEvent'
		public Keyword getSocialEventKeyword_0() { return cSocialEventKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//location=Location
		public Assignment getLocationAssignment_3() { return cLocationAssignment_3; }
		
		//Location
		public RuleCall getLocationLocationParserRuleCall_3_0() { return cLocationLocationParserRuleCall_3_0; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_4() { return cStartTimeAssignment_4; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_4_0() { return cStartTimeSTRINGTerminalRuleCall_4_0; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_5() { return cEndTimeAssignment_5; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_5_0() { return cEndTimeSTRINGTerminalRuleCall_5_0; }
		
		//directions=GoogleMapsDirections
		public Assignment getDirectionsAssignment_6() { return cDirectionsAssignment_6; }
		
		//GoogleMapsDirections
		public RuleCall getDirectionsGoogleMapsDirectionsParserRuleCall_6_0() { return cDirectionsGoogleMapsDirectionsParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class GoogleMapsDirectionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ConferenceProgram.GoogleMapsDirections");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDirectionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUrlAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUrlSTRINGTerminalRuleCall_2_0 = (RuleCall)cUrlAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GoogleMapsDirections:
		//    'Directions' '{'
		//     url=STRING
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Directions' '{'
		// url=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Directions'
		public Keyword getDirectionsKeyword_0() { return cDirectionsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//url=STRING
		public Assignment getUrlAssignment_2() { return cUrlAssignment_2; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_2_0() { return cUrlSTRINGTerminalRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	
	
	private final ConferenceProgramElements pConferenceProgram;
	private final TrackElements pTrack;
	private final SessionElements pSession;
	private final ResearchPaperElements pResearchPaper;
	private final IndustryPaperElements pIndustryPaper;
	private final DemoAndPosterElements pDemoAndPoster;
	private final PanelElements pPanel;
	private final LocationElements pLocation;
	private final RoomElements pRoom;
	private final KeynoteElements pKeynote;
	private final CoffeBreakElements pCoffeBreak;
	private final LunchElements pLunch;
	private final SocialEventElements pSocialEvent;
	private final GoogleMapsDirectionsElements pGoogleMapsDirections;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ConferenceProgramGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pConferenceProgram = new ConferenceProgramElements();
		this.pTrack = new TrackElements();
		this.pSession = new SessionElements();
		this.pResearchPaper = new ResearchPaperElements();
		this.pIndustryPaper = new IndustryPaperElements();
		this.pDemoAndPoster = new DemoAndPosterElements();
		this.pPanel = new PanelElements();
		this.pLocation = new LocationElements();
		this.pRoom = new RoomElements();
		this.pKeynote = new KeynoteElements();
		this.pCoffeBreak = new CoffeBreakElements();
		this.pLunch = new LunchElements();
		this.pSocialEvent = new SocialEventElements();
		this.pGoogleMapsDirections = new GoogleMapsDirectionsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.ConferenceProgram".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ConferenceProgram:
	//    'Program' name=ID
	//    date=STRING
	//    (tracks+=Track)+ //1 or more  track
	//    (socialEvents+=SocialEvent)* //zero or more social events
	//    (keynotes+=Keynote)* //zero or more keynotes
	//    (coffebreaks+=CoffeBreak)* //zeror or more coffee breaks
	//    (lunches+=Lunch)* //zeror or more lunch breaks
	//    ;
	public ConferenceProgramElements getConferenceProgramAccess() {
		return pConferenceProgram;
	}
	
	public ParserRule getConferenceProgramRule() {
		return getConferenceProgramAccess().getRule();
	}
	
	//Track:
	//    'Track' name=ID '{'
	//    (session+=Session)+
	//    '}';
	public TrackElements getTrackAccess() {
		return pTrack;
	}
	
	public ParserRule getTrackRule() {
		return getTrackAccess().getRule();
	}
	
	//Session:
	//    'Session' name=ID '{'
	//    (researchpaper+=ResearchPaper)*
	//    (industrypaper+=IndustryPaper)*
	//    (demoandposter+=DemoAndPoster)*
	//    (panel+=Panel)*
	//    (location=Location)?
	//    startTime=STRING
	//    endTime=STRING
	//    '}';
	public SessionElements getSessionAccess() {
		return pSession;
	}
	
	public ParserRule getSessionRule() {
		return getSessionAccess().getRule();
	}
	
	//ResearchPaper:
	//    'Paper' name=ID;
	public ResearchPaperElements getResearchPaperAccess() {
		return pResearchPaper;
	}
	
	public ParserRule getResearchPaperRule() {
		return getResearchPaperAccess().getRule();
	}
	
	//IndustryPaper:
	//    'IndustryPaper' name=ID;
	public IndustryPaperElements getIndustryPaperAccess() {
		return pIndustryPaper;
	}
	
	public ParserRule getIndustryPaperRule() {
		return getIndustryPaperAccess().getRule();
	}
	
	//DemoAndPoster:
	//    'DemoAndPoster' name=ID;
	public DemoAndPosterElements getDemoAndPosterAccess() {
		return pDemoAndPoster;
	}
	
	public ParserRule getDemoAndPosterRule() {
		return getDemoAndPosterAccess().getRule();
	}
	
	//Panel:
	//    'Panel' name=ID;
	public PanelElements getPanelAccess() {
		return pPanel;
	}
	
	public ParserRule getPanelRule() {
		return getPanelAccess().getRule();
	}
	
	//Location:
	//    'Location' '{'
	//    room=Room
	//    '}';
	public LocationElements getLocationAccess() {
		return pLocation;
	}
	
	public ParserRule getLocationRule() {
		return getLocationAccess().getRule();
	}
	
	//Room:
	//    'Room' name=ID;
	public RoomElements getRoomAccess() {
		return pRoom;
	}
	
	public ParserRule getRoomRule() {
		return getRoomAccess().getRule();
	}
	
	//Keynote:
	//    'Keynote' name=ID
	//    startTime=STRING
	//    endTime=STRING;
	public KeynoteElements getKeynoteAccess() {
		return pKeynote;
	}
	
	public ParserRule getKeynoteRule() {
		return getKeynoteAccess().getRule();
	}
	
	//CoffeBreak:
	//    'Break' name=ID
	//    startTime=STRING
	//    endTime=STRING;
	public CoffeBreakElements getCoffeBreakAccess() {
		return pCoffeBreak;
	}
	
	public ParserRule getCoffeBreakRule() {
		return getCoffeBreakAccess().getRule();
	}
	
	//Lunch:
	//    'Lunch' name=ID
	//    startTime=STRING
	//    endTime=STRING;
	public LunchElements getLunchAccess() {
		return pLunch;
	}
	
	public ParserRule getLunchRule() {
		return getLunchAccess().getRule();
	}
	
	//SocialEvent:
	//    'SocialEvent' name=ID '{'
	//    location=Location
	//    startTime=STRING
	//    endTime=STRING
	//    directions=GoogleMapsDirections
	//    '}';
	public SocialEventElements getSocialEventAccess() {
		return pSocialEvent;
	}
	
	public ParserRule getSocialEventRule() {
		return getSocialEventAccess().getRule();
	}
	
	//GoogleMapsDirections:
	//    'Directions' '{'
	//     url=STRING
	//    '}';
	public GoogleMapsDirectionsElements getGoogleMapsDirectionsAccess() {
		return pGoogleMapsDirections;
	}
	
	public ParserRule getGoogleMapsDirectionsRule() {
		return getGoogleMapsDirectionsAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
