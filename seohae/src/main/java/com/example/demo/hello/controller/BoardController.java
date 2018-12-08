package com.example.demo.hello.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.hello.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("")
	public String boardList(Model model) throws Exception {
		List<Map<String, Object>> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		System.out.println(list + "##################");
		return "board/boardList";
	}
}
