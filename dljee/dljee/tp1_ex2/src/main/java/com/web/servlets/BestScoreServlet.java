package com.web.servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.bo.Utilisateur;
import com.web.helpers.DataManagementFactory;
import com.web.helpers.GameContextManagement;
import com.web.helpers.IGameDataManagement;

public class BestScoreServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		IGameDataManagement contextGame = (IGameDataManagement) getServletContext().getAttribute("gameData");

		
		List<Utilisateur> users = contextGame.getAllUsers();
		request.setAttribute("users", users);
		getServletContext().getRequestDispatcher("/WEB-INF/vues/back/bestScore.jsp").forward(request, response);

	}

}
