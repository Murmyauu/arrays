import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statistics.services.StatsService;

public class StatsServiceTest {

    @Test
    public void testTheAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheAverageAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calcAverageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheMonthWhenMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMaxRevenue(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheMonthWhenMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMinRevenue(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthNumbersBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthNumbersAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
