package com.iu.s1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.board.BoardVO;

@Controller
@RequestMapping(value = "/board/**")// /board/test/boardWrite
public class BoardController {
	//value는 무조건 절대경로
	//boardList메서드명 board/boardList
	//RequestMapping의 value가 return되는 경로와 같다면 returnX, void
	//return을 Model타입인 경우도 RequestMapping의 경로로
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public Model boardList(Model model) {
		String result = "Change";
		String result2 = "Another Data";
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("title");
		model.addAttribute("result", result);
		model.addAttribute(boardVO);
		return model;
	}
	
	@RequestMapping(value = "boardWrite", method = RequestMethod.POST)
	public String boardWrite2(BoardVO boardVO) {
		System.out.println("num : "+boardVO.getNum());
		System.out.println("title : "+boardVO.getTitle());
		System.out.println("writer : "+boardVO.getWriter());
		System.out.println("contents : "+boardVO.getContents());
		System.out.println("hit : "+boardVO.getHit());
		return "redirect:../";
	}
	
	@RequestMapping(value = "boardWrite", method = RequestMethod.GET)
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping(value = "boardSelect", method = RequestMethod.GET)
	public ModelAndView boardSelect(int num, ModelAndView mv) {
		//파라미터의 이름이 num인 것을 맵핑
		System.out.println("num : "+num);
		mv.addObject("num", num);
		mv.setViewName("board/boardSelect");
		return mv;
	}
}