package controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		 return "home";//-->viewResolver-->prefix+"home"-->suffix =
		// /WEB-INF/views/home.jsp

		//return "index";// tên định nghĩa trong tiles.xml
	}
//
//@RequestMapping(path="/upload-file", method=RequestMethod.GET)
//public String uploadFile() {
//    return "uploadFile";//tên đinh nghĩa trong tils.xml
//}
//
//@RequestMapping(path="/upload-file", method=RequestMethod.POST)
//public String uploadFile(HttpServletRequest request,@RequestParam(name)) {
//   String tt=part.ge
//String tm=request.getServletContext().getRealPath("/img/");
//   try {
//	   OutputStream os=new FileOutputStream(tm+tt);
//	   byte[] mb=part.getBytes();
//	   os.write(mb);
//	   os.close();
//   }catch (IOException e) {
//	// TODO: handle exception
//	   e.printStackTrace();
//}
//   model().addAttribute("tapTin",tt);
//	
//	return "redirect:/upload-file";//tên đinh nghĩa trong tils.xml
//}


}
