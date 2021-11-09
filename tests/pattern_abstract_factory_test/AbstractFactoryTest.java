package abstract_factory_test;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void iranian_garden_test() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        Client client = new Client(iranianGardenCreator);
        client.plantTree();
        client.plantFlower();
        Assert.assertEquals(FlowerType.Khatmi, client.getFlowerType());
        Assert.assertEquals(TreeType.Chenar, client.getTreeType());
    }

    @Test
    public void japanese_garden_test() {
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
        Client client = new Client(japaneseGardenCreator);
        client.plantTree();
        client.plantFlower();
        Assert.assertEquals(FlowerType.Tsubaki, client.getFlowerType());
        Assert.assertEquals(TreeType.Lilac, client.getTreeType());
    }
}
