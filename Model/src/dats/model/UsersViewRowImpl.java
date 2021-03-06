package dats.model;

import dats.model.common.UsersViewRow;

import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 12 18:18:05 EAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UsersViewRowImpl extends ViewRowImpl implements UsersViewRow {


    public static final int ENTITY_USERS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        Firstname,
        Lastname,
        Othername,
        Username,
        Password,
        Gender,
        PhoneMobile,
        PhoneOffice,
        Email,
        UnitId,
        GroupId,
        IsActive,
        Description,
        UnitsView1,
        GroupsView1;
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
    public static final int FIRSTNAME = AttributesEnum.Firstname.index();
    public static final int LASTNAME = AttributesEnum.Lastname.index();
    public static final int OTHERNAME = AttributesEnum.Othername.index();
    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int PHONEMOBILE = AttributesEnum.PhoneMobile.index();
    public static final int PHONEOFFICE = AttributesEnum.PhoneOffice.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int UNITID = AttributesEnum.UnitId.index();
    public static final int GROUPID = AttributesEnum.GroupId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int UNITSVIEW1 = AttributesEnum.UnitsView1.index();
    public static final int GROUPSVIEW1 = AttributesEnum.GroupsView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UsersViewRowImpl() {
    }

    /**
     * Gets Users entity object.
     * @return the Users
     */
    public EntityImpl getUsers() {
        return (EntityImpl) getEntity(ENTITY_USERS);
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
     * Gets the attribute value for firstname using the alias name Firstname.
     * @return the firstname
     */
    public String getFirstname() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for firstname using the alias name Firstname.
     * @param value value to set the firstname
     */
    public void setFirstname(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for lastname using the alias name Lastname.
     * @return the lastname
     */
    public String getLastname() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for lastname using the alias name Lastname.
     * @param value value to set the lastname
     */
    public void setLastname(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for othername using the alias name Othername.
     * @return the othername
     */
    public String getOthername() {
        return (String) getAttributeInternal(OTHERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for othername using the alias name Othername.
     * @param value value to set the othername
     */
    public void setOthername(String value) {
        setAttributeInternal(OTHERNAME, value);
    }

    /**
     * Gets the attribute value for username using the alias name Username.
     * @return the username
     */
    public String getUsername() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for username using the alias name Username.
     * @param value value to set the username
     */
    public void setUsername(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for password using the alias name Password.
     * @return the password
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for password using the alias name Password.
     * @param value value to set the password
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for gender using the alias name Gender.
     * @return the gender
     */
    public String getGender() {
        return (String) getAttributeInternal(GENDER);
    }

    /**
     * Sets <code>value</code> as attribute value for gender using the alias name Gender.
     * @param value value to set the gender
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**
     * Gets the attribute value for phone_mobile using the alias name PhoneMobile.
     * @return the phone_mobile
     */
    public String getPhoneMobile() {
        return (String) getAttributeInternal(PHONEMOBILE);
    }

    /**
     * Sets <code>value</code> as attribute value for phone_mobile using the alias name PhoneMobile.
     * @param value value to set the phone_mobile
     */
    public void setPhoneMobile(String value) {
        setAttributeInternal(PHONEMOBILE, value);
    }

    /**
     * Gets the attribute value for phone_office using the alias name PhoneOffice.
     * @return the phone_office
     */
    public String getPhoneOffice() {
        return (String) getAttributeInternal(PHONEOFFICE);
    }

    /**
     * Sets <code>value</code> as attribute value for phone_office using the alias name PhoneOffice.
     * @param value value to set the phone_office
     */
    public void setPhoneOffice(String value) {
        setAttributeInternal(PHONEOFFICE, value);
    }

    /**
     * Gets the attribute value for email using the alias name Email.
     * @return the email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for email using the alias name Email.
     * @param value value to set the email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for unit_id using the alias name UnitId.
     * @return the unit_id
     */
    public Integer getUnitId() {
        return (Integer) getAttributeInternal(UNITID);
    }

    /**
     * Sets <code>value</code> as attribute value for unit_id using the alias name UnitId.
     * @param value value to set the unit_id
     */
    public void setUnitId(Integer value) {
        setAttributeInternal(UNITID, value);
    }

    /**
     * Gets the attribute value for group_id using the alias name GroupId.
     * @return the group_id
     */
    public Integer getGroupId() {
        return (Integer) getAttributeInternal(GROUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for group_id using the alias name GroupId.
     * @param value value to set the group_id
     */
    public void setGroupId(Integer value) {
        setAttributeInternal(GROUPID, value);
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
     * Gets the view accessor <code>RowSet</code> UnitsView1.
     */
    public RowSet getUnitsView1() {
        return (RowSet) getAttributeInternal(UNITSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> GroupsView1.
     */
    public RowSet getGroupsView1() {
        return (RowSet) getAttributeInternal(GROUPSVIEW1);
    }
}

