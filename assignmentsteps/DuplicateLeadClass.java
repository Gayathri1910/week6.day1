package week6day1.assignmentsteps;

import org.openqa.selenium.By;

import assignment.runner.AssignmentCucumberRunner;
import io.cucumber.java.en.Then;

public class DuplicateLeadClass extends AssignmentCucumberRunner{

	@Then("Click on duplicare lead")
	public void duplicatelead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
}
