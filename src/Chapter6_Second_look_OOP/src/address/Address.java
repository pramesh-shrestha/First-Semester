package address;

public class Address
{
  private String street;
  private String number;
  private String postalCode;
  private String city;
  private String country;

  //5 args constructor
  public Address(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  //set methods
  public void setAddress(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  //get methods
  public String getStreet()
  {
    return street;
  }
  public String getNumber()
  {
    return number;
  }
  public String getPostalCode()
  {
    return postalCode;
  }
  public String getCity()
  {
    return city;
  }
  public String getCountry()
  {
    return country;
  }

  //set methods
  public void setStreet(String st)
  {
    street = st;
  }
  public void setNumber(String no)
  {
    number = no;
  }
  public void setPostalCode(String pc)
  {
    postalCode = pc;
  }
  public void setCity(String ci)
  {
    city = ci;
  }
  public void setCountry(String co)
  {
    country = co;
  }

  //toString() method
  public String toString()
  {
    return "Street: " + street + " Number: " + number + " Postal: " + postalCode +
        " City: " + city + " Country: " + country;
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Address))
    {
      return false;
    }
    Address other = (Address) obj;
    return street.equals(other.street) && number.equals(other.number) &&
        postalCode.equals(other.postalCode) && city.equals(other.city) &&
        country.equals(other.country);
  }
}
