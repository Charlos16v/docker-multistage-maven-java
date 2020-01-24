package edu.elsmancs.gildedrose;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Item;
import edu.elsmancs.gildedrose.domain.NormalItem;


public class AppTest {

    @Test
    public void crearItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("10", item.getSell_in().toString());
        assertEquals("20", item.getQuality().toString());
    }

    @Test
    public void crearNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals("10", normal.getSell_in().toString());
        assertEquals("20", normal.getQuality().toString());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);

        normal.updateQuality();
        assertEquals(9, normal.getSell_in().intValue());
        assertEquals(19, normal.getQuality().intValue());
    }

    @Test
    public void updateQualityNormalItemSellInCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 0, 20);
        normal.updateQuality();
        assertEquals(-1, normal.getSell_in().intValue());
        assertEquals(18, normal.getQuality().intValue());    
    }

    @Test
    public void updateQualityNormalItemBajoCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 0);
        normal.updateQuality();
        assertEquals(9, normal.getSell_in().intValue());
        assertEquals(0, normal.getQuality().intValue());
    }
}
