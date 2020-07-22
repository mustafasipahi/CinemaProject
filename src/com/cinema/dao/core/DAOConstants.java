package com.cinema.dao.core;

public class DAOConstants {

	public static class Actor_Constants {

		public static final String INSERT_ACTOR_SQL = "INSERT INTO cinema_shemas_tes.t_actor VALUES (?,?,?)";
		public static final String DELETE_ACTOR_SQL = "DELETE FROM cinema_shemas_tes.t_actor WHERE actor_id=?";
		public static final String FIND_BY_ID_ACTOR_SQL = "SELECT * FROM cinema_shemas_tes.t_actor WHERE actor_id=?";
		public static final String GET_ALL_ACTOR_SQL = "SELECT * FROM cinema_shemas_tes.t_actor";
	}

	public static class Director_Constants {

		public static final String INSERT_DIRECTOR_SQL = "INSERT INTO cinema_shemas_tes.t_directors VALUES (?,?,?)";
		public static final String DELETE_DIRECTOR_SQL = "DELETE FROM cinema_shemas_tes.t_directors WHERE actor_id=?";
		public static final String FIND_BY_ID_DIRECTOR_SQL = "SELECT * FROM cinema_shemas_tes.t_directors WHERE director_id=?";
		public static final String GET_ALL_DIRECTOR_SQL = "SELECT * FROM cinema_shemas_tes.t_directors";
	}

	public static class Movie_Constants {

		public static final String INSERT_MOVIE_SQL = "INSERT INTO cinema_shemas_tes.t_movies VALUES (?,?,?,?)";
		public static final String DELETE_MOVIE_SQL = "DELETE FROM cinema_shemas_tes.t_movies WHERE movie_id=?";
		public static final String FIND_BY_ID_MOVIE_SQL = "SELECT * FROM cinema_shemas_tes.t_movies WHERE movie_id=?";
		public static final String GET_ALL_MOVIE_SQL = "SELECT * FROM cinema_shemas_tes.t_movies";
	}

	public static class Theatre_Constants {

		public static final String INSERT_MOVIE_SQL = "INSERT INTO cinema_shemas_tes.t_theatres VALUES (?,?,?,?)";
		public static final String DELETE_MOVIE_SQL = "DELETE FROM cinema_shemas_tes.t_theatres WHERE theatre_id=?";
		public static final String FIND_BY_ID_MOVIE_SQL = "SELECT * FROM cinema_shemas_tes.t_theatres WHERE theatre_id=?";
		public static final String GET_ALL_MOVIE_SQL = "SELECT * FROM cinema_shemas_tes.t_theatres";
	}

}