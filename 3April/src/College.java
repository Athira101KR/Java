import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
	private String name, website,mobile,founder;
	private Integer numberOfDept;
	private String location; 
	private Date startingDate;
	 
	public College() {}
	
	public College(String name,String website,String mobile,String founder,Integer numberOfDept,String location,Date startingDate)
	{
		super();
		this.name=name;
		this.website=website;
		this.mobile=mobile;
		this.founder=founder;
		this.numberOfDept=numberOfDept;
		this.location=location;
		this.startingDate=startingDate;		
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		name=this.name;
	}
	public String getWebsite()
	{
		return website;
	}
	public void setWebsite(String website)
	{
		website=this.website;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		mobile=this.mobile;
	}
	public String getFounder()
	{
		return founder;
	}
	public void setFounder(String founder)
	{
		founder=this.founder;
	}
	public Integer getNumberOfdept()
	{
		return numberOfDept;
	}
	public void setNumberOfdept(Integer numberOfDept)
	{
		numberOfDept=this.numberOfDept;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		location=this.location;
	}
	public Date getStartingDate()
	{
		return startingDate;
	}
	public void setStartingDate(Date startingDate)
	{
		startingDate=this.startingDate;
	}
	
	public static College createCollege(String detail) throws ParseException
	{
		College college=new College();
		String[] array=detail.split(" ");
		college.setName(array[0]);
		college.setWebsite(array[1]);
		college.setMobile(array[2]);
		college.setFounder(array[3]);
		college.setNumberOfdept(Integer.parseInt(array[4]));
		college.setLocation(array[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college.setStartingDate(sdf.parse(array[6]));
		return college;
	}
}
