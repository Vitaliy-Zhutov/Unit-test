package task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListsCompareTest {
    ListsCompare listsCompare;

    private final List<Integer> list_1 = Arrays.asList(8,4,33,15,3);
    private final List<Integer> list_2 = Arrays.asList(1,7,14,77,5);
    private final List<Integer> list_0 = new ArrayList<>();

    @BeforeEach
    void setUp() {
        listsCompare = new ListsCompare();
    }

    // Unit test
    @Test
    void UTestAverageWithValues(){
        assertEquals(listsCompare.listsAverages(list_1), 12.6);
    }

    // Unit test null
    @Test
    void UTestAverageNull(){
        assertEquals(listsCompare.listsAverages(list_0), 0.0);
    }

    // Integration Test
    @Test
    void ITestCompareAverageNone(){
        assertEquals(listsCompare.compareAverage(list_1, list_1), "Средние значения равны");
    }

    // Integration Test
    @Test
    void ITestCompareAverageOne(){
        assertEquals(listsCompare.compareAverage(list_2, list_1), "Первый список имеет большее среднее значение");
    }

    // Integration Test
    @Test
    void ITestCompareAverageTwo(){
        assertEquals(listsCompare.compareAverage(list_1, list_2), "Второй список имеет большее среднее значение");
    }


}