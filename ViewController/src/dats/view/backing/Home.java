package dats.view.backing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

//import oracle.adf.model.BindingContainer;
//import oracle.adf.model.BindingContext;
//import oracle.adf.model.OperationBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.util.ResetUtils;
//import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.UploadedFile;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;
import oracle.adf.model.BindingContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import dats.model.AppModuleImpl;
import dats.model.DaTrackingProcessDocumentsViewImpl;
//import dats.model.DocumentsViewImpl;
import oracle.adf.view.rich.event.QueryEvent;
import oracle.adf.view.rich.model.AttributeCriterion;
import oracle.adf.view.rich.model.ConjunctionCriterion;
import oracle.adf.view.rich.model.Criterion;
import oracle.adf.view.rich.model.FilterableQueryDescriptor;
import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.client.Configuration;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;
import org.apache.myfaces.trinidad.model.CollectionModel;

public class Home {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichPanelSplitter ps1;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichTable t2;
    private RichInputDate id1;
    private RichMessages m1;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichInputFile if1;
    private RichInputText pathBind;
    private static int daTrackingProcessDocumentsId;
    private static int stepId;
    private static String filePath;
    private RichPanelSplitter ps2;
    private RichPanelCollection pc2;
    private RichTable t3;
    private RichButton b4;
    private static String OS = System.getProperty("os.name").toLowerCase();

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

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }


    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
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


    public void setIf1(RichInputFile if1) {
        this.if1 = if1;
    }

    public RichInputFile getIf1() {
        return if1;
    }

    /**Method to upload file to actual path on Server*/
    private String uploadFile(UploadedFile file) {
        UploadedFile myfile = file;
        String path = null;
        //TO DO: Check if table row is selected, if not, skip and ask user to select a row before uploading file
        if (myfile == null) {
        } else {
            // All uploaded files will be stored in below path
            if(OS.indexOf("win") >= 0){
                path = "D://FileUploads//" + myfile.getFilename(); 
            }else if(OS.indexOf("nix") >= 0){
                path = "//FileUploads//" + myfile.getFilename();
            }
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
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Returns the path where file is stored
        return path;
    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /** * Generic Method to execute operation * */
    public OperationBinding executeOperation(String operation) {
        java.util.List createParams = getBindingsCont().getOperationBindings();
        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
        return createParam;
    }

    /**Method to Upload File ,called on ValueChangeEvent of inputFile * @param vce */
    public void uploadFileVCE(ValueChangeEvent vce) {
        try {
            //DocumentsViewImpl documentsViewImpl = new DocumentsViewImpl();
            DaTrackingProcessDocumentsViewImpl daTrackingProcessDocumentsViewImpl = new DaTrackingProcessDocumentsViewImpl();
            if (vce.getNewValue() != null) {
                //Get File Object from VC Event
                UploadedFile fileVal = (UploadedFile) vce.getNewValue();
                //Upload File to path- Return actual server path
                String location = uploadFile(fileVal);
                //documentsViewImpl.setFileData(getDaId(), getStepId(), fileVal.getFilename(), location, fileVal.getContentType());
                daTrackingProcessDocumentsViewImpl.setFileData(getDaTrackingProcessDocumentsId(), fileVal.getFilename(), location, fileVal.getContentType());
                //Reset inputFile component after upload
                ResetUtils.reset(vce.getComponent());
                //Notify user of successful file upload
                showMessageSuccess();
            }
        } catch (Exception exception) {
            // exception.printStackTrace();
            exception.printStackTrace();
            showMessageFailure();
        }
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

    public static void setDaTrackingProcessDocumentsId(int daTrackingProcessDocumentsId) {
        Home.daTrackingProcessDocumentsId = daTrackingProcessDocumentsId;
    }

    public static int getDaTrackingProcessDocumentsId() {
        return daTrackingProcessDocumentsId;
    }

    public static void setStepId(int stepId) {
        Home.stepId = stepId;
    }

    public static int getStepId() {
        return stepId;
    }

    //Get table values for the selected rows
    public void tableRowSelectionListener(SelectionEvent selectionEvent) {
        try{
        RichTable richTable = (RichTable) selectionEvent.getSource();
        CollectionModel tableModel = (CollectionModel) richTable.getValue();
        JUCtrlHierBinding adfTableBinding = (JUCtrlHierBinding) tableModel.getWrappedData();
        Object selectedRowData = richTable.getSelectedRowData();
        JUCtrlHierNodeBinding nodeBinding = (JUCtrlHierNodeBinding) selectedRowData;
        // for (Object o : nodeBinding.getAttributeValues()) {
        //  System.out.println("Selected values " + o);
        // }
        // System.out.println("DA ID: " + nodeBinding.getAttribute("DaId"));
        // System.out.println("STEP ID: " + nodeBinding.getAttribute("StepId"));
        // Update value for daId
        setDaTrackingProcessDocumentsId(Integer.parseInt(nodeBinding.getAttribute("Id").toString()));
        // Update value for stepId
      //  setStepId(Integer.parseInt(nodeBinding.getAttribute("StepId").toString()));
        }catch(Exception exception){
                System.err.println("Exception thrown and caught in 'tableRowSelectionListener'");
            }
    }

    //Get files table values for the selected rows
    public void filesTableRowSelectionListener(SelectionEvent selectionEvent) {
        RichTable richTable = (RichTable) selectionEvent.getSource();
        CollectionModel tableModel = (CollectionModel) richTable.getValue();
        JUCtrlHierBinding adfTableBinding = (JUCtrlHierBinding) tableModel.getWrappedData();
        Object selectedRowData = richTable.getSelectedRowData();
        JUCtrlHierNodeBinding nodeBinding = (JUCtrlHierNodeBinding) selectedRowData;
        // Update value for filePath
        setFilePath(nodeBinding.getAttribute("DocumentLocation").toString());
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }


    public void downloadFileListener(FacesContext facesContext, OutputStream outputStream) throws IOException {
        //Read file from particular path, path bind is binding of table field that contains path
        try {
           // pathBind = new RichInputText();
           // pathBind.setValue("D:/FileUploads/fleet_management_screenshot.png");
           // File filed = new File(pathBind.getValue().toString());
            System.err.println("Full file path : "+getFilePath());
            File filed = new File(getFilePath());
            FileInputStream fis;
            byte[] b;
            fis = new FileInputStream(filed);
            int n;
            while ((n = fis.available()) > 0) {
                b = new byte[n];
                int result = fis.read(b);
                outputStream.write(b, 0, b.length);
                if (result == -1)
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputStream.flush();
    }

    public void setPathBind(RichInputText pathBind) {
        this.pathBind = pathBind;
    }

    public RichInputText getPathBind() {
        return pathBind;
    }

    public static void setFilePath(String filePath) {
        Home.filePath = filePath;
    }

    public static String getFilePath() {
        return filePath;
    }


    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }
    
    /**
     * method to reset filter attributes on an af:table
     * @param actionEvent event which triggers the method
     */
    public void resetTableFilter(ActionEvent actionEvent) {
        FilterableQueryDescriptor queryDescriptor = (FilterableQueryDescriptor) getT2().getFilterModel();
        if (queryDescriptor != null && queryDescriptor.getFilterConjunctionCriterion() != null) {
            ConjunctionCriterion cc = queryDescriptor.getFilterConjunctionCriterion();
            List<Criterion> lc = cc.getCriterionList();
            for (Criterion c : lc) {
                if (c instanceof AttributeCriterion) {
                    AttributeCriterion ac = (AttributeCriterion) c;
                    ac.setValue(null);
                }
            }
            getT2().queueEvent(new QueryEvent(getT2(), queryDescriptor));
        }
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

}
