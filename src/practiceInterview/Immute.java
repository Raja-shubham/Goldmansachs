package practiceInterview;

import java.util.ArrayList;
import java.util.List;

public final class Immute {
    private final String name;
    private final List<Integer> gf;

    public Immute(String name, List<Integer> gfs) {
        this.name = name;
        this.gf = new ArrayList<>();
        for(Integer i :gfs){
            gf.add(i);
        }

    }

    public String getName() {
        return name;
    }

    public List<Integer> getGf() {
        List<Integer> al = new ArrayList<>();
        for (Integer i :this.gf){
            al.add(i);
        }
        return al;
    }

}
