package com.athens.h2app;

import com.athens.h2app.repository.homeworkrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class service{

    @Autowired
        private homeworkrepo repo;

        @RequestMapping("/them")
        public List<HomeWork> getAll() {
            return (List<HomeWork>) repo.findAll();
        }

        @RequestMapping("/them/{id}")
        public HomeWork getToDo(@PathVariable int id) {
            return repo.findById(id);
        }

        @RequestMapping(method = RequestMethod.POST, value = "/them")
        public void postTodo(@RequestBody HomeWork homeWork) {
            repo.save(homeWork);
        }

        @RequestMapping(method = RequestMethod.PUT, value = "/them/{id}")
        public void putTodo(@RequestBody HomeWork homeWork, @PathVariable int id) {
            Optional<HomeWork> td= Optional.ofNullable(repo.findById(id));
            homeWork=td.get();
            repo.save(homeWork);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = ("/them/{id}"))
        public void delTodo(@PathVariable int id) {
            repo.deleteById(id);
        }
    }


