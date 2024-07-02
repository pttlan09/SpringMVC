package controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import businessLogics.LoaiSuaBL;
import javaBeans.LoaiSua;


@Controller
@RequestMapping
public class LoaiSuaController {
	@RequestMapping(path="/them-loai-sua",method=RequestMethod.GET)
	public String them()
	{
		return "them-loai-sua";
		
	}
	@RequestMapping(path="/them-loai-sua",method=RequestMethod.POST)
	public String them(HttpServletRequest request) throws SQLException {
		String ml,tl;
		ml=request.getParameter("maLoai");
		tl=request.getParameter("tenLoai");
		
		LoaiSua ls= new LoaiSua();
		ls.setMaLoai(ml);
		ls.setTenLoai(tl);
		LoaiSuaBL.themLoaiSua(ls);
		
		return "them-loai-sua";
	}

}
