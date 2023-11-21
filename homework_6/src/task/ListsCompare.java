package task;

import java.util.List;

public class ListsCompare {

    public double listsAverages(List<Integer> request) {
        return request.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

    public String compareAverage(List<Integer> list1, List<Integer> list2) {
        double resultList1 = listsAverages(list1);
        double resultList2 = listsAverages(list2);

        if (resultList2 > resultList1) {
            return "Второй список имеет большее среднее значение";
        } else if (resultList2 < resultList1) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
