package src.in.valtech.util; 

/**
 * @Author: Gopal
 */

public class YahooInfoDSDetails
{

	private String dataVersion;
	private String yahooUsername;
	private String yahooPassword;
	private String yahooUrl;

	/**
	 * @return the dataVersion
	 */
	
	public String getDataVersion()
	{
		return dataVersion;
	}

	/**
	 * @param dataVersion
	 *            the dataVersion to set
	 */
	
	public void setDataVersion(String dataVersion) 
	{
		this.dataVersion = dataVersion;
	}

	/**
	 * @return the yahooUsername
	 */
	
	public String getyahooUsername() 
	{
		return yahooUsername;
	}

	/**
	 * @param yahooUsername
	 *            the yahooUsername to set
	 */
	public void setyahooUsername(String yahooUsername)
	{
		this.yahooUsername = yahooUsername;
	}

	/**
	 * @return the yahooPassword
	 */
	public String getyahooPassword() {
		return yahooPassword;
	}

	/**
	 * @param yahooPassword
	 *            the yahooPassword to set
	 */
	public void setyahooPassword(String yahooPassword) {
		this.yahooPassword = yahooPassword;
	}
	
	/**
	* @return the yahoo url
	*/
	public String getyahooUrl() {
	return yahooUrl;
	}

	/**
	* @param yahoo url
	* the yahoo url to set
	*/
	public void setyahooUrl(String yahooUrl) {
	this.yahooUrl = yahooUrl;
	}

}

