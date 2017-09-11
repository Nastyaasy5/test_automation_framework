package jbehave.steps;

import org.apache.commons.lang.StringUtils;

import com.booking.structure.beans.HotelSearchCriteriaBean;
import com.booking.structure.core.pages.HotelsSearchPage;
import com.booking.util.WebDriverUtil;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HotelSearchPageSteps extends ScenarioSteps {

    private HotelsSearchPage hotelsSearchPage;

    private final static String DATE_SEPARATOR = ",";

    public HotelSearchPageSteps(final Pages pages) {
        super(pages);
        hotelsSearchPage = getPages().getPage(HotelsSearchPage.class);
    }

    @Step
    public void openPage() {
        hotelsSearchPage.openAt("https://www.booking.com");
    }

}
