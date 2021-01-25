package food2door.Producers;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducers {
    private List<GetCompanyInfo> producers = new ArrayList<>();
    public void addProducer(GetCompanyInfo getCompanyInfo){
        producers.add(getCompanyInfo);
    }

    @Override
    public String toString() {
        return "ListOfProducers{" +
                "producers=" + producers +
                '}';
    }
}
