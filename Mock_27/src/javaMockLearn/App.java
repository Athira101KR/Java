package javaMockLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Artist> allArtist=Artist.prefill();
		System.out.println("Enter the number of songs:");
		int noOfSongs=sc.nextInt();
		for(int i=0;i<noOfSongs;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				 detail=sc.nextLine();
			String arr[]=detail.split(",");
			
			Song song=new Song();
			song.setTitle(arr[0]);
			song.setGenre(arr[1]);
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
			song.setDuration(sdf.parse(arr[2]));
			song.setRating(Double.parseDouble(arr[3]));
			String[] artistArray=arr[4].split("-");
			List<Artist> artistList=new ArrayList<>();
			
			for(String a:artistArray)
			{
				for(Artist ar:allArtist)
				{
					if(ar.getName().equals(a))
					{
						ar.getSongList().add(song);
						artistList.add(ar);
					}
				}
			}
			song.setArtistList(artistList);
			List<Song> songList=new ArrayList<>();
			songList.add(song);
			
		}
		System.out.println("Enter the gender of singer:");
		String gender=sc.next();
		Artist result=Artist.bestSinger(gender,allArtist);
		System.out.println("The best "+gender+" singer is "+result.getName());
	}

}
