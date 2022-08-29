package com.example.contractTest;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public abstract class BaseClass {

    @Autowired
    HatController hatController;

    @MockBean
    HatService hatService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(hatController);
        Mockito.when(hatService.findHatById(1L))
                .thenReturn(new Hat(1L, "Test Hat 1", "yellow", 10L));
        Mockito.when(hatService.findHatById(2L))
                .thenReturn(new Hat(2L, "Test Hat 2", "blue", 12L));
    }
}