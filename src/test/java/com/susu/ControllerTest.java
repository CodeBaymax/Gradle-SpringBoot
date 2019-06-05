package com.susu;

import com.susu.controller.SusuController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ControllerTest extends BaseTest {

    @Autowired
    private SusuController susuController;

    @Test
    public void testSuValue() {
        System.out.println(susuController.suValue());
    }
}
