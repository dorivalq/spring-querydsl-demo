package hellocucumber;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerRepository;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddUserStep {

    @Autowired
    CustomerRepository repository;
    private List<Customer> list;

    @Given("I have a user name {string} sure name {string}")
    public void i_have_a_user_name_sure_name(String firstName, String lastName) {
        repository.save(new Customer(firstName, lastName));

    }

    @When("I search for user id {int}")
    public void i_search_for_user_id(Integer int1) {
       this.list =  repository.findAll();
    }

    @Then("I should have a user firt name {string}")
    public void i_should_have_a_user_firt_name(String string) {
        Assert.assertFalse(list.isEmpty());
        Assert.assertFalse(list.get(0).getFirstName().equals(string));
    }

}
