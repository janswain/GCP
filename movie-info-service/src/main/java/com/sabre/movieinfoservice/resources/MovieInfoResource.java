package com.sabre.movieinfoservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabre.movieinfoservice.model.resources.Project;

@RestController
@RequestMapping("/projects")
public class MovieInfoResource {

	@RequestMapping("/{project}")
	public List<Project> getMovieInfo(@PathVariable("project") String project) {

		List<Project> projects = new ArrayList<>();
		projects.add(new Project("1111", "GetThere"));
		projects.add(new Project("34555", "UDUT"));
		projects.add(new Project("87897", "AirExtra"));
		projects.add(new Project("1111", "GetThere"));
		return projects;
	}
}
