package io.anonym.silent.cucumber.stepdefs;

import io.anonym.silent.SampleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
