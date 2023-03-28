package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.ConferenceProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConferenceProgramParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(ConferenceProgramGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConferenceProgram"
    // InternalConferenceProgram.g:53:1: entryRuleConferenceProgram : ruleConferenceProgram EOF ;
    public final void entryRuleConferenceProgram() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:54:1: ( ruleConferenceProgram EOF )
            // InternalConferenceProgram.g:55:1: ruleConferenceProgram EOF
            {
             before(grammarAccess.getConferenceProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleConferenceProgram();

            state._fsp--;

             after(grammarAccess.getConferenceProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConferenceProgram"


    // $ANTLR start "ruleConferenceProgram"
    // InternalConferenceProgram.g:62:1: ruleConferenceProgram : ( ( rule__ConferenceProgram__Group__0 ) ) ;
    public final void ruleConferenceProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:66:2: ( ( ( rule__ConferenceProgram__Group__0 ) ) )
            // InternalConferenceProgram.g:67:2: ( ( rule__ConferenceProgram__Group__0 ) )
            {
            // InternalConferenceProgram.g:67:2: ( ( rule__ConferenceProgram__Group__0 ) )
            // InternalConferenceProgram.g:68:3: ( rule__ConferenceProgram__Group__0 )
            {
             before(grammarAccess.getConferenceProgramAccess().getGroup()); 
            // InternalConferenceProgram.g:69:3: ( rule__ConferenceProgram__Group__0 )
            // InternalConferenceProgram.g:69:4: rule__ConferenceProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConferenceProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConferenceProgram"


    // $ANTLR start "entryRuleTrack"
    // InternalConferenceProgram.g:78:1: entryRuleTrack : ruleTrack EOF ;
    public final void entryRuleTrack() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:79:1: ( ruleTrack EOF )
            // InternalConferenceProgram.g:80:1: ruleTrack EOF
            {
             before(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTrackRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalConferenceProgram.g:87:1: ruleTrack : ( ( rule__Track__Group__0 ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:91:2: ( ( ( rule__Track__Group__0 ) ) )
            // InternalConferenceProgram.g:92:2: ( ( rule__Track__Group__0 ) )
            {
            // InternalConferenceProgram.g:92:2: ( ( rule__Track__Group__0 ) )
            // InternalConferenceProgram.g:93:3: ( rule__Track__Group__0 )
            {
             before(grammarAccess.getTrackAccess().getGroup()); 
            // InternalConferenceProgram.g:94:3: ( rule__Track__Group__0 )
            // InternalConferenceProgram.g:94:4: rule__Track__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleSession"
    // InternalConferenceProgram.g:103:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:104:1: ( ruleSession EOF )
            // InternalConferenceProgram.g:105:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalConferenceProgram.g:112:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:116:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalConferenceProgram.g:117:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalConferenceProgram.g:117:2: ( ( rule__Session__Group__0 ) )
            // InternalConferenceProgram.g:118:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalConferenceProgram.g:119:3: ( rule__Session__Group__0 )
            // InternalConferenceProgram.g:119:4: rule__Session__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleResearchPaper"
    // InternalConferenceProgram.g:128:1: entryRuleResearchPaper : ruleResearchPaper EOF ;
    public final void entryRuleResearchPaper() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:129:1: ( ruleResearchPaper EOF )
            // InternalConferenceProgram.g:130:1: ruleResearchPaper EOF
            {
             before(grammarAccess.getResearchPaperRule()); 
            pushFollow(FOLLOW_1);
            ruleResearchPaper();

            state._fsp--;

             after(grammarAccess.getResearchPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResearchPaper"


    // $ANTLR start "ruleResearchPaper"
    // InternalConferenceProgram.g:137:1: ruleResearchPaper : ( ( rule__ResearchPaper__Group__0 ) ) ;
    public final void ruleResearchPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:141:2: ( ( ( rule__ResearchPaper__Group__0 ) ) )
            // InternalConferenceProgram.g:142:2: ( ( rule__ResearchPaper__Group__0 ) )
            {
            // InternalConferenceProgram.g:142:2: ( ( rule__ResearchPaper__Group__0 ) )
            // InternalConferenceProgram.g:143:3: ( rule__ResearchPaper__Group__0 )
            {
             before(grammarAccess.getResearchPaperAccess().getGroup()); 
            // InternalConferenceProgram.g:144:3: ( rule__ResearchPaper__Group__0 )
            // InternalConferenceProgram.g:144:4: rule__ResearchPaper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResearchPaper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResearchPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResearchPaper"


    // $ANTLR start "entryRuleIndustryPaper"
    // InternalConferenceProgram.g:153:1: entryRuleIndustryPaper : ruleIndustryPaper EOF ;
    public final void entryRuleIndustryPaper() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:154:1: ( ruleIndustryPaper EOF )
            // InternalConferenceProgram.g:155:1: ruleIndustryPaper EOF
            {
             before(grammarAccess.getIndustryPaperRule()); 
            pushFollow(FOLLOW_1);
            ruleIndustryPaper();

            state._fsp--;

             after(grammarAccess.getIndustryPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndustryPaper"


    // $ANTLR start "ruleIndustryPaper"
    // InternalConferenceProgram.g:162:1: ruleIndustryPaper : ( ( rule__IndustryPaper__Group__0 ) ) ;
    public final void ruleIndustryPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:166:2: ( ( ( rule__IndustryPaper__Group__0 ) ) )
            // InternalConferenceProgram.g:167:2: ( ( rule__IndustryPaper__Group__0 ) )
            {
            // InternalConferenceProgram.g:167:2: ( ( rule__IndustryPaper__Group__0 ) )
            // InternalConferenceProgram.g:168:3: ( rule__IndustryPaper__Group__0 )
            {
             before(grammarAccess.getIndustryPaperAccess().getGroup()); 
            // InternalConferenceProgram.g:169:3: ( rule__IndustryPaper__Group__0 )
            // InternalConferenceProgram.g:169:4: rule__IndustryPaper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndustryPaper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndustryPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndustryPaper"


    // $ANTLR start "entryRuleDemoAndPoster"
    // InternalConferenceProgram.g:178:1: entryRuleDemoAndPoster : ruleDemoAndPoster EOF ;
    public final void entryRuleDemoAndPoster() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:179:1: ( ruleDemoAndPoster EOF )
            // InternalConferenceProgram.g:180:1: ruleDemoAndPoster EOF
            {
             before(grammarAccess.getDemoAndPosterRule()); 
            pushFollow(FOLLOW_1);
            ruleDemoAndPoster();

            state._fsp--;

             after(grammarAccess.getDemoAndPosterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDemoAndPoster"


    // $ANTLR start "ruleDemoAndPoster"
    // InternalConferenceProgram.g:187:1: ruleDemoAndPoster : ( ( rule__DemoAndPoster__Group__0 ) ) ;
    public final void ruleDemoAndPoster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:191:2: ( ( ( rule__DemoAndPoster__Group__0 ) ) )
            // InternalConferenceProgram.g:192:2: ( ( rule__DemoAndPoster__Group__0 ) )
            {
            // InternalConferenceProgram.g:192:2: ( ( rule__DemoAndPoster__Group__0 ) )
            // InternalConferenceProgram.g:193:3: ( rule__DemoAndPoster__Group__0 )
            {
             before(grammarAccess.getDemoAndPosterAccess().getGroup()); 
            // InternalConferenceProgram.g:194:3: ( rule__DemoAndPoster__Group__0 )
            // InternalConferenceProgram.g:194:4: rule__DemoAndPoster__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DemoAndPoster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDemoAndPosterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDemoAndPoster"


    // $ANTLR start "entryRulePanel"
    // InternalConferenceProgram.g:203:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:204:1: ( rulePanel EOF )
            // InternalConferenceProgram.g:205:1: rulePanel EOF
            {
             before(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getPanelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalConferenceProgram.g:212:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:216:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalConferenceProgram.g:217:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalConferenceProgram.g:217:2: ( ( rule__Panel__Group__0 ) )
            // InternalConferenceProgram.g:218:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalConferenceProgram.g:219:3: ( rule__Panel__Group__0 )
            // InternalConferenceProgram.g:219:4: rule__Panel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleLocation"
    // InternalConferenceProgram.g:228:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:229:1: ( ruleLocation EOF )
            // InternalConferenceProgram.g:230:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalConferenceProgram.g:237:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:241:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalConferenceProgram.g:242:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalConferenceProgram.g:242:2: ( ( rule__Location__Group__0 ) )
            // InternalConferenceProgram.g:243:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalConferenceProgram.g:244:3: ( rule__Location__Group__0 )
            // InternalConferenceProgram.g:244:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleRoom"
    // InternalConferenceProgram.g:253:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:254:1: ( ruleRoom EOF )
            // InternalConferenceProgram.g:255:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalConferenceProgram.g:262:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:266:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalConferenceProgram.g:267:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalConferenceProgram.g:267:2: ( ( rule__Room__Group__0 ) )
            // InternalConferenceProgram.g:268:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalConferenceProgram.g:269:3: ( rule__Room__Group__0 )
            // InternalConferenceProgram.g:269:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleKeynote"
    // InternalConferenceProgram.g:278:1: entryRuleKeynote : ruleKeynote EOF ;
    public final void entryRuleKeynote() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:279:1: ( ruleKeynote EOF )
            // InternalConferenceProgram.g:280:1: ruleKeynote EOF
            {
             before(grammarAccess.getKeynoteRule()); 
            pushFollow(FOLLOW_1);
            ruleKeynote();

            state._fsp--;

             after(grammarAccess.getKeynoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeynote"


    // $ANTLR start "ruleKeynote"
    // InternalConferenceProgram.g:287:1: ruleKeynote : ( ( rule__Keynote__Group__0 ) ) ;
    public final void ruleKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:291:2: ( ( ( rule__Keynote__Group__0 ) ) )
            // InternalConferenceProgram.g:292:2: ( ( rule__Keynote__Group__0 ) )
            {
            // InternalConferenceProgram.g:292:2: ( ( rule__Keynote__Group__0 ) )
            // InternalConferenceProgram.g:293:3: ( rule__Keynote__Group__0 )
            {
             before(grammarAccess.getKeynoteAccess().getGroup()); 
            // InternalConferenceProgram.g:294:3: ( rule__Keynote__Group__0 )
            // InternalConferenceProgram.g:294:4: rule__Keynote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeynote"


    // $ANTLR start "entryRuleCoffeBreak"
    // InternalConferenceProgram.g:303:1: entryRuleCoffeBreak : ruleCoffeBreak EOF ;
    public final void entryRuleCoffeBreak() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:304:1: ( ruleCoffeBreak EOF )
            // InternalConferenceProgram.g:305:1: ruleCoffeBreak EOF
            {
             before(grammarAccess.getCoffeBreakRule()); 
            pushFollow(FOLLOW_1);
            ruleCoffeBreak();

            state._fsp--;

             after(grammarAccess.getCoffeBreakRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoffeBreak"


    // $ANTLR start "ruleCoffeBreak"
    // InternalConferenceProgram.g:312:1: ruleCoffeBreak : ( ( rule__CoffeBreak__Group__0 ) ) ;
    public final void ruleCoffeBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:316:2: ( ( ( rule__CoffeBreak__Group__0 ) ) )
            // InternalConferenceProgram.g:317:2: ( ( rule__CoffeBreak__Group__0 ) )
            {
            // InternalConferenceProgram.g:317:2: ( ( rule__CoffeBreak__Group__0 ) )
            // InternalConferenceProgram.g:318:3: ( rule__CoffeBreak__Group__0 )
            {
             before(grammarAccess.getCoffeBreakAccess().getGroup()); 
            // InternalConferenceProgram.g:319:3: ( rule__CoffeBreak__Group__0 )
            // InternalConferenceProgram.g:319:4: rule__CoffeBreak__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoffeBreakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoffeBreak"


    // $ANTLR start "entryRuleLunch"
    // InternalConferenceProgram.g:328:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:329:1: ( ruleLunch EOF )
            // InternalConferenceProgram.g:330:1: ruleLunch EOF
            {
             before(grammarAccess.getLunchRule()); 
            pushFollow(FOLLOW_1);
            ruleLunch();

            state._fsp--;

             after(grammarAccess.getLunchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLunch"


    // $ANTLR start "ruleLunch"
    // InternalConferenceProgram.g:337:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:341:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalConferenceProgram.g:342:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalConferenceProgram.g:342:2: ( ( rule__Lunch__Group__0 ) )
            // InternalConferenceProgram.g:343:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalConferenceProgram.g:344:3: ( rule__Lunch__Group__0 )
            // InternalConferenceProgram.g:344:4: rule__Lunch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunch"


    // $ANTLR start "entryRuleSocialEvent"
    // InternalConferenceProgram.g:353:1: entryRuleSocialEvent : ruleSocialEvent EOF ;
    public final void entryRuleSocialEvent() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:354:1: ( ruleSocialEvent EOF )
            // InternalConferenceProgram.g:355:1: ruleSocialEvent EOF
            {
             before(grammarAccess.getSocialEventRule()); 
            pushFollow(FOLLOW_1);
            ruleSocialEvent();

            state._fsp--;

             after(grammarAccess.getSocialEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSocialEvent"


    // $ANTLR start "ruleSocialEvent"
    // InternalConferenceProgram.g:362:1: ruleSocialEvent : ( ( rule__SocialEvent__Group__0 ) ) ;
    public final void ruleSocialEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:366:2: ( ( ( rule__SocialEvent__Group__0 ) ) )
            // InternalConferenceProgram.g:367:2: ( ( rule__SocialEvent__Group__0 ) )
            {
            // InternalConferenceProgram.g:367:2: ( ( rule__SocialEvent__Group__0 ) )
            // InternalConferenceProgram.g:368:3: ( rule__SocialEvent__Group__0 )
            {
             before(grammarAccess.getSocialEventAccess().getGroup()); 
            // InternalConferenceProgram.g:369:3: ( rule__SocialEvent__Group__0 )
            // InternalConferenceProgram.g:369:4: rule__SocialEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSocialEvent"


    // $ANTLR start "entryRuleGoogleMapsDirections"
    // InternalConferenceProgram.g:378:1: entryRuleGoogleMapsDirections : ruleGoogleMapsDirections EOF ;
    public final void entryRuleGoogleMapsDirections() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:379:1: ( ruleGoogleMapsDirections EOF )
            // InternalConferenceProgram.g:380:1: ruleGoogleMapsDirections EOF
            {
             before(grammarAccess.getGoogleMapsDirectionsRule()); 
            pushFollow(FOLLOW_1);
            ruleGoogleMapsDirections();

            state._fsp--;

             after(grammarAccess.getGoogleMapsDirectionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoogleMapsDirections"


    // $ANTLR start "ruleGoogleMapsDirections"
    // InternalConferenceProgram.g:387:1: ruleGoogleMapsDirections : ( ( rule__GoogleMapsDirections__Group__0 ) ) ;
    public final void ruleGoogleMapsDirections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:391:2: ( ( ( rule__GoogleMapsDirections__Group__0 ) ) )
            // InternalConferenceProgram.g:392:2: ( ( rule__GoogleMapsDirections__Group__0 ) )
            {
            // InternalConferenceProgram.g:392:2: ( ( rule__GoogleMapsDirections__Group__0 ) )
            // InternalConferenceProgram.g:393:3: ( rule__GoogleMapsDirections__Group__0 )
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getGroup()); 
            // InternalConferenceProgram.g:394:3: ( rule__GoogleMapsDirections__Group__0 )
            // InternalConferenceProgram.g:394:4: rule__GoogleMapsDirections__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoogleMapsDirectionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoogleMapsDirections"


    // $ANTLR start "rule__ConferenceProgram__Group__0"
    // InternalConferenceProgram.g:402:1: rule__ConferenceProgram__Group__0 : rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1 ;
    public final void rule__ConferenceProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:406:1: ( rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1 )
            // InternalConferenceProgram.g:407:2: rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConferenceProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__0"


    // $ANTLR start "rule__ConferenceProgram__Group__0__Impl"
    // InternalConferenceProgram.g:414:1: rule__ConferenceProgram__Group__0__Impl : ( 'Program' ) ;
    public final void rule__ConferenceProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:418:1: ( ( 'Program' ) )
            // InternalConferenceProgram.g:419:1: ( 'Program' )
            {
            // InternalConferenceProgram.g:419:1: ( 'Program' )
            // InternalConferenceProgram.g:420:2: 'Program'
            {
             before(grammarAccess.getConferenceProgramAccess().getProgramKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConferenceProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__0__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__1"
    // InternalConferenceProgram.g:429:1: rule__ConferenceProgram__Group__1 : rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2 ;
    public final void rule__ConferenceProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:433:1: ( rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2 )
            // InternalConferenceProgram.g:434:2: rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConferenceProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__1"


    // $ANTLR start "rule__ConferenceProgram__Group__1__Impl"
    // InternalConferenceProgram.g:441:1: rule__ConferenceProgram__Group__1__Impl : ( ( rule__ConferenceProgram__NameAssignment_1 ) ) ;
    public final void rule__ConferenceProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:445:1: ( ( ( rule__ConferenceProgram__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:446:1: ( ( rule__ConferenceProgram__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:446:1: ( ( rule__ConferenceProgram__NameAssignment_1 ) )
            // InternalConferenceProgram.g:447:2: ( rule__ConferenceProgram__NameAssignment_1 )
            {
             before(grammarAccess.getConferenceProgramAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:448:2: ( rule__ConferenceProgram__NameAssignment_1 )
            // InternalConferenceProgram.g:448:3: rule__ConferenceProgram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__1__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__2"
    // InternalConferenceProgram.g:456:1: rule__ConferenceProgram__Group__2 : rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3 ;
    public final void rule__ConferenceProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:460:1: ( rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3 )
            // InternalConferenceProgram.g:461:2: rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConferenceProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__2"


    // $ANTLR start "rule__ConferenceProgram__Group__2__Impl"
    // InternalConferenceProgram.g:468:1: rule__ConferenceProgram__Group__2__Impl : ( ( rule__ConferenceProgram__DateAssignment_2 ) ) ;
    public final void rule__ConferenceProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:472:1: ( ( ( rule__ConferenceProgram__DateAssignment_2 ) ) )
            // InternalConferenceProgram.g:473:1: ( ( rule__ConferenceProgram__DateAssignment_2 ) )
            {
            // InternalConferenceProgram.g:473:1: ( ( rule__ConferenceProgram__DateAssignment_2 ) )
            // InternalConferenceProgram.g:474:2: ( rule__ConferenceProgram__DateAssignment_2 )
            {
             before(grammarAccess.getConferenceProgramAccess().getDateAssignment_2()); 
            // InternalConferenceProgram.g:475:2: ( rule__ConferenceProgram__DateAssignment_2 )
            // InternalConferenceProgram.g:475:3: rule__ConferenceProgram__DateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__DateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceProgramAccess().getDateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__2__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__3"
    // InternalConferenceProgram.g:483:1: rule__ConferenceProgram__Group__3 : rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4 ;
    public final void rule__ConferenceProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:487:1: ( rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4 )
            // InternalConferenceProgram.g:488:2: rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__3"


    // $ANTLR start "rule__ConferenceProgram__Group__3__Impl"
    // InternalConferenceProgram.g:495:1: rule__ConferenceProgram__Group__3__Impl : ( ( ( rule__ConferenceProgram__TracksAssignment_3 ) ) ( ( rule__ConferenceProgram__TracksAssignment_3 )* ) ) ;
    public final void rule__ConferenceProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:499:1: ( ( ( ( rule__ConferenceProgram__TracksAssignment_3 ) ) ( ( rule__ConferenceProgram__TracksAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:500:1: ( ( ( rule__ConferenceProgram__TracksAssignment_3 ) ) ( ( rule__ConferenceProgram__TracksAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:500:1: ( ( ( rule__ConferenceProgram__TracksAssignment_3 ) ) ( ( rule__ConferenceProgram__TracksAssignment_3 )* ) )
            // InternalConferenceProgram.g:501:2: ( ( rule__ConferenceProgram__TracksAssignment_3 ) ) ( ( rule__ConferenceProgram__TracksAssignment_3 )* )
            {
            // InternalConferenceProgram.g:501:2: ( ( rule__ConferenceProgram__TracksAssignment_3 ) )
            // InternalConferenceProgram.g:502:3: ( rule__ConferenceProgram__TracksAssignment_3 )
            {
             before(grammarAccess.getConferenceProgramAccess().getTracksAssignment_3()); 
            // InternalConferenceProgram.g:503:3: ( rule__ConferenceProgram__TracksAssignment_3 )
            // InternalConferenceProgram.g:503:4: rule__ConferenceProgram__TracksAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__ConferenceProgram__TracksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConferenceProgramAccess().getTracksAssignment_3()); 

            }

            // InternalConferenceProgram.g:506:2: ( ( rule__ConferenceProgram__TracksAssignment_3 )* )
            // InternalConferenceProgram.g:507:3: ( rule__ConferenceProgram__TracksAssignment_3 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getTracksAssignment_3()); 
            // InternalConferenceProgram.g:508:3: ( rule__ConferenceProgram__TracksAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConferenceProgram.g:508:4: rule__ConferenceProgram__TracksAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConferenceProgram__TracksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getTracksAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__3__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__4"
    // InternalConferenceProgram.g:517:1: rule__ConferenceProgram__Group__4 : rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5 ;
    public final void rule__ConferenceProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:521:1: ( rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5 )
            // InternalConferenceProgram.g:522:2: rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__4"


    // $ANTLR start "rule__ConferenceProgram__Group__4__Impl"
    // InternalConferenceProgram.g:529:1: rule__ConferenceProgram__Group__4__Impl : ( ( rule__ConferenceProgram__SocialEventsAssignment_4 )* ) ;
    public final void rule__ConferenceProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:533:1: ( ( ( rule__ConferenceProgram__SocialEventsAssignment_4 )* ) )
            // InternalConferenceProgram.g:534:1: ( ( rule__ConferenceProgram__SocialEventsAssignment_4 )* )
            {
            // InternalConferenceProgram.g:534:1: ( ( rule__ConferenceProgram__SocialEventsAssignment_4 )* )
            // InternalConferenceProgram.g:535:2: ( rule__ConferenceProgram__SocialEventsAssignment_4 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getSocialEventsAssignment_4()); 
            // InternalConferenceProgram.g:536:2: ( rule__ConferenceProgram__SocialEventsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalConferenceProgram.g:536:3: rule__ConferenceProgram__SocialEventsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ConferenceProgram__SocialEventsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getSocialEventsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__4__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__5"
    // InternalConferenceProgram.g:544:1: rule__ConferenceProgram__Group__5 : rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6 ;
    public final void rule__ConferenceProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:548:1: ( rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6 )
            // InternalConferenceProgram.g:549:2: rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__5"


    // $ANTLR start "rule__ConferenceProgram__Group__5__Impl"
    // InternalConferenceProgram.g:556:1: rule__ConferenceProgram__Group__5__Impl : ( ( rule__ConferenceProgram__KeynotesAssignment_5 )* ) ;
    public final void rule__ConferenceProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:560:1: ( ( ( rule__ConferenceProgram__KeynotesAssignment_5 )* ) )
            // InternalConferenceProgram.g:561:1: ( ( rule__ConferenceProgram__KeynotesAssignment_5 )* )
            {
            // InternalConferenceProgram.g:561:1: ( ( rule__ConferenceProgram__KeynotesAssignment_5 )* )
            // InternalConferenceProgram.g:562:2: ( rule__ConferenceProgram__KeynotesAssignment_5 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getKeynotesAssignment_5()); 
            // InternalConferenceProgram.g:563:2: ( rule__ConferenceProgram__KeynotesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalConferenceProgram.g:563:3: rule__ConferenceProgram__KeynotesAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConferenceProgram__KeynotesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getKeynotesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__5__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__6"
    // InternalConferenceProgram.g:571:1: rule__ConferenceProgram__Group__6 : rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7 ;
    public final void rule__ConferenceProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:575:1: ( rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7 )
            // InternalConferenceProgram.g:576:2: rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__6"


    // $ANTLR start "rule__ConferenceProgram__Group__6__Impl"
    // InternalConferenceProgram.g:583:1: rule__ConferenceProgram__Group__6__Impl : ( ( rule__ConferenceProgram__CoffebreaksAssignment_6 )* ) ;
    public final void rule__ConferenceProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:587:1: ( ( ( rule__ConferenceProgram__CoffebreaksAssignment_6 )* ) )
            // InternalConferenceProgram.g:588:1: ( ( rule__ConferenceProgram__CoffebreaksAssignment_6 )* )
            {
            // InternalConferenceProgram.g:588:1: ( ( rule__ConferenceProgram__CoffebreaksAssignment_6 )* )
            // InternalConferenceProgram.g:589:2: ( rule__ConferenceProgram__CoffebreaksAssignment_6 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getCoffebreaksAssignment_6()); 
            // InternalConferenceProgram.g:590:2: ( rule__ConferenceProgram__CoffebreaksAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalConferenceProgram.g:590:3: rule__ConferenceProgram__CoffebreaksAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ConferenceProgram__CoffebreaksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getCoffebreaksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__6__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__7"
    // InternalConferenceProgram.g:598:1: rule__ConferenceProgram__Group__7 : rule__ConferenceProgram__Group__7__Impl ;
    public final void rule__ConferenceProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:602:1: ( rule__ConferenceProgram__Group__7__Impl )
            // InternalConferenceProgram.g:603:2: rule__ConferenceProgram__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__7"


    // $ANTLR start "rule__ConferenceProgram__Group__7__Impl"
    // InternalConferenceProgram.g:609:1: rule__ConferenceProgram__Group__7__Impl : ( ( rule__ConferenceProgram__LunchesAssignment_7 )* ) ;
    public final void rule__ConferenceProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:613:1: ( ( ( rule__ConferenceProgram__LunchesAssignment_7 )* ) )
            // InternalConferenceProgram.g:614:1: ( ( rule__ConferenceProgram__LunchesAssignment_7 )* )
            {
            // InternalConferenceProgram.g:614:1: ( ( rule__ConferenceProgram__LunchesAssignment_7 )* )
            // InternalConferenceProgram.g:615:2: ( rule__ConferenceProgram__LunchesAssignment_7 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getLunchesAssignment_7()); 
            // InternalConferenceProgram.g:616:2: ( rule__ConferenceProgram__LunchesAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConferenceProgram.g:616:3: rule__ConferenceProgram__LunchesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConferenceProgram__LunchesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getLunchesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__Group__7__Impl"


    // $ANTLR start "rule__Track__Group__0"
    // InternalConferenceProgram.g:625:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:629:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalConferenceProgram.g:630:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Track__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0"


    // $ANTLR start "rule__Track__Group__0__Impl"
    // InternalConferenceProgram.g:637:1: rule__Track__Group__0__Impl : ( 'Track' ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:641:1: ( ( 'Track' ) )
            // InternalConferenceProgram.g:642:1: ( 'Track' )
            {
            // InternalConferenceProgram.g:642:1: ( 'Track' )
            // InternalConferenceProgram.g:643:2: 'Track'
            {
             before(grammarAccess.getTrackAccess().getTrackKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getTrackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0__Impl"


    // $ANTLR start "rule__Track__Group__1"
    // InternalConferenceProgram.g:652:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:656:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalConferenceProgram.g:657:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Track__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1"


    // $ANTLR start "rule__Track__Group__1__Impl"
    // InternalConferenceProgram.g:664:1: rule__Track__Group__1__Impl : ( ( rule__Track__NameAssignment_1 ) ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:668:1: ( ( ( rule__Track__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:669:1: ( ( rule__Track__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:669:1: ( ( rule__Track__NameAssignment_1 ) )
            // InternalConferenceProgram.g:670:2: ( rule__Track__NameAssignment_1 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:671:2: ( rule__Track__NameAssignment_1 )
            // InternalConferenceProgram.g:671:3: rule__Track__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1__Impl"


    // $ANTLR start "rule__Track__Group__2"
    // InternalConferenceProgram.g:679:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:683:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // InternalConferenceProgram.g:684:2: rule__Track__Group__2__Impl rule__Track__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Track__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__2"


    // $ANTLR start "rule__Track__Group__2__Impl"
    // InternalConferenceProgram.g:691:1: rule__Track__Group__2__Impl : ( '{' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:695:1: ( ( '{' ) )
            // InternalConferenceProgram.g:696:1: ( '{' )
            {
            // InternalConferenceProgram.g:696:1: ( '{' )
            // InternalConferenceProgram.g:697:2: '{'
            {
             before(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__2__Impl"


    // $ANTLR start "rule__Track__Group__3"
    // InternalConferenceProgram.g:706:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:710:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // InternalConferenceProgram.g:711:2: rule__Track__Group__3__Impl rule__Track__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Track__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__3"


    // $ANTLR start "rule__Track__Group__3__Impl"
    // InternalConferenceProgram.g:718:1: rule__Track__Group__3__Impl : ( ( ( rule__Track__SessionAssignment_3 ) ) ( ( rule__Track__SessionAssignment_3 )* ) ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:722:1: ( ( ( ( rule__Track__SessionAssignment_3 ) ) ( ( rule__Track__SessionAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:723:1: ( ( ( rule__Track__SessionAssignment_3 ) ) ( ( rule__Track__SessionAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:723:1: ( ( ( rule__Track__SessionAssignment_3 ) ) ( ( rule__Track__SessionAssignment_3 )* ) )
            // InternalConferenceProgram.g:724:2: ( ( rule__Track__SessionAssignment_3 ) ) ( ( rule__Track__SessionAssignment_3 )* )
            {
            // InternalConferenceProgram.g:724:2: ( ( rule__Track__SessionAssignment_3 ) )
            // InternalConferenceProgram.g:725:3: ( rule__Track__SessionAssignment_3 )
            {
             before(grammarAccess.getTrackAccess().getSessionAssignment_3()); 
            // InternalConferenceProgram.g:726:3: ( rule__Track__SessionAssignment_3 )
            // InternalConferenceProgram.g:726:4: rule__Track__SessionAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Track__SessionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getSessionAssignment_3()); 

            }

            // InternalConferenceProgram.g:729:2: ( ( rule__Track__SessionAssignment_3 )* )
            // InternalConferenceProgram.g:730:3: ( rule__Track__SessionAssignment_3 )*
            {
             before(grammarAccess.getTrackAccess().getSessionAssignment_3()); 
            // InternalConferenceProgram.g:731:3: ( rule__Track__SessionAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalConferenceProgram.g:731:4: rule__Track__SessionAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Track__SessionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTrackAccess().getSessionAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__3__Impl"


    // $ANTLR start "rule__Track__Group__4"
    // InternalConferenceProgram.g:740:1: rule__Track__Group__4 : rule__Track__Group__4__Impl ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:744:1: ( rule__Track__Group__4__Impl )
            // InternalConferenceProgram.g:745:2: rule__Track__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__4"


    // $ANTLR start "rule__Track__Group__4__Impl"
    // InternalConferenceProgram.g:751:1: rule__Track__Group__4__Impl : ( '}' ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:755:1: ( ( '}' ) )
            // InternalConferenceProgram.g:756:1: ( '}' )
            {
            // InternalConferenceProgram.g:756:1: ( '}' )
            // InternalConferenceProgram.g:757:2: '}'
            {
             before(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__4__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // InternalConferenceProgram.g:767:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:771:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalConferenceProgram.g:772:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Session__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0"


    // $ANTLR start "rule__Session__Group__0__Impl"
    // InternalConferenceProgram.g:779:1: rule__Session__Group__0__Impl : ( 'Session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:783:1: ( ( 'Session' ) )
            // InternalConferenceProgram.g:784:1: ( 'Session' )
            {
            // InternalConferenceProgram.g:784:1: ( 'Session' )
            // InternalConferenceProgram.g:785:2: 'Session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0__Impl"


    // $ANTLR start "rule__Session__Group__1"
    // InternalConferenceProgram.g:794:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:798:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalConferenceProgram.g:799:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Session__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__1"


    // $ANTLR start "rule__Session__Group__1__Impl"
    // InternalConferenceProgram.g:806:1: rule__Session__Group__1__Impl : ( ( rule__Session__NameAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:810:1: ( ( ( rule__Session__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:811:1: ( ( rule__Session__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:811:1: ( ( rule__Session__NameAssignment_1 ) )
            // InternalConferenceProgram.g:812:2: ( rule__Session__NameAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:813:2: ( rule__Session__NameAssignment_1 )
            // InternalConferenceProgram.g:813:3: rule__Session__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__1__Impl"


    // $ANTLR start "rule__Session__Group__2"
    // InternalConferenceProgram.g:821:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:825:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalConferenceProgram.g:826:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__2"


    // $ANTLR start "rule__Session__Group__2__Impl"
    // InternalConferenceProgram.g:833:1: rule__Session__Group__2__Impl : ( '{' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:837:1: ( ( '{' ) )
            // InternalConferenceProgram.g:838:1: ( '{' )
            {
            // InternalConferenceProgram.g:838:1: ( '{' )
            // InternalConferenceProgram.g:839:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__2__Impl"


    // $ANTLR start "rule__Session__Group__3"
    // InternalConferenceProgram.g:848:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:852:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalConferenceProgram.g:853:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__3"


    // $ANTLR start "rule__Session__Group__3__Impl"
    // InternalConferenceProgram.g:860:1: rule__Session__Group__3__Impl : ( ( rule__Session__ResearchpaperAssignment_3 )* ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:864:1: ( ( ( rule__Session__ResearchpaperAssignment_3 )* ) )
            // InternalConferenceProgram.g:865:1: ( ( rule__Session__ResearchpaperAssignment_3 )* )
            {
            // InternalConferenceProgram.g:865:1: ( ( rule__Session__ResearchpaperAssignment_3 )* )
            // InternalConferenceProgram.g:866:2: ( rule__Session__ResearchpaperAssignment_3 )*
            {
             before(grammarAccess.getSessionAccess().getResearchpaperAssignment_3()); 
            // InternalConferenceProgram.g:867:2: ( rule__Session__ResearchpaperAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConferenceProgram.g:867:3: rule__Session__ResearchpaperAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Session__ResearchpaperAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getResearchpaperAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__3__Impl"


    // $ANTLR start "rule__Session__Group__4"
    // InternalConferenceProgram.g:875:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:879:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalConferenceProgram.g:880:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__4"


    // $ANTLR start "rule__Session__Group__4__Impl"
    // InternalConferenceProgram.g:887:1: rule__Session__Group__4__Impl : ( ( rule__Session__IndustrypaperAssignment_4 )* ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:891:1: ( ( ( rule__Session__IndustrypaperAssignment_4 )* ) )
            // InternalConferenceProgram.g:892:1: ( ( rule__Session__IndustrypaperAssignment_4 )* )
            {
            // InternalConferenceProgram.g:892:1: ( ( rule__Session__IndustrypaperAssignment_4 )* )
            // InternalConferenceProgram.g:893:2: ( rule__Session__IndustrypaperAssignment_4 )*
            {
             before(grammarAccess.getSessionAccess().getIndustrypaperAssignment_4()); 
            // InternalConferenceProgram.g:894:2: ( rule__Session__IndustrypaperAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConferenceProgram.g:894:3: rule__Session__IndustrypaperAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Session__IndustrypaperAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getIndustrypaperAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__4__Impl"


    // $ANTLR start "rule__Session__Group__5"
    // InternalConferenceProgram.g:902:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:906:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalConferenceProgram.g:907:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__5"


    // $ANTLR start "rule__Session__Group__5__Impl"
    // InternalConferenceProgram.g:914:1: rule__Session__Group__5__Impl : ( ( rule__Session__DemoandposterAssignment_5 )* ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:918:1: ( ( ( rule__Session__DemoandposterAssignment_5 )* ) )
            // InternalConferenceProgram.g:919:1: ( ( rule__Session__DemoandposterAssignment_5 )* )
            {
            // InternalConferenceProgram.g:919:1: ( ( rule__Session__DemoandposterAssignment_5 )* )
            // InternalConferenceProgram.g:920:2: ( rule__Session__DemoandposterAssignment_5 )*
            {
             before(grammarAccess.getSessionAccess().getDemoandposterAssignment_5()); 
            // InternalConferenceProgram.g:921:2: ( rule__Session__DemoandposterAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConferenceProgram.g:921:3: rule__Session__DemoandposterAssignment_5
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Session__DemoandposterAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getDemoandposterAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__5__Impl"


    // $ANTLR start "rule__Session__Group__6"
    // InternalConferenceProgram.g:929:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:933:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalConferenceProgram.g:934:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__6"


    // $ANTLR start "rule__Session__Group__6__Impl"
    // InternalConferenceProgram.g:941:1: rule__Session__Group__6__Impl : ( ( rule__Session__PanelAssignment_6 )* ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:945:1: ( ( ( rule__Session__PanelAssignment_6 )* ) )
            // InternalConferenceProgram.g:946:1: ( ( rule__Session__PanelAssignment_6 )* )
            {
            // InternalConferenceProgram.g:946:1: ( ( rule__Session__PanelAssignment_6 )* )
            // InternalConferenceProgram.g:947:2: ( rule__Session__PanelAssignment_6 )*
            {
             before(grammarAccess.getSessionAccess().getPanelAssignment_6()); 
            // InternalConferenceProgram.g:948:2: ( rule__Session__PanelAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConferenceProgram.g:948:3: rule__Session__PanelAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Session__PanelAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getPanelAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__6__Impl"


    // $ANTLR start "rule__Session__Group__7"
    // InternalConferenceProgram.g:956:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:960:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalConferenceProgram.g:961:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Session__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__7"


    // $ANTLR start "rule__Session__Group__7__Impl"
    // InternalConferenceProgram.g:968:1: rule__Session__Group__7__Impl : ( ( rule__Session__LocationAssignment_7 )? ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:972:1: ( ( ( rule__Session__LocationAssignment_7 )? ) )
            // InternalConferenceProgram.g:973:1: ( ( rule__Session__LocationAssignment_7 )? )
            {
            // InternalConferenceProgram.g:973:1: ( ( rule__Session__LocationAssignment_7 )? )
            // InternalConferenceProgram.g:974:2: ( rule__Session__LocationAssignment_7 )?
            {
             before(grammarAccess.getSessionAccess().getLocationAssignment_7()); 
            // InternalConferenceProgram.g:975:2: ( rule__Session__LocationAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConferenceProgram.g:975:3: rule__Session__LocationAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__LocationAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getLocationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__7__Impl"


    // $ANTLR start "rule__Session__Group__8"
    // InternalConferenceProgram.g:983:1: rule__Session__Group__8 : rule__Session__Group__8__Impl rule__Session__Group__9 ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:987:1: ( rule__Session__Group__8__Impl rule__Session__Group__9 )
            // InternalConferenceProgram.g:988:2: rule__Session__Group__8__Impl rule__Session__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__8"


    // $ANTLR start "rule__Session__Group__8__Impl"
    // InternalConferenceProgram.g:995:1: rule__Session__Group__8__Impl : ( ( rule__Session__StartTimeAssignment_8 ) ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:999:1: ( ( ( rule__Session__StartTimeAssignment_8 ) ) )
            // InternalConferenceProgram.g:1000:1: ( ( rule__Session__StartTimeAssignment_8 ) )
            {
            // InternalConferenceProgram.g:1000:1: ( ( rule__Session__StartTimeAssignment_8 ) )
            // InternalConferenceProgram.g:1001:2: ( rule__Session__StartTimeAssignment_8 )
            {
             before(grammarAccess.getSessionAccess().getStartTimeAssignment_8()); 
            // InternalConferenceProgram.g:1002:2: ( rule__Session__StartTimeAssignment_8 )
            // InternalConferenceProgram.g:1002:3: rule__Session__StartTimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartTimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__8__Impl"


    // $ANTLR start "rule__Session__Group__9"
    // InternalConferenceProgram.g:1010:1: rule__Session__Group__9 : rule__Session__Group__9__Impl rule__Session__Group__10 ;
    public final void rule__Session__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1014:1: ( rule__Session__Group__9__Impl rule__Session__Group__10 )
            // InternalConferenceProgram.g:1015:2: rule__Session__Group__9__Impl rule__Session__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Session__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__9"


    // $ANTLR start "rule__Session__Group__9__Impl"
    // InternalConferenceProgram.g:1022:1: rule__Session__Group__9__Impl : ( ( rule__Session__EndTimeAssignment_9 ) ) ;
    public final void rule__Session__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1026:1: ( ( ( rule__Session__EndTimeAssignment_9 ) ) )
            // InternalConferenceProgram.g:1027:1: ( ( rule__Session__EndTimeAssignment_9 ) )
            {
            // InternalConferenceProgram.g:1027:1: ( ( rule__Session__EndTimeAssignment_9 ) )
            // InternalConferenceProgram.g:1028:2: ( rule__Session__EndTimeAssignment_9 )
            {
             before(grammarAccess.getSessionAccess().getEndTimeAssignment_9()); 
            // InternalConferenceProgram.g:1029:2: ( rule__Session__EndTimeAssignment_9 )
            // InternalConferenceProgram.g:1029:3: rule__Session__EndTimeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndTimeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndTimeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__9__Impl"


    // $ANTLR start "rule__Session__Group__10"
    // InternalConferenceProgram.g:1037:1: rule__Session__Group__10 : rule__Session__Group__10__Impl ;
    public final void rule__Session__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1041:1: ( rule__Session__Group__10__Impl )
            // InternalConferenceProgram.g:1042:2: rule__Session__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__10"


    // $ANTLR start "rule__Session__Group__10__Impl"
    // InternalConferenceProgram.g:1048:1: rule__Session__Group__10__Impl : ( '}' ) ;
    public final void rule__Session__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1052:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1053:1: ( '}' )
            {
            // InternalConferenceProgram.g:1053:1: ( '}' )
            // InternalConferenceProgram.g:1054:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__10__Impl"


    // $ANTLR start "rule__ResearchPaper__Group__0"
    // InternalConferenceProgram.g:1064:1: rule__ResearchPaper__Group__0 : rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1 ;
    public final void rule__ResearchPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1068:1: ( rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1 )
            // InternalConferenceProgram.g:1069:2: rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ResearchPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchPaper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResearchPaper__Group__0"


    // $ANTLR start "rule__ResearchPaper__Group__0__Impl"
    // InternalConferenceProgram.g:1076:1: rule__ResearchPaper__Group__0__Impl : ( 'Paper' ) ;
    public final void rule__ResearchPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1080:1: ( ( 'Paper' ) )
            // InternalConferenceProgram.g:1081:1: ( 'Paper' )
            {
            // InternalConferenceProgram.g:1081:1: ( 'Paper' )
            // InternalConferenceProgram.g:1082:2: 'Paper'
            {
             before(grammarAccess.getResearchPaperAccess().getPaperKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResearchPaperAccess().getPaperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResearchPaper__Group__0__Impl"


    // $ANTLR start "rule__ResearchPaper__Group__1"
    // InternalConferenceProgram.g:1091:1: rule__ResearchPaper__Group__1 : rule__ResearchPaper__Group__1__Impl ;
    public final void rule__ResearchPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1095:1: ( rule__ResearchPaper__Group__1__Impl )
            // InternalConferenceProgram.g:1096:2: rule__ResearchPaper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResearchPaper__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResearchPaper__Group__1"


    // $ANTLR start "rule__ResearchPaper__Group__1__Impl"
    // InternalConferenceProgram.g:1102:1: rule__ResearchPaper__Group__1__Impl : ( ( rule__ResearchPaper__NameAssignment_1 ) ) ;
    public final void rule__ResearchPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1106:1: ( ( ( rule__ResearchPaper__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1107:1: ( ( rule__ResearchPaper__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1107:1: ( ( rule__ResearchPaper__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1108:2: ( rule__ResearchPaper__NameAssignment_1 )
            {
             before(grammarAccess.getResearchPaperAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1109:2: ( rule__ResearchPaper__NameAssignment_1 )
            // InternalConferenceProgram.g:1109:3: rule__ResearchPaper__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResearchPaper__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResearchPaperAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResearchPaper__Group__1__Impl"


    // $ANTLR start "rule__IndustryPaper__Group__0"
    // InternalConferenceProgram.g:1118:1: rule__IndustryPaper__Group__0 : rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1 ;
    public final void rule__IndustryPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1122:1: ( rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1 )
            // InternalConferenceProgram.g:1123:2: rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IndustryPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustryPaper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndustryPaper__Group__0"


    // $ANTLR start "rule__IndustryPaper__Group__0__Impl"
    // InternalConferenceProgram.g:1130:1: rule__IndustryPaper__Group__0__Impl : ( 'IndustryPaper' ) ;
    public final void rule__IndustryPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1134:1: ( ( 'IndustryPaper' ) )
            // InternalConferenceProgram.g:1135:1: ( 'IndustryPaper' )
            {
            // InternalConferenceProgram.g:1135:1: ( 'IndustryPaper' )
            // InternalConferenceProgram.g:1136:2: 'IndustryPaper'
            {
             before(grammarAccess.getIndustryPaperAccess().getIndustryPaperKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIndustryPaperAccess().getIndustryPaperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndustryPaper__Group__0__Impl"


    // $ANTLR start "rule__IndustryPaper__Group__1"
    // InternalConferenceProgram.g:1145:1: rule__IndustryPaper__Group__1 : rule__IndustryPaper__Group__1__Impl ;
    public final void rule__IndustryPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1149:1: ( rule__IndustryPaper__Group__1__Impl )
            // InternalConferenceProgram.g:1150:2: rule__IndustryPaper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndustryPaper__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndustryPaper__Group__1"


    // $ANTLR start "rule__IndustryPaper__Group__1__Impl"
    // InternalConferenceProgram.g:1156:1: rule__IndustryPaper__Group__1__Impl : ( ( rule__IndustryPaper__NameAssignment_1 ) ) ;
    public final void rule__IndustryPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1160:1: ( ( ( rule__IndustryPaper__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1161:1: ( ( rule__IndustryPaper__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1161:1: ( ( rule__IndustryPaper__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1162:2: ( rule__IndustryPaper__NameAssignment_1 )
            {
             before(grammarAccess.getIndustryPaperAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1163:2: ( rule__IndustryPaper__NameAssignment_1 )
            // InternalConferenceProgram.g:1163:3: rule__IndustryPaper__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndustryPaper__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndustryPaperAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndustryPaper__Group__1__Impl"


    // $ANTLR start "rule__DemoAndPoster__Group__0"
    // InternalConferenceProgram.g:1172:1: rule__DemoAndPoster__Group__0 : rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1 ;
    public final void rule__DemoAndPoster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1176:1: ( rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1 )
            // InternalConferenceProgram.g:1177:2: rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DemoAndPoster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoAndPoster__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DemoAndPoster__Group__0"


    // $ANTLR start "rule__DemoAndPoster__Group__0__Impl"
    // InternalConferenceProgram.g:1184:1: rule__DemoAndPoster__Group__0__Impl : ( 'DemoAndPoster' ) ;
    public final void rule__DemoAndPoster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1188:1: ( ( 'DemoAndPoster' ) )
            // InternalConferenceProgram.g:1189:1: ( 'DemoAndPoster' )
            {
            // InternalConferenceProgram.g:1189:1: ( 'DemoAndPoster' )
            // InternalConferenceProgram.g:1190:2: 'DemoAndPoster'
            {
             before(grammarAccess.getDemoAndPosterAccess().getDemoAndPosterKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDemoAndPosterAccess().getDemoAndPosterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DemoAndPoster__Group__0__Impl"


    // $ANTLR start "rule__DemoAndPoster__Group__1"
    // InternalConferenceProgram.g:1199:1: rule__DemoAndPoster__Group__1 : rule__DemoAndPoster__Group__1__Impl ;
    public final void rule__DemoAndPoster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1203:1: ( rule__DemoAndPoster__Group__1__Impl )
            // InternalConferenceProgram.g:1204:2: rule__DemoAndPoster__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DemoAndPoster__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DemoAndPoster__Group__1"


    // $ANTLR start "rule__DemoAndPoster__Group__1__Impl"
    // InternalConferenceProgram.g:1210:1: rule__DemoAndPoster__Group__1__Impl : ( ( rule__DemoAndPoster__NameAssignment_1 ) ) ;
    public final void rule__DemoAndPoster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1214:1: ( ( ( rule__DemoAndPoster__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1215:1: ( ( rule__DemoAndPoster__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1215:1: ( ( rule__DemoAndPoster__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1216:2: ( rule__DemoAndPoster__NameAssignment_1 )
            {
             before(grammarAccess.getDemoAndPosterAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1217:2: ( rule__DemoAndPoster__NameAssignment_1 )
            // InternalConferenceProgram.g:1217:3: rule__DemoAndPoster__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DemoAndPoster__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDemoAndPosterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DemoAndPoster__Group__1__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // InternalConferenceProgram.g:1226:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1230:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalConferenceProgram.g:1231:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Panel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0"


    // $ANTLR start "rule__Panel__Group__0__Impl"
    // InternalConferenceProgram.g:1238:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1242:1: ( ( 'Panel' ) )
            // InternalConferenceProgram.g:1243:1: ( 'Panel' )
            {
            // InternalConferenceProgram.g:1243:1: ( 'Panel' )
            // InternalConferenceProgram.g:1244:2: 'Panel'
            {
             before(grammarAccess.getPanelAccess().getPanelKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getPanelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0__Impl"


    // $ANTLR start "rule__Panel__Group__1"
    // InternalConferenceProgram.g:1253:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1257:1: ( rule__Panel__Group__1__Impl )
            // InternalConferenceProgram.g:1258:2: rule__Panel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1"


    // $ANTLR start "rule__Panel__Group__1__Impl"
    // InternalConferenceProgram.g:1264:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1268:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1269:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1269:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1270:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1271:2: ( rule__Panel__NameAssignment_1 )
            // InternalConferenceProgram.g:1271:3: rule__Panel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalConferenceProgram.g:1280:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1284:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalConferenceProgram.g:1285:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalConferenceProgram.g:1292:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1296:1: ( ( 'Location' ) )
            // InternalConferenceProgram.g:1297:1: ( 'Location' )
            {
            // InternalConferenceProgram.g:1297:1: ( 'Location' )
            // InternalConferenceProgram.g:1298:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalConferenceProgram.g:1307:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1311:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalConferenceProgram.g:1312:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalConferenceProgram.g:1319:1: rule__Location__Group__1__Impl : ( '{' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1323:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1324:1: ( '{' )
            {
            // InternalConferenceProgram.g:1324:1: ( '{' )
            // InternalConferenceProgram.g:1325:2: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalConferenceProgram.g:1334:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1338:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalConferenceProgram.g:1339:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalConferenceProgram.g:1346:1: rule__Location__Group__2__Impl : ( ( rule__Location__RoomAssignment_2 ) ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1350:1: ( ( ( rule__Location__RoomAssignment_2 ) ) )
            // InternalConferenceProgram.g:1351:1: ( ( rule__Location__RoomAssignment_2 ) )
            {
            // InternalConferenceProgram.g:1351:1: ( ( rule__Location__RoomAssignment_2 ) )
            // InternalConferenceProgram.g:1352:2: ( rule__Location__RoomAssignment_2 )
            {
             before(grammarAccess.getLocationAccess().getRoomAssignment_2()); 
            // InternalConferenceProgram.g:1353:2: ( rule__Location__RoomAssignment_2 )
            // InternalConferenceProgram.g:1353:3: rule__Location__RoomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Location__RoomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getRoomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalConferenceProgram.g:1361:1: rule__Location__Group__3 : rule__Location__Group__3__Impl ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1365:1: ( rule__Location__Group__3__Impl )
            // InternalConferenceProgram.g:1366:2: rule__Location__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalConferenceProgram.g:1372:1: rule__Location__Group__3__Impl : ( '}' ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1376:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1377:1: ( '}' )
            {
            // InternalConferenceProgram.g:1377:1: ( '}' )
            // InternalConferenceProgram.g:1378:2: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalConferenceProgram.g:1388:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1392:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalConferenceProgram.g:1393:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalConferenceProgram.g:1400:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1404:1: ( ( 'Room' ) )
            // InternalConferenceProgram.g:1405:1: ( 'Room' )
            {
            // InternalConferenceProgram.g:1405:1: ( 'Room' )
            // InternalConferenceProgram.g:1406:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalConferenceProgram.g:1415:1: rule__Room__Group__1 : rule__Room__Group__1__Impl ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1419:1: ( rule__Room__Group__1__Impl )
            // InternalConferenceProgram.g:1420:2: rule__Room__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalConferenceProgram.g:1426:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1430:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1431:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1431:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1432:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1433:2: ( rule__Room__NameAssignment_1 )
            // InternalConferenceProgram.g:1433:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Keynote__Group__0"
    // InternalConferenceProgram.g:1442:1: rule__Keynote__Group__0 : rule__Keynote__Group__0__Impl rule__Keynote__Group__1 ;
    public final void rule__Keynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1446:1: ( rule__Keynote__Group__0__Impl rule__Keynote__Group__1 )
            // InternalConferenceProgram.g:1447:2: rule__Keynote__Group__0__Impl rule__Keynote__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Keynote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__0"


    // $ANTLR start "rule__Keynote__Group__0__Impl"
    // InternalConferenceProgram.g:1454:1: rule__Keynote__Group__0__Impl : ( 'Keynote' ) ;
    public final void rule__Keynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1458:1: ( ( 'Keynote' ) )
            // InternalConferenceProgram.g:1459:1: ( 'Keynote' )
            {
            // InternalConferenceProgram.g:1459:1: ( 'Keynote' )
            // InternalConferenceProgram.g:1460:2: 'Keynote'
            {
             before(grammarAccess.getKeynoteAccess().getKeynoteKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getKeynoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__0__Impl"


    // $ANTLR start "rule__Keynote__Group__1"
    // InternalConferenceProgram.g:1469:1: rule__Keynote__Group__1 : rule__Keynote__Group__1__Impl rule__Keynote__Group__2 ;
    public final void rule__Keynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1473:1: ( rule__Keynote__Group__1__Impl rule__Keynote__Group__2 )
            // InternalConferenceProgram.g:1474:2: rule__Keynote__Group__1__Impl rule__Keynote__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__1"


    // $ANTLR start "rule__Keynote__Group__1__Impl"
    // InternalConferenceProgram.g:1481:1: rule__Keynote__Group__1__Impl : ( ( rule__Keynote__NameAssignment_1 ) ) ;
    public final void rule__Keynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1485:1: ( ( ( rule__Keynote__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1486:1: ( ( rule__Keynote__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1486:1: ( ( rule__Keynote__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1487:2: ( rule__Keynote__NameAssignment_1 )
            {
             before(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1488:2: ( rule__Keynote__NameAssignment_1 )
            // InternalConferenceProgram.g:1488:3: rule__Keynote__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__1__Impl"


    // $ANTLR start "rule__Keynote__Group__2"
    // InternalConferenceProgram.g:1496:1: rule__Keynote__Group__2 : rule__Keynote__Group__2__Impl rule__Keynote__Group__3 ;
    public final void rule__Keynote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1500:1: ( rule__Keynote__Group__2__Impl rule__Keynote__Group__3 )
            // InternalConferenceProgram.g:1501:2: rule__Keynote__Group__2__Impl rule__Keynote__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__2"


    // $ANTLR start "rule__Keynote__Group__2__Impl"
    // InternalConferenceProgram.g:1508:1: rule__Keynote__Group__2__Impl : ( ( rule__Keynote__StartTimeAssignment_2 ) ) ;
    public final void rule__Keynote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1512:1: ( ( ( rule__Keynote__StartTimeAssignment_2 ) ) )
            // InternalConferenceProgram.g:1513:1: ( ( rule__Keynote__StartTimeAssignment_2 ) )
            {
            // InternalConferenceProgram.g:1513:1: ( ( rule__Keynote__StartTimeAssignment_2 ) )
            // InternalConferenceProgram.g:1514:2: ( rule__Keynote__StartTimeAssignment_2 )
            {
             before(grammarAccess.getKeynoteAccess().getStartTimeAssignment_2()); 
            // InternalConferenceProgram.g:1515:2: ( rule__Keynote__StartTimeAssignment_2 )
            // InternalConferenceProgram.g:1515:3: rule__Keynote__StartTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__StartTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getStartTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__2__Impl"


    // $ANTLR start "rule__Keynote__Group__3"
    // InternalConferenceProgram.g:1523:1: rule__Keynote__Group__3 : rule__Keynote__Group__3__Impl ;
    public final void rule__Keynote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1527:1: ( rule__Keynote__Group__3__Impl )
            // InternalConferenceProgram.g:1528:2: rule__Keynote__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__3"


    // $ANTLR start "rule__Keynote__Group__3__Impl"
    // InternalConferenceProgram.g:1534:1: rule__Keynote__Group__3__Impl : ( ( rule__Keynote__EndTimeAssignment_3 ) ) ;
    public final void rule__Keynote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1538:1: ( ( ( rule__Keynote__EndTimeAssignment_3 ) ) )
            // InternalConferenceProgram.g:1539:1: ( ( rule__Keynote__EndTimeAssignment_3 ) )
            {
            // InternalConferenceProgram.g:1539:1: ( ( rule__Keynote__EndTimeAssignment_3 ) )
            // InternalConferenceProgram.g:1540:2: ( rule__Keynote__EndTimeAssignment_3 )
            {
             before(grammarAccess.getKeynoteAccess().getEndTimeAssignment_3()); 
            // InternalConferenceProgram.g:1541:2: ( rule__Keynote__EndTimeAssignment_3 )
            // InternalConferenceProgram.g:1541:3: rule__Keynote__EndTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__EndTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getEndTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__3__Impl"


    // $ANTLR start "rule__CoffeBreak__Group__0"
    // InternalConferenceProgram.g:1550:1: rule__CoffeBreak__Group__0 : rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1 ;
    public final void rule__CoffeBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1554:1: ( rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1 )
            // InternalConferenceProgram.g:1555:2: rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CoffeBreak__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__0"


    // $ANTLR start "rule__CoffeBreak__Group__0__Impl"
    // InternalConferenceProgram.g:1562:1: rule__CoffeBreak__Group__0__Impl : ( 'Break' ) ;
    public final void rule__CoffeBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1566:1: ( ( 'Break' ) )
            // InternalConferenceProgram.g:1567:1: ( 'Break' )
            {
            // InternalConferenceProgram.g:1567:1: ( 'Break' )
            // InternalConferenceProgram.g:1568:2: 'Break'
            {
             before(grammarAccess.getCoffeBreakAccess().getBreakKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCoffeBreakAccess().getBreakKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__0__Impl"


    // $ANTLR start "rule__CoffeBreak__Group__1"
    // InternalConferenceProgram.g:1577:1: rule__CoffeBreak__Group__1 : rule__CoffeBreak__Group__1__Impl rule__CoffeBreak__Group__2 ;
    public final void rule__CoffeBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1581:1: ( rule__CoffeBreak__Group__1__Impl rule__CoffeBreak__Group__2 )
            // InternalConferenceProgram.g:1582:2: rule__CoffeBreak__Group__1__Impl rule__CoffeBreak__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CoffeBreak__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__1"


    // $ANTLR start "rule__CoffeBreak__Group__1__Impl"
    // InternalConferenceProgram.g:1589:1: rule__CoffeBreak__Group__1__Impl : ( ( rule__CoffeBreak__NameAssignment_1 ) ) ;
    public final void rule__CoffeBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1593:1: ( ( ( rule__CoffeBreak__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1594:1: ( ( rule__CoffeBreak__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1594:1: ( ( rule__CoffeBreak__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1595:2: ( rule__CoffeBreak__NameAssignment_1 )
            {
             before(grammarAccess.getCoffeBreakAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1596:2: ( rule__CoffeBreak__NameAssignment_1 )
            // InternalConferenceProgram.g:1596:3: rule__CoffeBreak__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoffeBreakAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__1__Impl"


    // $ANTLR start "rule__CoffeBreak__Group__2"
    // InternalConferenceProgram.g:1604:1: rule__CoffeBreak__Group__2 : rule__CoffeBreak__Group__2__Impl rule__CoffeBreak__Group__3 ;
    public final void rule__CoffeBreak__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1608:1: ( rule__CoffeBreak__Group__2__Impl rule__CoffeBreak__Group__3 )
            // InternalConferenceProgram.g:1609:2: rule__CoffeBreak__Group__2__Impl rule__CoffeBreak__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CoffeBreak__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__2"


    // $ANTLR start "rule__CoffeBreak__Group__2__Impl"
    // InternalConferenceProgram.g:1616:1: rule__CoffeBreak__Group__2__Impl : ( ( rule__CoffeBreak__StartTimeAssignment_2 ) ) ;
    public final void rule__CoffeBreak__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1620:1: ( ( ( rule__CoffeBreak__StartTimeAssignment_2 ) ) )
            // InternalConferenceProgram.g:1621:1: ( ( rule__CoffeBreak__StartTimeAssignment_2 ) )
            {
            // InternalConferenceProgram.g:1621:1: ( ( rule__CoffeBreak__StartTimeAssignment_2 ) )
            // InternalConferenceProgram.g:1622:2: ( rule__CoffeBreak__StartTimeAssignment_2 )
            {
             before(grammarAccess.getCoffeBreakAccess().getStartTimeAssignment_2()); 
            // InternalConferenceProgram.g:1623:2: ( rule__CoffeBreak__StartTimeAssignment_2 )
            // InternalConferenceProgram.g:1623:3: rule__CoffeBreak__StartTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__StartTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoffeBreakAccess().getStartTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__2__Impl"


    // $ANTLR start "rule__CoffeBreak__Group__3"
    // InternalConferenceProgram.g:1631:1: rule__CoffeBreak__Group__3 : rule__CoffeBreak__Group__3__Impl ;
    public final void rule__CoffeBreak__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1635:1: ( rule__CoffeBreak__Group__3__Impl )
            // InternalConferenceProgram.g:1636:2: rule__CoffeBreak__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__3"


    // $ANTLR start "rule__CoffeBreak__Group__3__Impl"
    // InternalConferenceProgram.g:1642:1: rule__CoffeBreak__Group__3__Impl : ( ( rule__CoffeBreak__EndTimeAssignment_3 ) ) ;
    public final void rule__CoffeBreak__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1646:1: ( ( ( rule__CoffeBreak__EndTimeAssignment_3 ) ) )
            // InternalConferenceProgram.g:1647:1: ( ( rule__CoffeBreak__EndTimeAssignment_3 ) )
            {
            // InternalConferenceProgram.g:1647:1: ( ( rule__CoffeBreak__EndTimeAssignment_3 ) )
            // InternalConferenceProgram.g:1648:2: ( rule__CoffeBreak__EndTimeAssignment_3 )
            {
             before(grammarAccess.getCoffeBreakAccess().getEndTimeAssignment_3()); 
            // InternalConferenceProgram.g:1649:2: ( rule__CoffeBreak__EndTimeAssignment_3 )
            // InternalConferenceProgram.g:1649:3: rule__CoffeBreak__EndTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__EndTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoffeBreakAccess().getEndTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__Group__3__Impl"


    // $ANTLR start "rule__Lunch__Group__0"
    // InternalConferenceProgram.g:1658:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1662:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalConferenceProgram.g:1663:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Lunch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__0"


    // $ANTLR start "rule__Lunch__Group__0__Impl"
    // InternalConferenceProgram.g:1670:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1674:1: ( ( 'Lunch' ) )
            // InternalConferenceProgram.g:1675:1: ( 'Lunch' )
            {
            // InternalConferenceProgram.g:1675:1: ( 'Lunch' )
            // InternalConferenceProgram.g:1676:2: 'Lunch'
            {
             before(grammarAccess.getLunchAccess().getLunchKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getLunchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__0__Impl"


    // $ANTLR start "rule__Lunch__Group__1"
    // InternalConferenceProgram.g:1685:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl rule__Lunch__Group__2 ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1689:1: ( rule__Lunch__Group__1__Impl rule__Lunch__Group__2 )
            // InternalConferenceProgram.g:1690:2: rule__Lunch__Group__1__Impl rule__Lunch__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__1"


    // $ANTLR start "rule__Lunch__Group__1__Impl"
    // InternalConferenceProgram.g:1697:1: rule__Lunch__Group__1__Impl : ( ( rule__Lunch__NameAssignment_1 ) ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1701:1: ( ( ( rule__Lunch__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1702:1: ( ( rule__Lunch__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1702:1: ( ( rule__Lunch__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1703:2: ( rule__Lunch__NameAssignment_1 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1704:2: ( rule__Lunch__NameAssignment_1 )
            // InternalConferenceProgram.g:1704:3: rule__Lunch__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__1__Impl"


    // $ANTLR start "rule__Lunch__Group__2"
    // InternalConferenceProgram.g:1712:1: rule__Lunch__Group__2 : rule__Lunch__Group__2__Impl rule__Lunch__Group__3 ;
    public final void rule__Lunch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1716:1: ( rule__Lunch__Group__2__Impl rule__Lunch__Group__3 )
            // InternalConferenceProgram.g:1717:2: rule__Lunch__Group__2__Impl rule__Lunch__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__2"


    // $ANTLR start "rule__Lunch__Group__2__Impl"
    // InternalConferenceProgram.g:1724:1: rule__Lunch__Group__2__Impl : ( ( rule__Lunch__StartTimeAssignment_2 ) ) ;
    public final void rule__Lunch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1728:1: ( ( ( rule__Lunch__StartTimeAssignment_2 ) ) )
            // InternalConferenceProgram.g:1729:1: ( ( rule__Lunch__StartTimeAssignment_2 ) )
            {
            // InternalConferenceProgram.g:1729:1: ( ( rule__Lunch__StartTimeAssignment_2 ) )
            // InternalConferenceProgram.g:1730:2: ( rule__Lunch__StartTimeAssignment_2 )
            {
             before(grammarAccess.getLunchAccess().getStartTimeAssignment_2()); 
            // InternalConferenceProgram.g:1731:2: ( rule__Lunch__StartTimeAssignment_2 )
            // InternalConferenceProgram.g:1731:3: rule__Lunch__StartTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__StartTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getStartTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__2__Impl"


    // $ANTLR start "rule__Lunch__Group__3"
    // InternalConferenceProgram.g:1739:1: rule__Lunch__Group__3 : rule__Lunch__Group__3__Impl ;
    public final void rule__Lunch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1743:1: ( rule__Lunch__Group__3__Impl )
            // InternalConferenceProgram.g:1744:2: rule__Lunch__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__3"


    // $ANTLR start "rule__Lunch__Group__3__Impl"
    // InternalConferenceProgram.g:1750:1: rule__Lunch__Group__3__Impl : ( ( rule__Lunch__EndTimeAssignment_3 ) ) ;
    public final void rule__Lunch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1754:1: ( ( ( rule__Lunch__EndTimeAssignment_3 ) ) )
            // InternalConferenceProgram.g:1755:1: ( ( rule__Lunch__EndTimeAssignment_3 ) )
            {
            // InternalConferenceProgram.g:1755:1: ( ( rule__Lunch__EndTimeAssignment_3 ) )
            // InternalConferenceProgram.g:1756:2: ( rule__Lunch__EndTimeAssignment_3 )
            {
             before(grammarAccess.getLunchAccess().getEndTimeAssignment_3()); 
            // InternalConferenceProgram.g:1757:2: ( rule__Lunch__EndTimeAssignment_3 )
            // InternalConferenceProgram.g:1757:3: rule__Lunch__EndTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__EndTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getEndTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__3__Impl"


    // $ANTLR start "rule__SocialEvent__Group__0"
    // InternalConferenceProgram.g:1766:1: rule__SocialEvent__Group__0 : rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1 ;
    public final void rule__SocialEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1770:1: ( rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1 )
            // InternalConferenceProgram.g:1771:2: rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SocialEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__0"


    // $ANTLR start "rule__SocialEvent__Group__0__Impl"
    // InternalConferenceProgram.g:1778:1: rule__SocialEvent__Group__0__Impl : ( 'SocialEvent' ) ;
    public final void rule__SocialEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1782:1: ( ( 'SocialEvent' ) )
            // InternalConferenceProgram.g:1783:1: ( 'SocialEvent' )
            {
            // InternalConferenceProgram.g:1783:1: ( 'SocialEvent' )
            // InternalConferenceProgram.g:1784:2: 'SocialEvent'
            {
             before(grammarAccess.getSocialEventAccess().getSocialEventKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getSocialEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__0__Impl"


    // $ANTLR start "rule__SocialEvent__Group__1"
    // InternalConferenceProgram.g:1793:1: rule__SocialEvent__Group__1 : rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2 ;
    public final void rule__SocialEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1797:1: ( rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2 )
            // InternalConferenceProgram.g:1798:2: rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SocialEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__1"


    // $ANTLR start "rule__SocialEvent__Group__1__Impl"
    // InternalConferenceProgram.g:1805:1: rule__SocialEvent__Group__1__Impl : ( ( rule__SocialEvent__NameAssignment_1 ) ) ;
    public final void rule__SocialEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1809:1: ( ( ( rule__SocialEvent__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1810:1: ( ( rule__SocialEvent__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1810:1: ( ( rule__SocialEvent__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1811:2: ( rule__SocialEvent__NameAssignment_1 )
            {
             before(grammarAccess.getSocialEventAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1812:2: ( rule__SocialEvent__NameAssignment_1 )
            // InternalConferenceProgram.g:1812:3: rule__SocialEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__1__Impl"


    // $ANTLR start "rule__SocialEvent__Group__2"
    // InternalConferenceProgram.g:1820:1: rule__SocialEvent__Group__2 : rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3 ;
    public final void rule__SocialEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1824:1: ( rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3 )
            // InternalConferenceProgram.g:1825:2: rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SocialEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__2"


    // $ANTLR start "rule__SocialEvent__Group__2__Impl"
    // InternalConferenceProgram.g:1832:1: rule__SocialEvent__Group__2__Impl : ( '{' ) ;
    public final void rule__SocialEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1836:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1837:1: ( '{' )
            {
            // InternalConferenceProgram.g:1837:1: ( '{' )
            // InternalConferenceProgram.g:1838:2: '{'
            {
             before(grammarAccess.getSocialEventAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__2__Impl"


    // $ANTLR start "rule__SocialEvent__Group__3"
    // InternalConferenceProgram.g:1847:1: rule__SocialEvent__Group__3 : rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4 ;
    public final void rule__SocialEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1851:1: ( rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4 )
            // InternalConferenceProgram.g:1852:2: rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SocialEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__3"


    // $ANTLR start "rule__SocialEvent__Group__3__Impl"
    // InternalConferenceProgram.g:1859:1: rule__SocialEvent__Group__3__Impl : ( ( rule__SocialEvent__LocationAssignment_3 ) ) ;
    public final void rule__SocialEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1863:1: ( ( ( rule__SocialEvent__LocationAssignment_3 ) ) )
            // InternalConferenceProgram.g:1864:1: ( ( rule__SocialEvent__LocationAssignment_3 ) )
            {
            // InternalConferenceProgram.g:1864:1: ( ( rule__SocialEvent__LocationAssignment_3 ) )
            // InternalConferenceProgram.g:1865:2: ( rule__SocialEvent__LocationAssignment_3 )
            {
             before(grammarAccess.getSocialEventAccess().getLocationAssignment_3()); 
            // InternalConferenceProgram.g:1866:2: ( rule__SocialEvent__LocationAssignment_3 )
            // InternalConferenceProgram.g:1866:3: rule__SocialEvent__LocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__LocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getLocationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__3__Impl"


    // $ANTLR start "rule__SocialEvent__Group__4"
    // InternalConferenceProgram.g:1874:1: rule__SocialEvent__Group__4 : rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5 ;
    public final void rule__SocialEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1878:1: ( rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5 )
            // InternalConferenceProgram.g:1879:2: rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__SocialEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__4"


    // $ANTLR start "rule__SocialEvent__Group__4__Impl"
    // InternalConferenceProgram.g:1886:1: rule__SocialEvent__Group__4__Impl : ( ( rule__SocialEvent__StartTimeAssignment_4 ) ) ;
    public final void rule__SocialEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1890:1: ( ( ( rule__SocialEvent__StartTimeAssignment_4 ) ) )
            // InternalConferenceProgram.g:1891:1: ( ( rule__SocialEvent__StartTimeAssignment_4 ) )
            {
            // InternalConferenceProgram.g:1891:1: ( ( rule__SocialEvent__StartTimeAssignment_4 ) )
            // InternalConferenceProgram.g:1892:2: ( rule__SocialEvent__StartTimeAssignment_4 )
            {
             before(grammarAccess.getSocialEventAccess().getStartTimeAssignment_4()); 
            // InternalConferenceProgram.g:1893:2: ( rule__SocialEvent__StartTimeAssignment_4 )
            // InternalConferenceProgram.g:1893:3: rule__SocialEvent__StartTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__StartTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getStartTimeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__4__Impl"


    // $ANTLR start "rule__SocialEvent__Group__5"
    // InternalConferenceProgram.g:1901:1: rule__SocialEvent__Group__5 : rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6 ;
    public final void rule__SocialEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1905:1: ( rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6 )
            // InternalConferenceProgram.g:1906:2: rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__SocialEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__5"


    // $ANTLR start "rule__SocialEvent__Group__5__Impl"
    // InternalConferenceProgram.g:1913:1: rule__SocialEvent__Group__5__Impl : ( ( rule__SocialEvent__EndTimeAssignment_5 ) ) ;
    public final void rule__SocialEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1917:1: ( ( ( rule__SocialEvent__EndTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:1918:1: ( ( rule__SocialEvent__EndTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:1918:1: ( ( rule__SocialEvent__EndTimeAssignment_5 ) )
            // InternalConferenceProgram.g:1919:2: ( rule__SocialEvent__EndTimeAssignment_5 )
            {
             before(grammarAccess.getSocialEventAccess().getEndTimeAssignment_5()); 
            // InternalConferenceProgram.g:1920:2: ( rule__SocialEvent__EndTimeAssignment_5 )
            // InternalConferenceProgram.g:1920:3: rule__SocialEvent__EndTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__EndTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getEndTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__5__Impl"


    // $ANTLR start "rule__SocialEvent__Group__6"
    // InternalConferenceProgram.g:1928:1: rule__SocialEvent__Group__6 : rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7 ;
    public final void rule__SocialEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1932:1: ( rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7 )
            // InternalConferenceProgram.g:1933:2: rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__SocialEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__6"


    // $ANTLR start "rule__SocialEvent__Group__6__Impl"
    // InternalConferenceProgram.g:1940:1: rule__SocialEvent__Group__6__Impl : ( ( rule__SocialEvent__DirectionsAssignment_6 ) ) ;
    public final void rule__SocialEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1944:1: ( ( ( rule__SocialEvent__DirectionsAssignment_6 ) ) )
            // InternalConferenceProgram.g:1945:1: ( ( rule__SocialEvent__DirectionsAssignment_6 ) )
            {
            // InternalConferenceProgram.g:1945:1: ( ( rule__SocialEvent__DirectionsAssignment_6 ) )
            // InternalConferenceProgram.g:1946:2: ( rule__SocialEvent__DirectionsAssignment_6 )
            {
             before(grammarAccess.getSocialEventAccess().getDirectionsAssignment_6()); 
            // InternalConferenceProgram.g:1947:2: ( rule__SocialEvent__DirectionsAssignment_6 )
            // InternalConferenceProgram.g:1947:3: rule__SocialEvent__DirectionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__DirectionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSocialEventAccess().getDirectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__6__Impl"


    // $ANTLR start "rule__SocialEvent__Group__7"
    // InternalConferenceProgram.g:1955:1: rule__SocialEvent__Group__7 : rule__SocialEvent__Group__7__Impl ;
    public final void rule__SocialEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1959:1: ( rule__SocialEvent__Group__7__Impl )
            // InternalConferenceProgram.g:1960:2: rule__SocialEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SocialEvent__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__7"


    // $ANTLR start "rule__SocialEvent__Group__7__Impl"
    // InternalConferenceProgram.g:1966:1: rule__SocialEvent__Group__7__Impl : ( '}' ) ;
    public final void rule__SocialEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1970:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1971:1: ( '}' )
            {
            // InternalConferenceProgram.g:1971:1: ( '}' )
            // InternalConferenceProgram.g:1972:2: '}'
            {
             before(grammarAccess.getSocialEventAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__Group__7__Impl"


    // $ANTLR start "rule__GoogleMapsDirections__Group__0"
    // InternalConferenceProgram.g:1982:1: rule__GoogleMapsDirections__Group__0 : rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1 ;
    public final void rule__GoogleMapsDirections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1986:1: ( rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1 )
            // InternalConferenceProgram.g:1987:2: rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GoogleMapsDirections__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__0"


    // $ANTLR start "rule__GoogleMapsDirections__Group__0__Impl"
    // InternalConferenceProgram.g:1994:1: rule__GoogleMapsDirections__Group__0__Impl : ( 'Directions' ) ;
    public final void rule__GoogleMapsDirections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1998:1: ( ( 'Directions' ) )
            // InternalConferenceProgram.g:1999:1: ( 'Directions' )
            {
            // InternalConferenceProgram.g:1999:1: ( 'Directions' )
            // InternalConferenceProgram.g:2000:2: 'Directions'
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getDirectionsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGoogleMapsDirectionsAccess().getDirectionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__0__Impl"


    // $ANTLR start "rule__GoogleMapsDirections__Group__1"
    // InternalConferenceProgram.g:2009:1: rule__GoogleMapsDirections__Group__1 : rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2 ;
    public final void rule__GoogleMapsDirections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2013:1: ( rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2 )
            // InternalConferenceProgram.g:2014:2: rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GoogleMapsDirections__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__1"


    // $ANTLR start "rule__GoogleMapsDirections__Group__1__Impl"
    // InternalConferenceProgram.g:2021:1: rule__GoogleMapsDirections__Group__1__Impl : ( '{' ) ;
    public final void rule__GoogleMapsDirections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2025:1: ( ( '{' ) )
            // InternalConferenceProgram.g:2026:1: ( '{' )
            {
            // InternalConferenceProgram.g:2026:1: ( '{' )
            // InternalConferenceProgram.g:2027:2: '{'
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGoogleMapsDirectionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__1__Impl"


    // $ANTLR start "rule__GoogleMapsDirections__Group__2"
    // InternalConferenceProgram.g:2036:1: rule__GoogleMapsDirections__Group__2 : rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3 ;
    public final void rule__GoogleMapsDirections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2040:1: ( rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3 )
            // InternalConferenceProgram.g:2041:2: rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__GoogleMapsDirections__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__2"


    // $ANTLR start "rule__GoogleMapsDirections__Group__2__Impl"
    // InternalConferenceProgram.g:2048:1: rule__GoogleMapsDirections__Group__2__Impl : ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) ) ;
    public final void rule__GoogleMapsDirections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2052:1: ( ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) ) )
            // InternalConferenceProgram.g:2053:1: ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) )
            {
            // InternalConferenceProgram.g:2053:1: ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) )
            // InternalConferenceProgram.g:2054:2: ( rule__GoogleMapsDirections__UrlAssignment_2 )
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getUrlAssignment_2()); 
            // InternalConferenceProgram.g:2055:2: ( rule__GoogleMapsDirections__UrlAssignment_2 )
            // InternalConferenceProgram.g:2055:3: rule__GoogleMapsDirections__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoogleMapsDirectionsAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__2__Impl"


    // $ANTLR start "rule__GoogleMapsDirections__Group__3"
    // InternalConferenceProgram.g:2063:1: rule__GoogleMapsDirections__Group__3 : rule__GoogleMapsDirections__Group__3__Impl ;
    public final void rule__GoogleMapsDirections__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2067:1: ( rule__GoogleMapsDirections__Group__3__Impl )
            // InternalConferenceProgram.g:2068:2: rule__GoogleMapsDirections__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoogleMapsDirections__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__3"


    // $ANTLR start "rule__GoogleMapsDirections__Group__3__Impl"
    // InternalConferenceProgram.g:2074:1: rule__GoogleMapsDirections__Group__3__Impl : ( '}' ) ;
    public final void rule__GoogleMapsDirections__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2078:1: ( ( '}' ) )
            // InternalConferenceProgram.g:2079:1: ( '}' )
            {
            // InternalConferenceProgram.g:2079:1: ( '}' )
            // InternalConferenceProgram.g:2080:2: '}'
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGoogleMapsDirectionsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__Group__3__Impl"


    // $ANTLR start "rule__ConferenceProgram__NameAssignment_1"
    // InternalConferenceProgram.g:2090:1: rule__ConferenceProgram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConferenceProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2094:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2095:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2095:2: ( RULE_ID )
            // InternalConferenceProgram.g:2096:3: RULE_ID
            {
             before(grammarAccess.getConferenceProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConferenceProgramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__NameAssignment_1"


    // $ANTLR start "rule__ConferenceProgram__DateAssignment_2"
    // InternalConferenceProgram.g:2105:1: rule__ConferenceProgram__DateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConferenceProgram__DateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2109:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2110:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2110:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2111:3: RULE_STRING
            {
             before(grammarAccess.getConferenceProgramAccess().getDateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConferenceProgramAccess().getDateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__DateAssignment_2"


    // $ANTLR start "rule__ConferenceProgram__TracksAssignment_3"
    // InternalConferenceProgram.g:2120:1: rule__ConferenceProgram__TracksAssignment_3 : ( ruleTrack ) ;
    public final void rule__ConferenceProgram__TracksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2124:1: ( ( ruleTrack ) )
            // InternalConferenceProgram.g:2125:2: ( ruleTrack )
            {
            // InternalConferenceProgram.g:2125:2: ( ruleTrack )
            // InternalConferenceProgram.g:2126:3: ruleTrack
            {
             before(grammarAccess.getConferenceProgramAccess().getTracksTrackParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getTracksTrackParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__TracksAssignment_3"


    // $ANTLR start "rule__ConferenceProgram__SocialEventsAssignment_4"
    // InternalConferenceProgram.g:2135:1: rule__ConferenceProgram__SocialEventsAssignment_4 : ( ruleSocialEvent ) ;
    public final void rule__ConferenceProgram__SocialEventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2139:1: ( ( ruleSocialEvent ) )
            // InternalConferenceProgram.g:2140:2: ( ruleSocialEvent )
            {
            // InternalConferenceProgram.g:2140:2: ( ruleSocialEvent )
            // InternalConferenceProgram.g:2141:3: ruleSocialEvent
            {
             before(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSocialEvent();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__SocialEventsAssignment_4"


    // $ANTLR start "rule__ConferenceProgram__KeynotesAssignment_5"
    // InternalConferenceProgram.g:2150:1: rule__ConferenceProgram__KeynotesAssignment_5 : ( ruleKeynote ) ;
    public final void rule__ConferenceProgram__KeynotesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2154:1: ( ( ruleKeynote ) )
            // InternalConferenceProgram.g:2155:2: ( ruleKeynote )
            {
            // InternalConferenceProgram.g:2155:2: ( ruleKeynote )
            // InternalConferenceProgram.g:2156:3: ruleKeynote
            {
             before(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleKeynote();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__KeynotesAssignment_5"


    // $ANTLR start "rule__ConferenceProgram__CoffebreaksAssignment_6"
    // InternalConferenceProgram.g:2165:1: rule__ConferenceProgram__CoffebreaksAssignment_6 : ( ruleCoffeBreak ) ;
    public final void rule__ConferenceProgram__CoffebreaksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2169:1: ( ( ruleCoffeBreak ) )
            // InternalConferenceProgram.g:2170:2: ( ruleCoffeBreak )
            {
            // InternalConferenceProgram.g:2170:2: ( ruleCoffeBreak )
            // InternalConferenceProgram.g:2171:3: ruleCoffeBreak
            {
             before(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCoffeBreak();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__CoffebreaksAssignment_6"


    // $ANTLR start "rule__ConferenceProgram__LunchesAssignment_7"
    // InternalConferenceProgram.g:2180:1: rule__ConferenceProgram__LunchesAssignment_7 : ( ruleLunch ) ;
    public final void rule__ConferenceProgram__LunchesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2184:1: ( ( ruleLunch ) )
            // InternalConferenceProgram.g:2185:2: ( ruleLunch )
            {
            // InternalConferenceProgram.g:2185:2: ( ruleLunch )
            // InternalConferenceProgram.g:2186:3: ruleLunch
            {
             before(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLunch();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConferenceProgram__LunchesAssignment_7"


    // $ANTLR start "rule__Track__NameAssignment_1"
    // InternalConferenceProgram.g:2195:1: rule__Track__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Track__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2199:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2200:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2200:2: ( RULE_ID )
            // InternalConferenceProgram.g:2201:3: RULE_ID
            {
             before(grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__NameAssignment_1"


    // $ANTLR start "rule__Track__SessionAssignment_3"
    // InternalConferenceProgram.g:2210:1: rule__Track__SessionAssignment_3 : ( ruleSession ) ;
    public final void rule__Track__SessionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2214:1: ( ( ruleSession ) )
            // InternalConferenceProgram.g:2215:2: ( ruleSession )
            {
            // InternalConferenceProgram.g:2215:2: ( ruleSession )
            // InternalConferenceProgram.g:2216:3: ruleSession
            {
             before(grammarAccess.getTrackAccess().getSessionSessionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getSessionSessionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__SessionAssignment_3"


    // $ANTLR start "rule__Session__NameAssignment_1"
    // InternalConferenceProgram.g:2225:1: rule__Session__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Session__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2229:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2230:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2230:2: ( RULE_ID )
            // InternalConferenceProgram.g:2231:3: RULE_ID
            {
             before(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__NameAssignment_1"


    // $ANTLR start "rule__Session__ResearchpaperAssignment_3"
    // InternalConferenceProgram.g:2240:1: rule__Session__ResearchpaperAssignment_3 : ( ruleResearchPaper ) ;
    public final void rule__Session__ResearchpaperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2244:1: ( ( ruleResearchPaper ) )
            // InternalConferenceProgram.g:2245:2: ( ruleResearchPaper )
            {
            // InternalConferenceProgram.g:2245:2: ( ruleResearchPaper )
            // InternalConferenceProgram.g:2246:3: ruleResearchPaper
            {
             before(grammarAccess.getSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResearchPaper();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__ResearchpaperAssignment_3"


    // $ANTLR start "rule__Session__IndustrypaperAssignment_4"
    // InternalConferenceProgram.g:2255:1: rule__Session__IndustrypaperAssignment_4 : ( ruleIndustryPaper ) ;
    public final void rule__Session__IndustrypaperAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2259:1: ( ( ruleIndustryPaper ) )
            // InternalConferenceProgram.g:2260:2: ( ruleIndustryPaper )
            {
            // InternalConferenceProgram.g:2260:2: ( ruleIndustryPaper )
            // InternalConferenceProgram.g:2261:3: ruleIndustryPaper
            {
             before(grammarAccess.getSessionAccess().getIndustrypaperIndustryPaperParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIndustryPaper();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getIndustrypaperIndustryPaperParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__IndustrypaperAssignment_4"


    // $ANTLR start "rule__Session__DemoandposterAssignment_5"
    // InternalConferenceProgram.g:2270:1: rule__Session__DemoandposterAssignment_5 : ( ruleDemoAndPoster ) ;
    public final void rule__Session__DemoandposterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2274:1: ( ( ruleDemoAndPoster ) )
            // InternalConferenceProgram.g:2275:2: ( ruleDemoAndPoster )
            {
            // InternalConferenceProgram.g:2275:2: ( ruleDemoAndPoster )
            // InternalConferenceProgram.g:2276:3: ruleDemoAndPoster
            {
             before(grammarAccess.getSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDemoAndPoster();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__DemoandposterAssignment_5"


    // $ANTLR start "rule__Session__PanelAssignment_6"
    // InternalConferenceProgram.g:2285:1: rule__Session__PanelAssignment_6 : ( rulePanel ) ;
    public final void rule__Session__PanelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2289:1: ( ( rulePanel ) )
            // InternalConferenceProgram.g:2290:2: ( rulePanel )
            {
            // InternalConferenceProgram.g:2290:2: ( rulePanel )
            // InternalConferenceProgram.g:2291:3: rulePanel
            {
             before(grammarAccess.getSessionAccess().getPanelPanelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getPanelPanelParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__PanelAssignment_6"


    // $ANTLR start "rule__Session__LocationAssignment_7"
    // InternalConferenceProgram.g:2300:1: rule__Session__LocationAssignment_7 : ( ruleLocation ) ;
    public final void rule__Session__LocationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2304:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:2305:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:2305:2: ( ruleLocation )
            // InternalConferenceProgram.g:2306:3: ruleLocation
            {
             before(grammarAccess.getSessionAccess().getLocationLocationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getLocationLocationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__LocationAssignment_7"


    // $ANTLR start "rule__Session__StartTimeAssignment_8"
    // InternalConferenceProgram.g:2315:1: rule__Session__StartTimeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Session__StartTimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2319:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2320:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2320:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2321:3: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartTimeAssignment_8"


    // $ANTLR start "rule__Session__EndTimeAssignment_9"
    // InternalConferenceProgram.g:2330:1: rule__Session__EndTimeAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Session__EndTimeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2334:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2335:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2335:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2336:3: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndTimeAssignment_9"


    // $ANTLR start "rule__ResearchPaper__NameAssignment_1"
    // InternalConferenceProgram.g:2345:1: rule__ResearchPaper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResearchPaper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2349:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2350:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2350:2: ( RULE_ID )
            // InternalConferenceProgram.g:2351:3: RULE_ID
            {
             before(grammarAccess.getResearchPaperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResearchPaperAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResearchPaper__NameAssignment_1"


    // $ANTLR start "rule__IndustryPaper__NameAssignment_1"
    // InternalConferenceProgram.g:2360:1: rule__IndustryPaper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IndustryPaper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2364:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2365:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2365:2: ( RULE_ID )
            // InternalConferenceProgram.g:2366:3: RULE_ID
            {
             before(grammarAccess.getIndustryPaperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndustryPaperAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndustryPaper__NameAssignment_1"


    // $ANTLR start "rule__DemoAndPoster__NameAssignment_1"
    // InternalConferenceProgram.g:2375:1: rule__DemoAndPoster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DemoAndPoster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2379:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2380:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2380:2: ( RULE_ID )
            // InternalConferenceProgram.g:2381:3: RULE_ID
            {
             before(grammarAccess.getDemoAndPosterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDemoAndPosterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DemoAndPoster__NameAssignment_1"


    // $ANTLR start "rule__Panel__NameAssignment_1"
    // InternalConferenceProgram.g:2390:1: rule__Panel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2394:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2395:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2395:2: ( RULE_ID )
            // InternalConferenceProgram.g:2396:3: RULE_ID
            {
             before(grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__NameAssignment_1"


    // $ANTLR start "rule__Location__RoomAssignment_2"
    // InternalConferenceProgram.g:2405:1: rule__Location__RoomAssignment_2 : ( ruleRoom ) ;
    public final void rule__Location__RoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2409:1: ( ( ruleRoom ) )
            // InternalConferenceProgram.g:2410:2: ( ruleRoom )
            {
            // InternalConferenceProgram.g:2410:2: ( ruleRoom )
            // InternalConferenceProgram.g:2411:3: ruleRoom
            {
             before(grammarAccess.getLocationAccess().getRoomRoomParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getRoomRoomParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__RoomAssignment_2"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalConferenceProgram.g:2420:1: rule__Room__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2424:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2425:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2425:2: ( RULE_ID )
            // InternalConferenceProgram.g:2426:3: RULE_ID
            {
             before(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Keynote__NameAssignment_1"
    // InternalConferenceProgram.g:2435:1: rule__Keynote__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Keynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2439:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2440:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2440:2: ( RULE_ID )
            // InternalConferenceProgram.g:2441:3: RULE_ID
            {
             before(grammarAccess.getKeynoteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__NameAssignment_1"


    // $ANTLR start "rule__Keynote__StartTimeAssignment_2"
    // InternalConferenceProgram.g:2450:1: rule__Keynote__StartTimeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Keynote__StartTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2454:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2455:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2455:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2456:3: RULE_STRING
            {
             before(grammarAccess.getKeynoteAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__StartTimeAssignment_2"


    // $ANTLR start "rule__Keynote__EndTimeAssignment_3"
    // InternalConferenceProgram.g:2465:1: rule__Keynote__EndTimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Keynote__EndTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2469:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2470:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2470:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2471:3: RULE_STRING
            {
             before(grammarAccess.getKeynoteAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__EndTimeAssignment_3"


    // $ANTLR start "rule__CoffeBreak__NameAssignment_1"
    // InternalConferenceProgram.g:2480:1: rule__CoffeBreak__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoffeBreak__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2484:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2485:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2485:2: ( RULE_ID )
            // InternalConferenceProgram.g:2486:3: RULE_ID
            {
             before(grammarAccess.getCoffeBreakAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoffeBreakAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__NameAssignment_1"


    // $ANTLR start "rule__CoffeBreak__StartTimeAssignment_2"
    // InternalConferenceProgram.g:2495:1: rule__CoffeBreak__StartTimeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CoffeBreak__StartTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2499:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2500:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2500:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2501:3: RULE_STRING
            {
             before(grammarAccess.getCoffeBreakAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoffeBreakAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__StartTimeAssignment_2"


    // $ANTLR start "rule__CoffeBreak__EndTimeAssignment_3"
    // InternalConferenceProgram.g:2510:1: rule__CoffeBreak__EndTimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CoffeBreak__EndTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2514:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2515:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2515:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2516:3: RULE_STRING
            {
             before(grammarAccess.getCoffeBreakAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoffeBreakAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeBreak__EndTimeAssignment_3"


    // $ANTLR start "rule__Lunch__NameAssignment_1"
    // InternalConferenceProgram.g:2525:1: rule__Lunch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lunch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2529:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2530:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2530:2: ( RULE_ID )
            // InternalConferenceProgram.g:2531:3: RULE_ID
            {
             before(grammarAccess.getLunchAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__NameAssignment_1"


    // $ANTLR start "rule__Lunch__StartTimeAssignment_2"
    // InternalConferenceProgram.g:2540:1: rule__Lunch__StartTimeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Lunch__StartTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2544:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2545:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2545:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2546:3: RULE_STRING
            {
             before(grammarAccess.getLunchAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getStartTimeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__StartTimeAssignment_2"


    // $ANTLR start "rule__Lunch__EndTimeAssignment_3"
    // InternalConferenceProgram.g:2555:1: rule__Lunch__EndTimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Lunch__EndTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2559:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2560:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2560:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2561:3: RULE_STRING
            {
             before(grammarAccess.getLunchAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getEndTimeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__EndTimeAssignment_3"


    // $ANTLR start "rule__SocialEvent__NameAssignment_1"
    // InternalConferenceProgram.g:2570:1: rule__SocialEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SocialEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2574:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:2575:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:2575:2: ( RULE_ID )
            // InternalConferenceProgram.g:2576:3: RULE_ID
            {
             before(grammarAccess.getSocialEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__NameAssignment_1"


    // $ANTLR start "rule__SocialEvent__LocationAssignment_3"
    // InternalConferenceProgram.g:2585:1: rule__SocialEvent__LocationAssignment_3 : ( ruleLocation ) ;
    public final void rule__SocialEvent__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2589:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:2590:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:2590:2: ( ruleLocation )
            // InternalConferenceProgram.g:2591:3: ruleLocation
            {
             before(grammarAccess.getSocialEventAccess().getLocationLocationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getSocialEventAccess().getLocationLocationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__LocationAssignment_3"


    // $ANTLR start "rule__SocialEvent__StartTimeAssignment_4"
    // InternalConferenceProgram.g:2600:1: rule__SocialEvent__StartTimeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SocialEvent__StartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2604:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2605:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2605:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2606:3: RULE_STRING
            {
             before(grammarAccess.getSocialEventAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__StartTimeAssignment_4"


    // $ANTLR start "rule__SocialEvent__EndTimeAssignment_5"
    // InternalConferenceProgram.g:2615:1: rule__SocialEvent__EndTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SocialEvent__EndTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2619:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2620:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2620:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2621:3: RULE_STRING
            {
             before(grammarAccess.getSocialEventAccess().getEndTimeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSocialEventAccess().getEndTimeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__EndTimeAssignment_5"


    // $ANTLR start "rule__SocialEvent__DirectionsAssignment_6"
    // InternalConferenceProgram.g:2630:1: rule__SocialEvent__DirectionsAssignment_6 : ( ruleGoogleMapsDirections ) ;
    public final void rule__SocialEvent__DirectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2634:1: ( ( ruleGoogleMapsDirections ) )
            // InternalConferenceProgram.g:2635:2: ( ruleGoogleMapsDirections )
            {
            // InternalConferenceProgram.g:2635:2: ( ruleGoogleMapsDirections )
            // InternalConferenceProgram.g:2636:3: ruleGoogleMapsDirections
            {
             before(grammarAccess.getSocialEventAccess().getDirectionsGoogleMapsDirectionsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGoogleMapsDirections();

            state._fsp--;

             after(grammarAccess.getSocialEventAccess().getDirectionsGoogleMapsDirectionsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocialEvent__DirectionsAssignment_6"


    // $ANTLR start "rule__GoogleMapsDirections__UrlAssignment_2"
    // InternalConferenceProgram.g:2645:1: rule__GoogleMapsDirections__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoogleMapsDirections__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2649:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:2650:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:2650:2: ( RULE_STRING )
            // InternalConferenceProgram.g:2651:3: RULE_STRING
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoogleMapsDirectionsAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoogleMapsDirections__UrlAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001F0020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});

}