package kr.co.mboard;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import kr.co.mboard.dao.Dao;
import kr.co.mboard.dto.Dto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	public SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("/write_ok")
	public String write_ok(Dto dto) {
		Dao dao = sqlSession.getMapper(Dao.class);
		dao.write(dto.getName(), dto.getTitle(), dto.getContent());
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		Dao dao = sqlSession.getMapper(Dao.class);
		ArrayList<Dto> list = dao.list();
		model.addAttribute("list", list);
		return "/list";
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request, Model model) {
		Dao dao = sqlSession.getMapper(Dao.class);
		Dto dto = dao.content(request.getParameter("id"));
		model.addAttribute("dto", dto);
		return "/content";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		Dao dao = sqlSession.getMapper(Dao.class);
		dao.delete(request.getParameter("id"));
		return "reirect:/list";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request, Model model) {
		Dao dao = sqlSession.getMapper(Dao.class);
		Dto dto = dao.update(request.getParameter("id"));
		model.addAttribute("dto", dto);
		return "/update";
	}
	
	@RequestMapping("/update_ok")
	public String update_ok(Dto dto) {
		Dao dao = sqlSession.getMapper(Dao.class);
		dao.update_ok(dto.getName(), dto.getTitle(), dto.getContent(), dto.getId());
		return "redirect:/content?id="+dto.getId();
	}
}
