import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int number = 0;
        List<Integer> result = new ArrayList<>();
        for(Integer i: source) {
            if (i < treshold) {
                logger.log("Элемент \"" + i + "\" не проходит");
            } else {
                logger.log("Элемент \"" + i + "\" проходит");
                result.add(i);
                number++;
            }
        }
        logger.log("Прошло фильтр " + number + " элемента из " + source.size());
        return result;
    }
}