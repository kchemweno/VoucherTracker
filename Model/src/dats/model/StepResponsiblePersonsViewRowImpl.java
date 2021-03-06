package dats.model;

import dats.model.common.StepResponsiblePersonsViewRow;

import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 23 12:14:58 EAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StepResponsiblePersonsViewRowImpl extends ViewRowImpl implements StepResponsiblePersonsViewRow {


    public static final int ENTITY_STEPRESPONSIBLEPERSONS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        StepId,
        UserId,
        IsActive,
        Comments,
        StepsView1,
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
    public static final int STEPID = AttributesEnum.StepId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int STEPSVIEW1 = AttributesEnum.StepsView1.index();
    public static final int USERSVIEW1 = AttributesEnum.UsersView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StepResponsiblePersonsViewRowImpl() {
    }

    /**
     * Gets StepResponsiblePersons entity object.
     * @return the StepResponsiblePersons
     */
    public EntityImpl getStepResponsiblePersons() {
        return (EntityImpl) getEntity(ENTITY_STEPRESPONSIBLEPERSONS);
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
     * Gets the attribute value for user_id using the alias name UserId.
     * @return the user_id
     */
    public Integer getUserId() {
        return (Integer) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as attribute value for user_id using the alias name UserId.
     * @param value value to set the user_id
     */
    public void setUserId(Integer value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for is_active using the alias name IsActive.
     * @return the is_active
     */
    public Boolean getIsActive() {
        return (Boolean) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for is_active using the alias name IsActive.
     * @param value value to set the is_active
     */
    public void setIsActive(Boolean value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for comments using the alias name Comments.
     * @return the comments
     */
    public String getComments() {
        return (String) getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for comments using the alias name Comments.
     * @param value value to set the comments
     */
    public void setComments(String value) {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StepsView1.
     */
    public RowSet getStepsView1() {
        return (RowSet) getAttributeInternal(STEPSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UsersView1.
     */
    public RowSet getUsersView1() {
        return (RowSet) getAttributeInternal(USERSVIEW1);
    }


}

