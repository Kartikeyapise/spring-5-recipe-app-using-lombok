package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup(){
         category = new Category();
    }

    @Test
    public void getId() {
        Long idVal=4L;
        category.setId(idVal);
        assertEquals(idVal,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}