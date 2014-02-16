/*
 * Customer Class
 * Olympic Pride Project
 * Team Fearsome Foursome
 * GUI primarily developed by Scott Young
 * Handling code primarily developed by Bella Belova
 * File handling code primarily developed by Benny Nunez
 * Class code, bugfixes and streamlining by Amy Roberts
 * Intro to Programming for Business
 * "We pledge that we have complied with the AIC in this work."
 * - AR / BB / BN / SY
 */

package texteditor;

/* Begin customer class code.
 * Class implemented by Amy.
 * Creates variables, initializes them to default values, and provides
 * get and set methods, as well as a print to export a formatted string.
 */

class Customer
{
	private String LastName, FirstName, Address, Address2, City, State, Email;
        private String PhoneNumber, Zip;
	

	//___________Constructor_____________
	Customer()
	{
		LastName = FirstName = Address = Address2 = City = State = Email = "";
                Zip = "";
                PhoneNumber = "";
                
	} // end constructor
	
	//_______________METHODS_______________
	//gets and sets
	String getLName()
	{
		return LastName;
	}//end getLName
	void setLName(String lName)
	{
	LastName = lName;
	}//end setLName
	
	String getFName()
	{
		return FirstName;
	}//end getFName
	void setFName(String fName)
	{
		FirstName = fName;
	}//end setFName
	
	String getAddress()
	{
		return Address;
	}//end getAddress
	void setAddress(String add)
	{
	Address = add;
	}//end setAddress
	
	String getAddress2()
	{
		return Address2;
	}//end getAddress2
	void setAddress2(String add2)
	{
	Address2 = add2;
	}//end setAddress2
	
	String getCity()
	{
		return City;
	}//end getCity
	void setCity(String city)
	{
	City = city;
	}//end setCity
	
	String getState()
	{
		return State;
	}//end getState
	void setState(String state)
	{
	State = state;
	}//end setState
	
	String getEmail()
	{
		return Email;
	}//end getEmail
	void setEmail(String email)
	{
	Email = email;
	}//end setEmail
	
	String getPhone()
	{
		return PhoneNumber;
	}//end getPhone
	void setPhone(String phone)
	{
	PhoneNumber = phone;
	}//end setPhone
	
	String getZip()
	{
		return Zip;
	}//end getZip
	void setZip(String zip)
	{
	Zip = zip;
	}//end setZip
	
	//print function to return all data as a string in CSV format with a newline at the end
	String print()
	{
		String data = FirstName + "," + LastName + "," + Address + "," + Address2 + "," + 
				  City + "," + State + "," + Zip + "," + PhoneNumber + "," + Email + "\r\n";
		return data;
	}
        
	//The following method was added shortly after the rest of the class was finished,
	//without comment as to function or indication who wrote it. The comment was 
	//added at the last minute. Amy has not touched this function, even to correct the typo.
	
	// Clear all variables
        
        void ClearFields()
        {
            FirstName = "";
            LastName = "";
            Address = "";;
            Address2 = "";
            City = "";
            State = "";
            Zip = "";
            PhoneNumber = "";
            Email = "";
  
 
            
        }
	
} //end class Customer