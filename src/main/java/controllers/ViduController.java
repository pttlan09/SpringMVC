package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vidu")
public class ViduController {
	@RequestMapping("/them")
	public String viDuThem(Model model) {
		model.addAttribute("tb", "Thêm sản phẩm");//request.setattribute("tb","thêm sp");
		return "vidu";								//request.getRequestDispatcher("/WEB-INF/views/vidu.jsp").forward(request,respone);
	}

	@RequestMapping("/sua")
	public String viDuSua(Model model) {
		model.addAttribute("tb", "Sửa sản phẩm");
		return "vidu";
	}

	@RequestMapping("/xoa")
	public String viDuXoa(Model model) {
		model.addAttribute("tb", "Xoa sản phẩm");
		return "vidu";
	}

	

}
