package assignment.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/assignmentfeature/",glue="week6day1.assignmentsteps",monochrome=true,publish=true)
public class NewCucumber extends AssignmentCucumberRunner{

}



