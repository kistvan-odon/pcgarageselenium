package ro.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.selectors.CategoriesSelectors;

public class HomePage extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    private Categories categories = new Categories(getDriver());

    public void selectCategory(String... titles) {
        categories.selectCategory(CategoriesSelectors.categories, CategoriesSelectors.categoryTitle, CategoriesSelectors
                .subCategories, titles);
    }
}