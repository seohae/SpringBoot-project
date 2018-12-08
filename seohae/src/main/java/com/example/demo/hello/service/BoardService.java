package com.example.demo.hello.service;

import java.util.List;
import java.util.Map;

public interface BoardService {

	List<Map<String, Object>> selectBoardList() throws Exception;

}
