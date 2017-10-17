package dats.model;

import dats.model.common.DistrictsViewRow;
import dats.model.common.Text;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 17 10:28:14 EAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DistrictsViewRowImpl extends ViewRowImpl implements DistrictsViewRow {

    public static final int ENTITY_DISTRICTS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        RegionId,
        Title,
        Description,
        Archived,
        Deleted,
        DateCreated,
        CreatedBy,
        LastModified,
        ModifiedBy,
        DistrictsView1;
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
    public static final int REGIONID = AttributesEnum.RegionId.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ARCHIVED = AttributesEnum.Archived.index();
    public static final int DELETED = AttributesEnum.Deleted.index();
    public static final int DATECREATED = AttributesEnum.DateCreated.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTMODIFIED = AttributesEnum.LastModified.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int DISTRICTSVIEW1 = AttributesEnum.DistrictsView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DistrictsViewRowImpl() {
    }

    /**
     * Gets Districts entity object.
     * @return the Districts
     */
    public EntityImpl getDistricts() {
        return (EntityImpl) getEntity(ENTITY_DISTRICTS);
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
     * Gets the attribute value for region_id using the alias name RegionId.
     * @return the region_id
     */
    public Integer getRegionId() {
        return (Integer) getAttributeInternal(REGIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for region_id using the alias name RegionId.
     * @param value value to set the region_id
     */
    public void setRegionId(Integer value) {
        setAttributeInternal(REGIONID, value);
    }

    /**
     * Gets the attribute value for title using the alias name Title.
     * @return the title
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as attribute value for title using the alias name Title.
     * @param value value to set the title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for description using the alias name Description.
     * @return the description
     */
    public Text getDescription() {
        return (Text) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for description using the alias name Description.
     * @param value value to set the description
     */
    public void setDescription(Text value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for archived using the alias name Archived.
     * @return the archived
     */
    public Boolean getArchived() {
        return (Boolean) getAttributeInternal(ARCHIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for archived using the alias name Archived.
     * @param value value to set the archived
     */
    public void setArchived(Boolean value) {
        setAttributeInternal(ARCHIVED, value);
    }

    /**
     * Gets the attribute value for deleted using the alias name Deleted.
     * @return the deleted
     */
    public Boolean getDeleted() {
        return (Boolean) getAttributeInternal(DELETED);
    }

    /**
     * Sets <code>value</code> as attribute value for deleted using the alias name Deleted.
     * @param value value to set the deleted
     */
    public void setDeleted(Boolean value) {
        setAttributeInternal(DELETED, value);
    }

    /**
     * Gets the attribute value for date_created using the alias name DateCreated.
     * @return the date_created
     */
    public Timestamp getDateCreated() {
        return (Timestamp) getAttributeInternal(DATECREATED);
    }

    /**
     * Sets <code>value</code> as attribute value for date_created using the alias name DateCreated.
     * @param value value to set the date_created
     */
    public void setDateCreated(Timestamp value) {
        setAttributeInternal(DATECREATED, value);
    }

    /**
     * Gets the attribute value for created_by using the alias name CreatedBy.
     * @return the created_by
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for created_by using the alias name CreatedBy.
     * @param value value to set the created_by
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for last_modified using the alias name LastModified.
     * @return the last_modified
     */
    public Timestamp getLastModified() {
        return (Timestamp) getAttributeInternal(LASTMODIFIED);
    }

    /**
     * Sets <code>value</code> as attribute value for last_modified using the alias name LastModified.
     * @param value value to set the last_modified
     */
    public void setLastModified(Timestamp value) {
        setAttributeInternal(LASTMODIFIED, value);
    }

    /**
     * Gets the attribute value for modified_by using the alias name ModifiedBy.
     * @return the modified_by
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for modified_by using the alias name ModifiedBy.
     * @param value value to set the modified_by
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DistrictsView1.
     */
    public RowSet getDistrictsView1() {
        return (RowSet) getAttributeInternal(DISTRICTSVIEW1);
    }
}

