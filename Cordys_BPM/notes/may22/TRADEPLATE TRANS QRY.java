Trade Certificate Details Entry
--------------------------------------------------
Trade Plate Number
Type of Trade Plate
Trade Plate Certificate Date
Trade Plate Expiry Date
Insurance Type
Insurance Expiry Date --
Trade Plate Renewed Date
Trade Certificate Details Entry - by
Trade Certificate Details Entry - plant
Trade Certificate Details Entry - on

Trade Certificate Issue Entry
-----------------------------------------------------------
Vehicle Serial Number
Vehicle Body Serial Number
Requester Token Number
Mobile Number
Issue Date 
Issued By
Destination
Expected Return Date
HOD Token No.
issue Purpose

Trade Certificate Return to Stores Entry
-----------------------------------------------------
Return Date
Returned To
Returned By 
KM Covered
Return Remarks


--------------------------------------------------------------
TC Plate Tracking
VMS_TRADE_CERT_RET_STORE
VMS_TRADE_CERTIFICATE_DETAILS
VMS_TRADE_CERT_ISSUED
--------------------------------------------------------------

select 
TCI.VMS_TCD_TRADE_PLATE_NO,

TC.VMS_TCD_TRADE_PLATE_TYPE,
TC.VMS_TCD_TRADE_PLATE_CERT_DATE,
TC.VMS_TCD_TRADE_PLATE_EXP_DATE,
TC.VMS_TCD_INSURANCE_TYPE,--DECODE
TC.VMS_TCD_INSURANCE_EXP_DATE,
TC.VMS_TCD_TRADE_PLATE_RWD_DATE,
TC.VMS_TCD_CREATED_BY,
TC.VMS_TCD_CREATED_ON,

TCI.VMS_CVRE_SL_NO,
TCI.VMS_CVRE_SL_NO,
TCI.VMS_TCI_TOKEN_NO,
TCI.VMS_TCI_REQ_CONT_NO,
TCI.VMS_TCI_ISSUED_BY,
TCI.VMS_TCI_ISSUED_DATE_TIME,
TCI.VMS_TCI_DESTINATION,


TCI.VMS_TCI_EXP_RTN_DATE,
TCI.VMS_TCI_HOD_TKNO,
TCI.VMS_TCI_PURPOSE,

TCR.VMS_TCRS_RET_DATE,
TCR.VMS_TCRS_RET_TO,
TCR.VMS_TCRS_RET_BY,
TCR.VMS_TCRS_KM_COVERED,
TCR.VMS_TCRS_REMARKS


from VMS_TRADE_CERT_ISSUED TCI
left join VMS_TRADE_CERTIFICATE_DETAILS TC on TCI.VMS_TCD_TRADE_PLATE_NO = TC.VMS_TCD_TRADE_PLATE_NO
left join VMS_TRADE_CERT_RET_STORE TCR ON TCI.VMS_TCI_SL_NO = TCR.VMS_TCI_SL_NO
WHERE TCI.VMS_TCD_TRADE_PLATE_NO IS NOT NULL;