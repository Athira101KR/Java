import java.text.SimpleDateFormat;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;
	
	public University() {}
	
	public University(String name, List<College>collegeList) 
	{
		super();
		this.name=name;
		this.collegeList=collegeList;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		name=this.name;
	}
	public List getCollegeList()
	{
		return collegeList;
	}
	public void setCollegeList(List collegeList)
	{
		collegeList=this.collegeList;
	}
//adds the college to the college list
	public void addCollegeToUniversity(College college)
	{
		collegeList.add(college);
	}
	
	public Boolean removeCollege(String name)
	{
		College college=null;
		for(int i=0;i<collegeList.size();i++)
		{
			College c=collegeList.get(i);
			if(c.getName().equals(name))
			{
				college=c;
				break;
			}
		}
		return collegeList.remove(college);
	}
	
	public void displayColleges()
	{
		SimpleDateFormat spf=new SimpleDateFormat();
		for(int i=0;i<collegeList.size();i++)
		{
			College c=collegeList.get(i);
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfdept(),c.getLocation(),spf.format(c.getStartingDate()));
		}
	}
}
