package com.moviecatlog.moviecatlogdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/")
	public String sayHi() {
		String msg= restTemplate.getForObject("http://moviecatlog-movies/movies/", String.class);
		return msg;
	}
}
