package jbehave.scenariosteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;

//import com.booking.structure.beans.HotelSearchCriteriaBean;
//import com.booking.util.JbehaveUtil;

import net.thucydides.core.annotations.Steps;
import jbehave.steps.HotelSearchPageSteps;
//import jbehave.steps.SearchResultPageSteps;

public class BookingSearchScenario {

    @Steps
    private HotelSearchPageSteps hotelSearchPageSteps;


    @Given("user has opened 'Booking.com' site")
    public void userOpenedSite() {
        hotelSearchPageSteps.openPage();
    }


}

