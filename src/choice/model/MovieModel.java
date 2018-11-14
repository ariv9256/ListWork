package choice.model;

public class MovieModel
{
	private String movieName;
	private int movieAge;
	private int movieLength;
	private boolean likeOrNot;
	
	
	public MovieModel()
	{
		
	}
	public MovieModel(String movieName, int movieAge, int movieLength, boolean likeOrNot)
	{
		this.movieName = movieName;
		this.movieAge = movieAge;
		this.movieLength = movieLength;
		this.likeOrNot = likeOrNot;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public int getMovieAge()
	{
		return movieAge;
	}
	public int getMovieLength()
	{
		return movieLength;
	}
	public boolean getLikeOrNot()
	{
		return likeOrNot;
	}
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}
	public void setMovieAge(int movieAge)
	{
		this.movieAge = movieAge;
	}
	public void setMovieLength(int movieLength)
	{
		this.movieLength = movieLength;
	}
	public void setLikeOrNot(boolean likeOrNot)
	{
		this.likeOrNot = likeOrNot;
	}
}
