package exercise3;
import java.util.Scanner;

abstract class Item{
	protected String identificationNumber;
	protected String title;
	protected int numberOfCopies;
	
	public abstract String getIdentificationNumber();
	public abstract void setIdentificationNumber(String identificationNumber);
	public abstract String getTitle();
	public abstract void setTitle(String title);
	public abstract int getNumberOfCopies();
	public abstract void setNumberOfCopies(int numberOfCopies);
	
	public void  checkIn(int checkInCount) {
		numberOfCopies+=checkInCount; 
	}
	
	public void checkOut(int checkOutCount) {
		numberOfCopies-=checkOutCount;
	}
	
	public Item(String identificationNumber, String title, int numberOfCopies) {
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

}

abstract class WrittenItem extends Item{
	
	public WrittenItem(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	
	protected String authorName;
	protected int authorAge;
	protected String auothorLocation;
	
	public  abstract String getAuthorName();
	public abstract void setAuthorName(String authorName);
	public abstract int getAuthorAge();
	public abstract void setAuthorAge(int authorAge);
	public abstract String getAuotherLocation();
	public abstract void setAuotherLocation(String auotherLocation);
	
	public WrittenItem(String authorName,int authorAge,String auotherLocation) {
		super(authorName, auotherLocation, authorAge);
		this.authorName = authorName;
		this.authorAge = authorAge;
		this.auothorLocation = auotherLocation;
	}
	
}


class Book extends WrittenItem {
	
	public Book(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	@Override
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	@Override
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public String getAuthorName() {
		return authorName;
	}
	@Override
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public int getAuthorAge() {
		return authorAge;
	}
	@Override
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	@Override
	public String getAuotherLocation() {
		return auothorLocation;
	}
	@Override
	public void setAuotherLocation(String auotherLocation) {
		this.auothorLocation = auotherLocation;
	}
	
	
}

class JournalPaper extends WrittenItem{
	
	public JournalPaper(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	@Override
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	@Override
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public String getAuthorName() {
		return authorName;
	}
	@Override
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public int getAuthorAge() {
		return authorAge;
	}
	@Override
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	@Override
	public String getAuotherLocation() {
		return auothorLocation;
	}
	@Override
	public void setAuotherLocation(String auotherLocation) {
		this.auothorLocation = auotherLocation;
	}

}

abstract class MediaItem{
	
	protected int runTime;

	public abstract int getRunTime();
	public abstract void setRunTime(int runTime);
	
}

class Video extends MediaItem{

	private String directorName;
	private String genre;
	private String year;
	
	
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public int getRunTime() {
		return runTime;
	}
	@Override
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}	
	
}

class Cd extends MediaItem {
	
	private String artistName;
	private String artistGenre;
	
	public Cd(String artistName,String artistGenre) {
		this.artistName = artistName;
		this.artistGenre = artistGenre;
	}
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistGenre() {
		return artistGenre;
	}
	public void setArtistGenre(String artistGenre) {
		this.artistGenre = artistGenre;
	}
	@Override
	public int getRunTime() {
		return runTime;
	}
	@Override
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}	
}




public class Library {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Title of book");
		String title = sc.nextLine();
		System.out.println("Enter Unique Identification Number of book");
		String identificationNumber = sc.next();
		System.out.println("Enter No of Copies of book");
		int numberOfCopies = sc.nextInt();
		System.out.println("--------------------------------------------------------");
		
		Book obj = new Book(identificationNumber, title, numberOfCopies  );
		System.out.println("Identification Number : "+obj.getIdentificationNumber());
		System.out.println("Book Title : "+obj.getTitle());
		System.out.println("No of Copies : "+obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Enter no of books to Check Out");
		int checkOutCount = sc.nextInt();
		obj.checkOut(checkOutCount);
		System.out.println("No of books after Check Out : "+obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Enter no of books for Check In ");
		int checkInCount = sc.nextInt();
		obj.checkIn(checkInCount);
		System.out.println("No of book copies after Check In : "+obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Enter Author Name : ");
		String authorName = sc.next();
		System.out.println("Enter Author Age : ");
		int authorAge = sc.nextInt();
		System.out.println("Enter Author Location : ");
		String authorLocation = sc.next();
		
		obj.setAuthorName(authorName);
		obj.setAuthorAge(authorAge);
		obj.setAuotherLocation(authorLocation);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Author Name : "+obj.getAuthorName());
		System.out.println("Author Age : "+obj.getAuthorAge());
		System.out.println("Author Location : "+obj.getAuotherLocation());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Enter the Run Time of Video in Hours");
		int runTime = sc.nextInt();
		Video obj1 = new Video();
		System.out.println("Enter Director Name : ");
		String directorName = sc.next();
		System.out.println("Enter Video Genre : ");
		String genre = sc.next();
		System.out.println("Enter Video Realise Year : ");
		String year = sc.next();
		System.out.println("--------------------------------------------------------");
		
		obj1.setRunTime(runTime);
		obj1.setDirectorName(directorName);
		obj1.setGenre(genre);
		obj1.setYear(year);
		
		System.out.println("Video Run Time : "+obj1.getRunTime());
		System.out.println("Video Director Name: "+obj1.getDirectorName());
		System.out.println("Video Run Time : "+obj1.getGenre());
		System.out.println("Video Run Time : "+obj1.getYear());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Enter Artist Name : ");
		String artistName = sc.next();
		System.out.println("Enter Artist Genre : ");
		String artistGenre = sc.next();
		System.out.println("--------------------------------------------------------");
		
		Cd obj2 = new Cd(artistName,artistGenre);
		System.out.println("Artist Name : "+obj2.getArtistName());
		System.out.println("Artist Genre : "+obj2.getArtistGenre());
		
	}

}







