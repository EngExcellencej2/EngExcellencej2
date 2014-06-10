import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;





class Ano
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	
	
}


public class ListChk {
	
	private List<Ano> getCountiesForZip(String zipCode)
	  {
	    List<Ano> list = new ArrayList<Ano>();
	    if (zipCode == null || zipCode.length() == 0)
	    {
	      return list;
	    }
//	    Ano[] countyData = locationProcess.getCountiesForZip(zipCode);
	    for (int i = 0; i < countyData.length; i++)
	    {
	      list.add(countyData[i]);
	    }
	    return list;
	  }
	
	public static void main(String args[])
	{
		Ano ano = new Ano();
		List ls = ano.getAge();
	}

	
	public Ano[] getCountiesForZip(String zipCode)
	{
	//  ZipData[] zipData = findZipData(zipCode);
	  Set <Long> countyIds = new HashSet <Long>();
	//  for(int i = 0; i < zipData.length; i++)
	//  {
//	    countyIds.add(new Long(zipData[i].getCountyID()));
	//  }
	  Ano[] result;
	//  try
	//  {
//	    result = location.getCounty(toLongArray(countyIds), applicationContext);
	//  }
	//  catch(CountyNotFoundException e)
	//  {
//	    throw new UnexpectedProcessException(e.getMessage(), e);
	//  }
	//  catch(LocationException e)
	//  {
//	    throw new UnexpectedProcessException(e.getMessage(), e);
	//  }
	  
	  return result;
	}
}
