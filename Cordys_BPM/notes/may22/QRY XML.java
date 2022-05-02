public static int getVehPendingPartsAgainstUser(String VehSrlno,String VehBodySrlno,String userlist) throws UnsupportedEncodingException, XMLException
{
Document doc = BSF.getXMLDocument();
String xmldata =  "<xml>";	
//QRY
BusObjectIterator boi1 = qObj1.getObjects();
	if(boi1!=null)
	{
		
		while (boi1.hasMoreElements()) {			
			BusObject resp1 = boi1.nextElement();
			
			srlNo++;
			xmldata=xmldata+"<tuple><old><VehIncidentHistory>"
							+ "<SrlNo>"+srlNo+"</SrlNo>"
							+ "<PendingType>Quarantine</PendingType>"
							+ "<RequestNo>"+resp1.getStringProperty("VMS_QE_SL_NO")+"</RequestNo>"
							+ "<TokenNo>"+resp1.getStringProperty("VMS_QE_CREATED_BY")+"</TokenNo>"
							+ "<Name>"+resp1.getStringProperty("VMS_QE_CREATED_NAME")+"</Name>"
							+ "<Contact>"+resp1.getStringProperty("VMS_QE_USER_CONTACT")+"</Contact>"
							+ "<Exprtn>NA</Exprtn>"
							+ "<VehBodyNo>"+resp1.getStringProperty("VEHICLE_BODY_SL_NO")+"</VehBodyNo>"
							+ "<VehSrlNo>"+resp1.getStringProperty("VEHICLE_SERIAL_NO")+"</VehSrlNo>"
							+ "<VehDesc>"+resp1.getStringProperty("VMS_CVRE_PLATFORM")+"</VehDesc>"
							+ "<PartNo>NA</PartNo>"
							+ "<PartDesc>NA</PartDesc>"
							+ "<Qty>1</Qty></VehIncidentHistory></old></tuple>";
			
		}
				
	}
	
xmldata = xmldata + "</xml>";
	String main1 = xmldata.replaceAll(">null<", "><");
	String main2 = main1.replaceAll(">NaN<", "><");
	int respNode = doc.parseString(main2);
	return respNode;
	}