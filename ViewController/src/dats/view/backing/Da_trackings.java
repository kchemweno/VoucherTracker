package dats.view.backing;

import dats.model.AppModuleImpl;
import dats.model.DaTrackingProcessDocumentsViewImpl;
import dats.model.DaTrackingProcessViewImpl;
import dats.model.DisbursementAuthorizationsViewImpl;
import dats.model.DistrictsViewImpl;
import dats.model.StepResponsiblePersonsViewImpl;
import dats.model.StepResponsiblePersonsViewRowImpl;
import dats.model.UsersViewImpl;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.event.QueryEvent;
import oracle.adf.view.rich.model.AttributeCriterion;
import oracle.adf.view.rich.model.ConjunctionCriterion;
import oracle.adf.view.rich.model.Criterion;
import oracle.adf.view.rich.model.FilterableQueryDescriptor;

import oracle.adf.view.rich.util.ResetUtils;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.client.Configuration;

import oracle.jbo.server.ViewObjectImpl;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class Da_trackings {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichPanelSplitter ps1;
    private RichPanelCollection pc1;
    private RichMessages m1;
    private RichTable t1;
    private RichToolbar t2;
    private RichButton b1;
    private RichMenu m2;
    private RichCommandMenuItem cmi1;
    private RichCommandMenuItem cmi2;
    private RichCommandMenuItem cmi3;
    private RichCommandMenuItem cmi4;
    private RichCommandMenuItem cmi5;
    private RichMenu m3;
    private RichMenu m4;
    private RichMenu m5;
    private RichMenu m6;
    private RichMenu m7;
    private RichCommandMenuItem cmi6;
    private RichCommandMenuItem cmi7;
    private RichCommandMenuItem cmi8;
    private RichCommandMenuItem cmi9;
    private RichCommandMenuItem cmi10;
    private RichCommandMenuItem cmi11;
    private RichCommandMenuItem cmi13;
    private RichCommandMenuItem cmi14;
    private RichCommandMenuItem cmi15;
    private RichPanelSplitter ps2;
    private RichPopup p1;
    private RichPanelWindow pw1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridRow gr3;
    private RichGridCell gc6;
    private RichPopup p2;
    private RichPanelWindow pw2;
    private RichPanelGroupLayout pgl4;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichPopup p3;
    private RichPanelWindow pw3;
    private RichInputText it8;
    private RichInputText it9;
    private static String oldStep2DANumber = "";
    private static String districtName = "";
    private static int districtId = 0;
    private RichInputDate id2;
    private static int stepId;
    private int daStepId;
    //  private String pw3Title = "";
    private String panelWindowTitle;
    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static int daTrackingProcessDocumentsId;
    private static int daId;
    private int daNumberId;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr4;
    private RichGridCell gc4;
    private String stepComments;
    private RichInputText it4;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichInputFile if2;
    private String requestDaFilename;
    private String requestDaFileLocation;
    private int requestDaStepId;
    private int requestDaDaId;
    private RichCommandMenuItem cmi12;
    private RichCommandMenuItem cmi16;
    private int stepDaId; 
    private String finalStepProcessComments;
    public static String commentsFinal;
    private RichInputListOfValues phaseIdId;
    private RichSpacer s5;
    private RichPanelFormLayout pfl4;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputText it13;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichSelectOneChoice soc13;
    private UISelectItems si13;
    private RichInputText it14;

    //Initiate DA request STEP #1
    public void showInitiateDARequestPopupDialog() {
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getP1().show(hints);
    }

    //Generate DA STEP #2
    public void showGenerateDAPopupDialog() {
        RichPopup.PopupHints daHints = new RichPopup.PopupHints();
        getP2().show(daHints);
    }

    public void showPopupsStep3To15() {
        RichPopup.PopupHints hints = new RichPopup.PopupHints();        
        getP3().show(hints);
    }
    
    public void cancelPopupsStep3To15() {
        try{
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getP3().cancel();
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }    
    
    public void hidePopupsStep3To15() {
        try{
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getP3().hide();
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }      
    // Request Payment STEP #3
   /* public void showStep3PopupDialog() {
        try{
        //int daid = soc1.getValue() != null? Integer.parseInt(soc1.getValue().toString()) : 0;
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Request Payment");
        Da_trackings.setStepId(3);
        showPopupsStep3To15();
       // int da = soc1.getValue() != null? Integer.parseInt(soc1.getValue().toString()) : 0;
       // Da_trackings.setDaId(daid);
        }catch(Exception except){
           System.err.println("Error launching step3 popup dialog");            
        }
    } */

    // Generate Payment STEP #2
    public void showStep2PopupDialog() {
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        try{
        setPanelWindowTitle("Generate Payment");
        //Da_trackings.setStepId(2);
        Da_trackings.setStepId(3);
      //  int daid = getDaId(); //Uncomment
       // Da_trackings.setDaId(getDaId());       
    //   Da_trackings.setDaId(daid); //Uncomment       
        showPopupsStep3To15();            
        }catch(Exception except){
           System.err.println("Error launching step2 popup dialog");   
            except.printStackTrace();
        }
    }

    // Send Routing Slip to Finance STEP #3
    public void showStep3PopupDialog() {
        try{    
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Send Routing Slip");
      //  Da_trackings.setStepId(3);
      Da_trackings.setStepId(5);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step3 popup dialog");            
        }            
    }
    
    // Returning Routing Slip to Finance STEP #3b : given step_id 17
    public void showStep3bPopupDialog() {
        try{    
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Returning Routing Slip to CBI");
        Da_trackings.setStepId(17);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step3b popup dialog");            
        }            
    }    
    
    // Approving Routing Slip STEP #3c : given step_id 18
    public void showStep3cPopupDialog() {
        try{    
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Approving Routing Slip");
        Da_trackings.setStepId(18);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step3c popup dialog");            
        }            
    }      

    // Send Vouchers To Implementing Partners STEP #4
    public void showStep4PopupDialog() {
        try{
        setPanelWindowTitle("Send Vouchers To Implementing Partners");
        //Da_trackings.setStepId(4);
        Da_trackings.setStepId(6);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step4 popup dialog");            
        }        
    }

    // Share Z Portal With Money Vendor STEP #5
    public void showStep5PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Share Z Portal With Money Vendor");
        //Da_trackings.setStepId(5);
        Da_trackings.setStepId(7);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step5 popup dialog");            
        }        
    }

    // Confirm Payments Readiness To CBI STEP #6
    public void showStep6PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Confirm Payments Readiness To CBI");
        //Da_trackings.setStepId(6);
        Da_trackings.setStepId(8);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step6 popup dialog");            
        }        
    }

    // Confirm Completion of Payments STEP #7
    public void showStep7PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Confirm Completion of Payments");
        //Da_trackings.setStepId(7);
        Da_trackings.setStepId(9);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step7 popup dialog");            
        }        
    }

    // Receive Vouchers STEP #8
    public void showStep8PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Receive Vouchers In Field Office");
        //Da_trackings.setStepId(8);
        Da_trackings.setStepId(10);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step8 popup dialog");            
        }        
    }

    // Transport Voucher To Nairobi STEP #9
    public void showStep9PopupDialog() {
        try{
       //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Transport Voucher To Nairobi");
       // Da_trackings.setStepId(9);
       Da_trackings.setStepId(11);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step9 popup dialog");            
        }        
    }

    // Verify Vouchers STEP #10
    public void showStep10PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Verify Vouchers");
        //Da_trackings.setStepId(10);
        Da_trackings.setStepId(12);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step10 popup dialog");            
        }        
    }
    
    // Verify Vouchers STEP #11
    public void showStep11PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Archive Vouchers");
        //Da_trackings.setStepId(11);
        Da_trackings.setStepId(13);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step11 popup dialog");            
        }        
    }

    // Send Verification Findings To Compliance STEP #12
    public void showStep12PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Send Verification Findings To Compliance");
        //Da_trackings.setStepId(12);
        Da_trackings.setStepId(14);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step12 popup dialog");            
        }        
    }

    // Inform Finance To Reimburse MV STEP #13
    public void showStep13PopupDialog() {
        try{
       //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Inform Finance To Reimburse MV");
        //Da_trackings.setStepId(13);
        Da_trackings.setStepId(15);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step13 popup dialog");            
        }        
    }

    // Reimburse Money Vendor STEP #14
    public void showStep14PopupDialog() {
        try{
        //Da_trackings.setDaId(Integer.parseInt(soc1.getValue().toString()));
        setPanelWindowTitle("Reimburse Money Vendor");
        //Da_trackings.setStepId(14);
        Da_trackings.setStepId(16);
        showPopupsStep3To15();
        }catch(Exception except){
           System.err.println("Error launching step14 popup dialog");            
        }        
    }

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }


    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }


    public void setM2(RichMenu m2) {
        this.m2 = m2;
    }

    public RichMenu getM2() {
        return m2;
    }

    public void setCmi1(RichCommandMenuItem cmi1) {
        this.cmi1 = cmi1;
    }

    public RichCommandMenuItem getCmi1() {
        return cmi1;
    }

    public void setCmi2(RichCommandMenuItem cmi2) {
        this.cmi2 = cmi2;
    }

    public RichCommandMenuItem getCmi2() {
        return cmi2;
    }

    public void setCmi3(RichCommandMenuItem cmi3) {
        this.cmi3 = cmi3;
    }

    public RichCommandMenuItem getCmi3() {
        return cmi3;
    }

    public void setCmi4(RichCommandMenuItem cmi4) {
        this.cmi4 = cmi4;
    }

    public RichCommandMenuItem getCmi4() {
        return cmi4;
    }

    public void setCmi5(RichCommandMenuItem cmi5) {
        this.cmi5 = cmi5;
    }

    public RichCommandMenuItem getCmi5() {
        return cmi5;
    }


    public void setM3(RichMenu m3) {
        this.m3 = m3;
    }

    public RichMenu getM3() {
        return m3;
    }

    public void setM4(RichMenu m4) {
        this.m4 = m4;
    }

    public RichMenu getM4() {
        return m4;
    }

    public void setM5(RichMenu m5) {
        this.m5 = m5;
    }

    public RichMenu getM5() {
        return m5;
    }

    public void setM6(RichMenu m6) {
        this.m6 = m6;
    }

    public RichMenu getM6() {
        return m6;
    }

    public void setM7(RichMenu m7) {
        this.m7 = m7;
    }

    public RichMenu getM7() {
        return m7;
    }

    public void setCmi6(RichCommandMenuItem cmi6) {
        this.cmi6 = cmi6;
    }

    public RichCommandMenuItem getCmi6() {
        return cmi6;
    }

    public void setCmi7(RichCommandMenuItem cmi7) {
        this.cmi7 = cmi7;
    }

    public RichCommandMenuItem getCmi7() {
        return cmi7;
    }

    public void setCmi8(RichCommandMenuItem cmi8) {
        this.cmi8 = cmi8;
    }

    public RichCommandMenuItem getCmi8() {
        return cmi8;
    }

    public void setCmi9(RichCommandMenuItem cmi9) {
        this.cmi9 = cmi9;
    }

    public RichCommandMenuItem getCmi9() {
        return cmi9;
    }

    public void setCmi10(RichCommandMenuItem cmi10) {
        this.cmi10 = cmi10;
    }

    public RichCommandMenuItem getCmi10() {
        return cmi10;
    }

    public void setCmi11(RichCommandMenuItem cmi11) {
        this.cmi11 = cmi11;
    }

    public RichCommandMenuItem getCmi11() {
        return cmi11;
    }


    public void setCmi13(RichCommandMenuItem cmi13) {
        this.cmi13 = cmi13;
    }

    public RichCommandMenuItem getCmi13() {
        return cmi13;
    }

    public void setCmi14(RichCommandMenuItem cmi14) {
        this.cmi14 = cmi14;
    }

    public RichCommandMenuItem getCmi14() {
        return cmi14;
    }

    public void setCmi15(RichCommandMenuItem cmi15) {
        this.cmi15 = cmi15;
    }

    public RichCommandMenuItem getCmi15() {
        return cmi15;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }


    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }


    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setPw2(RichPanelWindow pw2) {
        this.pw2 = pw2;
    }

    public RichPanelWindow getPw2() {
        return pw2;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }


    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }


    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setPw3(RichPanelWindow pw3) {
        this.pw3 = pw3;
    }

    public RichPanelWindow getPw3() {
        return pw3;
    }

    public String getStep1DaNumber() {
        String daNumber = "";
        daNumber = it8.getValue() == null ? "" : it8.getValue().toString();
        return daNumber;
    }

    public String getStep2DaNumber() {
        String daNumber = "";
        //daNumber = it5.getValue() == null ? "" : it5.getValue().toString();
        daNumber = it10.getValue() == null ? "" : it10.getValue().toString();
        return daNumber;
    }

    public String getStep2OldDaNumber() {
        DisbursementAuthorizationsViewImpl daProgress = new DisbursementAuthorizationsViewImpl();
        int daId = 0;
        String daNumber = "";
        daId = soc5.getValue() == null ? 0 : Integer.parseInt(soc5.getValue().toString());
        //  daProgress.getDAId("daNumber");
        //     daNumber = daProgress.getDaNumberForId(daId);
        //  daNumber = daProgress.getDaNumber(daId);
        //daProgress.getDaNumber(daId);
        daNumber = "16082017KC1";
        return daNumber;
    }

    public String getRequestDaComments() {
        String comments = "";
        try{
        comments = it9.getValue() == null ? "" : it9.getValue().toString();
        }catch(Exception exception){
            System.err.println("Error getting comments");
        }
        return comments;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public String getLoggedInUsername() {
        ADFContext adfCtx = ADFContext.getCurrent();
        SecurityContext secCntx = adfCtx.getSecurityContext();
        //String username = secCntx.getUserName();
        return secCntx.getUserName();
    }

    public int getLoggedInUserId() {
        int userId = 0;
        try{            
            UsersViewImpl usersViewImpl = new UsersViewImpl();
            userId = usersViewImpl.getUserId(getLoggedInUsername());
        }catch(Exception exception){
            System.err.println("Error getting loggedinuserid");
        }
        return userId;
    }
    
    public String getLoggedInUserFullname(int userId) {
        String loggedInUserFullname = "";
        try{            
            UsersViewImpl usersViewImpl = new UsersViewImpl();
            loggedInUserFullname = usersViewImpl.getUserFullname(userId+"");
        }catch(Exception exception){
          //  exception.printStackTrace();
            System.err.println("Error getting loggedinuserfullname");
        }
        return loggedInUserFullname;
    }

    public int getStep2DAId() {
        int daId = 0;
        try{
        // DisbursementAuthorizationsViewImpl daProcessImpl = new DisbursementAuthorizationsViewImpl();
        // daId=daProcessImpl.getDAId(getStep2DaNumber());
        daId = soc5.getValue() == null ? 0 : Integer.parseInt(soc5.getValue().toString());
        }catch(Exception exception){
            System.err.println("Error getting step2DAId");
        }
        return daId;
    }
    
    public String getGenerateDaDaNumber() {
        String daNumber = "";
        daNumber = it10.getValue() == null ? "" : it10.getValue().toString();
        return daNumber;
    }    

    public float getTotalValue() {
        float totalValue = 0;
        totalValue = it11.getValue() == null ? 0 : Float.parseFloat(it11.getValue().toString());
        return totalValue;
    }

    public int getNumberOfBeneficiaries() {
        int beneficiaries = 0;
        beneficiaries = it12.getValue() == null ? 0 : Integer.parseInt(it12.getValue().toString());
        return beneficiaries;
    }
   
    public String getGenerateDaLoaNumber() {
        String generateDaLoaNumber = "";
        try{        
        generateDaLoaNumber = it13.getValue() == null ? "" : it13.getValue().toString();        
        }catch(Exception exception){
            exception.printStackTrace();
        }
        return generateDaLoaNumber;
    }
    
    public int getGenerateDaPhaseId() {
        int generateDaPhaseId = 0;
        generateDaPhaseId = soc12.getValue() == null ? 0 : Integer.parseInt(soc12.getValue().toString());
        return generateDaPhaseId;
    }    
    
    public int getGenerateDaNumberOfBeneficiaries() {
        int beneficiaries = 0;
        beneficiaries = it12.getValue() == null ? 0 : Integer.parseInt(it12.getValue().toString());
        return beneficiaries;
    }

    public int getDistrictId() {
       /*DistrictsViewImpl districtImpl = new DistrictsViewImpl();
       int districtId=0;
       String district = soc6.getValue() == null ? "" : soc6.getValue().toString() ;
       //districtId = it2.getValue()==null ? 0 : Integer.parseInt(it2.getValue().toString());
       districtId = districtImpl.getDAId(district);
       System.err.println("District : "+districtId);
       districtId = districtImpl.getDAId(districtName);
       System.err.println("District Name: "+districtId); */
      // soc6.getAttributes();
      // System.err.println(Da_trackings.districtId);
      int districtId = soc11.getValue() == null ? 0 : Integer.parseInt(soc11.getValue().toString());
      //return Da_trackings.districtId;
       return districtId;
    }
       
    public int getGenerateDaNgoId() {
        int generateDaNgoId = soc6.getValue() == null ? 0 : Integer.parseInt(soc6.getValue().toString());
        return generateDaNgoId;
    }       

    public int getGenerateDAInterventionTypeId() {
        int generateDAInterventionTypeId = soc13.getValue() == null ? 0 : Integer.parseInt(soc13.getValue().toString());
        return generateDAInterventionTypeId;
    }  

    public String getGenerateDAComments() {
        String generateDAComments = it14.getValue() == null ? "" : it14.getValue().toString();
        return generateDAComments;
    }


    public void getStep2OldDaNumberListener(ValueChangeEvent valueChangeEvent) {
        // Da_trackings.oldStep2DANumber = valueChangeEvent.getNewValue() == null ? "" : valueChangeEvent.getNewValue().toString();
        // System.err.println(Da_trackings.oldStep2DANumber);
    }

    public void districtNameValueChangeListener(ValueChangeEvent valueChangeEvent) {
        Da_trackings.districtId = valueChangeEvent.getNewValue() == null ? 0 : Integer.parseInt(valueChangeEvent.getNewValue().toString());
        System.err.println(Da_trackings.districtName);
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    /**
     * method to reset filter attributes on an af:table
     * @param actionEvent event which triggers the method
     */
    public void resetTableFilter(ActionEvent actionEvent) {
        FilterableQueryDescriptor queryDescriptor = (FilterableQueryDescriptor) getT1().getFilterModel();
        if (queryDescriptor != null && queryDescriptor.getFilterConjunctionCriterion() != null) {
            ConjunctionCriterion cc = queryDescriptor.getFilterConjunctionCriterion();
            List<Criterion> lc = cc.getCriterionList();
            for (Criterion c : lc) {
                if (c instanceof AttributeCriterion) {
                    AttributeCriterion ac = (AttributeCriterion) c;
                    ac.setValue(null);
                }
            }
            getT1().queueEvent(new QueryEvent(getT1(), queryDescriptor));
        }
    }

    public void setPanelWindowTitle(String panelWindowTitle) {
        this.panelWindowTitle = panelWindowTitle;
    }

    public String getPanelWindowTitle() {
        return panelWindowTitle;
    }

    public void uploadDAFiles(ValueChangeEvent valueChangeEvent) {
        try {
            //DocumentsViewImpl documentsViewImpl = new DocumentsViewImpl();
            DaTrackingProcessDocumentsViewImpl daTrackingProcessDocumentsViewImpl = new DaTrackingProcessDocumentsViewImpl();
            if (valueChangeEvent.getNewValue() != null) {
                //Get File Object from VC Event
                valueChangeEvent.getNewValue();
                ArrayList<UploadedFile> filesList = (ArrayList<UploadedFile>)valueChangeEvent.getNewValue();                
                for(UploadedFile fileVal : filesList){              
                //Upload File to path- Return actual server path
                String location = uploadFile(fileVal);      
              //  String comments = getStepComments();
                Da_trackings.commentsFinal = getStepComments();
                daTrackingProcessDocumentsViewImpl.setFileDetails(Da_trackings.getStepId(),                                                              
                                                                  getStepDaId(),
                                                                  fileVal.getFilename(), location,
                                                                  fileVal.getContentType());
            }
                //Reset inputFile component after upload
                ResetUtils.reset(valueChangeEvent.getComponent());
                //Notify user of successful file upload
                showMessageSuccess();
            }
        } catch (Exception exception) {
            // exception.printStackTrace();
            showMessageFailure();
        }
    }
    
    public void uploadRequestDAFile(ValueChangeEvent valueChangeEvent) {
        try {
            //DocumentsViewImpl documentsViewImpl = new DocumentsViewImpl();
            DaTrackingProcessDocumentsViewImpl daTrackingProcessDocumentsViewImpl = new DaTrackingProcessDocumentsViewImpl();                     
            if (valueChangeEvent.getNewValue() != null) {
                //Get File Object from VC Event
                valueChangeEvent.getNewValue();
                ArrayList<UploadedFile> filesList = (ArrayList<UploadedFile>)valueChangeEvent.getNewValue();
                for(UploadedFile fileVal : filesList){
                    //Check file type
                    if(isExcel(getFileExtension(fileVal.getFilename()))){
                //Upload File to path- Return actual server path
                String location = uploadFile(fileVal);               
                /*daTrackingProcessDocumentsViewImpl.setFileDetails(99999, 
                                                                  233,
                                                                  fileVal.getFilename(), location,
                                                                 // fileVal.getContentType())
                                                                  getRequestDaComments())*/
                setRequestDaDaId(233); //DA chosen for all DA requests
                setRequestDaFileLocation(location);
                setRequestDaFilename(fileVal.getFilename());
                setRequestDaStepId(99999);//DA step chosen for all Da requests
                getRequestDaComments();
                        //Notify user of successful file upload
                        System.out.println("File successfully uploaded");
                        showMessageSuccess();
                    }else{
                        //Notify user of invalid file type
                        System.out.println("File selected is not Excel. Please upload only Excel files");
                        showMessageInvalidFileType();                      
                    }
            }
                //Reset inputFile component after upload
                ResetUtils.reset(valueChangeEvent.getComponent());
            }
        } catch (Exception exception) {
            System.err.println("File uploading failed");
            showMessageFailure();
        }
    }

    String getFileUploadValidator(String filename) {
        String parts[] = filename.split("\\.(?=[^\\.]+$)");
        return parts[1].toLowerCase();
    }

    boolean isExcel(String fileExtn) {
        if (fileExtn.equals("xls") || fileExtn.equals("xlsx"))
            return true;
        else
            return false;
    }
    
    String getFileExtension(String filename){
            String parts[] = filename.split("\\.(?=[^\\.]+$)");
            return parts[1].toLowerCase();
        }    

    private void showMessageSuccess() {
        FacesMessage Message = new FacesMessage("File Upload Successful!");
        Message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }

    private void showMessageFailure() {
        FacesMessage Message = new FacesMessage("File Upload Failed!. Please try again");
        Message.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }
    
    private void showMessageInvalidFileType() {
        FacesMessage Message = new FacesMessage("File selected is not Excel. Please upload only Excel files");
        Message.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }    

    public void showMessageInsertDaDetailsSuccess() {
        FacesMessage Message = new FacesMessage("Information saved successfully");
        Message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }
    
    public void showMessageInsertDaDetailsFailure() {
        FacesMessage Message = new FacesMessage("Error occurred saving information. Please try again");
        Message.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    } 

    /**Method to upload file to actual path on Server*/
    private String uploadFile(UploadedFile file) {
        UploadedFile myfile = file;
        String path = null;
        //TO DO: Check if table row is selected, if not, skip and ask user to select a row before uploading file   
        if (myfile == null) {
        } else {
            // All uploaded files will be stored in below path
            if (OS.indexOf("win") >= 0) {
                path = "D://FileUploads//" + myfile.getFilename();
            } else if (OS.indexOf("nix") >= 0) {
                path = "//FileUploads//VoucherTracker//" + myfile.getFilename();
            }
            //path = "//FileUploads//VoucherTracke//" + myfile.getFilename();
            InputStream inputStream = null;
            try {
                FileOutputStream out = new FileOutputStream(path);
                inputStream = myfile.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead = 0;
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();
                out.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.err.println("Error uploading file");
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("Error closing inputstream");
                }
            }
        }
        //Returns the path where file is stored
        return path;
    }

    public static void setDaTrackingProcessDocumentsId(int daTrackingProcessDocumentsId) {
        Da_trackings.daTrackingProcessDocumentsId = daTrackingProcessDocumentsId;
    }

    public static int getDaTrackingProcessDocumentsId() {
        return daTrackingProcessDocumentsId;
    }

    public static void setDaId(int daId) {
        Da_trackings.daId = daId;
    }
    
    public int getDaId() {
       // int daId = soc1.getValue() != null ? Integer.parseInt(soc1.getValue().toString()) : 0;
    //Da_trackings.daId = daId;
        return daId;
    }   
    
    public int getStepDaId(){
        stepDaId = soc1.getValue() !=null ? Integer.parseInt(soc1.getValue().toString()) : 0;      
        return stepDaId;
    }

    public void setStepDaId(int stepDaId) {
        this.stepDaId = stepDaId;
    }

    public static void setStepId(int stepId) {
        Da_trackings.stepId = stepId;
    }

    public static int getStepId() {
        return stepId;
    }

    public void if1_validator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...

    }

    public void it1_validator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...

    }

    public void setPgl6(RichPanelGridLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGridLayout getPgl6() {
        return pgl6;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setStepComments(String stepComments) {
        this.stepComments = stepComments;
    }

    public String getStepComments() {
      //  if(stepComments.equals("")){
      String stepComments = "";
        try{
        //    String nothing = it4.getValue().toString();
        stepComments= it4.getValue() != null ? it4.getValue().toString() : "";
    //    }
        }catch(Exception exception){
            System.err.println("Error getting stepCopmments");
        }
        return stepComments;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }


    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setDaNumberId(int daNumberId) {
        this.daNumberId = daNumberId;
    }

    public int getDaNumberId() {
        daNumberId = Da_trackings.daId;
        return daNumberId;
    }

    public void setDaStepId(int daStepId) {
        this.daStepId = daStepId;
    }

    public int getDaStepId() {
        daStepId = Da_trackings.getStepId();
        return daStepId;
    }

    public void daNumberChangeListener(ValueChangeEvent valueChangeEvent) {
      //  int daid = soc1.getValue() != null? Integer.parseInt(soc1.getValue().toString()) : 0;       
        int newDaId = valueChangeEvent.getNewValue() !=null ? Integer.parseInt(valueChangeEvent.getNewValue().toString()) : 0;
        System.err.println("DA Id is : " +newDaId);
        Da_trackings.setDaId(newDaId);
    }


    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }


    public void setIf2(RichInputFile if2) {
        this.if2 = if2;
    }

    public RichInputFile getIf2() {
        return if2;
    }

    public void setRequestDaFilename(String requestDaFilename) {
        this.requestDaFilename = requestDaFilename;
    }

    public String getRequestDaFilename() {
        return requestDaFilename;
    }

    public void setRequestDaFileLocation(String requestDaFileLocation) {
        this.requestDaFileLocation = requestDaFileLocation;
    }

    public String getRequestDaFileLocation() {
        return requestDaFileLocation;
    }

    public void setRequestDaStepId(int requestDaStepId) {
        this.requestDaStepId = requestDaStepId;
    }

    public int getRequestDaStepId() {
        return requestDaStepId;
    }

    public void setRequestDaDaId(int requestDaDaId) {
        this.requestDaDaId = requestDaDaId;
    }

    public int getRequestDaDaId() {
        return requestDaDaId;
    }
    
    //Email will be sent to vouchertracker@gmail.com and BCC sent to responsible users for the particular step.
    public void sendEmailNotification(int stepId, String daNumber){
        try{
            UsersViewImpl usersViewImpl = new UsersViewImpl();
            Map<String, String> emailsList = getStepResponsibleUsersEmails(stepId);
            //My first ever ever lambda expression. Welcome to Java 8
            //Remove the line below to enable email sending to the real recipients            
            emailsList.forEach((userFirstname,email)->{
               // email = "kiprotich.chemweno@fao.org";
                dats.model.SendEmail.send("vouchertracker@gmail.com", "", email,"Voucher Tracker Activity", "Dear "+userFirstname+", \"\\r\\n\"" +
                         "Your attention is drawn to an update made to DA Number '"+daNumber+ "'. \"\\r\\n\"" +
                         "For more details, log on to Voucher Tracker system. \"\\r\\n\"" +
                         " \"\\r\\n\"" +
                         "Regards \"\\r\\n\"" +
                         "**This is a system egenerated email DO NOT REPLY **");
                System.out.println("Email sent to "+userFirstname+ " at "+ new Date());
            });
          
        }catch(Exception exception){
            System.err.println("Error sending email notification");
            //exception.printStackTrace();
        }
    }    
    
    //Create an arraylist of user emails for users responsible for the step provided
    //The method gets userids responsible for a step then uses the userids to get email addresses
    public Map<String, String> getStepResponsibleUsersEmails(int stepId){
        Map<String, String> userEmails = new HashMap<>();
        ApplicationModule appMod=null;
        StepResponsiblePersonsViewImpl vo;
        UsersViewImpl usersViewImpl;
        try{   
            //userIds = new ArrayList<>();
            appMod = Configuration.createRootApplicationModule("dats.model.AppModule", "AppModuleLocal");
            vo = (StepResponsiblePersonsViewImpl) appMod.findViewObject("StepResponsiblePersonsView1");         
            usersViewImpl = new UsersViewImpl();
            //Create View criteria
            ViewCriteria viewCriteria = vo.createViewCriteria();
            ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
            viewCriteriaRow.setAttribute("StepId", stepId);
            viewCriteria.add(viewCriteriaRow);
            viewCriteria.setCriteriaMode(ViewCriteria.CRITERIA_MODE_CACHE);
            vo.applyViewCriteria(viewCriteria);
            vo.executeQuery();            
            while (vo.hasNext()) {
                StepResponsiblePersonsViewRowImpl row = (StepResponsiblePersonsViewRowImpl) vo.next();
                userEmails.put( usersViewImpl.getUserFirstName(row.getUserId()) , usersViewImpl.getEmail(row.getUserId()+""));
            }                       
        }catch(Exception exception){
            System.err.println("Error encountered when getting emails for users responsible for various steps");
          //  exception.printStackTrace();
        }  finally{
            if(appMod != null){
                Configuration.releaseRootApplicationModule(appMod, false);                      
            }
            vo = null;
            usersViewImpl = null;
        }
        return userEmails;
    }
 /*   
    public void insertDaStepDetailsProgress() {
      //  boolean isSuccessful = false;
      //  setInsertDaStepIsSuccessful(isSuccessful);
        AppModuleImpl appModule = new AppModuleImpl();
        try {
            if(appModule.insertDaStepDetailsProgress(getDaStepId(), getLoggedInUserId(), getStepDaId(), getStepComments())){
                showMessageInsertDaDetailsSuccess();
            }else{
                showMessageInsertDaDetailsFailure();
            }
        } catch (Exception exception) {
          //  isSuccessful=false;
            System.err.println("Error encountered inserting DA Progress");
            exception.printStackTrace();           
        }
       // return isSuccessful;
    } */

    public void setCmi12(RichCommandMenuItem cmi12) {
        this.cmi12 = cmi12;
    }

    public RichCommandMenuItem getCmi12() {
        return cmi12;
    }

    public void setCmi16(RichCommandMenuItem cmi16) {
        this.cmi16 = cmi16;
    }

    public RichCommandMenuItem getCmi16() {
        return cmi16;
    }

    public void setFinalStepProcessComments(String finalStepProcessComments) {
        this.finalStepProcessComments = finalStepProcessComments;
    }

    public String getFinalStepProcessComments() {
        return finalStepProcessComments;
    }


    public void setPhaseIdId(RichInputListOfValues phaseIdId) {
        this.phaseIdId = phaseIdId;
    }

    public RichInputListOfValues getPhaseIdId() {
        return phaseIdId;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }


    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }

    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void insertDaStepDetailsProgress(ActionEvent actionEvent) {
        AppModuleImpl appModule = new AppModuleImpl();
        try {
            if(appModule.insertDaStepDetailsProgress(getDaStepId(), getLoggedInUserId(), getLoggedInUserFullname(getLoggedInUserId()), getStepDaId(), getStepComments())){
                showMessageInsertDaDetailsSuccess();
            }else{
                showMessageInsertDaDetailsFailure();
            }
        } catch (Exception exception) {
          //  isSuccessful=false;
            System.err.println("Error encountered inserting DA Progress");
            //exception.printStackTrace();           
        }
    }
    
    public void insertGenerateDaDetails(ActionEvent actionEvent) {
        AppModuleImpl appModule = new AppModuleImpl();
        try {
            if(appModule.insertGenerateDaDetails(getTotalValue(), getNumberOfBeneficiaries() , getDistrictId(), getGenerateDaNgoId(), getGenerateDAInterventionTypeId(), 
                                                 getGenerateDaPhaseId(), getGenerateDaDaNumber(), getGenerateDaLoaNumber(), getGenerateDAComments(),getLoggedInUserFullname(getLoggedInUserId()),getLoggedInUserId())){
                showMessageInsertDaDetailsSuccess();
            }else{
                showMessageInsertDaDetailsFailure();
            }
        } catch (Exception exception) {
          //  isSuccessful=false;
            System.err.println("Error encountered inserting DA Progress");
         //   exception.printStackTrace();           
        }
    }


}
