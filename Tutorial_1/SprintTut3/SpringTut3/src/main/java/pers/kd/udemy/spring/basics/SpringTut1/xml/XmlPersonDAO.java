package pers.kd.udemy.spring.basics.SpringTut1.xml;

public class XmlPersonDAO {
	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}


	public XmlJdbcConnection xmlJdbcConnection;

}
