package choice.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MovieModel
{
	private String movieName;
	private int movieAge;
	private int movieLength;
	private boolean likeOrNot;
	private ArrayList<MovieModel> movieList = new ArrayList<MovieModel>();
	
	public MovieModel()
	{
		
	}
	public MovieModel(String movieName, int movieAge, int movieLength, boolean likeOrNot, MovieModel movieList)
	{
		this.movieName = movieName;
		this.movieAge = movieAge;
		this.movieLength = movieLength;
		this.likeOrNot = likeOrNot;
		this.movieList = getMovieList();
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
	public ArrayList<MovieModel> getMovieList()
	{
		return movieList;
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
	public void setMovieList(ArrayList<MovieModel> movieList)
	{
		this.movieList = movieList;
	}
}
