package com.pms.controller;

import com.pms.entity.Author;
import com.pms.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class AuthorHandler {
	@Resource(name = "authorServiceImpl")
	private AuthorService authorService;

	@ResponseBody
	@RequestMapping(value = "/author/show", method = RequestMethod.POST)
	public List<Author> show(@RequestParam("paper_id") String paper_id, HttpServletRequest request) {
		List<Author> authors = authorService.findAuthorListByPaperId(paper_id);
		return authors;
	}
}
