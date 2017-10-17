package dats.model.common;

import java.sql.Date;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 12 11:13:53 EAT 2017
// ---------------------------------------------------------------------
public interface PaymentsViewRow extends Row {
    Integer getId();

    void setId(Integer value);

    Integer getMoneyVendorId();

    void setMoneyVendorId(Integer value);

    Integer getDaId();

    void setDaId(Integer value);

    Integer getSectorId();

    void setSectorId(Integer value);

    Integer getCategoryId();

    void setCategoryId(Integer value);

    Integer getPhaseId();

    void setPhaseId(Integer value);

    Integer getLoaId();

    void setLoaId(Integer value);

    Integer getDistributedItemsId();

    void setDistributedItemsId(Integer value);

    Integer getNgoId();

    void setNgoId(Integer value);

    Integer getDistrictId();

    void setDistrictId(Integer value);

    Integer getPaymentLocationId();

    void setPaymentLocationId(Integer value);

    Integer getPaymentCycleId();

    void setPaymentCycleId(Integer value);

    String getPeriodPaid();

    void setPeriodPaid(String value);

    Integer getForemenVouchers();

    void setForemenVouchers(Integer value);

    Integer getWorkers();

    void setWorkers(Integer value);

    String getPoNumber();

    void setPoNumber(String value);

    Float getAuthorizedAmount();

    void setAuthorizedAmount(Float value);

    Float getAmountPaid();

    void setAmountPaid(Float value);

    Integer getRateId();

    void setRateId(Integer value);

    Integer getVouchersToReceive();

    void setVouchersToReceive(Integer value);

    Date getDateOfInvoice();

    void setDateOfInvoice(Date value);

    String getReimbursedThroughInvoiceNumber();

    void setReimbursedThroughInvoiceNumber(String value);

    Date getDateOfPay();

    void setDateOfPay(Date value);

    String getPayReferenceNumber();

    void setPayReferenceNumber(String value);

    Float getBalToPay();

    void setBalToPay(Float value);

    Float getMoneyVendorCommission();

    void setMoneyVendorCommission(Float value);

    Float getGrossAmount();

    void setGrossAmount(Float value);
}
