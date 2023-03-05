package com.hwkim.mvc02;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/today_lotto")
	public String today_lotto(Model model) {
		//�ζ�
		HashSet<Integer> hs = new HashSet<Integer>();
	    while(hs.size()<6){
	       int r = (int)(Math.random()*45+1);
	       hs.add(r);
	    }
	    ArrayList<Integer> nums = new ArrayList<Integer>(hs);
	    model.addAttribute("lottos", nums);
	      
	      
		//��ȯ���� suffix�� prefix�� �ٿ� ���� jsp��ο� ���ϸ��� �����ȴ�.
		return "today_lotto";
	}
}
