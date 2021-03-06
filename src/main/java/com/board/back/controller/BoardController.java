package com.board.back.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.back.model.Board;
import com.board.back.service.BoardService;
@CrossOrigin(origins = "http://board-app-bucket-1.s3-website-us-east-1.amazonaws.com")
@RestController
@RequestMapping("/api")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	// get all board 
	@GetMapping("/board")
	public List<Board> getAllBoards() {
		
		return boardService.getAllBoard();
	}
	
	@GetMapping("/test")
	public String testMethod() {
		
		return "test~!~!";
	}

	@GetMapping("/test2")
	public List<String> testMethod2() {
		List<String> list = new ArrayList<String>();
		list.add("가~");
		list.add("나~");
		list.add("다~");
		return list;
	}
	
}