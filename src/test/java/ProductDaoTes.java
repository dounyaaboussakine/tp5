import metier.ProductDaoImpl;
import entities.Product;
import entities.Category;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductDaoTest {

    private ProductDaoImpl productDao;

    @BeforeEach
    void setUp() {
        productDao = new ProductDaoImpl();
    }

    @Test
    void testAddProduct() {
        Category c = new Category("Informatique");
        Product p = new Product();
        p.setName("Laptop");
        p.setPrice(9000.0);
        p.setCategory(c);

        productDao.save(p);
        assertNotNull(p.getId());
    }
}
