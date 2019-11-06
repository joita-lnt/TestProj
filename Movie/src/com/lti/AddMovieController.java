package com.lti;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddUserController
 */
@WebServlet("/AddMovieController")
public class AddMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(request.getParameter("id"));
		String movie_name=request.getParameter("movie_name");
		String actor=request.getParameter("actor");
		String actress=request.getParameter("actress");
		int collection=Integer.parseInt(request.getParameter("collection"));
		String director=request.getParameter("director");
		String date_of_release=request.getParameter("date_of_release");
		
		Movie m=new Movie();
		m.setId(id);
		m.setMovie_name(movie_name);
		m.setActor(actor);
		m.setActress(actress);
		m.setDirector(director);
		m.setCollection(collection);
		m.setDate_of_release(date_of_release);
		
		MovieDAO movieDao=new MovieDAO();
		String result=movieDao.addMovie(m);
		
		if(result.equals(Results.SUCCESS))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/userSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
