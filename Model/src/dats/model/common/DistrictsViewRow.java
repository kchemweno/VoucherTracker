package dats.model.common;

import java.sql.Timestamp;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 17 10:28:21 EAT 2017
// ---------------------------------------------------------------------
public interface DistrictsViewRow extends Row {
    Integer getId();

    void setId(Integer value);

    Integer getRegionId();

    void setRegionId(Integer value);

    String getTitle();

    void setTitle(String value);

    Text getDescription();

    void setDescription(Text value);

    Boolean getArchived();

    void setArchived(Boolean value);

    Boolean getDeleted();

    void setDeleted(Boolean value);

    Timestamp getDateCreated();

    void setDateCreated(Timestamp value);

    Integer getCreatedBy();

    void setCreatedBy(Integer value);

    Timestamp getLastModified();

    void setLastModified(Timestamp value);

    String getModifiedBy();

    void setModifiedBy(String value);
}
