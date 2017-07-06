package com.openhr.org.web.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openhr.org.util.ImageUtil;

@Controller
@RequestMapping("/hrbp/org")
public class OrgController {
	
	@RequestMapping("/getImg")
    public void getImg(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
		 //利用图片工具生成图片  
	    //第一个参数是生成的验证码，第二个参数是生成的图片  
	    Object[] objs = ImageUtil.createImage();  
	    //将图片输出给浏览器  
	    BufferedImage image = (BufferedImage) objs[1];  
	    response.setContentType("image/png");  
	    OutputStream os = response.getOutputStream();  
	    ImageIO.write(image, "png", os);  
    }
}
