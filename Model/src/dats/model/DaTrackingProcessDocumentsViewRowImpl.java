package dats.model;

import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 12 18:22:13 EAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DaTrackingProcessDocumentsViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_DATRACKINGPROCESSDOCUMENTS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        DocumentId,
        DaTrackingProcessId,
        DocumentName,
        DocumentLocation,
        Description,
        IsActive,
        DaId,
        StepId,
        DaTrackingProcessView,
        DaTrackingProcessView1,
        DaTrackingProcessView2,
        DaTrackingProcessView3,
        DaTrackingProcessDocumentsView,
        UsersView,
        UsersView1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ID = AttributesEnum.Id.index();
    public static final int DOCUMENTID = AttributesEnum.DocumentId.index();
    public static final int DATRACKINGPROCESSID = AttributesEnum.DaTrackingProcessId.index();
    public static final int DOCUMENTNAME = AttributesEnum.DocumentName.index();
    public static final int DOCUMENTLOCATION = AttributesEnum.DocumentLocation.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int DAID = AttributesEnum.DaId.index();
    public static final int STEPID = AttributesEnum.StepId.index();
    public static final int DATRACKINGPROCESSVIEW = AttributesEnum.DaTrackingProcessView.index();
    public static final int DATRACKINGPROCESSVIEW1 = AttributesEnum.DaTrackingProcessView1.index();
    public static final int DATRACKINGPROCESSVIEW2 = AttributesEnum.DaTrackingProcessView2.index();
    public static final int DATRACKINGPROCESSVIEW3 = AttributesEnum.DaTrackingProcessView3.index();
    public static final int DATRACKINGPROCESSDOCUMENTSVIEW = AttributesEnum.DaTrackingProcessDocumentsView.index();
    public static final int USERSVIEW = AttributesEnum.UsersView.index();
    public static final int USERSVIEW1 = AttributesEnum.UsersView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DaTrackingProcessDocumentsViewRowImpl() {
    }

    /**
     * Gets DaTrackingProcessDocuments entity object.
     * @return the DaTrackingProcessDocuments
     */
    public EntityImpl getDaTrackingProcessDocuments() {
        return (EntityImpl) getEntity(ENTITY_DATRACKINGPROCESSDOCUMENTS);
    }

    /**
     * Gets the attribute value for id using the alias name Id.
     * @return the id
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for id using the alias name Id.
     * @param value value to set the id
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for document_id using the alias name DocumentId.
     * @return the document_id
     */
    public Integer getDocumentId() {
        return (Integer) getAttributeInternal(DOCUMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for document_id using the alias name DocumentId.
     * @param value value to set the document_id
     */
    public void setDocumentId(Integer value) {
        setAttributeInternal(DOCUMENTID, value);
    }

    /**
     * Gets the attribute value for da_tracking_process_id using the alias name DaTrackingProcessId.
     * @return the da_tracking_process_id
     */
    public Integer getDaTrackingProcessId() {
        return (Integer) getAttributeInternal(DATRACKINGPROCESSID);
    }

    /**
     * Sets <code>value</code> as attribute value for da_tracking_process_id using the alias name DaTrackingProcessId.
     * @param value value to set the da_tracking_process_id
     */
    public void setDaTrackingProcessId(Integer value) {
        setAttributeInternal(DATRACKINGPROCESSID, value);
    }

    /**
     * Gets the attribute value for document_name using the alias name DocumentName.
     * @return the document_name
     */
    public String getDocumentName() {
        return (String) getAttributeInternal(DOCUMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for document_name using the alias name DocumentName.
     * @param value value to set the document_name
     */
    public void setDocumentName(String value) {
        setAttributeInternal(DOCUMENTNAME, value);
    }

    /**
     * Gets the attribute value for document_location using the alias name DocumentLocation.
     * @return the document_location
     */
    public String getDocumentLocation() {
        return (String) getAttributeInternal(DOCUMENTLOCATION);
    }

    /**
     * Sets <code>value</code> as attribute value for document_location using the alias name DocumentLocation.
     * @param value value to set the document_location
     */
    public void setDocumentLocation(String value) {
        setAttributeInternal(DOCUMENTLOCATION, value);
    }

    /**
     * Gets the attribute value for description using the alias name Description.
     * @return the description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for description using the alias name Description.
     * @param value value to set the description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for is_active using the alias name IsActive.
     * @return the is_active
     */
    public Integer getIsActive() {
        return (Integer) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for is_active using the alias name IsActive.
     * @param value value to set the is_active
     */
    public void setIsActive(Integer value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for da_id using the alias name DaId.
     * @return the da_id
     */
    public Integer getDaId() {
        return (Integer) getAttributeInternal(DAID);
    }

    /**
     * Sets <code>value</code> as attribute value for da_id using the alias name DaId.
     * @param value value to set the da_id
     */
    public void setDaId(Integer value) {
        setAttributeInternal(DAID, value);
    }

    /**
     * Gets the attribute value for step_id using the alias name StepId.
     * @return the step_id
     */
    public Integer getStepId() {
        return (Integer) getAttributeInternal(STEPID);
    }

    /**
     * Sets <code>value</code> as attribute value for step_id using the alias name StepId.
     * @param value value to set the step_id
     */
    public void setStepId(Integer value) {
        setAttributeInternal(STEPID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DaTrackingProcessView.
     */
    public RowIterator getDaTrackingProcessView() {
        return (RowIterator) getAttributeInternal(DATRACKINGPROCESSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DaTrackingProcessView1.
     */
    public RowIterator getDaTrackingProcessView1() {
        return (RowIterator) getAttributeInternal(DATRACKINGPROCESSVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DaTrackingProcessView2.
     */
    public RowIterator getDaTrackingProcessView2() {
        return (RowIterator) getAttributeInternal(DATRACKINGPROCESSVIEW2);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DaTrackingProcessView3.
     */
    public RowIterator getDaTrackingProcessView3() {
        return (RowIterator) getAttributeInternal(DATRACKINGPROCESSVIEW3);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DaTrackingProcessDocumentsView.
     */
    public RowIterator getDaTrackingProcessDocumentsView() {
        return (RowIterator) getAttributeInternal(DATRACKINGPROCESSDOCUMENTSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UsersView.
     */
    public RowIterator getUsersView() {
        return (RowIterator) getAttributeInternal(USERSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UsersView1.
     */
    public RowIterator getUsersView1() {
        return (RowIterator) getAttributeInternal(USERSVIEW1);
    }
}
