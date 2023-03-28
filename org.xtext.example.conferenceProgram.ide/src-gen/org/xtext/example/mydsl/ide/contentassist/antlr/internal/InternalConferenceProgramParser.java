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


    // $ANTLR start "entryRuleResearchTrack"
    // InternalConferenceProgram.g:78:1: entryRuleResearchTrack : ruleResearchTrack EOF ;
    public final void entryRuleResearchTrack() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:79:1: ( ruleResearchTrack EOF )
            // InternalConferenceProgram.g:80:1: ruleResearchTrack EOF
            {
             before(grammarAccess.getResearchTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleResearchTrack();

            state._fsp--;

             after(grammarAccess.getResearchTrackRule()); 
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
    // $ANTLR end "entryRuleResearchTrack"


    // $ANTLR start "ruleResearchTrack"
    // InternalConferenceProgram.g:87:1: ruleResearchTrack : ( ( rule__ResearchTrack__Group__0 ) ) ;
    public final void ruleResearchTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:91:2: ( ( ( rule__ResearchTrack__Group__0 ) ) )
            // InternalConferenceProgram.g:92:2: ( ( rule__ResearchTrack__Group__0 ) )
            {
            // InternalConferenceProgram.g:92:2: ( ( rule__ResearchTrack__Group__0 ) )
            // InternalConferenceProgram.g:93:3: ( rule__ResearchTrack__Group__0 )
            {
             before(grammarAccess.getResearchTrackAccess().getGroup()); 
            // InternalConferenceProgram.g:94:3: ( rule__ResearchTrack__Group__0 )
            // InternalConferenceProgram.g:94:4: rule__ResearchTrack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResearchTrackAccess().getGroup()); 

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
    // $ANTLR end "ruleResearchTrack"


    // $ANTLR start "entryRuleIndustryTrack"
    // InternalConferenceProgram.g:103:1: entryRuleIndustryTrack : ruleIndustryTrack EOF ;
    public final void entryRuleIndustryTrack() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:104:1: ( ruleIndustryTrack EOF )
            // InternalConferenceProgram.g:105:1: ruleIndustryTrack EOF
            {
             before(grammarAccess.getIndustryTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleIndustryTrack();

            state._fsp--;

             after(grammarAccess.getIndustryTrackRule()); 
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
    // $ANTLR end "entryRuleIndustryTrack"


    // $ANTLR start "ruleIndustryTrack"
    // InternalConferenceProgram.g:112:1: ruleIndustryTrack : ( ( rule__IndustryTrack__Group__0 ) ) ;
    public final void ruleIndustryTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:116:2: ( ( ( rule__IndustryTrack__Group__0 ) ) )
            // InternalConferenceProgram.g:117:2: ( ( rule__IndustryTrack__Group__0 ) )
            {
            // InternalConferenceProgram.g:117:2: ( ( rule__IndustryTrack__Group__0 ) )
            // InternalConferenceProgram.g:118:3: ( rule__IndustryTrack__Group__0 )
            {
             before(grammarAccess.getIndustryTrackAccess().getGroup()); 
            // InternalConferenceProgram.g:119:3: ( rule__IndustryTrack__Group__0 )
            // InternalConferenceProgram.g:119:4: rule__IndustryTrack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndustryTrackAccess().getGroup()); 

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
    // $ANTLR end "ruleIndustryTrack"


    // $ANTLR start "entryRuleDemosAndPosterTrack"
    // InternalConferenceProgram.g:128:1: entryRuleDemosAndPosterTrack : ruleDemosAndPosterTrack EOF ;
    public final void entryRuleDemosAndPosterTrack() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:129:1: ( ruleDemosAndPosterTrack EOF )
            // InternalConferenceProgram.g:130:1: ruleDemosAndPosterTrack EOF
            {
             before(grammarAccess.getDemosAndPosterTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleDemosAndPosterTrack();

            state._fsp--;

             after(grammarAccess.getDemosAndPosterTrackRule()); 
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
    // $ANTLR end "entryRuleDemosAndPosterTrack"


    // $ANTLR start "ruleDemosAndPosterTrack"
    // InternalConferenceProgram.g:137:1: ruleDemosAndPosterTrack : ( ( rule__DemosAndPosterTrack__Group__0 ) ) ;
    public final void ruleDemosAndPosterTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:141:2: ( ( ( rule__DemosAndPosterTrack__Group__0 ) ) )
            // InternalConferenceProgram.g:142:2: ( ( rule__DemosAndPosterTrack__Group__0 ) )
            {
            // InternalConferenceProgram.g:142:2: ( ( rule__DemosAndPosterTrack__Group__0 ) )
            // InternalConferenceProgram.g:143:3: ( rule__DemosAndPosterTrack__Group__0 )
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getGroup()); 
            // InternalConferenceProgram.g:144:3: ( rule__DemosAndPosterTrack__Group__0 )
            // InternalConferenceProgram.g:144:4: rule__DemosAndPosterTrack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDemosAndPosterTrackAccess().getGroup()); 

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
    // $ANTLR end "ruleDemosAndPosterTrack"


    // $ANTLR start "entryRulePanelTrack"
    // InternalConferenceProgram.g:153:1: entryRulePanelTrack : rulePanelTrack EOF ;
    public final void entryRulePanelTrack() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:154:1: ( rulePanelTrack EOF )
            // InternalConferenceProgram.g:155:1: rulePanelTrack EOF
            {
             before(grammarAccess.getPanelTrackRule()); 
            pushFollow(FOLLOW_1);
            rulePanelTrack();

            state._fsp--;

             after(grammarAccess.getPanelTrackRule()); 
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
    // $ANTLR end "entryRulePanelTrack"


    // $ANTLR start "rulePanelTrack"
    // InternalConferenceProgram.g:162:1: rulePanelTrack : ( ( rule__PanelTrack__Group__0 ) ) ;
    public final void rulePanelTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:166:2: ( ( ( rule__PanelTrack__Group__0 ) ) )
            // InternalConferenceProgram.g:167:2: ( ( rule__PanelTrack__Group__0 ) )
            {
            // InternalConferenceProgram.g:167:2: ( ( rule__PanelTrack__Group__0 ) )
            // InternalConferenceProgram.g:168:3: ( rule__PanelTrack__Group__0 )
            {
             before(grammarAccess.getPanelTrackAccess().getGroup()); 
            // InternalConferenceProgram.g:169:3: ( rule__PanelTrack__Group__0 )
            // InternalConferenceProgram.g:169:4: rule__PanelTrack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelTrackAccess().getGroup()); 

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
    // $ANTLR end "rulePanelTrack"


    // $ANTLR start "entryRuleResearchSession"
    // InternalConferenceProgram.g:178:1: entryRuleResearchSession : ruleResearchSession EOF ;
    public final void entryRuleResearchSession() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:179:1: ( ruleResearchSession EOF )
            // InternalConferenceProgram.g:180:1: ruleResearchSession EOF
            {
             before(grammarAccess.getResearchSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleResearchSession();

            state._fsp--;

             after(grammarAccess.getResearchSessionRule()); 
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
    // $ANTLR end "entryRuleResearchSession"


    // $ANTLR start "ruleResearchSession"
    // InternalConferenceProgram.g:187:1: ruleResearchSession : ( ( rule__ResearchSession__Group__0 ) ) ;
    public final void ruleResearchSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:191:2: ( ( ( rule__ResearchSession__Group__0 ) ) )
            // InternalConferenceProgram.g:192:2: ( ( rule__ResearchSession__Group__0 ) )
            {
            // InternalConferenceProgram.g:192:2: ( ( rule__ResearchSession__Group__0 ) )
            // InternalConferenceProgram.g:193:3: ( rule__ResearchSession__Group__0 )
            {
             before(grammarAccess.getResearchSessionAccess().getGroup()); 
            // InternalConferenceProgram.g:194:3: ( rule__ResearchSession__Group__0 )
            // InternalConferenceProgram.g:194:4: rule__ResearchSession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResearchSessionAccess().getGroup()); 

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
    // $ANTLR end "ruleResearchSession"


    // $ANTLR start "entryRuleIndustrySession"
    // InternalConferenceProgram.g:203:1: entryRuleIndustrySession : ruleIndustrySession EOF ;
    public final void entryRuleIndustrySession() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:204:1: ( ruleIndustrySession EOF )
            // InternalConferenceProgram.g:205:1: ruleIndustrySession EOF
            {
             before(grammarAccess.getIndustrySessionRule()); 
            pushFollow(FOLLOW_1);
            ruleIndustrySession();

            state._fsp--;

             after(grammarAccess.getIndustrySessionRule()); 
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
    // $ANTLR end "entryRuleIndustrySession"


    // $ANTLR start "ruleIndustrySession"
    // InternalConferenceProgram.g:212:1: ruleIndustrySession : ( ( rule__IndustrySession__Group__0 ) ) ;
    public final void ruleIndustrySession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:216:2: ( ( ( rule__IndustrySession__Group__0 ) ) )
            // InternalConferenceProgram.g:217:2: ( ( rule__IndustrySession__Group__0 ) )
            {
            // InternalConferenceProgram.g:217:2: ( ( rule__IndustrySession__Group__0 ) )
            // InternalConferenceProgram.g:218:3: ( rule__IndustrySession__Group__0 )
            {
             before(grammarAccess.getIndustrySessionAccess().getGroup()); 
            // InternalConferenceProgram.g:219:3: ( rule__IndustrySession__Group__0 )
            // InternalConferenceProgram.g:219:4: rule__IndustrySession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndustrySessionAccess().getGroup()); 

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
    // $ANTLR end "ruleIndustrySession"


    // $ANTLR start "entryRuleDemoSession"
    // InternalConferenceProgram.g:228:1: entryRuleDemoSession : ruleDemoSession EOF ;
    public final void entryRuleDemoSession() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:229:1: ( ruleDemoSession EOF )
            // InternalConferenceProgram.g:230:1: ruleDemoSession EOF
            {
             before(grammarAccess.getDemoSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleDemoSession();

            state._fsp--;

             after(grammarAccess.getDemoSessionRule()); 
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
    // $ANTLR end "entryRuleDemoSession"


    // $ANTLR start "ruleDemoSession"
    // InternalConferenceProgram.g:237:1: ruleDemoSession : ( ( rule__DemoSession__Group__0 ) ) ;
    public final void ruleDemoSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:241:2: ( ( ( rule__DemoSession__Group__0 ) ) )
            // InternalConferenceProgram.g:242:2: ( ( rule__DemoSession__Group__0 ) )
            {
            // InternalConferenceProgram.g:242:2: ( ( rule__DemoSession__Group__0 ) )
            // InternalConferenceProgram.g:243:3: ( rule__DemoSession__Group__0 )
            {
             before(grammarAccess.getDemoSessionAccess().getGroup()); 
            // InternalConferenceProgram.g:244:3: ( rule__DemoSession__Group__0 )
            // InternalConferenceProgram.g:244:4: rule__DemoSession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDemoSessionAccess().getGroup()); 

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
    // $ANTLR end "ruleDemoSession"


    // $ANTLR start "entryRulePanelSession"
    // InternalConferenceProgram.g:253:1: entryRulePanelSession : rulePanelSession EOF ;
    public final void entryRulePanelSession() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:254:1: ( rulePanelSession EOF )
            // InternalConferenceProgram.g:255:1: rulePanelSession EOF
            {
             before(grammarAccess.getPanelSessionRule()); 
            pushFollow(FOLLOW_1);
            rulePanelSession();

            state._fsp--;

             after(grammarAccess.getPanelSessionRule()); 
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
    // $ANTLR end "entryRulePanelSession"


    // $ANTLR start "rulePanelSession"
    // InternalConferenceProgram.g:262:1: rulePanelSession : ( ( rule__PanelSession__Group__0 ) ) ;
    public final void rulePanelSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:266:2: ( ( ( rule__PanelSession__Group__0 ) ) )
            // InternalConferenceProgram.g:267:2: ( ( rule__PanelSession__Group__0 ) )
            {
            // InternalConferenceProgram.g:267:2: ( ( rule__PanelSession__Group__0 ) )
            // InternalConferenceProgram.g:268:3: ( rule__PanelSession__Group__0 )
            {
             before(grammarAccess.getPanelSessionAccess().getGroup()); 
            // InternalConferenceProgram.g:269:3: ( rule__PanelSession__Group__0 )
            // InternalConferenceProgram.g:269:4: rule__PanelSession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelSessionAccess().getGroup()); 

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
    // $ANTLR end "rulePanelSession"


    // $ANTLR start "entryRuleResearchPaper"
    // InternalConferenceProgram.g:278:1: entryRuleResearchPaper : ruleResearchPaper EOF ;
    public final void entryRuleResearchPaper() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:279:1: ( ruleResearchPaper EOF )
            // InternalConferenceProgram.g:280:1: ruleResearchPaper EOF
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
    // InternalConferenceProgram.g:287:1: ruleResearchPaper : ( ( rule__ResearchPaper__Group__0 ) ) ;
    public final void ruleResearchPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:291:2: ( ( ( rule__ResearchPaper__Group__0 ) ) )
            // InternalConferenceProgram.g:292:2: ( ( rule__ResearchPaper__Group__0 ) )
            {
            // InternalConferenceProgram.g:292:2: ( ( rule__ResearchPaper__Group__0 ) )
            // InternalConferenceProgram.g:293:3: ( rule__ResearchPaper__Group__0 )
            {
             before(grammarAccess.getResearchPaperAccess().getGroup()); 
            // InternalConferenceProgram.g:294:3: ( rule__ResearchPaper__Group__0 )
            // InternalConferenceProgram.g:294:4: rule__ResearchPaper__Group__0
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
    // InternalConferenceProgram.g:303:1: entryRuleIndustryPaper : ruleIndustryPaper EOF ;
    public final void entryRuleIndustryPaper() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:304:1: ( ruleIndustryPaper EOF )
            // InternalConferenceProgram.g:305:1: ruleIndustryPaper EOF
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
    // InternalConferenceProgram.g:312:1: ruleIndustryPaper : ( ( rule__IndustryPaper__Group__0 ) ) ;
    public final void ruleIndustryPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:316:2: ( ( ( rule__IndustryPaper__Group__0 ) ) )
            // InternalConferenceProgram.g:317:2: ( ( rule__IndustryPaper__Group__0 ) )
            {
            // InternalConferenceProgram.g:317:2: ( ( rule__IndustryPaper__Group__0 ) )
            // InternalConferenceProgram.g:318:3: ( rule__IndustryPaper__Group__0 )
            {
             before(grammarAccess.getIndustryPaperAccess().getGroup()); 
            // InternalConferenceProgram.g:319:3: ( rule__IndustryPaper__Group__0 )
            // InternalConferenceProgram.g:319:4: rule__IndustryPaper__Group__0
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
    // InternalConferenceProgram.g:328:1: entryRuleDemoAndPoster : ruleDemoAndPoster EOF ;
    public final void entryRuleDemoAndPoster() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:329:1: ( ruleDemoAndPoster EOF )
            // InternalConferenceProgram.g:330:1: ruleDemoAndPoster EOF
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
    // InternalConferenceProgram.g:337:1: ruleDemoAndPoster : ( ( rule__DemoAndPoster__Group__0 ) ) ;
    public final void ruleDemoAndPoster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:341:2: ( ( ( rule__DemoAndPoster__Group__0 ) ) )
            // InternalConferenceProgram.g:342:2: ( ( rule__DemoAndPoster__Group__0 ) )
            {
            // InternalConferenceProgram.g:342:2: ( ( rule__DemoAndPoster__Group__0 ) )
            // InternalConferenceProgram.g:343:3: ( rule__DemoAndPoster__Group__0 )
            {
             before(grammarAccess.getDemoAndPosterAccess().getGroup()); 
            // InternalConferenceProgram.g:344:3: ( rule__DemoAndPoster__Group__0 )
            // InternalConferenceProgram.g:344:4: rule__DemoAndPoster__Group__0
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
    // InternalConferenceProgram.g:353:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:354:1: ( rulePanel EOF )
            // InternalConferenceProgram.g:355:1: rulePanel EOF
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
    // InternalConferenceProgram.g:362:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:366:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalConferenceProgram.g:367:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalConferenceProgram.g:367:2: ( ( rule__Panel__Group__0 ) )
            // InternalConferenceProgram.g:368:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalConferenceProgram.g:369:3: ( rule__Panel__Group__0 )
            // InternalConferenceProgram.g:369:4: rule__Panel__Group__0
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
    // InternalConferenceProgram.g:378:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:379:1: ( ruleLocation EOF )
            // InternalConferenceProgram.g:380:1: ruleLocation EOF
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
    // InternalConferenceProgram.g:387:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:391:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalConferenceProgram.g:392:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalConferenceProgram.g:392:2: ( ( rule__Location__Group__0 ) )
            // InternalConferenceProgram.g:393:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalConferenceProgram.g:394:3: ( rule__Location__Group__0 )
            // InternalConferenceProgram.g:394:4: rule__Location__Group__0
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
    // InternalConferenceProgram.g:403:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:404:1: ( ruleRoom EOF )
            // InternalConferenceProgram.g:405:1: ruleRoom EOF
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
    // InternalConferenceProgram.g:412:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:416:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalConferenceProgram.g:417:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalConferenceProgram.g:417:2: ( ( rule__Room__Group__0 ) )
            // InternalConferenceProgram.g:418:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalConferenceProgram.g:419:3: ( rule__Room__Group__0 )
            // InternalConferenceProgram.g:419:4: rule__Room__Group__0
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
    // InternalConferenceProgram.g:428:1: entryRuleKeynote : ruleKeynote EOF ;
    public final void entryRuleKeynote() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:429:1: ( ruleKeynote EOF )
            // InternalConferenceProgram.g:430:1: ruleKeynote EOF
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
    // InternalConferenceProgram.g:437:1: ruleKeynote : ( ( rule__Keynote__Group__0 ) ) ;
    public final void ruleKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:441:2: ( ( ( rule__Keynote__Group__0 ) ) )
            // InternalConferenceProgram.g:442:2: ( ( rule__Keynote__Group__0 ) )
            {
            // InternalConferenceProgram.g:442:2: ( ( rule__Keynote__Group__0 ) )
            // InternalConferenceProgram.g:443:3: ( rule__Keynote__Group__0 )
            {
             before(grammarAccess.getKeynoteAccess().getGroup()); 
            // InternalConferenceProgram.g:444:3: ( rule__Keynote__Group__0 )
            // InternalConferenceProgram.g:444:4: rule__Keynote__Group__0
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
    // InternalConferenceProgram.g:453:1: entryRuleCoffeBreak : ruleCoffeBreak EOF ;
    public final void entryRuleCoffeBreak() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:454:1: ( ruleCoffeBreak EOF )
            // InternalConferenceProgram.g:455:1: ruleCoffeBreak EOF
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
    // InternalConferenceProgram.g:462:1: ruleCoffeBreak : ( ( rule__CoffeBreak__Group__0 ) ) ;
    public final void ruleCoffeBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:466:2: ( ( ( rule__CoffeBreak__Group__0 ) ) )
            // InternalConferenceProgram.g:467:2: ( ( rule__CoffeBreak__Group__0 ) )
            {
            // InternalConferenceProgram.g:467:2: ( ( rule__CoffeBreak__Group__0 ) )
            // InternalConferenceProgram.g:468:3: ( rule__CoffeBreak__Group__0 )
            {
             before(grammarAccess.getCoffeBreakAccess().getGroup()); 
            // InternalConferenceProgram.g:469:3: ( rule__CoffeBreak__Group__0 )
            // InternalConferenceProgram.g:469:4: rule__CoffeBreak__Group__0
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
    // InternalConferenceProgram.g:478:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:479:1: ( ruleLunch EOF )
            // InternalConferenceProgram.g:480:1: ruleLunch EOF
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
    // InternalConferenceProgram.g:487:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:491:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalConferenceProgram.g:492:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalConferenceProgram.g:492:2: ( ( rule__Lunch__Group__0 ) )
            // InternalConferenceProgram.g:493:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalConferenceProgram.g:494:3: ( rule__Lunch__Group__0 )
            // InternalConferenceProgram.g:494:4: rule__Lunch__Group__0
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
    // InternalConferenceProgram.g:503:1: entryRuleSocialEvent : ruleSocialEvent EOF ;
    public final void entryRuleSocialEvent() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:504:1: ( ruleSocialEvent EOF )
            // InternalConferenceProgram.g:505:1: ruleSocialEvent EOF
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
    // InternalConferenceProgram.g:512:1: ruleSocialEvent : ( ( rule__SocialEvent__Group__0 ) ) ;
    public final void ruleSocialEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:516:2: ( ( ( rule__SocialEvent__Group__0 ) ) )
            // InternalConferenceProgram.g:517:2: ( ( rule__SocialEvent__Group__0 ) )
            {
            // InternalConferenceProgram.g:517:2: ( ( rule__SocialEvent__Group__0 ) )
            // InternalConferenceProgram.g:518:3: ( rule__SocialEvent__Group__0 )
            {
             before(grammarAccess.getSocialEventAccess().getGroup()); 
            // InternalConferenceProgram.g:519:3: ( rule__SocialEvent__Group__0 )
            // InternalConferenceProgram.g:519:4: rule__SocialEvent__Group__0
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
    // InternalConferenceProgram.g:528:1: entryRuleGoogleMapsDirections : ruleGoogleMapsDirections EOF ;
    public final void entryRuleGoogleMapsDirections() throws RecognitionException {
        try {
            // InternalConferenceProgram.g:529:1: ( ruleGoogleMapsDirections EOF )
            // InternalConferenceProgram.g:530:1: ruleGoogleMapsDirections EOF
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
    // InternalConferenceProgram.g:537:1: ruleGoogleMapsDirections : ( ( rule__GoogleMapsDirections__Group__0 ) ) ;
    public final void ruleGoogleMapsDirections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:541:2: ( ( ( rule__GoogleMapsDirections__Group__0 ) ) )
            // InternalConferenceProgram.g:542:2: ( ( rule__GoogleMapsDirections__Group__0 ) )
            {
            // InternalConferenceProgram.g:542:2: ( ( rule__GoogleMapsDirections__Group__0 ) )
            // InternalConferenceProgram.g:543:3: ( rule__GoogleMapsDirections__Group__0 )
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getGroup()); 
            // InternalConferenceProgram.g:544:3: ( rule__GoogleMapsDirections__Group__0 )
            // InternalConferenceProgram.g:544:4: rule__GoogleMapsDirections__Group__0
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
    // InternalConferenceProgram.g:552:1: rule__ConferenceProgram__Group__0 : rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1 ;
    public final void rule__ConferenceProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:556:1: ( rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1 )
            // InternalConferenceProgram.g:557:2: rule__ConferenceProgram__Group__0__Impl rule__ConferenceProgram__Group__1
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
    // InternalConferenceProgram.g:564:1: rule__ConferenceProgram__Group__0__Impl : ( 'Program' ) ;
    public final void rule__ConferenceProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:568:1: ( ( 'Program' ) )
            // InternalConferenceProgram.g:569:1: ( 'Program' )
            {
            // InternalConferenceProgram.g:569:1: ( 'Program' )
            // InternalConferenceProgram.g:570:2: 'Program'
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
    // InternalConferenceProgram.g:579:1: rule__ConferenceProgram__Group__1 : rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2 ;
    public final void rule__ConferenceProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:583:1: ( rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2 )
            // InternalConferenceProgram.g:584:2: rule__ConferenceProgram__Group__1__Impl rule__ConferenceProgram__Group__2
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
    // InternalConferenceProgram.g:591:1: rule__ConferenceProgram__Group__1__Impl : ( ( rule__ConferenceProgram__NameAssignment_1 ) ) ;
    public final void rule__ConferenceProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:595:1: ( ( ( rule__ConferenceProgram__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:596:1: ( ( rule__ConferenceProgram__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:596:1: ( ( rule__ConferenceProgram__NameAssignment_1 ) )
            // InternalConferenceProgram.g:597:2: ( rule__ConferenceProgram__NameAssignment_1 )
            {
             before(grammarAccess.getConferenceProgramAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:598:2: ( rule__ConferenceProgram__NameAssignment_1 )
            // InternalConferenceProgram.g:598:3: rule__ConferenceProgram__NameAssignment_1
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
    // InternalConferenceProgram.g:606:1: rule__ConferenceProgram__Group__2 : rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3 ;
    public final void rule__ConferenceProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:610:1: ( rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3 )
            // InternalConferenceProgram.g:611:2: rule__ConferenceProgram__Group__2__Impl rule__ConferenceProgram__Group__3
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
    // InternalConferenceProgram.g:618:1: rule__ConferenceProgram__Group__2__Impl : ( ( rule__ConferenceProgram__DateAssignment_2 ) ) ;
    public final void rule__ConferenceProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:622:1: ( ( ( rule__ConferenceProgram__DateAssignment_2 ) ) )
            // InternalConferenceProgram.g:623:1: ( ( rule__ConferenceProgram__DateAssignment_2 ) )
            {
            // InternalConferenceProgram.g:623:1: ( ( rule__ConferenceProgram__DateAssignment_2 ) )
            // InternalConferenceProgram.g:624:2: ( rule__ConferenceProgram__DateAssignment_2 )
            {
             before(grammarAccess.getConferenceProgramAccess().getDateAssignment_2()); 
            // InternalConferenceProgram.g:625:2: ( rule__ConferenceProgram__DateAssignment_2 )
            // InternalConferenceProgram.g:625:3: rule__ConferenceProgram__DateAssignment_2
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
    // InternalConferenceProgram.g:633:1: rule__ConferenceProgram__Group__3 : rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4 ;
    public final void rule__ConferenceProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:637:1: ( rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4 )
            // InternalConferenceProgram.g:638:2: rule__ConferenceProgram__Group__3__Impl rule__ConferenceProgram__Group__4
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
    // InternalConferenceProgram.g:645:1: rule__ConferenceProgram__Group__3__Impl : ( ( rule__ConferenceProgram__ResearchtracksAssignment_3 ) ) ;
    public final void rule__ConferenceProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:649:1: ( ( ( rule__ConferenceProgram__ResearchtracksAssignment_3 ) ) )
            // InternalConferenceProgram.g:650:1: ( ( rule__ConferenceProgram__ResearchtracksAssignment_3 ) )
            {
            // InternalConferenceProgram.g:650:1: ( ( rule__ConferenceProgram__ResearchtracksAssignment_3 ) )
            // InternalConferenceProgram.g:651:2: ( rule__ConferenceProgram__ResearchtracksAssignment_3 )
            {
             before(grammarAccess.getConferenceProgramAccess().getResearchtracksAssignment_3()); 
            // InternalConferenceProgram.g:652:2: ( rule__ConferenceProgram__ResearchtracksAssignment_3 )
            // InternalConferenceProgram.g:652:3: rule__ConferenceProgram__ResearchtracksAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__ResearchtracksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConferenceProgramAccess().getResearchtracksAssignment_3()); 

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
    // InternalConferenceProgram.g:660:1: rule__ConferenceProgram__Group__4 : rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5 ;
    public final void rule__ConferenceProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:664:1: ( rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5 )
            // InternalConferenceProgram.g:665:2: rule__ConferenceProgram__Group__4__Impl rule__ConferenceProgram__Group__5
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
    // InternalConferenceProgram.g:672:1: rule__ConferenceProgram__Group__4__Impl : ( ( rule__ConferenceProgram__IndustrytracksAssignment_4 )? ) ;
    public final void rule__ConferenceProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:676:1: ( ( ( rule__ConferenceProgram__IndustrytracksAssignment_4 )? ) )
            // InternalConferenceProgram.g:677:1: ( ( rule__ConferenceProgram__IndustrytracksAssignment_4 )? )
            {
            // InternalConferenceProgram.g:677:1: ( ( rule__ConferenceProgram__IndustrytracksAssignment_4 )? )
            // InternalConferenceProgram.g:678:2: ( rule__ConferenceProgram__IndustrytracksAssignment_4 )?
            {
             before(grammarAccess.getConferenceProgramAccess().getIndustrytracksAssignment_4()); 
            // InternalConferenceProgram.g:679:2: ( rule__ConferenceProgram__IndustrytracksAssignment_4 )?
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
                    // InternalConferenceProgram.g:679:3: rule__ConferenceProgram__IndustrytracksAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConferenceProgram__IndustrytracksAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceProgramAccess().getIndustrytracksAssignment_4()); 

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
    // InternalConferenceProgram.g:687:1: rule__ConferenceProgram__Group__5 : rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6 ;
    public final void rule__ConferenceProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:691:1: ( rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6 )
            // InternalConferenceProgram.g:692:2: rule__ConferenceProgram__Group__5__Impl rule__ConferenceProgram__Group__6
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
    // InternalConferenceProgram.g:699:1: rule__ConferenceProgram__Group__5__Impl : ( ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )? ) ;
    public final void rule__ConferenceProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:703:1: ( ( ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )? ) )
            // InternalConferenceProgram.g:704:1: ( ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )? )
            {
            // InternalConferenceProgram.g:704:1: ( ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )? )
            // InternalConferenceProgram.g:705:2: ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )?
            {
             before(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackAssignment_5()); 
            // InternalConferenceProgram.g:706:2: ( rule__ConferenceProgram__DemosandposterstrackAssignment_5 )?
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
                    // InternalConferenceProgram.g:706:3: rule__ConferenceProgram__DemosandposterstrackAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConferenceProgram__DemosandposterstrackAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackAssignment_5()); 

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
    // InternalConferenceProgram.g:714:1: rule__ConferenceProgram__Group__6 : rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7 ;
    public final void rule__ConferenceProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:718:1: ( rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7 )
            // InternalConferenceProgram.g:719:2: rule__ConferenceProgram__Group__6__Impl rule__ConferenceProgram__Group__7
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
    // InternalConferenceProgram.g:726:1: rule__ConferenceProgram__Group__6__Impl : ( ( rule__ConferenceProgram__PanelstrackAssignment_6 )? ) ;
    public final void rule__ConferenceProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:730:1: ( ( ( rule__ConferenceProgram__PanelstrackAssignment_6 )? ) )
            // InternalConferenceProgram.g:731:1: ( ( rule__ConferenceProgram__PanelstrackAssignment_6 )? )
            {
            // InternalConferenceProgram.g:731:1: ( ( rule__ConferenceProgram__PanelstrackAssignment_6 )? )
            // InternalConferenceProgram.g:732:2: ( rule__ConferenceProgram__PanelstrackAssignment_6 )?
            {
             before(grammarAccess.getConferenceProgramAccess().getPanelstrackAssignment_6()); 
            // InternalConferenceProgram.g:733:2: ( rule__ConferenceProgram__PanelstrackAssignment_6 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConferenceProgram.g:733:3: rule__ConferenceProgram__PanelstrackAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConferenceProgram__PanelstrackAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceProgramAccess().getPanelstrackAssignment_6()); 

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
    // InternalConferenceProgram.g:741:1: rule__ConferenceProgram__Group__7 : rule__ConferenceProgram__Group__7__Impl rule__ConferenceProgram__Group__8 ;
    public final void rule__ConferenceProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:745:1: ( rule__ConferenceProgram__Group__7__Impl rule__ConferenceProgram__Group__8 )
            // InternalConferenceProgram.g:746:2: rule__ConferenceProgram__Group__7__Impl rule__ConferenceProgram__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__8();

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
    // InternalConferenceProgram.g:753:1: rule__ConferenceProgram__Group__7__Impl : ( ( rule__ConferenceProgram__SocialEventsAssignment_7 )* ) ;
    public final void rule__ConferenceProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:757:1: ( ( ( rule__ConferenceProgram__SocialEventsAssignment_7 )* ) )
            // InternalConferenceProgram.g:758:1: ( ( rule__ConferenceProgram__SocialEventsAssignment_7 )* )
            {
            // InternalConferenceProgram.g:758:1: ( ( rule__ConferenceProgram__SocialEventsAssignment_7 )* )
            // InternalConferenceProgram.g:759:2: ( rule__ConferenceProgram__SocialEventsAssignment_7 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getSocialEventsAssignment_7()); 
            // InternalConferenceProgram.g:760:2: ( rule__ConferenceProgram__SocialEventsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalConferenceProgram.g:760:3: rule__ConferenceProgram__SocialEventsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConferenceProgram__SocialEventsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getSocialEventsAssignment_7()); 

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


    // $ANTLR start "rule__ConferenceProgram__Group__8"
    // InternalConferenceProgram.g:768:1: rule__ConferenceProgram__Group__8 : rule__ConferenceProgram__Group__8__Impl rule__ConferenceProgram__Group__9 ;
    public final void rule__ConferenceProgram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:772:1: ( rule__ConferenceProgram__Group__8__Impl rule__ConferenceProgram__Group__9 )
            // InternalConferenceProgram.g:773:2: rule__ConferenceProgram__Group__8__Impl rule__ConferenceProgram__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__9();

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
    // $ANTLR end "rule__ConferenceProgram__Group__8"


    // $ANTLR start "rule__ConferenceProgram__Group__8__Impl"
    // InternalConferenceProgram.g:780:1: rule__ConferenceProgram__Group__8__Impl : ( ( rule__ConferenceProgram__KeynotesAssignment_8 )* ) ;
    public final void rule__ConferenceProgram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:784:1: ( ( ( rule__ConferenceProgram__KeynotesAssignment_8 )* ) )
            // InternalConferenceProgram.g:785:1: ( ( rule__ConferenceProgram__KeynotesAssignment_8 )* )
            {
            // InternalConferenceProgram.g:785:1: ( ( rule__ConferenceProgram__KeynotesAssignment_8 )* )
            // InternalConferenceProgram.g:786:2: ( rule__ConferenceProgram__KeynotesAssignment_8 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getKeynotesAssignment_8()); 
            // InternalConferenceProgram.g:787:2: ( rule__ConferenceProgram__KeynotesAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConferenceProgram.g:787:3: rule__ConferenceProgram__KeynotesAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ConferenceProgram__KeynotesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getKeynotesAssignment_8()); 

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
    // $ANTLR end "rule__ConferenceProgram__Group__8__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__9"
    // InternalConferenceProgram.g:795:1: rule__ConferenceProgram__Group__9 : rule__ConferenceProgram__Group__9__Impl rule__ConferenceProgram__Group__10 ;
    public final void rule__ConferenceProgram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:799:1: ( rule__ConferenceProgram__Group__9__Impl rule__ConferenceProgram__Group__10 )
            // InternalConferenceProgram.g:800:2: rule__ConferenceProgram__Group__9__Impl rule__ConferenceProgram__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__ConferenceProgram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__10();

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
    // $ANTLR end "rule__ConferenceProgram__Group__9"


    // $ANTLR start "rule__ConferenceProgram__Group__9__Impl"
    // InternalConferenceProgram.g:807:1: rule__ConferenceProgram__Group__9__Impl : ( ( rule__ConferenceProgram__CoffebreaksAssignment_9 )* ) ;
    public final void rule__ConferenceProgram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:811:1: ( ( ( rule__ConferenceProgram__CoffebreaksAssignment_9 )* ) )
            // InternalConferenceProgram.g:812:1: ( ( rule__ConferenceProgram__CoffebreaksAssignment_9 )* )
            {
            // InternalConferenceProgram.g:812:1: ( ( rule__ConferenceProgram__CoffebreaksAssignment_9 )* )
            // InternalConferenceProgram.g:813:2: ( rule__ConferenceProgram__CoffebreaksAssignment_9 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getCoffebreaksAssignment_9()); 
            // InternalConferenceProgram.g:814:2: ( rule__ConferenceProgram__CoffebreaksAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalConferenceProgram.g:814:3: rule__ConferenceProgram__CoffebreaksAssignment_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConferenceProgram__CoffebreaksAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getCoffebreaksAssignment_9()); 

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
    // $ANTLR end "rule__ConferenceProgram__Group__9__Impl"


    // $ANTLR start "rule__ConferenceProgram__Group__10"
    // InternalConferenceProgram.g:822:1: rule__ConferenceProgram__Group__10 : rule__ConferenceProgram__Group__10__Impl ;
    public final void rule__ConferenceProgram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:826:1: ( rule__ConferenceProgram__Group__10__Impl )
            // InternalConferenceProgram.g:827:2: rule__ConferenceProgram__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConferenceProgram__Group__10__Impl();

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
    // $ANTLR end "rule__ConferenceProgram__Group__10"


    // $ANTLR start "rule__ConferenceProgram__Group__10__Impl"
    // InternalConferenceProgram.g:833:1: rule__ConferenceProgram__Group__10__Impl : ( ( rule__ConferenceProgram__LunchesAssignment_10 )* ) ;
    public final void rule__ConferenceProgram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:837:1: ( ( ( rule__ConferenceProgram__LunchesAssignment_10 )* ) )
            // InternalConferenceProgram.g:838:1: ( ( rule__ConferenceProgram__LunchesAssignment_10 )* )
            {
            // InternalConferenceProgram.g:838:1: ( ( rule__ConferenceProgram__LunchesAssignment_10 )* )
            // InternalConferenceProgram.g:839:2: ( rule__ConferenceProgram__LunchesAssignment_10 )*
            {
             before(grammarAccess.getConferenceProgramAccess().getLunchesAssignment_10()); 
            // InternalConferenceProgram.g:840:2: ( rule__ConferenceProgram__LunchesAssignment_10 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConferenceProgram.g:840:3: rule__ConferenceProgram__LunchesAssignment_10
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ConferenceProgram__LunchesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConferenceProgramAccess().getLunchesAssignment_10()); 

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
    // $ANTLR end "rule__ConferenceProgram__Group__10__Impl"


    // $ANTLR start "rule__ResearchTrack__Group__0"
    // InternalConferenceProgram.g:849:1: rule__ResearchTrack__Group__0 : rule__ResearchTrack__Group__0__Impl rule__ResearchTrack__Group__1 ;
    public final void rule__ResearchTrack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:853:1: ( rule__ResearchTrack__Group__0__Impl rule__ResearchTrack__Group__1 )
            // InternalConferenceProgram.g:854:2: rule__ResearchTrack__Group__0__Impl rule__ResearchTrack__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ResearchTrack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__1();

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
    // $ANTLR end "rule__ResearchTrack__Group__0"


    // $ANTLR start "rule__ResearchTrack__Group__0__Impl"
    // InternalConferenceProgram.g:861:1: rule__ResearchTrack__Group__0__Impl : ( 'Track' ) ;
    public final void rule__ResearchTrack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:865:1: ( ( 'Track' ) )
            // InternalConferenceProgram.g:866:1: ( 'Track' )
            {
            // InternalConferenceProgram.g:866:1: ( 'Track' )
            // InternalConferenceProgram.g:867:2: 'Track'
            {
             before(grammarAccess.getResearchTrackAccess().getTrackKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getResearchTrackAccess().getTrackKeyword_0()); 

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
    // $ANTLR end "rule__ResearchTrack__Group__0__Impl"


    // $ANTLR start "rule__ResearchTrack__Group__1"
    // InternalConferenceProgram.g:876:1: rule__ResearchTrack__Group__1 : rule__ResearchTrack__Group__1__Impl rule__ResearchTrack__Group__2 ;
    public final void rule__ResearchTrack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:880:1: ( rule__ResearchTrack__Group__1__Impl rule__ResearchTrack__Group__2 )
            // InternalConferenceProgram.g:881:2: rule__ResearchTrack__Group__1__Impl rule__ResearchTrack__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ResearchTrack__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__2();

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
    // $ANTLR end "rule__ResearchTrack__Group__1"


    // $ANTLR start "rule__ResearchTrack__Group__1__Impl"
    // InternalConferenceProgram.g:888:1: rule__ResearchTrack__Group__1__Impl : ( ( rule__ResearchTrack__NameAssignment_1 ) ) ;
    public final void rule__ResearchTrack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:892:1: ( ( ( rule__ResearchTrack__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:893:1: ( ( rule__ResearchTrack__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:893:1: ( ( rule__ResearchTrack__NameAssignment_1 ) )
            // InternalConferenceProgram.g:894:2: ( rule__ResearchTrack__NameAssignment_1 )
            {
             before(grammarAccess.getResearchTrackAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:895:2: ( rule__ResearchTrack__NameAssignment_1 )
            // InternalConferenceProgram.g:895:3: rule__ResearchTrack__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResearchTrack__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResearchTrackAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ResearchTrack__Group__1__Impl"


    // $ANTLR start "rule__ResearchTrack__Group__2"
    // InternalConferenceProgram.g:903:1: rule__ResearchTrack__Group__2 : rule__ResearchTrack__Group__2__Impl rule__ResearchTrack__Group__3 ;
    public final void rule__ResearchTrack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:907:1: ( rule__ResearchTrack__Group__2__Impl rule__ResearchTrack__Group__3 )
            // InternalConferenceProgram.g:908:2: rule__ResearchTrack__Group__2__Impl rule__ResearchTrack__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ResearchTrack__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__3();

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
    // $ANTLR end "rule__ResearchTrack__Group__2"


    // $ANTLR start "rule__ResearchTrack__Group__2__Impl"
    // InternalConferenceProgram.g:915:1: rule__ResearchTrack__Group__2__Impl : ( '{' ) ;
    public final void rule__ResearchTrack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:919:1: ( ( '{' ) )
            // InternalConferenceProgram.g:920:1: ( '{' )
            {
            // InternalConferenceProgram.g:920:1: ( '{' )
            // InternalConferenceProgram.g:921:2: '{'
            {
             before(grammarAccess.getResearchTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResearchTrackAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ResearchTrack__Group__2__Impl"


    // $ANTLR start "rule__ResearchTrack__Group__3"
    // InternalConferenceProgram.g:930:1: rule__ResearchTrack__Group__3 : rule__ResearchTrack__Group__3__Impl rule__ResearchTrack__Group__4 ;
    public final void rule__ResearchTrack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:934:1: ( rule__ResearchTrack__Group__3__Impl rule__ResearchTrack__Group__4 )
            // InternalConferenceProgram.g:935:2: rule__ResearchTrack__Group__3__Impl rule__ResearchTrack__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ResearchTrack__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__4();

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
    // $ANTLR end "rule__ResearchTrack__Group__3"


    // $ANTLR start "rule__ResearchTrack__Group__3__Impl"
    // InternalConferenceProgram.g:942:1: rule__ResearchTrack__Group__3__Impl : ( ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) ) ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* ) ) ;
    public final void rule__ResearchTrack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:946:1: ( ( ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) ) ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:947:1: ( ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) ) ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:947:1: ( ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) ) ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* ) )
            // InternalConferenceProgram.g:948:2: ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) ) ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* )
            {
            // InternalConferenceProgram.g:948:2: ( ( rule__ResearchTrack__ResearchsessionAssignment_3 ) )
            // InternalConferenceProgram.g:949:3: ( rule__ResearchTrack__ResearchsessionAssignment_3 )
            {
             before(grammarAccess.getResearchTrackAccess().getResearchsessionAssignment_3()); 
            // InternalConferenceProgram.g:950:3: ( rule__ResearchTrack__ResearchsessionAssignment_3 )
            // InternalConferenceProgram.g:950:4: rule__ResearchTrack__ResearchsessionAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__ResearchTrack__ResearchsessionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResearchTrackAccess().getResearchsessionAssignment_3()); 

            }

            // InternalConferenceProgram.g:953:2: ( ( rule__ResearchTrack__ResearchsessionAssignment_3 )* )
            // InternalConferenceProgram.g:954:3: ( rule__ResearchTrack__ResearchsessionAssignment_3 )*
            {
             before(grammarAccess.getResearchTrackAccess().getResearchsessionAssignment_3()); 
            // InternalConferenceProgram.g:955:3: ( rule__ResearchTrack__ResearchsessionAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConferenceProgram.g:955:4: rule__ResearchTrack__ResearchsessionAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ResearchTrack__ResearchsessionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getResearchTrackAccess().getResearchsessionAssignment_3()); 

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
    // $ANTLR end "rule__ResearchTrack__Group__3__Impl"


    // $ANTLR start "rule__ResearchTrack__Group__4"
    // InternalConferenceProgram.g:964:1: rule__ResearchTrack__Group__4 : rule__ResearchTrack__Group__4__Impl ;
    public final void rule__ResearchTrack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:968:1: ( rule__ResearchTrack__Group__4__Impl )
            // InternalConferenceProgram.g:969:2: rule__ResearchTrack__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResearchTrack__Group__4__Impl();

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
    // $ANTLR end "rule__ResearchTrack__Group__4"


    // $ANTLR start "rule__ResearchTrack__Group__4__Impl"
    // InternalConferenceProgram.g:975:1: rule__ResearchTrack__Group__4__Impl : ( '}' ) ;
    public final void rule__ResearchTrack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:979:1: ( ( '}' ) )
            // InternalConferenceProgram.g:980:1: ( '}' )
            {
            // InternalConferenceProgram.g:980:1: ( '}' )
            // InternalConferenceProgram.g:981:2: '}'
            {
             before(grammarAccess.getResearchTrackAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getResearchTrackAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ResearchTrack__Group__4__Impl"


    // $ANTLR start "rule__IndustryTrack__Group__0"
    // InternalConferenceProgram.g:991:1: rule__IndustryTrack__Group__0 : rule__IndustryTrack__Group__0__Impl rule__IndustryTrack__Group__1 ;
    public final void rule__IndustryTrack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:995:1: ( rule__IndustryTrack__Group__0__Impl rule__IndustryTrack__Group__1 )
            // InternalConferenceProgram.g:996:2: rule__IndustryTrack__Group__0__Impl rule__IndustryTrack__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IndustryTrack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__1();

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
    // $ANTLR end "rule__IndustryTrack__Group__0"


    // $ANTLR start "rule__IndustryTrack__Group__0__Impl"
    // InternalConferenceProgram.g:1003:1: rule__IndustryTrack__Group__0__Impl : ( 'Track' ) ;
    public final void rule__IndustryTrack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1007:1: ( ( 'Track' ) )
            // InternalConferenceProgram.g:1008:1: ( 'Track' )
            {
            // InternalConferenceProgram.g:1008:1: ( 'Track' )
            // InternalConferenceProgram.g:1009:2: 'Track'
            {
             before(grammarAccess.getIndustryTrackAccess().getTrackKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIndustryTrackAccess().getTrackKeyword_0()); 

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
    // $ANTLR end "rule__IndustryTrack__Group__0__Impl"


    // $ANTLR start "rule__IndustryTrack__Group__1"
    // InternalConferenceProgram.g:1018:1: rule__IndustryTrack__Group__1 : rule__IndustryTrack__Group__1__Impl rule__IndustryTrack__Group__2 ;
    public final void rule__IndustryTrack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1022:1: ( rule__IndustryTrack__Group__1__Impl rule__IndustryTrack__Group__2 )
            // InternalConferenceProgram.g:1023:2: rule__IndustryTrack__Group__1__Impl rule__IndustryTrack__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IndustryTrack__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__2();

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
    // $ANTLR end "rule__IndustryTrack__Group__1"


    // $ANTLR start "rule__IndustryTrack__Group__1__Impl"
    // InternalConferenceProgram.g:1030:1: rule__IndustryTrack__Group__1__Impl : ( ( rule__IndustryTrack__NameAssignment_1 ) ) ;
    public final void rule__IndustryTrack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1034:1: ( ( ( rule__IndustryTrack__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1035:1: ( ( rule__IndustryTrack__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1035:1: ( ( rule__IndustryTrack__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1036:2: ( rule__IndustryTrack__NameAssignment_1 )
            {
             before(grammarAccess.getIndustryTrackAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1037:2: ( rule__IndustryTrack__NameAssignment_1 )
            // InternalConferenceProgram.g:1037:3: rule__IndustryTrack__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndustryTrack__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndustryTrackAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IndustryTrack__Group__1__Impl"


    // $ANTLR start "rule__IndustryTrack__Group__2"
    // InternalConferenceProgram.g:1045:1: rule__IndustryTrack__Group__2 : rule__IndustryTrack__Group__2__Impl rule__IndustryTrack__Group__3 ;
    public final void rule__IndustryTrack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1049:1: ( rule__IndustryTrack__Group__2__Impl rule__IndustryTrack__Group__3 )
            // InternalConferenceProgram.g:1050:2: rule__IndustryTrack__Group__2__Impl rule__IndustryTrack__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__IndustryTrack__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__3();

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
    // $ANTLR end "rule__IndustryTrack__Group__2"


    // $ANTLR start "rule__IndustryTrack__Group__2__Impl"
    // InternalConferenceProgram.g:1057:1: rule__IndustryTrack__Group__2__Impl : ( '{' ) ;
    public final void rule__IndustryTrack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1061:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1062:1: ( '{' )
            {
            // InternalConferenceProgram.g:1062:1: ( '{' )
            // InternalConferenceProgram.g:1063:2: '{'
            {
             before(grammarAccess.getIndustryTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIndustryTrackAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__IndustryTrack__Group__2__Impl"


    // $ANTLR start "rule__IndustryTrack__Group__3"
    // InternalConferenceProgram.g:1072:1: rule__IndustryTrack__Group__3 : rule__IndustryTrack__Group__3__Impl rule__IndustryTrack__Group__4 ;
    public final void rule__IndustryTrack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1076:1: ( rule__IndustryTrack__Group__3__Impl rule__IndustryTrack__Group__4 )
            // InternalConferenceProgram.g:1077:2: rule__IndustryTrack__Group__3__Impl rule__IndustryTrack__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__IndustryTrack__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__4();

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
    // $ANTLR end "rule__IndustryTrack__Group__3"


    // $ANTLR start "rule__IndustryTrack__Group__3__Impl"
    // InternalConferenceProgram.g:1084:1: rule__IndustryTrack__Group__3__Impl : ( ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) ) ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* ) ) ;
    public final void rule__IndustryTrack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1088:1: ( ( ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) ) ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1089:1: ( ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) ) ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1089:1: ( ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) ) ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* ) )
            // InternalConferenceProgram.g:1090:2: ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) ) ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1090:2: ( ( rule__IndustryTrack__IndutrysessionAssignment_3 ) )
            // InternalConferenceProgram.g:1091:3: ( rule__IndustryTrack__IndutrysessionAssignment_3 )
            {
             before(grammarAccess.getIndustryTrackAccess().getIndutrysessionAssignment_3()); 
            // InternalConferenceProgram.g:1092:3: ( rule__IndustryTrack__IndutrysessionAssignment_3 )
            // InternalConferenceProgram.g:1092:4: rule__IndustryTrack__IndutrysessionAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__IndustryTrack__IndutrysessionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndustryTrackAccess().getIndutrysessionAssignment_3()); 

            }

            // InternalConferenceProgram.g:1095:2: ( ( rule__IndustryTrack__IndutrysessionAssignment_3 )* )
            // InternalConferenceProgram.g:1096:3: ( rule__IndustryTrack__IndutrysessionAssignment_3 )*
            {
             before(grammarAccess.getIndustryTrackAccess().getIndutrysessionAssignment_3()); 
            // InternalConferenceProgram.g:1097:3: ( rule__IndustryTrack__IndutrysessionAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConferenceProgram.g:1097:4: rule__IndustryTrack__IndutrysessionAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__IndustryTrack__IndutrysessionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIndustryTrackAccess().getIndutrysessionAssignment_3()); 

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
    // $ANTLR end "rule__IndustryTrack__Group__3__Impl"


    // $ANTLR start "rule__IndustryTrack__Group__4"
    // InternalConferenceProgram.g:1106:1: rule__IndustryTrack__Group__4 : rule__IndustryTrack__Group__4__Impl ;
    public final void rule__IndustryTrack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1110:1: ( rule__IndustryTrack__Group__4__Impl )
            // InternalConferenceProgram.g:1111:2: rule__IndustryTrack__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndustryTrack__Group__4__Impl();

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
    // $ANTLR end "rule__IndustryTrack__Group__4"


    // $ANTLR start "rule__IndustryTrack__Group__4__Impl"
    // InternalConferenceProgram.g:1117:1: rule__IndustryTrack__Group__4__Impl : ( '}' ) ;
    public final void rule__IndustryTrack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1121:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1122:1: ( '}' )
            {
            // InternalConferenceProgram.g:1122:1: ( '}' )
            // InternalConferenceProgram.g:1123:2: '}'
            {
             before(grammarAccess.getIndustryTrackAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIndustryTrackAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__IndustryTrack__Group__4__Impl"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__0"
    // InternalConferenceProgram.g:1133:1: rule__DemosAndPosterTrack__Group__0 : rule__DemosAndPosterTrack__Group__0__Impl rule__DemosAndPosterTrack__Group__1 ;
    public final void rule__DemosAndPosterTrack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1137:1: ( rule__DemosAndPosterTrack__Group__0__Impl rule__DemosAndPosterTrack__Group__1 )
            // InternalConferenceProgram.g:1138:2: rule__DemosAndPosterTrack__Group__0__Impl rule__DemosAndPosterTrack__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DemosAndPosterTrack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__1();

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__0"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__0__Impl"
    // InternalConferenceProgram.g:1145:1: rule__DemosAndPosterTrack__Group__0__Impl : ( 'Track' ) ;
    public final void rule__DemosAndPosterTrack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1149:1: ( ( 'Track' ) )
            // InternalConferenceProgram.g:1150:1: ( 'Track' )
            {
            // InternalConferenceProgram.g:1150:1: ( 'Track' )
            // InternalConferenceProgram.g:1151:2: 'Track'
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getTrackKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDemosAndPosterTrackAccess().getTrackKeyword_0()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__0__Impl"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__1"
    // InternalConferenceProgram.g:1160:1: rule__DemosAndPosterTrack__Group__1 : rule__DemosAndPosterTrack__Group__1__Impl rule__DemosAndPosterTrack__Group__2 ;
    public final void rule__DemosAndPosterTrack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1164:1: ( rule__DemosAndPosterTrack__Group__1__Impl rule__DemosAndPosterTrack__Group__2 )
            // InternalConferenceProgram.g:1165:2: rule__DemosAndPosterTrack__Group__1__Impl rule__DemosAndPosterTrack__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DemosAndPosterTrack__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__2();

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__1"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__1__Impl"
    // InternalConferenceProgram.g:1172:1: rule__DemosAndPosterTrack__Group__1__Impl : ( ( rule__DemosAndPosterTrack__NameAssignment_1 ) ) ;
    public final void rule__DemosAndPosterTrack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1176:1: ( ( ( rule__DemosAndPosterTrack__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1177:1: ( ( rule__DemosAndPosterTrack__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1177:1: ( ( rule__DemosAndPosterTrack__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1178:2: ( rule__DemosAndPosterTrack__NameAssignment_1 )
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1179:2: ( rule__DemosAndPosterTrack__NameAssignment_1 )
            // InternalConferenceProgram.g:1179:3: rule__DemosAndPosterTrack__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDemosAndPosterTrackAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__1__Impl"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__2"
    // InternalConferenceProgram.g:1187:1: rule__DemosAndPosterTrack__Group__2 : rule__DemosAndPosterTrack__Group__2__Impl rule__DemosAndPosterTrack__Group__3 ;
    public final void rule__DemosAndPosterTrack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1191:1: ( rule__DemosAndPosterTrack__Group__2__Impl rule__DemosAndPosterTrack__Group__3 )
            // InternalConferenceProgram.g:1192:2: rule__DemosAndPosterTrack__Group__2__Impl rule__DemosAndPosterTrack__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DemosAndPosterTrack__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__3();

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__2"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__2__Impl"
    // InternalConferenceProgram.g:1199:1: rule__DemosAndPosterTrack__Group__2__Impl : ( '{' ) ;
    public final void rule__DemosAndPosterTrack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1203:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1204:1: ( '{' )
            {
            // InternalConferenceProgram.g:1204:1: ( '{' )
            // InternalConferenceProgram.g:1205:2: '{'
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDemosAndPosterTrackAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__2__Impl"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__3"
    // InternalConferenceProgram.g:1214:1: rule__DemosAndPosterTrack__Group__3 : rule__DemosAndPosterTrack__Group__3__Impl rule__DemosAndPosterTrack__Group__4 ;
    public final void rule__DemosAndPosterTrack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1218:1: ( rule__DemosAndPosterTrack__Group__3__Impl rule__DemosAndPosterTrack__Group__4 )
            // InternalConferenceProgram.g:1219:2: rule__DemosAndPosterTrack__Group__3__Impl rule__DemosAndPosterTrack__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DemosAndPosterTrack__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__4();

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__3"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__3__Impl"
    // InternalConferenceProgram.g:1226:1: rule__DemosAndPosterTrack__Group__3__Impl : ( ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) ) ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* ) ) ;
    public final void rule__DemosAndPosterTrack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1230:1: ( ( ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) ) ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1231:1: ( ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) ) ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1231:1: ( ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) ) ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* ) )
            // InternalConferenceProgram.g:1232:2: ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) ) ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1232:2: ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 ) )
            // InternalConferenceProgram.g:1233:3: ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionAssignment_3()); 
            // InternalConferenceProgram.g:1234:3: ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )
            // InternalConferenceProgram.g:1234:4: rule__DemosAndPosterTrack__DemosessionAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__DemosAndPosterTrack__DemosessionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionAssignment_3()); 

            }

            // InternalConferenceProgram.g:1237:2: ( ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )* )
            // InternalConferenceProgram.g:1238:3: ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )*
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionAssignment_3()); 
            // InternalConferenceProgram.g:1239:3: ( rule__DemosAndPosterTrack__DemosessionAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConferenceProgram.g:1239:4: rule__DemosAndPosterTrack__DemosessionAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DemosAndPosterTrack__DemosessionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionAssignment_3()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__3__Impl"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__4"
    // InternalConferenceProgram.g:1248:1: rule__DemosAndPosterTrack__Group__4 : rule__DemosAndPosterTrack__Group__4__Impl ;
    public final void rule__DemosAndPosterTrack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1252:1: ( rule__DemosAndPosterTrack__Group__4__Impl )
            // InternalConferenceProgram.g:1253:2: rule__DemosAndPosterTrack__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DemosAndPosterTrack__Group__4__Impl();

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__4"


    // $ANTLR start "rule__DemosAndPosterTrack__Group__4__Impl"
    // InternalConferenceProgram.g:1259:1: rule__DemosAndPosterTrack__Group__4__Impl : ( '}' ) ;
    public final void rule__DemosAndPosterTrack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1263:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1264:1: ( '}' )
            {
            // InternalConferenceProgram.g:1264:1: ( '}' )
            // InternalConferenceProgram.g:1265:2: '}'
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDemosAndPosterTrackAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__Group__4__Impl"


    // $ANTLR start "rule__PanelTrack__Group__0"
    // InternalConferenceProgram.g:1275:1: rule__PanelTrack__Group__0 : rule__PanelTrack__Group__0__Impl rule__PanelTrack__Group__1 ;
    public final void rule__PanelTrack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1279:1: ( rule__PanelTrack__Group__0__Impl rule__PanelTrack__Group__1 )
            // InternalConferenceProgram.g:1280:2: rule__PanelTrack__Group__0__Impl rule__PanelTrack__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PanelTrack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__1();

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
    // $ANTLR end "rule__PanelTrack__Group__0"


    // $ANTLR start "rule__PanelTrack__Group__0__Impl"
    // InternalConferenceProgram.g:1287:1: rule__PanelTrack__Group__0__Impl : ( 'Track' ) ;
    public final void rule__PanelTrack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1291:1: ( ( 'Track' ) )
            // InternalConferenceProgram.g:1292:1: ( 'Track' )
            {
            // InternalConferenceProgram.g:1292:1: ( 'Track' )
            // InternalConferenceProgram.g:1293:2: 'Track'
            {
             before(grammarAccess.getPanelTrackAccess().getTrackKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPanelTrackAccess().getTrackKeyword_0()); 

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
    // $ANTLR end "rule__PanelTrack__Group__0__Impl"


    // $ANTLR start "rule__PanelTrack__Group__1"
    // InternalConferenceProgram.g:1302:1: rule__PanelTrack__Group__1 : rule__PanelTrack__Group__1__Impl rule__PanelTrack__Group__2 ;
    public final void rule__PanelTrack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1306:1: ( rule__PanelTrack__Group__1__Impl rule__PanelTrack__Group__2 )
            // InternalConferenceProgram.g:1307:2: rule__PanelTrack__Group__1__Impl rule__PanelTrack__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PanelTrack__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__2();

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
    // $ANTLR end "rule__PanelTrack__Group__1"


    // $ANTLR start "rule__PanelTrack__Group__1__Impl"
    // InternalConferenceProgram.g:1314:1: rule__PanelTrack__Group__1__Impl : ( ( rule__PanelTrack__NameAssignment_1 ) ) ;
    public final void rule__PanelTrack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1318:1: ( ( ( rule__PanelTrack__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1319:1: ( ( rule__PanelTrack__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1319:1: ( ( rule__PanelTrack__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1320:2: ( rule__PanelTrack__NameAssignment_1 )
            {
             before(grammarAccess.getPanelTrackAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1321:2: ( rule__PanelTrack__NameAssignment_1 )
            // InternalConferenceProgram.g:1321:3: rule__PanelTrack__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PanelTrack__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelTrackAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PanelTrack__Group__1__Impl"


    // $ANTLR start "rule__PanelTrack__Group__2"
    // InternalConferenceProgram.g:1329:1: rule__PanelTrack__Group__2 : rule__PanelTrack__Group__2__Impl rule__PanelTrack__Group__3 ;
    public final void rule__PanelTrack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1333:1: ( rule__PanelTrack__Group__2__Impl rule__PanelTrack__Group__3 )
            // InternalConferenceProgram.g:1334:2: rule__PanelTrack__Group__2__Impl rule__PanelTrack__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PanelTrack__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__3();

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
    // $ANTLR end "rule__PanelTrack__Group__2"


    // $ANTLR start "rule__PanelTrack__Group__2__Impl"
    // InternalConferenceProgram.g:1341:1: rule__PanelTrack__Group__2__Impl : ( '{' ) ;
    public final void rule__PanelTrack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1345:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1346:1: ( '{' )
            {
            // InternalConferenceProgram.g:1346:1: ( '{' )
            // InternalConferenceProgram.g:1347:2: '{'
            {
             before(grammarAccess.getPanelTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPanelTrackAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PanelTrack__Group__2__Impl"


    // $ANTLR start "rule__PanelTrack__Group__3"
    // InternalConferenceProgram.g:1356:1: rule__PanelTrack__Group__3 : rule__PanelTrack__Group__3__Impl rule__PanelTrack__Group__4 ;
    public final void rule__PanelTrack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1360:1: ( rule__PanelTrack__Group__3__Impl rule__PanelTrack__Group__4 )
            // InternalConferenceProgram.g:1361:2: rule__PanelTrack__Group__3__Impl rule__PanelTrack__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__PanelTrack__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__4();

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
    // $ANTLR end "rule__PanelTrack__Group__3"


    // $ANTLR start "rule__PanelTrack__Group__3__Impl"
    // InternalConferenceProgram.g:1368:1: rule__PanelTrack__Group__3__Impl : ( ( ( rule__PanelTrack__PanelsessionAssignment_3 ) ) ( ( rule__PanelTrack__PanelsessionAssignment_3 )* ) ) ;
    public final void rule__PanelTrack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1372:1: ( ( ( ( rule__PanelTrack__PanelsessionAssignment_3 ) ) ( ( rule__PanelTrack__PanelsessionAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1373:1: ( ( ( rule__PanelTrack__PanelsessionAssignment_3 ) ) ( ( rule__PanelTrack__PanelsessionAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1373:1: ( ( ( rule__PanelTrack__PanelsessionAssignment_3 ) ) ( ( rule__PanelTrack__PanelsessionAssignment_3 )* ) )
            // InternalConferenceProgram.g:1374:2: ( ( rule__PanelTrack__PanelsessionAssignment_3 ) ) ( ( rule__PanelTrack__PanelsessionAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1374:2: ( ( rule__PanelTrack__PanelsessionAssignment_3 ) )
            // InternalConferenceProgram.g:1375:3: ( rule__PanelTrack__PanelsessionAssignment_3 )
            {
             before(grammarAccess.getPanelTrackAccess().getPanelsessionAssignment_3()); 
            // InternalConferenceProgram.g:1376:3: ( rule__PanelTrack__PanelsessionAssignment_3 )
            // InternalConferenceProgram.g:1376:4: rule__PanelTrack__PanelsessionAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__PanelTrack__PanelsessionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPanelTrackAccess().getPanelsessionAssignment_3()); 

            }

            // InternalConferenceProgram.g:1379:2: ( ( rule__PanelTrack__PanelsessionAssignment_3 )* )
            // InternalConferenceProgram.g:1380:3: ( rule__PanelTrack__PanelsessionAssignment_3 )*
            {
             before(grammarAccess.getPanelTrackAccess().getPanelsessionAssignment_3()); 
            // InternalConferenceProgram.g:1381:3: ( rule__PanelTrack__PanelsessionAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalConferenceProgram.g:1381:4: rule__PanelTrack__PanelsessionAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PanelTrack__PanelsessionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPanelTrackAccess().getPanelsessionAssignment_3()); 

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
    // $ANTLR end "rule__PanelTrack__Group__3__Impl"


    // $ANTLR start "rule__PanelTrack__Group__4"
    // InternalConferenceProgram.g:1390:1: rule__PanelTrack__Group__4 : rule__PanelTrack__Group__4__Impl ;
    public final void rule__PanelTrack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1394:1: ( rule__PanelTrack__Group__4__Impl )
            // InternalConferenceProgram.g:1395:2: rule__PanelTrack__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PanelTrack__Group__4__Impl();

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
    // $ANTLR end "rule__PanelTrack__Group__4"


    // $ANTLR start "rule__PanelTrack__Group__4__Impl"
    // InternalConferenceProgram.g:1401:1: rule__PanelTrack__Group__4__Impl : ( '}' ) ;
    public final void rule__PanelTrack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1405:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1406:1: ( '}' )
            {
            // InternalConferenceProgram.g:1406:1: ( '}' )
            // InternalConferenceProgram.g:1407:2: '}'
            {
             before(grammarAccess.getPanelTrackAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPanelTrackAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PanelTrack__Group__4__Impl"


    // $ANTLR start "rule__ResearchSession__Group__0"
    // InternalConferenceProgram.g:1417:1: rule__ResearchSession__Group__0 : rule__ResearchSession__Group__0__Impl rule__ResearchSession__Group__1 ;
    public final void rule__ResearchSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1421:1: ( rule__ResearchSession__Group__0__Impl rule__ResearchSession__Group__1 )
            // InternalConferenceProgram.g:1422:2: rule__ResearchSession__Group__0__Impl rule__ResearchSession__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ResearchSession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__1();

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
    // $ANTLR end "rule__ResearchSession__Group__0"


    // $ANTLR start "rule__ResearchSession__Group__0__Impl"
    // InternalConferenceProgram.g:1429:1: rule__ResearchSession__Group__0__Impl : ( 'Session' ) ;
    public final void rule__ResearchSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1433:1: ( ( 'Session' ) )
            // InternalConferenceProgram.g:1434:1: ( 'Session' )
            {
            // InternalConferenceProgram.g:1434:1: ( 'Session' )
            // InternalConferenceProgram.g:1435:2: 'Session'
            {
             before(grammarAccess.getResearchSessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getSessionKeyword_0()); 

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
    // $ANTLR end "rule__ResearchSession__Group__0__Impl"


    // $ANTLR start "rule__ResearchSession__Group__1"
    // InternalConferenceProgram.g:1444:1: rule__ResearchSession__Group__1 : rule__ResearchSession__Group__1__Impl rule__ResearchSession__Group__2 ;
    public final void rule__ResearchSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1448:1: ( rule__ResearchSession__Group__1__Impl rule__ResearchSession__Group__2 )
            // InternalConferenceProgram.g:1449:2: rule__ResearchSession__Group__1__Impl rule__ResearchSession__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ResearchSession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__2();

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
    // $ANTLR end "rule__ResearchSession__Group__1"


    // $ANTLR start "rule__ResearchSession__Group__1__Impl"
    // InternalConferenceProgram.g:1456:1: rule__ResearchSession__Group__1__Impl : ( ( rule__ResearchSession__NameAssignment_1 ) ) ;
    public final void rule__ResearchSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1460:1: ( ( ( rule__ResearchSession__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1461:1: ( ( rule__ResearchSession__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1461:1: ( ( rule__ResearchSession__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1462:2: ( rule__ResearchSession__NameAssignment_1 )
            {
             before(grammarAccess.getResearchSessionAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1463:2: ( rule__ResearchSession__NameAssignment_1 )
            // InternalConferenceProgram.g:1463:3: rule__ResearchSession__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResearchSession__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResearchSessionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ResearchSession__Group__1__Impl"


    // $ANTLR start "rule__ResearchSession__Group__2"
    // InternalConferenceProgram.g:1471:1: rule__ResearchSession__Group__2 : rule__ResearchSession__Group__2__Impl rule__ResearchSession__Group__3 ;
    public final void rule__ResearchSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1475:1: ( rule__ResearchSession__Group__2__Impl rule__ResearchSession__Group__3 )
            // InternalConferenceProgram.g:1476:2: rule__ResearchSession__Group__2__Impl rule__ResearchSession__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ResearchSession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__3();

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
    // $ANTLR end "rule__ResearchSession__Group__2"


    // $ANTLR start "rule__ResearchSession__Group__2__Impl"
    // InternalConferenceProgram.g:1483:1: rule__ResearchSession__Group__2__Impl : ( '{' ) ;
    public final void rule__ResearchSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1487:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1488:1: ( '{' )
            {
            // InternalConferenceProgram.g:1488:1: ( '{' )
            // InternalConferenceProgram.g:1489:2: '{'
            {
             before(grammarAccess.getResearchSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ResearchSession__Group__2__Impl"


    // $ANTLR start "rule__ResearchSession__Group__3"
    // InternalConferenceProgram.g:1498:1: rule__ResearchSession__Group__3 : rule__ResearchSession__Group__3__Impl rule__ResearchSession__Group__4 ;
    public final void rule__ResearchSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1502:1: ( rule__ResearchSession__Group__3__Impl rule__ResearchSession__Group__4 )
            // InternalConferenceProgram.g:1503:2: rule__ResearchSession__Group__3__Impl rule__ResearchSession__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ResearchSession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__4();

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
    // $ANTLR end "rule__ResearchSession__Group__3"


    // $ANTLR start "rule__ResearchSession__Group__3__Impl"
    // InternalConferenceProgram.g:1510:1: rule__ResearchSession__Group__3__Impl : ( ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) ) ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* ) ) ;
    public final void rule__ResearchSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1514:1: ( ( ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) ) ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1515:1: ( ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) ) ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1515:1: ( ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) ) ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* ) )
            // InternalConferenceProgram.g:1516:2: ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) ) ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1516:2: ( ( rule__ResearchSession__ResearchpaperAssignment_3 ) )
            // InternalConferenceProgram.g:1517:3: ( rule__ResearchSession__ResearchpaperAssignment_3 )
            {
             before(grammarAccess.getResearchSessionAccess().getResearchpaperAssignment_3()); 
            // InternalConferenceProgram.g:1518:3: ( rule__ResearchSession__ResearchpaperAssignment_3 )
            // InternalConferenceProgram.g:1518:4: rule__ResearchSession__ResearchpaperAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__ResearchSession__ResearchpaperAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResearchSessionAccess().getResearchpaperAssignment_3()); 

            }

            // InternalConferenceProgram.g:1521:2: ( ( rule__ResearchSession__ResearchpaperAssignment_3 )* )
            // InternalConferenceProgram.g:1522:3: ( rule__ResearchSession__ResearchpaperAssignment_3 )*
            {
             before(grammarAccess.getResearchSessionAccess().getResearchpaperAssignment_3()); 
            // InternalConferenceProgram.g:1523:3: ( rule__ResearchSession__ResearchpaperAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalConferenceProgram.g:1523:4: rule__ResearchSession__ResearchpaperAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ResearchSession__ResearchpaperAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getResearchSessionAccess().getResearchpaperAssignment_3()); 

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
    // $ANTLR end "rule__ResearchSession__Group__3__Impl"


    // $ANTLR start "rule__ResearchSession__Group__4"
    // InternalConferenceProgram.g:1532:1: rule__ResearchSession__Group__4 : rule__ResearchSession__Group__4__Impl rule__ResearchSession__Group__5 ;
    public final void rule__ResearchSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1536:1: ( rule__ResearchSession__Group__4__Impl rule__ResearchSession__Group__5 )
            // InternalConferenceProgram.g:1537:2: rule__ResearchSession__Group__4__Impl rule__ResearchSession__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ResearchSession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__5();

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
    // $ANTLR end "rule__ResearchSession__Group__4"


    // $ANTLR start "rule__ResearchSession__Group__4__Impl"
    // InternalConferenceProgram.g:1544:1: rule__ResearchSession__Group__4__Impl : ( ( rule__ResearchSession__LocationAssignment_4 )? ) ;
    public final void rule__ResearchSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1548:1: ( ( ( rule__ResearchSession__LocationAssignment_4 )? ) )
            // InternalConferenceProgram.g:1549:1: ( ( rule__ResearchSession__LocationAssignment_4 )? )
            {
            // InternalConferenceProgram.g:1549:1: ( ( rule__ResearchSession__LocationAssignment_4 )? )
            // InternalConferenceProgram.g:1550:2: ( rule__ResearchSession__LocationAssignment_4 )?
            {
             before(grammarAccess.getResearchSessionAccess().getLocationAssignment_4()); 
            // InternalConferenceProgram.g:1551:2: ( rule__ResearchSession__LocationAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConferenceProgram.g:1551:3: rule__ResearchSession__LocationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResearchSession__LocationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResearchSessionAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__ResearchSession__Group__4__Impl"


    // $ANTLR start "rule__ResearchSession__Group__5"
    // InternalConferenceProgram.g:1559:1: rule__ResearchSession__Group__5 : rule__ResearchSession__Group__5__Impl rule__ResearchSession__Group__6 ;
    public final void rule__ResearchSession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1563:1: ( rule__ResearchSession__Group__5__Impl rule__ResearchSession__Group__6 )
            // InternalConferenceProgram.g:1564:2: rule__ResearchSession__Group__5__Impl rule__ResearchSession__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ResearchSession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__6();

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
    // $ANTLR end "rule__ResearchSession__Group__5"


    // $ANTLR start "rule__ResearchSession__Group__5__Impl"
    // InternalConferenceProgram.g:1571:1: rule__ResearchSession__Group__5__Impl : ( ( rule__ResearchSession__StartTimeAssignment_5 ) ) ;
    public final void rule__ResearchSession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1575:1: ( ( ( rule__ResearchSession__StartTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:1576:1: ( ( rule__ResearchSession__StartTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:1576:1: ( ( rule__ResearchSession__StartTimeAssignment_5 ) )
            // InternalConferenceProgram.g:1577:2: ( rule__ResearchSession__StartTimeAssignment_5 )
            {
             before(grammarAccess.getResearchSessionAccess().getStartTimeAssignment_5()); 
            // InternalConferenceProgram.g:1578:2: ( rule__ResearchSession__StartTimeAssignment_5 )
            // InternalConferenceProgram.g:1578:3: rule__ResearchSession__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ResearchSession__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getResearchSessionAccess().getStartTimeAssignment_5()); 

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
    // $ANTLR end "rule__ResearchSession__Group__5__Impl"


    // $ANTLR start "rule__ResearchSession__Group__6"
    // InternalConferenceProgram.g:1586:1: rule__ResearchSession__Group__6 : rule__ResearchSession__Group__6__Impl rule__ResearchSession__Group__7 ;
    public final void rule__ResearchSession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1590:1: ( rule__ResearchSession__Group__6__Impl rule__ResearchSession__Group__7 )
            // InternalConferenceProgram.g:1591:2: rule__ResearchSession__Group__6__Impl rule__ResearchSession__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ResearchSession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__7();

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
    // $ANTLR end "rule__ResearchSession__Group__6"


    // $ANTLR start "rule__ResearchSession__Group__6__Impl"
    // InternalConferenceProgram.g:1598:1: rule__ResearchSession__Group__6__Impl : ( ( rule__ResearchSession__EndTimeAssignment_6 ) ) ;
    public final void rule__ResearchSession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1602:1: ( ( ( rule__ResearchSession__EndTimeAssignment_6 ) ) )
            // InternalConferenceProgram.g:1603:1: ( ( rule__ResearchSession__EndTimeAssignment_6 ) )
            {
            // InternalConferenceProgram.g:1603:1: ( ( rule__ResearchSession__EndTimeAssignment_6 ) )
            // InternalConferenceProgram.g:1604:2: ( rule__ResearchSession__EndTimeAssignment_6 )
            {
             before(grammarAccess.getResearchSessionAccess().getEndTimeAssignment_6()); 
            // InternalConferenceProgram.g:1605:2: ( rule__ResearchSession__EndTimeAssignment_6 )
            // InternalConferenceProgram.g:1605:3: rule__ResearchSession__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ResearchSession__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getResearchSessionAccess().getEndTimeAssignment_6()); 

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
    // $ANTLR end "rule__ResearchSession__Group__6__Impl"


    // $ANTLR start "rule__ResearchSession__Group__7"
    // InternalConferenceProgram.g:1613:1: rule__ResearchSession__Group__7 : rule__ResearchSession__Group__7__Impl ;
    public final void rule__ResearchSession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1617:1: ( rule__ResearchSession__Group__7__Impl )
            // InternalConferenceProgram.g:1618:2: rule__ResearchSession__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResearchSession__Group__7__Impl();

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
    // $ANTLR end "rule__ResearchSession__Group__7"


    // $ANTLR start "rule__ResearchSession__Group__7__Impl"
    // InternalConferenceProgram.g:1624:1: rule__ResearchSession__Group__7__Impl : ( '}' ) ;
    public final void rule__ResearchSession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1628:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1629:1: ( '}' )
            {
            // InternalConferenceProgram.g:1629:1: ( '}' )
            // InternalConferenceProgram.g:1630:2: '}'
            {
             before(grammarAccess.getResearchSessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ResearchSession__Group__7__Impl"


    // $ANTLR start "rule__IndustrySession__Group__0"
    // InternalConferenceProgram.g:1640:1: rule__IndustrySession__Group__0 : rule__IndustrySession__Group__0__Impl rule__IndustrySession__Group__1 ;
    public final void rule__IndustrySession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1644:1: ( rule__IndustrySession__Group__0__Impl rule__IndustrySession__Group__1 )
            // InternalConferenceProgram.g:1645:2: rule__IndustrySession__Group__0__Impl rule__IndustrySession__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IndustrySession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__1();

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
    // $ANTLR end "rule__IndustrySession__Group__0"


    // $ANTLR start "rule__IndustrySession__Group__0__Impl"
    // InternalConferenceProgram.g:1652:1: rule__IndustrySession__Group__0__Impl : ( 'Session' ) ;
    public final void rule__IndustrySession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1656:1: ( ( 'Session' ) )
            // InternalConferenceProgram.g:1657:1: ( 'Session' )
            {
            // InternalConferenceProgram.g:1657:1: ( 'Session' )
            // InternalConferenceProgram.g:1658:2: 'Session'
            {
             before(grammarAccess.getIndustrySessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getSessionKeyword_0()); 

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
    // $ANTLR end "rule__IndustrySession__Group__0__Impl"


    // $ANTLR start "rule__IndustrySession__Group__1"
    // InternalConferenceProgram.g:1667:1: rule__IndustrySession__Group__1 : rule__IndustrySession__Group__1__Impl rule__IndustrySession__Group__2 ;
    public final void rule__IndustrySession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1671:1: ( rule__IndustrySession__Group__1__Impl rule__IndustrySession__Group__2 )
            // InternalConferenceProgram.g:1672:2: rule__IndustrySession__Group__1__Impl rule__IndustrySession__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IndustrySession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__2();

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
    // $ANTLR end "rule__IndustrySession__Group__1"


    // $ANTLR start "rule__IndustrySession__Group__1__Impl"
    // InternalConferenceProgram.g:1679:1: rule__IndustrySession__Group__1__Impl : ( ( rule__IndustrySession__NameAssignment_1 ) ) ;
    public final void rule__IndustrySession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1683:1: ( ( ( rule__IndustrySession__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1684:1: ( ( rule__IndustrySession__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1684:1: ( ( rule__IndustrySession__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1685:2: ( rule__IndustrySession__NameAssignment_1 )
            {
             before(grammarAccess.getIndustrySessionAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1686:2: ( rule__IndustrySession__NameAssignment_1 )
            // InternalConferenceProgram.g:1686:3: rule__IndustrySession__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndustrySession__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndustrySessionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IndustrySession__Group__1__Impl"


    // $ANTLR start "rule__IndustrySession__Group__2"
    // InternalConferenceProgram.g:1694:1: rule__IndustrySession__Group__2 : rule__IndustrySession__Group__2__Impl rule__IndustrySession__Group__3 ;
    public final void rule__IndustrySession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1698:1: ( rule__IndustrySession__Group__2__Impl rule__IndustrySession__Group__3 )
            // InternalConferenceProgram.g:1699:2: rule__IndustrySession__Group__2__Impl rule__IndustrySession__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__IndustrySession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__3();

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
    // $ANTLR end "rule__IndustrySession__Group__2"


    // $ANTLR start "rule__IndustrySession__Group__2__Impl"
    // InternalConferenceProgram.g:1706:1: rule__IndustrySession__Group__2__Impl : ( '{' ) ;
    public final void rule__IndustrySession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1710:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1711:1: ( '{' )
            {
            // InternalConferenceProgram.g:1711:1: ( '{' )
            // InternalConferenceProgram.g:1712:2: '{'
            {
             before(grammarAccess.getIndustrySessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__IndustrySession__Group__2__Impl"


    // $ANTLR start "rule__IndustrySession__Group__3"
    // InternalConferenceProgram.g:1721:1: rule__IndustrySession__Group__3 : rule__IndustrySession__Group__3__Impl rule__IndustrySession__Group__4 ;
    public final void rule__IndustrySession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1725:1: ( rule__IndustrySession__Group__3__Impl rule__IndustrySession__Group__4 )
            // InternalConferenceProgram.g:1726:2: rule__IndustrySession__Group__3__Impl rule__IndustrySession__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__IndustrySession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__4();

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
    // $ANTLR end "rule__IndustrySession__Group__3"


    // $ANTLR start "rule__IndustrySession__Group__3__Impl"
    // InternalConferenceProgram.g:1733:1: rule__IndustrySession__Group__3__Impl : ( ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) ) ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* ) ) ;
    public final void rule__IndustrySession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1737:1: ( ( ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) ) ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1738:1: ( ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) ) ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1738:1: ( ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) ) ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* ) )
            // InternalConferenceProgram.g:1739:2: ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) ) ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1739:2: ( ( rule__IndustrySession__IndustrypaperAssignment_3 ) )
            // InternalConferenceProgram.g:1740:3: ( rule__IndustrySession__IndustrypaperAssignment_3 )
            {
             before(grammarAccess.getIndustrySessionAccess().getIndustrypaperAssignment_3()); 
            // InternalConferenceProgram.g:1741:3: ( rule__IndustrySession__IndustrypaperAssignment_3 )
            // InternalConferenceProgram.g:1741:4: rule__IndustrySession__IndustrypaperAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__IndustrySession__IndustrypaperAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndustrySessionAccess().getIndustrypaperAssignment_3()); 

            }

            // InternalConferenceProgram.g:1744:2: ( ( rule__IndustrySession__IndustrypaperAssignment_3 )* )
            // InternalConferenceProgram.g:1745:3: ( rule__IndustrySession__IndustrypaperAssignment_3 )*
            {
             before(grammarAccess.getIndustrySessionAccess().getIndustrypaperAssignment_3()); 
            // InternalConferenceProgram.g:1746:3: ( rule__IndustrySession__IndustrypaperAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalConferenceProgram.g:1746:4: rule__IndustrySession__IndustrypaperAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IndustrySession__IndustrypaperAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIndustrySessionAccess().getIndustrypaperAssignment_3()); 

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
    // $ANTLR end "rule__IndustrySession__Group__3__Impl"


    // $ANTLR start "rule__IndustrySession__Group__4"
    // InternalConferenceProgram.g:1755:1: rule__IndustrySession__Group__4 : rule__IndustrySession__Group__4__Impl rule__IndustrySession__Group__5 ;
    public final void rule__IndustrySession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1759:1: ( rule__IndustrySession__Group__4__Impl rule__IndustrySession__Group__5 )
            // InternalConferenceProgram.g:1760:2: rule__IndustrySession__Group__4__Impl rule__IndustrySession__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__IndustrySession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__5();

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
    // $ANTLR end "rule__IndustrySession__Group__4"


    // $ANTLR start "rule__IndustrySession__Group__4__Impl"
    // InternalConferenceProgram.g:1767:1: rule__IndustrySession__Group__4__Impl : ( ( rule__IndustrySession__LocationAssignment_4 )? ) ;
    public final void rule__IndustrySession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1771:1: ( ( ( rule__IndustrySession__LocationAssignment_4 )? ) )
            // InternalConferenceProgram.g:1772:1: ( ( rule__IndustrySession__LocationAssignment_4 )? )
            {
            // InternalConferenceProgram.g:1772:1: ( ( rule__IndustrySession__LocationAssignment_4 )? )
            // InternalConferenceProgram.g:1773:2: ( rule__IndustrySession__LocationAssignment_4 )?
            {
             before(grammarAccess.getIndustrySessionAccess().getLocationAssignment_4()); 
            // InternalConferenceProgram.g:1774:2: ( rule__IndustrySession__LocationAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalConferenceProgram.g:1774:3: rule__IndustrySession__LocationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__IndustrySession__LocationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndustrySessionAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__IndustrySession__Group__4__Impl"


    // $ANTLR start "rule__IndustrySession__Group__5"
    // InternalConferenceProgram.g:1782:1: rule__IndustrySession__Group__5 : rule__IndustrySession__Group__5__Impl rule__IndustrySession__Group__6 ;
    public final void rule__IndustrySession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1786:1: ( rule__IndustrySession__Group__5__Impl rule__IndustrySession__Group__6 )
            // InternalConferenceProgram.g:1787:2: rule__IndustrySession__Group__5__Impl rule__IndustrySession__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__IndustrySession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__6();

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
    // $ANTLR end "rule__IndustrySession__Group__5"


    // $ANTLR start "rule__IndustrySession__Group__5__Impl"
    // InternalConferenceProgram.g:1794:1: rule__IndustrySession__Group__5__Impl : ( ( rule__IndustrySession__StartTimeAssignment_5 ) ) ;
    public final void rule__IndustrySession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1798:1: ( ( ( rule__IndustrySession__StartTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:1799:1: ( ( rule__IndustrySession__StartTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:1799:1: ( ( rule__IndustrySession__StartTimeAssignment_5 ) )
            // InternalConferenceProgram.g:1800:2: ( rule__IndustrySession__StartTimeAssignment_5 )
            {
             before(grammarAccess.getIndustrySessionAccess().getStartTimeAssignment_5()); 
            // InternalConferenceProgram.g:1801:2: ( rule__IndustrySession__StartTimeAssignment_5 )
            // InternalConferenceProgram.g:1801:3: rule__IndustrySession__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IndustrySession__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIndustrySessionAccess().getStartTimeAssignment_5()); 

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
    // $ANTLR end "rule__IndustrySession__Group__5__Impl"


    // $ANTLR start "rule__IndustrySession__Group__6"
    // InternalConferenceProgram.g:1809:1: rule__IndustrySession__Group__6 : rule__IndustrySession__Group__6__Impl rule__IndustrySession__Group__7 ;
    public final void rule__IndustrySession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1813:1: ( rule__IndustrySession__Group__6__Impl rule__IndustrySession__Group__7 )
            // InternalConferenceProgram.g:1814:2: rule__IndustrySession__Group__6__Impl rule__IndustrySession__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__IndustrySession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__7();

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
    // $ANTLR end "rule__IndustrySession__Group__6"


    // $ANTLR start "rule__IndustrySession__Group__6__Impl"
    // InternalConferenceProgram.g:1821:1: rule__IndustrySession__Group__6__Impl : ( ( rule__IndustrySession__EndTimeAssignment_6 ) ) ;
    public final void rule__IndustrySession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1825:1: ( ( ( rule__IndustrySession__EndTimeAssignment_6 ) ) )
            // InternalConferenceProgram.g:1826:1: ( ( rule__IndustrySession__EndTimeAssignment_6 ) )
            {
            // InternalConferenceProgram.g:1826:1: ( ( rule__IndustrySession__EndTimeAssignment_6 ) )
            // InternalConferenceProgram.g:1827:2: ( rule__IndustrySession__EndTimeAssignment_6 )
            {
             before(grammarAccess.getIndustrySessionAccess().getEndTimeAssignment_6()); 
            // InternalConferenceProgram.g:1828:2: ( rule__IndustrySession__EndTimeAssignment_6 )
            // InternalConferenceProgram.g:1828:3: rule__IndustrySession__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IndustrySession__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIndustrySessionAccess().getEndTimeAssignment_6()); 

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
    // $ANTLR end "rule__IndustrySession__Group__6__Impl"


    // $ANTLR start "rule__IndustrySession__Group__7"
    // InternalConferenceProgram.g:1836:1: rule__IndustrySession__Group__7 : rule__IndustrySession__Group__7__Impl ;
    public final void rule__IndustrySession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1840:1: ( rule__IndustrySession__Group__7__Impl )
            // InternalConferenceProgram.g:1841:2: rule__IndustrySession__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndustrySession__Group__7__Impl();

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
    // $ANTLR end "rule__IndustrySession__Group__7"


    // $ANTLR start "rule__IndustrySession__Group__7__Impl"
    // InternalConferenceProgram.g:1847:1: rule__IndustrySession__Group__7__Impl : ( '}' ) ;
    public final void rule__IndustrySession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1851:1: ( ( '}' ) )
            // InternalConferenceProgram.g:1852:1: ( '}' )
            {
            // InternalConferenceProgram.g:1852:1: ( '}' )
            // InternalConferenceProgram.g:1853:2: '}'
            {
             before(grammarAccess.getIndustrySessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__IndustrySession__Group__7__Impl"


    // $ANTLR start "rule__DemoSession__Group__0"
    // InternalConferenceProgram.g:1863:1: rule__DemoSession__Group__0 : rule__DemoSession__Group__0__Impl rule__DemoSession__Group__1 ;
    public final void rule__DemoSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1867:1: ( rule__DemoSession__Group__0__Impl rule__DemoSession__Group__1 )
            // InternalConferenceProgram.g:1868:2: rule__DemoSession__Group__0__Impl rule__DemoSession__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DemoSession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__1();

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
    // $ANTLR end "rule__DemoSession__Group__0"


    // $ANTLR start "rule__DemoSession__Group__0__Impl"
    // InternalConferenceProgram.g:1875:1: rule__DemoSession__Group__0__Impl : ( 'Session' ) ;
    public final void rule__DemoSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1879:1: ( ( 'Session' ) )
            // InternalConferenceProgram.g:1880:1: ( 'Session' )
            {
            // InternalConferenceProgram.g:1880:1: ( 'Session' )
            // InternalConferenceProgram.g:1881:2: 'Session'
            {
             before(grammarAccess.getDemoSessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getSessionKeyword_0()); 

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
    // $ANTLR end "rule__DemoSession__Group__0__Impl"


    // $ANTLR start "rule__DemoSession__Group__1"
    // InternalConferenceProgram.g:1890:1: rule__DemoSession__Group__1 : rule__DemoSession__Group__1__Impl rule__DemoSession__Group__2 ;
    public final void rule__DemoSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1894:1: ( rule__DemoSession__Group__1__Impl rule__DemoSession__Group__2 )
            // InternalConferenceProgram.g:1895:2: rule__DemoSession__Group__1__Impl rule__DemoSession__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DemoSession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__2();

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
    // $ANTLR end "rule__DemoSession__Group__1"


    // $ANTLR start "rule__DemoSession__Group__1__Impl"
    // InternalConferenceProgram.g:1902:1: rule__DemoSession__Group__1__Impl : ( ( rule__DemoSession__NameAssignment_1 ) ) ;
    public final void rule__DemoSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1906:1: ( ( ( rule__DemoSession__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:1907:1: ( ( rule__DemoSession__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:1907:1: ( ( rule__DemoSession__NameAssignment_1 ) )
            // InternalConferenceProgram.g:1908:2: ( rule__DemoSession__NameAssignment_1 )
            {
             before(grammarAccess.getDemoSessionAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:1909:2: ( rule__DemoSession__NameAssignment_1 )
            // InternalConferenceProgram.g:1909:3: rule__DemoSession__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DemoSession__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDemoSessionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DemoSession__Group__1__Impl"


    // $ANTLR start "rule__DemoSession__Group__2"
    // InternalConferenceProgram.g:1917:1: rule__DemoSession__Group__2 : rule__DemoSession__Group__2__Impl rule__DemoSession__Group__3 ;
    public final void rule__DemoSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1921:1: ( rule__DemoSession__Group__2__Impl rule__DemoSession__Group__3 )
            // InternalConferenceProgram.g:1922:2: rule__DemoSession__Group__2__Impl rule__DemoSession__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DemoSession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__3();

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
    // $ANTLR end "rule__DemoSession__Group__2"


    // $ANTLR start "rule__DemoSession__Group__2__Impl"
    // InternalConferenceProgram.g:1929:1: rule__DemoSession__Group__2__Impl : ( '{' ) ;
    public final void rule__DemoSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1933:1: ( ( '{' ) )
            // InternalConferenceProgram.g:1934:1: ( '{' )
            {
            // InternalConferenceProgram.g:1934:1: ( '{' )
            // InternalConferenceProgram.g:1935:2: '{'
            {
             before(grammarAccess.getDemoSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DemoSession__Group__2__Impl"


    // $ANTLR start "rule__DemoSession__Group__3"
    // InternalConferenceProgram.g:1944:1: rule__DemoSession__Group__3 : rule__DemoSession__Group__3__Impl rule__DemoSession__Group__4 ;
    public final void rule__DemoSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1948:1: ( rule__DemoSession__Group__3__Impl rule__DemoSession__Group__4 )
            // InternalConferenceProgram.g:1949:2: rule__DemoSession__Group__3__Impl rule__DemoSession__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DemoSession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__4();

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
    // $ANTLR end "rule__DemoSession__Group__3"


    // $ANTLR start "rule__DemoSession__Group__3__Impl"
    // InternalConferenceProgram.g:1956:1: rule__DemoSession__Group__3__Impl : ( ( ( rule__DemoSession__DemoandposterAssignment_3 ) ) ( ( rule__DemoSession__DemoandposterAssignment_3 )* ) ) ;
    public final void rule__DemoSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1960:1: ( ( ( ( rule__DemoSession__DemoandposterAssignment_3 ) ) ( ( rule__DemoSession__DemoandposterAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:1961:1: ( ( ( rule__DemoSession__DemoandposterAssignment_3 ) ) ( ( rule__DemoSession__DemoandposterAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:1961:1: ( ( ( rule__DemoSession__DemoandposterAssignment_3 ) ) ( ( rule__DemoSession__DemoandposterAssignment_3 )* ) )
            // InternalConferenceProgram.g:1962:2: ( ( rule__DemoSession__DemoandposterAssignment_3 ) ) ( ( rule__DemoSession__DemoandposterAssignment_3 )* )
            {
            // InternalConferenceProgram.g:1962:2: ( ( rule__DemoSession__DemoandposterAssignment_3 ) )
            // InternalConferenceProgram.g:1963:3: ( rule__DemoSession__DemoandposterAssignment_3 )
            {
             before(grammarAccess.getDemoSessionAccess().getDemoandposterAssignment_3()); 
            // InternalConferenceProgram.g:1964:3: ( rule__DemoSession__DemoandposterAssignment_3 )
            // InternalConferenceProgram.g:1964:4: rule__DemoSession__DemoandposterAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__DemoSession__DemoandposterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDemoSessionAccess().getDemoandposterAssignment_3()); 

            }

            // InternalConferenceProgram.g:1967:2: ( ( rule__DemoSession__DemoandposterAssignment_3 )* )
            // InternalConferenceProgram.g:1968:3: ( rule__DemoSession__DemoandposterAssignment_3 )*
            {
             before(grammarAccess.getDemoSessionAccess().getDemoandposterAssignment_3()); 
            // InternalConferenceProgram.g:1969:3: ( rule__DemoSession__DemoandposterAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalConferenceProgram.g:1969:4: rule__DemoSession__DemoandposterAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DemoSession__DemoandposterAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDemoSessionAccess().getDemoandposterAssignment_3()); 

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
    // $ANTLR end "rule__DemoSession__Group__3__Impl"


    // $ANTLR start "rule__DemoSession__Group__4"
    // InternalConferenceProgram.g:1978:1: rule__DemoSession__Group__4 : rule__DemoSession__Group__4__Impl rule__DemoSession__Group__5 ;
    public final void rule__DemoSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1982:1: ( rule__DemoSession__Group__4__Impl rule__DemoSession__Group__5 )
            // InternalConferenceProgram.g:1983:2: rule__DemoSession__Group__4__Impl rule__DemoSession__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__DemoSession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__5();

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
    // $ANTLR end "rule__DemoSession__Group__4"


    // $ANTLR start "rule__DemoSession__Group__4__Impl"
    // InternalConferenceProgram.g:1990:1: rule__DemoSession__Group__4__Impl : ( ( rule__DemoSession__LocationAssignment_4 )? ) ;
    public final void rule__DemoSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:1994:1: ( ( ( rule__DemoSession__LocationAssignment_4 )? ) )
            // InternalConferenceProgram.g:1995:1: ( ( rule__DemoSession__LocationAssignment_4 )? )
            {
            // InternalConferenceProgram.g:1995:1: ( ( rule__DemoSession__LocationAssignment_4 )? )
            // InternalConferenceProgram.g:1996:2: ( rule__DemoSession__LocationAssignment_4 )?
            {
             before(grammarAccess.getDemoSessionAccess().getLocationAssignment_4()); 
            // InternalConferenceProgram.g:1997:2: ( rule__DemoSession__LocationAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalConferenceProgram.g:1997:3: rule__DemoSession__LocationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DemoSession__LocationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDemoSessionAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__DemoSession__Group__4__Impl"


    // $ANTLR start "rule__DemoSession__Group__5"
    // InternalConferenceProgram.g:2005:1: rule__DemoSession__Group__5 : rule__DemoSession__Group__5__Impl rule__DemoSession__Group__6 ;
    public final void rule__DemoSession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2009:1: ( rule__DemoSession__Group__5__Impl rule__DemoSession__Group__6 )
            // InternalConferenceProgram.g:2010:2: rule__DemoSession__Group__5__Impl rule__DemoSession__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__DemoSession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__6();

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
    // $ANTLR end "rule__DemoSession__Group__5"


    // $ANTLR start "rule__DemoSession__Group__5__Impl"
    // InternalConferenceProgram.g:2017:1: rule__DemoSession__Group__5__Impl : ( ( rule__DemoSession__StartTimeAssignment_5 ) ) ;
    public final void rule__DemoSession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2021:1: ( ( ( rule__DemoSession__StartTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:2022:1: ( ( rule__DemoSession__StartTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:2022:1: ( ( rule__DemoSession__StartTimeAssignment_5 ) )
            // InternalConferenceProgram.g:2023:2: ( rule__DemoSession__StartTimeAssignment_5 )
            {
             before(grammarAccess.getDemoSessionAccess().getStartTimeAssignment_5()); 
            // InternalConferenceProgram.g:2024:2: ( rule__DemoSession__StartTimeAssignment_5 )
            // InternalConferenceProgram.g:2024:3: rule__DemoSession__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DemoSession__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDemoSessionAccess().getStartTimeAssignment_5()); 

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
    // $ANTLR end "rule__DemoSession__Group__5__Impl"


    // $ANTLR start "rule__DemoSession__Group__6"
    // InternalConferenceProgram.g:2032:1: rule__DemoSession__Group__6 : rule__DemoSession__Group__6__Impl rule__DemoSession__Group__7 ;
    public final void rule__DemoSession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2036:1: ( rule__DemoSession__Group__6__Impl rule__DemoSession__Group__7 )
            // InternalConferenceProgram.g:2037:2: rule__DemoSession__Group__6__Impl rule__DemoSession__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__DemoSession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__7();

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
    // $ANTLR end "rule__DemoSession__Group__6"


    // $ANTLR start "rule__DemoSession__Group__6__Impl"
    // InternalConferenceProgram.g:2044:1: rule__DemoSession__Group__6__Impl : ( ( rule__DemoSession__EndTimeAssignment_6 ) ) ;
    public final void rule__DemoSession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2048:1: ( ( ( rule__DemoSession__EndTimeAssignment_6 ) ) )
            // InternalConferenceProgram.g:2049:1: ( ( rule__DemoSession__EndTimeAssignment_6 ) )
            {
            // InternalConferenceProgram.g:2049:1: ( ( rule__DemoSession__EndTimeAssignment_6 ) )
            // InternalConferenceProgram.g:2050:2: ( rule__DemoSession__EndTimeAssignment_6 )
            {
             before(grammarAccess.getDemoSessionAccess().getEndTimeAssignment_6()); 
            // InternalConferenceProgram.g:2051:2: ( rule__DemoSession__EndTimeAssignment_6 )
            // InternalConferenceProgram.g:2051:3: rule__DemoSession__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DemoSession__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDemoSessionAccess().getEndTimeAssignment_6()); 

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
    // $ANTLR end "rule__DemoSession__Group__6__Impl"


    // $ANTLR start "rule__DemoSession__Group__7"
    // InternalConferenceProgram.g:2059:1: rule__DemoSession__Group__7 : rule__DemoSession__Group__7__Impl ;
    public final void rule__DemoSession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2063:1: ( rule__DemoSession__Group__7__Impl )
            // InternalConferenceProgram.g:2064:2: rule__DemoSession__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DemoSession__Group__7__Impl();

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
    // $ANTLR end "rule__DemoSession__Group__7"


    // $ANTLR start "rule__DemoSession__Group__7__Impl"
    // InternalConferenceProgram.g:2070:1: rule__DemoSession__Group__7__Impl : ( '}' ) ;
    public final void rule__DemoSession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2074:1: ( ( '}' ) )
            // InternalConferenceProgram.g:2075:1: ( '}' )
            {
            // InternalConferenceProgram.g:2075:1: ( '}' )
            // InternalConferenceProgram.g:2076:2: '}'
            {
             before(grammarAccess.getDemoSessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DemoSession__Group__7__Impl"


    // $ANTLR start "rule__PanelSession__Group__0"
    // InternalConferenceProgram.g:2086:1: rule__PanelSession__Group__0 : rule__PanelSession__Group__0__Impl rule__PanelSession__Group__1 ;
    public final void rule__PanelSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2090:1: ( rule__PanelSession__Group__0__Impl rule__PanelSession__Group__1 )
            // InternalConferenceProgram.g:2091:2: rule__PanelSession__Group__0__Impl rule__PanelSession__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PanelSession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__1();

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
    // $ANTLR end "rule__PanelSession__Group__0"


    // $ANTLR start "rule__PanelSession__Group__0__Impl"
    // InternalConferenceProgram.g:2098:1: rule__PanelSession__Group__0__Impl : ( 'Session' ) ;
    public final void rule__PanelSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2102:1: ( ( 'Session' ) )
            // InternalConferenceProgram.g:2103:1: ( 'Session' )
            {
            // InternalConferenceProgram.g:2103:1: ( 'Session' )
            // InternalConferenceProgram.g:2104:2: 'Session'
            {
             before(grammarAccess.getPanelSessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getSessionKeyword_0()); 

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
    // $ANTLR end "rule__PanelSession__Group__0__Impl"


    // $ANTLR start "rule__PanelSession__Group__1"
    // InternalConferenceProgram.g:2113:1: rule__PanelSession__Group__1 : rule__PanelSession__Group__1__Impl rule__PanelSession__Group__2 ;
    public final void rule__PanelSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2117:1: ( rule__PanelSession__Group__1__Impl rule__PanelSession__Group__2 )
            // InternalConferenceProgram.g:2118:2: rule__PanelSession__Group__1__Impl rule__PanelSession__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PanelSession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__2();

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
    // $ANTLR end "rule__PanelSession__Group__1"


    // $ANTLR start "rule__PanelSession__Group__1__Impl"
    // InternalConferenceProgram.g:2125:1: rule__PanelSession__Group__1__Impl : ( ( rule__PanelSession__NameAssignment_1 ) ) ;
    public final void rule__PanelSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2129:1: ( ( ( rule__PanelSession__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2130:1: ( ( rule__PanelSession__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2130:1: ( ( rule__PanelSession__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2131:2: ( rule__PanelSession__NameAssignment_1 )
            {
             before(grammarAccess.getPanelSessionAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2132:2: ( rule__PanelSession__NameAssignment_1 )
            // InternalConferenceProgram.g:2132:3: rule__PanelSession__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PanelSession__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelSessionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PanelSession__Group__1__Impl"


    // $ANTLR start "rule__PanelSession__Group__2"
    // InternalConferenceProgram.g:2140:1: rule__PanelSession__Group__2 : rule__PanelSession__Group__2__Impl rule__PanelSession__Group__3 ;
    public final void rule__PanelSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2144:1: ( rule__PanelSession__Group__2__Impl rule__PanelSession__Group__3 )
            // InternalConferenceProgram.g:2145:2: rule__PanelSession__Group__2__Impl rule__PanelSession__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__PanelSession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__3();

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
    // $ANTLR end "rule__PanelSession__Group__2"


    // $ANTLR start "rule__PanelSession__Group__2__Impl"
    // InternalConferenceProgram.g:2152:1: rule__PanelSession__Group__2__Impl : ( '{' ) ;
    public final void rule__PanelSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2156:1: ( ( '{' ) )
            // InternalConferenceProgram.g:2157:1: ( '{' )
            {
            // InternalConferenceProgram.g:2157:1: ( '{' )
            // InternalConferenceProgram.g:2158:2: '{'
            {
             before(grammarAccess.getPanelSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PanelSession__Group__2__Impl"


    // $ANTLR start "rule__PanelSession__Group__3"
    // InternalConferenceProgram.g:2167:1: rule__PanelSession__Group__3 : rule__PanelSession__Group__3__Impl rule__PanelSession__Group__4 ;
    public final void rule__PanelSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2171:1: ( rule__PanelSession__Group__3__Impl rule__PanelSession__Group__4 )
            // InternalConferenceProgram.g:2172:2: rule__PanelSession__Group__3__Impl rule__PanelSession__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__PanelSession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__4();

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
    // $ANTLR end "rule__PanelSession__Group__3"


    // $ANTLR start "rule__PanelSession__Group__3__Impl"
    // InternalConferenceProgram.g:2179:1: rule__PanelSession__Group__3__Impl : ( ( ( rule__PanelSession__PanelAssignment_3 ) ) ( ( rule__PanelSession__PanelAssignment_3 )* ) ) ;
    public final void rule__PanelSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2183:1: ( ( ( ( rule__PanelSession__PanelAssignment_3 ) ) ( ( rule__PanelSession__PanelAssignment_3 )* ) ) )
            // InternalConferenceProgram.g:2184:1: ( ( ( rule__PanelSession__PanelAssignment_3 ) ) ( ( rule__PanelSession__PanelAssignment_3 )* ) )
            {
            // InternalConferenceProgram.g:2184:1: ( ( ( rule__PanelSession__PanelAssignment_3 ) ) ( ( rule__PanelSession__PanelAssignment_3 )* ) )
            // InternalConferenceProgram.g:2185:2: ( ( rule__PanelSession__PanelAssignment_3 ) ) ( ( rule__PanelSession__PanelAssignment_3 )* )
            {
            // InternalConferenceProgram.g:2185:2: ( ( rule__PanelSession__PanelAssignment_3 ) )
            // InternalConferenceProgram.g:2186:3: ( rule__PanelSession__PanelAssignment_3 )
            {
             before(grammarAccess.getPanelSessionAccess().getPanelAssignment_3()); 
            // InternalConferenceProgram.g:2187:3: ( rule__PanelSession__PanelAssignment_3 )
            // InternalConferenceProgram.g:2187:4: rule__PanelSession__PanelAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__PanelSession__PanelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPanelSessionAccess().getPanelAssignment_3()); 

            }

            // InternalConferenceProgram.g:2190:2: ( ( rule__PanelSession__PanelAssignment_3 )* )
            // InternalConferenceProgram.g:2191:3: ( rule__PanelSession__PanelAssignment_3 )*
            {
             before(grammarAccess.getPanelSessionAccess().getPanelAssignment_3()); 
            // InternalConferenceProgram.g:2192:3: ( rule__PanelSession__PanelAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalConferenceProgram.g:2192:4: rule__PanelSession__PanelAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PanelSession__PanelAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPanelSessionAccess().getPanelAssignment_3()); 

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
    // $ANTLR end "rule__PanelSession__Group__3__Impl"


    // $ANTLR start "rule__PanelSession__Group__4"
    // InternalConferenceProgram.g:2201:1: rule__PanelSession__Group__4 : rule__PanelSession__Group__4__Impl rule__PanelSession__Group__5 ;
    public final void rule__PanelSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2205:1: ( rule__PanelSession__Group__4__Impl rule__PanelSession__Group__5 )
            // InternalConferenceProgram.g:2206:2: rule__PanelSession__Group__4__Impl rule__PanelSession__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__PanelSession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__5();

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
    // $ANTLR end "rule__PanelSession__Group__4"


    // $ANTLR start "rule__PanelSession__Group__4__Impl"
    // InternalConferenceProgram.g:2213:1: rule__PanelSession__Group__4__Impl : ( ( rule__PanelSession__LocationAssignment_4 )? ) ;
    public final void rule__PanelSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2217:1: ( ( ( rule__PanelSession__LocationAssignment_4 )? ) )
            // InternalConferenceProgram.g:2218:1: ( ( rule__PanelSession__LocationAssignment_4 )? )
            {
            // InternalConferenceProgram.g:2218:1: ( ( rule__PanelSession__LocationAssignment_4 )? )
            // InternalConferenceProgram.g:2219:2: ( rule__PanelSession__LocationAssignment_4 )?
            {
             before(grammarAccess.getPanelSessionAccess().getLocationAssignment_4()); 
            // InternalConferenceProgram.g:2220:2: ( rule__PanelSession__LocationAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalConferenceProgram.g:2220:3: rule__PanelSession__LocationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PanelSession__LocationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelSessionAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__PanelSession__Group__4__Impl"


    // $ANTLR start "rule__PanelSession__Group__5"
    // InternalConferenceProgram.g:2228:1: rule__PanelSession__Group__5 : rule__PanelSession__Group__5__Impl rule__PanelSession__Group__6 ;
    public final void rule__PanelSession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2232:1: ( rule__PanelSession__Group__5__Impl rule__PanelSession__Group__6 )
            // InternalConferenceProgram.g:2233:2: rule__PanelSession__Group__5__Impl rule__PanelSession__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__PanelSession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__6();

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
    // $ANTLR end "rule__PanelSession__Group__5"


    // $ANTLR start "rule__PanelSession__Group__5__Impl"
    // InternalConferenceProgram.g:2240:1: rule__PanelSession__Group__5__Impl : ( ( rule__PanelSession__StartTimeAssignment_5 ) ) ;
    public final void rule__PanelSession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2244:1: ( ( ( rule__PanelSession__StartTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:2245:1: ( ( rule__PanelSession__StartTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:2245:1: ( ( rule__PanelSession__StartTimeAssignment_5 ) )
            // InternalConferenceProgram.g:2246:2: ( rule__PanelSession__StartTimeAssignment_5 )
            {
             before(grammarAccess.getPanelSessionAccess().getStartTimeAssignment_5()); 
            // InternalConferenceProgram.g:2247:2: ( rule__PanelSession__StartTimeAssignment_5 )
            // InternalConferenceProgram.g:2247:3: rule__PanelSession__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PanelSession__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPanelSessionAccess().getStartTimeAssignment_5()); 

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
    // $ANTLR end "rule__PanelSession__Group__5__Impl"


    // $ANTLR start "rule__PanelSession__Group__6"
    // InternalConferenceProgram.g:2255:1: rule__PanelSession__Group__6 : rule__PanelSession__Group__6__Impl rule__PanelSession__Group__7 ;
    public final void rule__PanelSession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2259:1: ( rule__PanelSession__Group__6__Impl rule__PanelSession__Group__7 )
            // InternalConferenceProgram.g:2260:2: rule__PanelSession__Group__6__Impl rule__PanelSession__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__PanelSession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__7();

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
    // $ANTLR end "rule__PanelSession__Group__6"


    // $ANTLR start "rule__PanelSession__Group__6__Impl"
    // InternalConferenceProgram.g:2267:1: rule__PanelSession__Group__6__Impl : ( ( rule__PanelSession__EndTimeAssignment_6 ) ) ;
    public final void rule__PanelSession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2271:1: ( ( ( rule__PanelSession__EndTimeAssignment_6 ) ) )
            // InternalConferenceProgram.g:2272:1: ( ( rule__PanelSession__EndTimeAssignment_6 ) )
            {
            // InternalConferenceProgram.g:2272:1: ( ( rule__PanelSession__EndTimeAssignment_6 ) )
            // InternalConferenceProgram.g:2273:2: ( rule__PanelSession__EndTimeAssignment_6 )
            {
             before(grammarAccess.getPanelSessionAccess().getEndTimeAssignment_6()); 
            // InternalConferenceProgram.g:2274:2: ( rule__PanelSession__EndTimeAssignment_6 )
            // InternalConferenceProgram.g:2274:3: rule__PanelSession__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PanelSession__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPanelSessionAccess().getEndTimeAssignment_6()); 

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
    // $ANTLR end "rule__PanelSession__Group__6__Impl"


    // $ANTLR start "rule__PanelSession__Group__7"
    // InternalConferenceProgram.g:2282:1: rule__PanelSession__Group__7 : rule__PanelSession__Group__7__Impl ;
    public final void rule__PanelSession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2286:1: ( rule__PanelSession__Group__7__Impl )
            // InternalConferenceProgram.g:2287:2: rule__PanelSession__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PanelSession__Group__7__Impl();

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
    // $ANTLR end "rule__PanelSession__Group__7"


    // $ANTLR start "rule__PanelSession__Group__7__Impl"
    // InternalConferenceProgram.g:2293:1: rule__PanelSession__Group__7__Impl : ( '}' ) ;
    public final void rule__PanelSession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2297:1: ( ( '}' ) )
            // InternalConferenceProgram.g:2298:1: ( '}' )
            {
            // InternalConferenceProgram.g:2298:1: ( '}' )
            // InternalConferenceProgram.g:2299:2: '}'
            {
             before(grammarAccess.getPanelSessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__PanelSession__Group__7__Impl"


    // $ANTLR start "rule__ResearchPaper__Group__0"
    // InternalConferenceProgram.g:2309:1: rule__ResearchPaper__Group__0 : rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1 ;
    public final void rule__ResearchPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2313:1: ( rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1 )
            // InternalConferenceProgram.g:2314:2: rule__ResearchPaper__Group__0__Impl rule__ResearchPaper__Group__1
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
    // InternalConferenceProgram.g:2321:1: rule__ResearchPaper__Group__0__Impl : ( 'Paper' ) ;
    public final void rule__ResearchPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2325:1: ( ( 'Paper' ) )
            // InternalConferenceProgram.g:2326:1: ( 'Paper' )
            {
            // InternalConferenceProgram.g:2326:1: ( 'Paper' )
            // InternalConferenceProgram.g:2327:2: 'Paper'
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
    // InternalConferenceProgram.g:2336:1: rule__ResearchPaper__Group__1 : rule__ResearchPaper__Group__1__Impl ;
    public final void rule__ResearchPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2340:1: ( rule__ResearchPaper__Group__1__Impl )
            // InternalConferenceProgram.g:2341:2: rule__ResearchPaper__Group__1__Impl
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
    // InternalConferenceProgram.g:2347:1: rule__ResearchPaper__Group__1__Impl : ( ( rule__ResearchPaper__NameAssignment_1 ) ) ;
    public final void rule__ResearchPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2351:1: ( ( ( rule__ResearchPaper__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2352:1: ( ( rule__ResearchPaper__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2352:1: ( ( rule__ResearchPaper__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2353:2: ( rule__ResearchPaper__NameAssignment_1 )
            {
             before(grammarAccess.getResearchPaperAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2354:2: ( rule__ResearchPaper__NameAssignment_1 )
            // InternalConferenceProgram.g:2354:3: rule__ResearchPaper__NameAssignment_1
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
    // InternalConferenceProgram.g:2363:1: rule__IndustryPaper__Group__0 : rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1 ;
    public final void rule__IndustryPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2367:1: ( rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1 )
            // InternalConferenceProgram.g:2368:2: rule__IndustryPaper__Group__0__Impl rule__IndustryPaper__Group__1
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
    // InternalConferenceProgram.g:2375:1: rule__IndustryPaper__Group__0__Impl : ( 'IndustryPaper' ) ;
    public final void rule__IndustryPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2379:1: ( ( 'IndustryPaper' ) )
            // InternalConferenceProgram.g:2380:1: ( 'IndustryPaper' )
            {
            // InternalConferenceProgram.g:2380:1: ( 'IndustryPaper' )
            // InternalConferenceProgram.g:2381:2: 'IndustryPaper'
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
    // InternalConferenceProgram.g:2390:1: rule__IndustryPaper__Group__1 : rule__IndustryPaper__Group__1__Impl ;
    public final void rule__IndustryPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2394:1: ( rule__IndustryPaper__Group__1__Impl )
            // InternalConferenceProgram.g:2395:2: rule__IndustryPaper__Group__1__Impl
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
    // InternalConferenceProgram.g:2401:1: rule__IndustryPaper__Group__1__Impl : ( ( rule__IndustryPaper__NameAssignment_1 ) ) ;
    public final void rule__IndustryPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2405:1: ( ( ( rule__IndustryPaper__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2406:1: ( ( rule__IndustryPaper__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2406:1: ( ( rule__IndustryPaper__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2407:2: ( rule__IndustryPaper__NameAssignment_1 )
            {
             before(grammarAccess.getIndustryPaperAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2408:2: ( rule__IndustryPaper__NameAssignment_1 )
            // InternalConferenceProgram.g:2408:3: rule__IndustryPaper__NameAssignment_1
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
    // InternalConferenceProgram.g:2417:1: rule__DemoAndPoster__Group__0 : rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1 ;
    public final void rule__DemoAndPoster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2421:1: ( rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1 )
            // InternalConferenceProgram.g:2422:2: rule__DemoAndPoster__Group__0__Impl rule__DemoAndPoster__Group__1
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
    // InternalConferenceProgram.g:2429:1: rule__DemoAndPoster__Group__0__Impl : ( 'DemoAndPoster' ) ;
    public final void rule__DemoAndPoster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2433:1: ( ( 'DemoAndPoster' ) )
            // InternalConferenceProgram.g:2434:1: ( 'DemoAndPoster' )
            {
            // InternalConferenceProgram.g:2434:1: ( 'DemoAndPoster' )
            // InternalConferenceProgram.g:2435:2: 'DemoAndPoster'
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
    // InternalConferenceProgram.g:2444:1: rule__DemoAndPoster__Group__1 : rule__DemoAndPoster__Group__1__Impl ;
    public final void rule__DemoAndPoster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2448:1: ( rule__DemoAndPoster__Group__1__Impl )
            // InternalConferenceProgram.g:2449:2: rule__DemoAndPoster__Group__1__Impl
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
    // InternalConferenceProgram.g:2455:1: rule__DemoAndPoster__Group__1__Impl : ( ( rule__DemoAndPoster__NameAssignment_1 ) ) ;
    public final void rule__DemoAndPoster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2459:1: ( ( ( rule__DemoAndPoster__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2460:1: ( ( rule__DemoAndPoster__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2460:1: ( ( rule__DemoAndPoster__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2461:2: ( rule__DemoAndPoster__NameAssignment_1 )
            {
             before(grammarAccess.getDemoAndPosterAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2462:2: ( rule__DemoAndPoster__NameAssignment_1 )
            // InternalConferenceProgram.g:2462:3: rule__DemoAndPoster__NameAssignment_1
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
    // InternalConferenceProgram.g:2471:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2475:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalConferenceProgram.g:2476:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
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
    // InternalConferenceProgram.g:2483:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2487:1: ( ( 'Panel' ) )
            // InternalConferenceProgram.g:2488:1: ( 'Panel' )
            {
            // InternalConferenceProgram.g:2488:1: ( 'Panel' )
            // InternalConferenceProgram.g:2489:2: 'Panel'
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
    // InternalConferenceProgram.g:2498:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2502:1: ( rule__Panel__Group__1__Impl )
            // InternalConferenceProgram.g:2503:2: rule__Panel__Group__1__Impl
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
    // InternalConferenceProgram.g:2509:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2513:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2514:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2514:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2515:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2516:2: ( rule__Panel__NameAssignment_1 )
            // InternalConferenceProgram.g:2516:3: rule__Panel__NameAssignment_1
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
    // InternalConferenceProgram.g:2525:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2529:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalConferenceProgram.g:2530:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalConferenceProgram.g:2537:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2541:1: ( ( 'Location' ) )
            // InternalConferenceProgram.g:2542:1: ( 'Location' )
            {
            // InternalConferenceProgram.g:2542:1: ( 'Location' )
            // InternalConferenceProgram.g:2543:2: 'Location'
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
    // InternalConferenceProgram.g:2552:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2556:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalConferenceProgram.g:2557:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalConferenceProgram.g:2564:1: rule__Location__Group__1__Impl : ( '{' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2568:1: ( ( '{' ) )
            // InternalConferenceProgram.g:2569:1: ( '{' )
            {
            // InternalConferenceProgram.g:2569:1: ( '{' )
            // InternalConferenceProgram.g:2570:2: '{'
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
    // InternalConferenceProgram.g:2579:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2583:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalConferenceProgram.g:2584:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalConferenceProgram.g:2591:1: rule__Location__Group__2__Impl : ( ( rule__Location__RoomAssignment_2 ) ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2595:1: ( ( ( rule__Location__RoomAssignment_2 ) ) )
            // InternalConferenceProgram.g:2596:1: ( ( rule__Location__RoomAssignment_2 ) )
            {
            // InternalConferenceProgram.g:2596:1: ( ( rule__Location__RoomAssignment_2 ) )
            // InternalConferenceProgram.g:2597:2: ( rule__Location__RoomAssignment_2 )
            {
             before(grammarAccess.getLocationAccess().getRoomAssignment_2()); 
            // InternalConferenceProgram.g:2598:2: ( rule__Location__RoomAssignment_2 )
            // InternalConferenceProgram.g:2598:3: rule__Location__RoomAssignment_2
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
    // InternalConferenceProgram.g:2606:1: rule__Location__Group__3 : rule__Location__Group__3__Impl ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2610:1: ( rule__Location__Group__3__Impl )
            // InternalConferenceProgram.g:2611:2: rule__Location__Group__3__Impl
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
    // InternalConferenceProgram.g:2617:1: rule__Location__Group__3__Impl : ( '}' ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2621:1: ( ( '}' ) )
            // InternalConferenceProgram.g:2622:1: ( '}' )
            {
            // InternalConferenceProgram.g:2622:1: ( '}' )
            // InternalConferenceProgram.g:2623:2: '}'
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
    // InternalConferenceProgram.g:2633:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2637:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalConferenceProgram.g:2638:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalConferenceProgram.g:2645:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2649:1: ( ( 'Room' ) )
            // InternalConferenceProgram.g:2650:1: ( 'Room' )
            {
            // InternalConferenceProgram.g:2650:1: ( 'Room' )
            // InternalConferenceProgram.g:2651:2: 'Room'
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
    // InternalConferenceProgram.g:2660:1: rule__Room__Group__1 : rule__Room__Group__1__Impl ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2664:1: ( rule__Room__Group__1__Impl )
            // InternalConferenceProgram.g:2665:2: rule__Room__Group__1__Impl
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
    // InternalConferenceProgram.g:2671:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2675:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2676:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2676:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2677:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2678:2: ( rule__Room__NameAssignment_1 )
            // InternalConferenceProgram.g:2678:3: rule__Room__NameAssignment_1
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
    // InternalConferenceProgram.g:2687:1: rule__Keynote__Group__0 : rule__Keynote__Group__0__Impl rule__Keynote__Group__1 ;
    public final void rule__Keynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2691:1: ( rule__Keynote__Group__0__Impl rule__Keynote__Group__1 )
            // InternalConferenceProgram.g:2692:2: rule__Keynote__Group__0__Impl rule__Keynote__Group__1
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
    // InternalConferenceProgram.g:2699:1: rule__Keynote__Group__0__Impl : ( 'Keynote' ) ;
    public final void rule__Keynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2703:1: ( ( 'Keynote' ) )
            // InternalConferenceProgram.g:2704:1: ( 'Keynote' )
            {
            // InternalConferenceProgram.g:2704:1: ( 'Keynote' )
            // InternalConferenceProgram.g:2705:2: 'Keynote'
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
    // InternalConferenceProgram.g:2714:1: rule__Keynote__Group__1 : rule__Keynote__Group__1__Impl ;
    public final void rule__Keynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2718:1: ( rule__Keynote__Group__1__Impl )
            // InternalConferenceProgram.g:2719:2: rule__Keynote__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__1__Impl();

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
    // InternalConferenceProgram.g:2725:1: rule__Keynote__Group__1__Impl : ( ( rule__Keynote__NameAssignment_1 ) ) ;
    public final void rule__Keynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2729:1: ( ( ( rule__Keynote__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2730:1: ( ( rule__Keynote__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2730:1: ( ( rule__Keynote__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2731:2: ( rule__Keynote__NameAssignment_1 )
            {
             before(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2732:2: ( rule__Keynote__NameAssignment_1 )
            // InternalConferenceProgram.g:2732:3: rule__Keynote__NameAssignment_1
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


    // $ANTLR start "rule__CoffeBreak__Group__0"
    // InternalConferenceProgram.g:2741:1: rule__CoffeBreak__Group__0 : rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1 ;
    public final void rule__CoffeBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2745:1: ( rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1 )
            // InternalConferenceProgram.g:2746:2: rule__CoffeBreak__Group__0__Impl rule__CoffeBreak__Group__1
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
    // InternalConferenceProgram.g:2753:1: rule__CoffeBreak__Group__0__Impl : ( 'Break' ) ;
    public final void rule__CoffeBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2757:1: ( ( 'Break' ) )
            // InternalConferenceProgram.g:2758:1: ( 'Break' )
            {
            // InternalConferenceProgram.g:2758:1: ( 'Break' )
            // InternalConferenceProgram.g:2759:2: 'Break'
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
    // InternalConferenceProgram.g:2768:1: rule__CoffeBreak__Group__1 : rule__CoffeBreak__Group__1__Impl ;
    public final void rule__CoffeBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2772:1: ( rule__CoffeBreak__Group__1__Impl )
            // InternalConferenceProgram.g:2773:2: rule__CoffeBreak__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoffeBreak__Group__1__Impl();

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
    // InternalConferenceProgram.g:2779:1: rule__CoffeBreak__Group__1__Impl : ( ( rule__CoffeBreak__NameAssignment_1 ) ) ;
    public final void rule__CoffeBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2783:1: ( ( ( rule__CoffeBreak__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2784:1: ( ( rule__CoffeBreak__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2784:1: ( ( rule__CoffeBreak__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2785:2: ( rule__CoffeBreak__NameAssignment_1 )
            {
             before(grammarAccess.getCoffeBreakAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2786:2: ( rule__CoffeBreak__NameAssignment_1 )
            // InternalConferenceProgram.g:2786:3: rule__CoffeBreak__NameAssignment_1
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


    // $ANTLR start "rule__Lunch__Group__0"
    // InternalConferenceProgram.g:2795:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2799:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalConferenceProgram.g:2800:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
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
    // InternalConferenceProgram.g:2807:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2811:1: ( ( 'Lunch' ) )
            // InternalConferenceProgram.g:2812:1: ( 'Lunch' )
            {
            // InternalConferenceProgram.g:2812:1: ( 'Lunch' )
            // InternalConferenceProgram.g:2813:2: 'Lunch'
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
    // InternalConferenceProgram.g:2822:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2826:1: ( rule__Lunch__Group__1__Impl )
            // InternalConferenceProgram.g:2827:2: rule__Lunch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__1__Impl();

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
    // InternalConferenceProgram.g:2833:1: rule__Lunch__Group__1__Impl : ( ( rule__Lunch__NameAssignment_1 ) ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2837:1: ( ( ( rule__Lunch__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2838:1: ( ( rule__Lunch__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2838:1: ( ( rule__Lunch__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2839:2: ( rule__Lunch__NameAssignment_1 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2840:2: ( rule__Lunch__NameAssignment_1 )
            // InternalConferenceProgram.g:2840:3: rule__Lunch__NameAssignment_1
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


    // $ANTLR start "rule__SocialEvent__Group__0"
    // InternalConferenceProgram.g:2849:1: rule__SocialEvent__Group__0 : rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1 ;
    public final void rule__SocialEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2853:1: ( rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1 )
            // InternalConferenceProgram.g:2854:2: rule__SocialEvent__Group__0__Impl rule__SocialEvent__Group__1
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
    // InternalConferenceProgram.g:2861:1: rule__SocialEvent__Group__0__Impl : ( 'SocialEvent' ) ;
    public final void rule__SocialEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2865:1: ( ( 'SocialEvent' ) )
            // InternalConferenceProgram.g:2866:1: ( 'SocialEvent' )
            {
            // InternalConferenceProgram.g:2866:1: ( 'SocialEvent' )
            // InternalConferenceProgram.g:2867:2: 'SocialEvent'
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
    // InternalConferenceProgram.g:2876:1: rule__SocialEvent__Group__1 : rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2 ;
    public final void rule__SocialEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2880:1: ( rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2 )
            // InternalConferenceProgram.g:2881:2: rule__SocialEvent__Group__1__Impl rule__SocialEvent__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalConferenceProgram.g:2888:1: rule__SocialEvent__Group__1__Impl : ( ( rule__SocialEvent__NameAssignment_1 ) ) ;
    public final void rule__SocialEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2892:1: ( ( ( rule__SocialEvent__NameAssignment_1 ) ) )
            // InternalConferenceProgram.g:2893:1: ( ( rule__SocialEvent__NameAssignment_1 ) )
            {
            // InternalConferenceProgram.g:2893:1: ( ( rule__SocialEvent__NameAssignment_1 ) )
            // InternalConferenceProgram.g:2894:2: ( rule__SocialEvent__NameAssignment_1 )
            {
             before(grammarAccess.getSocialEventAccess().getNameAssignment_1()); 
            // InternalConferenceProgram.g:2895:2: ( rule__SocialEvent__NameAssignment_1 )
            // InternalConferenceProgram.g:2895:3: rule__SocialEvent__NameAssignment_1
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
    // InternalConferenceProgram.g:2903:1: rule__SocialEvent__Group__2 : rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3 ;
    public final void rule__SocialEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2907:1: ( rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3 )
            // InternalConferenceProgram.g:2908:2: rule__SocialEvent__Group__2__Impl rule__SocialEvent__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalConferenceProgram.g:2915:1: rule__SocialEvent__Group__2__Impl : ( '{' ) ;
    public final void rule__SocialEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2919:1: ( ( '{' ) )
            // InternalConferenceProgram.g:2920:1: ( '{' )
            {
            // InternalConferenceProgram.g:2920:1: ( '{' )
            // InternalConferenceProgram.g:2921:2: '{'
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
    // InternalConferenceProgram.g:2930:1: rule__SocialEvent__Group__3 : rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4 ;
    public final void rule__SocialEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2934:1: ( rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4 )
            // InternalConferenceProgram.g:2935:2: rule__SocialEvent__Group__3__Impl rule__SocialEvent__Group__4
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
    // InternalConferenceProgram.g:2942:1: rule__SocialEvent__Group__3__Impl : ( ( rule__SocialEvent__LocationAssignment_3 ) ) ;
    public final void rule__SocialEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2946:1: ( ( ( rule__SocialEvent__LocationAssignment_3 ) ) )
            // InternalConferenceProgram.g:2947:1: ( ( rule__SocialEvent__LocationAssignment_3 ) )
            {
            // InternalConferenceProgram.g:2947:1: ( ( rule__SocialEvent__LocationAssignment_3 ) )
            // InternalConferenceProgram.g:2948:2: ( rule__SocialEvent__LocationAssignment_3 )
            {
             before(grammarAccess.getSocialEventAccess().getLocationAssignment_3()); 
            // InternalConferenceProgram.g:2949:2: ( rule__SocialEvent__LocationAssignment_3 )
            // InternalConferenceProgram.g:2949:3: rule__SocialEvent__LocationAssignment_3
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
    // InternalConferenceProgram.g:2957:1: rule__SocialEvent__Group__4 : rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5 ;
    public final void rule__SocialEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2961:1: ( rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5 )
            // InternalConferenceProgram.g:2962:2: rule__SocialEvent__Group__4__Impl rule__SocialEvent__Group__5
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
    // InternalConferenceProgram.g:2969:1: rule__SocialEvent__Group__4__Impl : ( ( rule__SocialEvent__StartTimeAssignment_4 ) ) ;
    public final void rule__SocialEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2973:1: ( ( ( rule__SocialEvent__StartTimeAssignment_4 ) ) )
            // InternalConferenceProgram.g:2974:1: ( ( rule__SocialEvent__StartTimeAssignment_4 ) )
            {
            // InternalConferenceProgram.g:2974:1: ( ( rule__SocialEvent__StartTimeAssignment_4 ) )
            // InternalConferenceProgram.g:2975:2: ( rule__SocialEvent__StartTimeAssignment_4 )
            {
             before(grammarAccess.getSocialEventAccess().getStartTimeAssignment_4()); 
            // InternalConferenceProgram.g:2976:2: ( rule__SocialEvent__StartTimeAssignment_4 )
            // InternalConferenceProgram.g:2976:3: rule__SocialEvent__StartTimeAssignment_4
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
    // InternalConferenceProgram.g:2984:1: rule__SocialEvent__Group__5 : rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6 ;
    public final void rule__SocialEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:2988:1: ( rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6 )
            // InternalConferenceProgram.g:2989:2: rule__SocialEvent__Group__5__Impl rule__SocialEvent__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalConferenceProgram.g:2996:1: rule__SocialEvent__Group__5__Impl : ( ( rule__SocialEvent__EndTimeAssignment_5 ) ) ;
    public final void rule__SocialEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3000:1: ( ( ( rule__SocialEvent__EndTimeAssignment_5 ) ) )
            // InternalConferenceProgram.g:3001:1: ( ( rule__SocialEvent__EndTimeAssignment_5 ) )
            {
            // InternalConferenceProgram.g:3001:1: ( ( rule__SocialEvent__EndTimeAssignment_5 ) )
            // InternalConferenceProgram.g:3002:2: ( rule__SocialEvent__EndTimeAssignment_5 )
            {
             before(grammarAccess.getSocialEventAccess().getEndTimeAssignment_5()); 
            // InternalConferenceProgram.g:3003:2: ( rule__SocialEvent__EndTimeAssignment_5 )
            // InternalConferenceProgram.g:3003:3: rule__SocialEvent__EndTimeAssignment_5
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
    // InternalConferenceProgram.g:3011:1: rule__SocialEvent__Group__6 : rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7 ;
    public final void rule__SocialEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3015:1: ( rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7 )
            // InternalConferenceProgram.g:3016:2: rule__SocialEvent__Group__6__Impl rule__SocialEvent__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalConferenceProgram.g:3023:1: rule__SocialEvent__Group__6__Impl : ( ( rule__SocialEvent__DirectionsAssignment_6 ) ) ;
    public final void rule__SocialEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3027:1: ( ( ( rule__SocialEvent__DirectionsAssignment_6 ) ) )
            // InternalConferenceProgram.g:3028:1: ( ( rule__SocialEvent__DirectionsAssignment_6 ) )
            {
            // InternalConferenceProgram.g:3028:1: ( ( rule__SocialEvent__DirectionsAssignment_6 ) )
            // InternalConferenceProgram.g:3029:2: ( rule__SocialEvent__DirectionsAssignment_6 )
            {
             before(grammarAccess.getSocialEventAccess().getDirectionsAssignment_6()); 
            // InternalConferenceProgram.g:3030:2: ( rule__SocialEvent__DirectionsAssignment_6 )
            // InternalConferenceProgram.g:3030:3: rule__SocialEvent__DirectionsAssignment_6
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
    // InternalConferenceProgram.g:3038:1: rule__SocialEvent__Group__7 : rule__SocialEvent__Group__7__Impl ;
    public final void rule__SocialEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3042:1: ( rule__SocialEvent__Group__7__Impl )
            // InternalConferenceProgram.g:3043:2: rule__SocialEvent__Group__7__Impl
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
    // InternalConferenceProgram.g:3049:1: rule__SocialEvent__Group__7__Impl : ( '}' ) ;
    public final void rule__SocialEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3053:1: ( ( '}' ) )
            // InternalConferenceProgram.g:3054:1: ( '}' )
            {
            // InternalConferenceProgram.g:3054:1: ( '}' )
            // InternalConferenceProgram.g:3055:2: '}'
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
    // InternalConferenceProgram.g:3065:1: rule__GoogleMapsDirections__Group__0 : rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1 ;
    public final void rule__GoogleMapsDirections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3069:1: ( rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1 )
            // InternalConferenceProgram.g:3070:2: rule__GoogleMapsDirections__Group__0__Impl rule__GoogleMapsDirections__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalConferenceProgram.g:3077:1: rule__GoogleMapsDirections__Group__0__Impl : ( 'Directions' ) ;
    public final void rule__GoogleMapsDirections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3081:1: ( ( 'Directions' ) )
            // InternalConferenceProgram.g:3082:1: ( 'Directions' )
            {
            // InternalConferenceProgram.g:3082:1: ( 'Directions' )
            // InternalConferenceProgram.g:3083:2: 'Directions'
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
    // InternalConferenceProgram.g:3092:1: rule__GoogleMapsDirections__Group__1 : rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2 ;
    public final void rule__GoogleMapsDirections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3096:1: ( rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2 )
            // InternalConferenceProgram.g:3097:2: rule__GoogleMapsDirections__Group__1__Impl rule__GoogleMapsDirections__Group__2
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
    // InternalConferenceProgram.g:3104:1: rule__GoogleMapsDirections__Group__1__Impl : ( '{' ) ;
    public final void rule__GoogleMapsDirections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3108:1: ( ( '{' ) )
            // InternalConferenceProgram.g:3109:1: ( '{' )
            {
            // InternalConferenceProgram.g:3109:1: ( '{' )
            // InternalConferenceProgram.g:3110:2: '{'
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
    // InternalConferenceProgram.g:3119:1: rule__GoogleMapsDirections__Group__2 : rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3 ;
    public final void rule__GoogleMapsDirections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3123:1: ( rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3 )
            // InternalConferenceProgram.g:3124:2: rule__GoogleMapsDirections__Group__2__Impl rule__GoogleMapsDirections__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalConferenceProgram.g:3131:1: rule__GoogleMapsDirections__Group__2__Impl : ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) ) ;
    public final void rule__GoogleMapsDirections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3135:1: ( ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) ) )
            // InternalConferenceProgram.g:3136:1: ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) )
            {
            // InternalConferenceProgram.g:3136:1: ( ( rule__GoogleMapsDirections__UrlAssignment_2 ) )
            // InternalConferenceProgram.g:3137:2: ( rule__GoogleMapsDirections__UrlAssignment_2 )
            {
             before(grammarAccess.getGoogleMapsDirectionsAccess().getUrlAssignment_2()); 
            // InternalConferenceProgram.g:3138:2: ( rule__GoogleMapsDirections__UrlAssignment_2 )
            // InternalConferenceProgram.g:3138:3: rule__GoogleMapsDirections__UrlAssignment_2
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
    // InternalConferenceProgram.g:3146:1: rule__GoogleMapsDirections__Group__3 : rule__GoogleMapsDirections__Group__3__Impl ;
    public final void rule__GoogleMapsDirections__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3150:1: ( rule__GoogleMapsDirections__Group__3__Impl )
            // InternalConferenceProgram.g:3151:2: rule__GoogleMapsDirections__Group__3__Impl
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
    // InternalConferenceProgram.g:3157:1: rule__GoogleMapsDirections__Group__3__Impl : ( '}' ) ;
    public final void rule__GoogleMapsDirections__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3161:1: ( ( '}' ) )
            // InternalConferenceProgram.g:3162:1: ( '}' )
            {
            // InternalConferenceProgram.g:3162:1: ( '}' )
            // InternalConferenceProgram.g:3163:2: '}'
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
    // InternalConferenceProgram.g:3173:1: rule__ConferenceProgram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConferenceProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3177:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3178:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3178:2: ( RULE_ID )
            // InternalConferenceProgram.g:3179:3: RULE_ID
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
    // InternalConferenceProgram.g:3188:1: rule__ConferenceProgram__DateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConferenceProgram__DateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3192:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3193:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3193:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3194:3: RULE_STRING
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


    // $ANTLR start "rule__ConferenceProgram__ResearchtracksAssignment_3"
    // InternalConferenceProgram.g:3203:1: rule__ConferenceProgram__ResearchtracksAssignment_3 : ( ruleResearchTrack ) ;
    public final void rule__ConferenceProgram__ResearchtracksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3207:1: ( ( ruleResearchTrack ) )
            // InternalConferenceProgram.g:3208:2: ( ruleResearchTrack )
            {
            // InternalConferenceProgram.g:3208:2: ( ruleResearchTrack )
            // InternalConferenceProgram.g:3209:3: ruleResearchTrack
            {
             before(grammarAccess.getConferenceProgramAccess().getResearchtracksResearchTrackParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResearchTrack();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getResearchtracksResearchTrackParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__ResearchtracksAssignment_3"


    // $ANTLR start "rule__ConferenceProgram__IndustrytracksAssignment_4"
    // InternalConferenceProgram.g:3218:1: rule__ConferenceProgram__IndustrytracksAssignment_4 : ( ruleIndustryTrack ) ;
    public final void rule__ConferenceProgram__IndustrytracksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3222:1: ( ( ruleIndustryTrack ) )
            // InternalConferenceProgram.g:3223:2: ( ruleIndustryTrack )
            {
            // InternalConferenceProgram.g:3223:2: ( ruleIndustryTrack )
            // InternalConferenceProgram.g:3224:3: ruleIndustryTrack
            {
             before(grammarAccess.getConferenceProgramAccess().getIndustrytracksIndustryTrackParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIndustryTrack();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getIndustrytracksIndustryTrackParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__IndustrytracksAssignment_4"


    // $ANTLR start "rule__ConferenceProgram__DemosandposterstrackAssignment_5"
    // InternalConferenceProgram.g:3233:1: rule__ConferenceProgram__DemosandposterstrackAssignment_5 : ( ruleDemosAndPosterTrack ) ;
    public final void rule__ConferenceProgram__DemosandposterstrackAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3237:1: ( ( ruleDemosAndPosterTrack ) )
            // InternalConferenceProgram.g:3238:2: ( ruleDemosAndPosterTrack )
            {
            // InternalConferenceProgram.g:3238:2: ( ruleDemosAndPosterTrack )
            // InternalConferenceProgram.g:3239:3: ruleDemosAndPosterTrack
            {
             before(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackDemosAndPosterTrackParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDemosAndPosterTrack();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getDemosandposterstrackDemosAndPosterTrackParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__DemosandposterstrackAssignment_5"


    // $ANTLR start "rule__ConferenceProgram__PanelstrackAssignment_6"
    // InternalConferenceProgram.g:3248:1: rule__ConferenceProgram__PanelstrackAssignment_6 : ( rulePanelTrack ) ;
    public final void rule__ConferenceProgram__PanelstrackAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3252:1: ( ( rulePanelTrack ) )
            // InternalConferenceProgram.g:3253:2: ( rulePanelTrack )
            {
            // InternalConferenceProgram.g:3253:2: ( rulePanelTrack )
            // InternalConferenceProgram.g:3254:3: rulePanelTrack
            {
             before(grammarAccess.getConferenceProgramAccess().getPanelstrackPanelTrackParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePanelTrack();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getPanelstrackPanelTrackParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__PanelstrackAssignment_6"


    // $ANTLR start "rule__ConferenceProgram__SocialEventsAssignment_7"
    // InternalConferenceProgram.g:3263:1: rule__ConferenceProgram__SocialEventsAssignment_7 : ( ruleSocialEvent ) ;
    public final void rule__ConferenceProgram__SocialEventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3267:1: ( ( ruleSocialEvent ) )
            // InternalConferenceProgram.g:3268:2: ( ruleSocialEvent )
            {
            // InternalConferenceProgram.g:3268:2: ( ruleSocialEvent )
            // InternalConferenceProgram.g:3269:3: ruleSocialEvent
            {
             before(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSocialEvent();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getSocialEventsSocialEventParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__SocialEventsAssignment_7"


    // $ANTLR start "rule__ConferenceProgram__KeynotesAssignment_8"
    // InternalConferenceProgram.g:3278:1: rule__ConferenceProgram__KeynotesAssignment_8 : ( ruleKeynote ) ;
    public final void rule__ConferenceProgram__KeynotesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3282:1: ( ( ruleKeynote ) )
            // InternalConferenceProgram.g:3283:2: ( ruleKeynote )
            {
            // InternalConferenceProgram.g:3283:2: ( ruleKeynote )
            // InternalConferenceProgram.g:3284:3: ruleKeynote
            {
             before(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleKeynote();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getKeynotesKeynoteParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__KeynotesAssignment_8"


    // $ANTLR start "rule__ConferenceProgram__CoffebreaksAssignment_9"
    // InternalConferenceProgram.g:3293:1: rule__ConferenceProgram__CoffebreaksAssignment_9 : ( ruleCoffeBreak ) ;
    public final void rule__ConferenceProgram__CoffebreaksAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3297:1: ( ( ruleCoffeBreak ) )
            // InternalConferenceProgram.g:3298:2: ( ruleCoffeBreak )
            {
            // InternalConferenceProgram.g:3298:2: ( ruleCoffeBreak )
            // InternalConferenceProgram.g:3299:3: ruleCoffeBreak
            {
             before(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCoffeBreak();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getCoffebreaksCoffeBreakParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__CoffebreaksAssignment_9"


    // $ANTLR start "rule__ConferenceProgram__LunchesAssignment_10"
    // InternalConferenceProgram.g:3308:1: rule__ConferenceProgram__LunchesAssignment_10 : ( ruleLunch ) ;
    public final void rule__ConferenceProgram__LunchesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3312:1: ( ( ruleLunch ) )
            // InternalConferenceProgram.g:3313:2: ( ruleLunch )
            {
            // InternalConferenceProgram.g:3313:2: ( ruleLunch )
            // InternalConferenceProgram.g:3314:3: ruleLunch
            {
             before(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLunch();

            state._fsp--;

             after(grammarAccess.getConferenceProgramAccess().getLunchesLunchParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ConferenceProgram__LunchesAssignment_10"


    // $ANTLR start "rule__ResearchTrack__NameAssignment_1"
    // InternalConferenceProgram.g:3323:1: rule__ResearchTrack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResearchTrack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3327:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3328:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3328:2: ( RULE_ID )
            // InternalConferenceProgram.g:3329:3: RULE_ID
            {
             before(grammarAccess.getResearchTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResearchTrackAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResearchTrack__NameAssignment_1"


    // $ANTLR start "rule__ResearchTrack__ResearchsessionAssignment_3"
    // InternalConferenceProgram.g:3338:1: rule__ResearchTrack__ResearchsessionAssignment_3 : ( ruleResearchSession ) ;
    public final void rule__ResearchTrack__ResearchsessionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3342:1: ( ( ruleResearchSession ) )
            // InternalConferenceProgram.g:3343:2: ( ruleResearchSession )
            {
            // InternalConferenceProgram.g:3343:2: ( ruleResearchSession )
            // InternalConferenceProgram.g:3344:3: ruleResearchSession
            {
             before(grammarAccess.getResearchTrackAccess().getResearchsessionResearchSessionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResearchSession();

            state._fsp--;

             after(grammarAccess.getResearchTrackAccess().getResearchsessionResearchSessionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ResearchTrack__ResearchsessionAssignment_3"


    // $ANTLR start "rule__IndustryTrack__NameAssignment_1"
    // InternalConferenceProgram.g:3353:1: rule__IndustryTrack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IndustryTrack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3357:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3358:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3358:2: ( RULE_ID )
            // InternalConferenceProgram.g:3359:3: RULE_ID
            {
             before(grammarAccess.getIndustryTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndustryTrackAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IndustryTrack__NameAssignment_1"


    // $ANTLR start "rule__IndustryTrack__IndutrysessionAssignment_3"
    // InternalConferenceProgram.g:3368:1: rule__IndustryTrack__IndutrysessionAssignment_3 : ( ruleIndustrySession ) ;
    public final void rule__IndustryTrack__IndutrysessionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3372:1: ( ( ruleIndustrySession ) )
            // InternalConferenceProgram.g:3373:2: ( ruleIndustrySession )
            {
            // InternalConferenceProgram.g:3373:2: ( ruleIndustrySession )
            // InternalConferenceProgram.g:3374:3: ruleIndustrySession
            {
             before(grammarAccess.getIndustryTrackAccess().getIndutrysessionIndustrySessionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIndustrySession();

            state._fsp--;

             after(grammarAccess.getIndustryTrackAccess().getIndutrysessionIndustrySessionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IndustryTrack__IndutrysessionAssignment_3"


    // $ANTLR start "rule__DemosAndPosterTrack__NameAssignment_1"
    // InternalConferenceProgram.g:3383:1: rule__DemosAndPosterTrack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DemosAndPosterTrack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3387:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3388:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3388:2: ( RULE_ID )
            // InternalConferenceProgram.g:3389:3: RULE_ID
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDemosAndPosterTrackAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__NameAssignment_1"


    // $ANTLR start "rule__DemosAndPosterTrack__DemosessionAssignment_3"
    // InternalConferenceProgram.g:3398:1: rule__DemosAndPosterTrack__DemosessionAssignment_3 : ( ruleDemoSession ) ;
    public final void rule__DemosAndPosterTrack__DemosessionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3402:1: ( ( ruleDemoSession ) )
            // InternalConferenceProgram.g:3403:2: ( ruleDemoSession )
            {
            // InternalConferenceProgram.g:3403:2: ( ruleDemoSession )
            // InternalConferenceProgram.g:3404:3: ruleDemoSession
            {
             before(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionDemoSessionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDemoSession();

            state._fsp--;

             after(grammarAccess.getDemosAndPosterTrackAccess().getDemosessionDemoSessionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DemosAndPosterTrack__DemosessionAssignment_3"


    // $ANTLR start "rule__PanelTrack__NameAssignment_1"
    // InternalConferenceProgram.g:3413:1: rule__PanelTrack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PanelTrack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3417:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3418:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3418:2: ( RULE_ID )
            // InternalConferenceProgram.g:3419:3: RULE_ID
            {
             before(grammarAccess.getPanelTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPanelTrackAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PanelTrack__NameAssignment_1"


    // $ANTLR start "rule__PanelTrack__PanelsessionAssignment_3"
    // InternalConferenceProgram.g:3428:1: rule__PanelTrack__PanelsessionAssignment_3 : ( rulePanelSession ) ;
    public final void rule__PanelTrack__PanelsessionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3432:1: ( ( rulePanelSession ) )
            // InternalConferenceProgram.g:3433:2: ( rulePanelSession )
            {
            // InternalConferenceProgram.g:3433:2: ( rulePanelSession )
            // InternalConferenceProgram.g:3434:3: rulePanelSession
            {
             before(grammarAccess.getPanelTrackAccess().getPanelsessionPanelSessionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePanelSession();

            state._fsp--;

             after(grammarAccess.getPanelTrackAccess().getPanelsessionPanelSessionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PanelTrack__PanelsessionAssignment_3"


    // $ANTLR start "rule__ResearchSession__NameAssignment_1"
    // InternalConferenceProgram.g:3443:1: rule__ResearchSession__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResearchSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3447:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3448:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3448:2: ( RULE_ID )
            // InternalConferenceProgram.g:3449:3: RULE_ID
            {
             before(grammarAccess.getResearchSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResearchSession__NameAssignment_1"


    // $ANTLR start "rule__ResearchSession__ResearchpaperAssignment_3"
    // InternalConferenceProgram.g:3458:1: rule__ResearchSession__ResearchpaperAssignment_3 : ( ruleResearchPaper ) ;
    public final void rule__ResearchSession__ResearchpaperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3462:1: ( ( ruleResearchPaper ) )
            // InternalConferenceProgram.g:3463:2: ( ruleResearchPaper )
            {
            // InternalConferenceProgram.g:3463:2: ( ruleResearchPaper )
            // InternalConferenceProgram.g:3464:3: ruleResearchPaper
            {
             before(grammarAccess.getResearchSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResearchPaper();

            state._fsp--;

             after(grammarAccess.getResearchSessionAccess().getResearchpaperResearchPaperParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ResearchSession__ResearchpaperAssignment_3"


    // $ANTLR start "rule__ResearchSession__LocationAssignment_4"
    // InternalConferenceProgram.g:3473:1: rule__ResearchSession__LocationAssignment_4 : ( ruleLocation ) ;
    public final void rule__ResearchSession__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3477:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:3478:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:3478:2: ( ruleLocation )
            // InternalConferenceProgram.g:3479:3: ruleLocation
            {
             before(grammarAccess.getResearchSessionAccess().getLocationLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getResearchSessionAccess().getLocationLocationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ResearchSession__LocationAssignment_4"


    // $ANTLR start "rule__ResearchSession__StartTimeAssignment_5"
    // InternalConferenceProgram.g:3488:1: rule__ResearchSession__StartTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ResearchSession__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3492:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3493:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3493:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3494:3: RULE_STRING
            {
             before(grammarAccess.getResearchSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ResearchSession__StartTimeAssignment_5"


    // $ANTLR start "rule__ResearchSession__EndTimeAssignment_6"
    // InternalConferenceProgram.g:3503:1: rule__ResearchSession__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ResearchSession__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3507:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3508:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3508:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3509:3: RULE_STRING
            {
             before(grammarAccess.getResearchSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResearchSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__ResearchSession__EndTimeAssignment_6"


    // $ANTLR start "rule__IndustrySession__NameAssignment_1"
    // InternalConferenceProgram.g:3518:1: rule__IndustrySession__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IndustrySession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3522:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3523:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3523:2: ( RULE_ID )
            // InternalConferenceProgram.g:3524:3: RULE_ID
            {
             before(grammarAccess.getIndustrySessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IndustrySession__NameAssignment_1"


    // $ANTLR start "rule__IndustrySession__IndustrypaperAssignment_3"
    // InternalConferenceProgram.g:3533:1: rule__IndustrySession__IndustrypaperAssignment_3 : ( ruleIndustryPaper ) ;
    public final void rule__IndustrySession__IndustrypaperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3537:1: ( ( ruleIndustryPaper ) )
            // InternalConferenceProgram.g:3538:2: ( ruleIndustryPaper )
            {
            // InternalConferenceProgram.g:3538:2: ( ruleIndustryPaper )
            // InternalConferenceProgram.g:3539:3: ruleIndustryPaper
            {
             before(grammarAccess.getIndustrySessionAccess().getIndustrypaperIndustryPaperParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIndustryPaper();

            state._fsp--;

             after(grammarAccess.getIndustrySessionAccess().getIndustrypaperIndustryPaperParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IndustrySession__IndustrypaperAssignment_3"


    // $ANTLR start "rule__IndustrySession__LocationAssignment_4"
    // InternalConferenceProgram.g:3548:1: rule__IndustrySession__LocationAssignment_4 : ( ruleLocation ) ;
    public final void rule__IndustrySession__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3552:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:3553:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:3553:2: ( ruleLocation )
            // InternalConferenceProgram.g:3554:3: ruleLocation
            {
             before(grammarAccess.getIndustrySessionAccess().getLocationLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getIndustrySessionAccess().getLocationLocationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IndustrySession__LocationAssignment_4"


    // $ANTLR start "rule__IndustrySession__StartTimeAssignment_5"
    // InternalConferenceProgram.g:3563:1: rule__IndustrySession__StartTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__IndustrySession__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3567:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3568:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3568:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3569:3: RULE_STRING
            {
             before(grammarAccess.getIndustrySessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__IndustrySession__StartTimeAssignment_5"


    // $ANTLR start "rule__IndustrySession__EndTimeAssignment_6"
    // InternalConferenceProgram.g:3578:1: rule__IndustrySession__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__IndustrySession__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3582:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3583:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3583:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3584:3: RULE_STRING
            {
             before(grammarAccess.getIndustrySessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndustrySessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__IndustrySession__EndTimeAssignment_6"


    // $ANTLR start "rule__DemoSession__NameAssignment_1"
    // InternalConferenceProgram.g:3593:1: rule__DemoSession__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DemoSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3597:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3598:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3598:2: ( RULE_ID )
            // InternalConferenceProgram.g:3599:3: RULE_ID
            {
             before(grammarAccess.getDemoSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DemoSession__NameAssignment_1"


    // $ANTLR start "rule__DemoSession__DemoandposterAssignment_3"
    // InternalConferenceProgram.g:3608:1: rule__DemoSession__DemoandposterAssignment_3 : ( ruleDemoAndPoster ) ;
    public final void rule__DemoSession__DemoandposterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3612:1: ( ( ruleDemoAndPoster ) )
            // InternalConferenceProgram.g:3613:2: ( ruleDemoAndPoster )
            {
            // InternalConferenceProgram.g:3613:2: ( ruleDemoAndPoster )
            // InternalConferenceProgram.g:3614:3: ruleDemoAndPoster
            {
             before(grammarAccess.getDemoSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDemoAndPoster();

            state._fsp--;

             after(grammarAccess.getDemoSessionAccess().getDemoandposterDemoAndPosterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DemoSession__DemoandposterAssignment_3"


    // $ANTLR start "rule__DemoSession__LocationAssignment_4"
    // InternalConferenceProgram.g:3623:1: rule__DemoSession__LocationAssignment_4 : ( ruleLocation ) ;
    public final void rule__DemoSession__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3627:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:3628:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:3628:2: ( ruleLocation )
            // InternalConferenceProgram.g:3629:3: ruleLocation
            {
             before(grammarAccess.getDemoSessionAccess().getLocationLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getDemoSessionAccess().getLocationLocationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DemoSession__LocationAssignment_4"


    // $ANTLR start "rule__DemoSession__StartTimeAssignment_5"
    // InternalConferenceProgram.g:3638:1: rule__DemoSession__StartTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DemoSession__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3642:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3643:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3643:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3644:3: RULE_STRING
            {
             before(grammarAccess.getDemoSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__DemoSession__StartTimeAssignment_5"


    // $ANTLR start "rule__DemoSession__EndTimeAssignment_6"
    // InternalConferenceProgram.g:3653:1: rule__DemoSession__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__DemoSession__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3657:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3658:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3658:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3659:3: RULE_STRING
            {
             before(grammarAccess.getDemoSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDemoSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__DemoSession__EndTimeAssignment_6"


    // $ANTLR start "rule__PanelSession__NameAssignment_1"
    // InternalConferenceProgram.g:3668:1: rule__PanelSession__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PanelSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3672:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3673:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3673:2: ( RULE_ID )
            // InternalConferenceProgram.g:3674:3: RULE_ID
            {
             before(grammarAccess.getPanelSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PanelSession__NameAssignment_1"


    // $ANTLR start "rule__PanelSession__PanelAssignment_3"
    // InternalConferenceProgram.g:3683:1: rule__PanelSession__PanelAssignment_3 : ( rulePanel ) ;
    public final void rule__PanelSession__PanelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3687:1: ( ( rulePanel ) )
            // InternalConferenceProgram.g:3688:2: ( rulePanel )
            {
            // InternalConferenceProgram.g:3688:2: ( rulePanel )
            // InternalConferenceProgram.g:3689:3: rulePanel
            {
             before(grammarAccess.getPanelSessionAccess().getPanelPanelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getPanelSessionAccess().getPanelPanelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PanelSession__PanelAssignment_3"


    // $ANTLR start "rule__PanelSession__LocationAssignment_4"
    // InternalConferenceProgram.g:3698:1: rule__PanelSession__LocationAssignment_4 : ( ruleLocation ) ;
    public final void rule__PanelSession__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3702:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:3703:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:3703:2: ( ruleLocation )
            // InternalConferenceProgram.g:3704:3: ruleLocation
            {
             before(grammarAccess.getPanelSessionAccess().getLocationLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getPanelSessionAccess().getLocationLocationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PanelSession__LocationAssignment_4"


    // $ANTLR start "rule__PanelSession__StartTimeAssignment_5"
    // InternalConferenceProgram.g:3713:1: rule__PanelSession__StartTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__PanelSession__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3717:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3718:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3718:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3719:3: RULE_STRING
            {
             before(grammarAccess.getPanelSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getStartTimeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__PanelSession__StartTimeAssignment_5"


    // $ANTLR start "rule__PanelSession__EndTimeAssignment_6"
    // InternalConferenceProgram.g:3728:1: rule__PanelSession__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__PanelSession__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3732:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3733:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3733:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3734:3: RULE_STRING
            {
             before(grammarAccess.getPanelSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanelSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__PanelSession__EndTimeAssignment_6"


    // $ANTLR start "rule__ResearchPaper__NameAssignment_1"
    // InternalConferenceProgram.g:3743:1: rule__ResearchPaper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResearchPaper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3747:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3748:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3748:2: ( RULE_ID )
            // InternalConferenceProgram.g:3749:3: RULE_ID
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
    // InternalConferenceProgram.g:3758:1: rule__IndustryPaper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IndustryPaper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3762:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3763:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3763:2: ( RULE_ID )
            // InternalConferenceProgram.g:3764:3: RULE_ID
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
    // InternalConferenceProgram.g:3773:1: rule__DemoAndPoster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DemoAndPoster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3777:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3778:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3778:2: ( RULE_ID )
            // InternalConferenceProgram.g:3779:3: RULE_ID
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
    // InternalConferenceProgram.g:3788:1: rule__Panel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3792:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3793:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3793:2: ( RULE_ID )
            // InternalConferenceProgram.g:3794:3: RULE_ID
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
    // InternalConferenceProgram.g:3803:1: rule__Location__RoomAssignment_2 : ( ruleRoom ) ;
    public final void rule__Location__RoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3807:1: ( ( ruleRoom ) )
            // InternalConferenceProgram.g:3808:2: ( ruleRoom )
            {
            // InternalConferenceProgram.g:3808:2: ( ruleRoom )
            // InternalConferenceProgram.g:3809:3: ruleRoom
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
    // InternalConferenceProgram.g:3818:1: rule__Room__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3822:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3823:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3823:2: ( RULE_ID )
            // InternalConferenceProgram.g:3824:3: RULE_ID
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
    // InternalConferenceProgram.g:3833:1: rule__Keynote__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Keynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3837:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3838:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3838:2: ( RULE_ID )
            // InternalConferenceProgram.g:3839:3: RULE_ID
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


    // $ANTLR start "rule__CoffeBreak__NameAssignment_1"
    // InternalConferenceProgram.g:3848:1: rule__CoffeBreak__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoffeBreak__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3852:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3853:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3853:2: ( RULE_ID )
            // InternalConferenceProgram.g:3854:3: RULE_ID
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


    // $ANTLR start "rule__Lunch__NameAssignment_1"
    // InternalConferenceProgram.g:3863:1: rule__Lunch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lunch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3867:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3868:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3868:2: ( RULE_ID )
            // InternalConferenceProgram.g:3869:3: RULE_ID
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


    // $ANTLR start "rule__SocialEvent__NameAssignment_1"
    // InternalConferenceProgram.g:3878:1: rule__SocialEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SocialEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3882:1: ( ( RULE_ID ) )
            // InternalConferenceProgram.g:3883:2: ( RULE_ID )
            {
            // InternalConferenceProgram.g:3883:2: ( RULE_ID )
            // InternalConferenceProgram.g:3884:3: RULE_ID
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
    // InternalConferenceProgram.g:3893:1: rule__SocialEvent__LocationAssignment_3 : ( ruleLocation ) ;
    public final void rule__SocialEvent__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3897:1: ( ( ruleLocation ) )
            // InternalConferenceProgram.g:3898:2: ( ruleLocation )
            {
            // InternalConferenceProgram.g:3898:2: ( ruleLocation )
            // InternalConferenceProgram.g:3899:3: ruleLocation
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
    // InternalConferenceProgram.g:3908:1: rule__SocialEvent__StartTimeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SocialEvent__StartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3912:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3913:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3913:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3914:3: RULE_STRING
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
    // InternalConferenceProgram.g:3923:1: rule__SocialEvent__EndTimeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SocialEvent__EndTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3927:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3928:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3928:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3929:3: RULE_STRING
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
    // InternalConferenceProgram.g:3938:1: rule__SocialEvent__DirectionsAssignment_6 : ( ruleGoogleMapsDirections ) ;
    public final void rule__SocialEvent__DirectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3942:1: ( ( ruleGoogleMapsDirections ) )
            // InternalConferenceProgram.g:3943:2: ( ruleGoogleMapsDirections )
            {
            // InternalConferenceProgram.g:3943:2: ( ruleGoogleMapsDirections )
            // InternalConferenceProgram.g:3944:3: ruleGoogleMapsDirections
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
    // InternalConferenceProgram.g:3953:1: rule__GoogleMapsDirections__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoogleMapsDirections__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConferenceProgram.g:3957:1: ( ( RULE_STRING ) )
            // InternalConferenceProgram.g:3958:2: ( RULE_STRING )
            {
            // InternalConferenceProgram.g:3958:2: ( RULE_STRING )
            // InternalConferenceProgram.g:3959:3: RULE_STRING
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C01000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});

}