package com.example.demo.hello.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hello.mapper.BoardMapper;
import com.example.demo.hello.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<Map<String, Object>> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}
	
	
}
