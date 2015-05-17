package ro.selectors;

import org.openqa.selenium.By;

/**
 * Created by Istvan on 06.04.2015.
 */
public interface CategoriesSelectors {
    By categories = By.cssSelector("nav#bottommenu > ul > li");
    By categoryTitle = By.tagName("a");
    By subCategories = By.cssSelector("div table tbody tr td a");
}
