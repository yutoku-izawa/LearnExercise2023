

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InputDate
 */
@WebServlet("/InputDate")
public class InputDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score"));

		HttpSession session = request.getSession();

		ArrayList<String> listName = (ArrayList<String>)session.getAttribute("listNameKey");
		ArrayList<Integer> listScore = (ArrayList<Integer>)session.getAttribute("listScoreKey");

		//ArrayList<String> listName = new ArrayList<>();
		//ArrayList<Integer> listScore = new ArrayList<>();

		if(listName == null) {
			listName = new ArrayList<>();
			listScore = new ArrayList<>();
		}

		listName.add(name);
		listScore.add(score);
		//listName.add(session.setAttribute("nameKey", name));

		session.setAttribute("nameKey", name);
		session.setAttribute("scoreKey", score);

		request.getRequestDispatcher("/result.jsp").forward(request, response);



	}

	ArrayList<Result> creatResult(){
		ArrayList<Result> resultList = new ArrayList<>();

		return resultList;
	}

}
