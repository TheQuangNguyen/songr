package com.code401.songr;

import com.code401.songr.models.Album;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    // make sure that my testing is set up properly
    @Test
    public void contextLoads() {}

    // Test if the hello world route is working properly
    @Test
    public void testHelloWorldRoute() throws Exception {
        this.mockMvc.perform(get("/hello")).andDo(print())
                .andExpect(view().name("hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("<h1 id=\"catchphrase\">Hello <span>User</span></h1>")));
    }


}
