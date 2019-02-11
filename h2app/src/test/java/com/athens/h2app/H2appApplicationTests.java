package com.athens.h2app;

import com.athens.h2app.repository.homeworkrepo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class H2appApplicationTests{

    /*@Test
    public void contextLoads() {
*/
        @Autowired
        private homeworkrepo repo;
        @Mock
        service sr;
        @Rule
        public MockitoRule mockitoRule = MockitoJUnit.rule();

        @Test
        public void getAllTest() {
            when(sr.getAll()).thenReturn((List<HomeWork>) repo.findAll());
        }

        @Test
        public void getIdTest() {
            when(sr.getToDo(1)).thenReturn((repo.findById(1)));
        }

        @Test
        public void delTest() {

    }}




