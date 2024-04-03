package stream_apı.intermediate_example_OPTIONAL_map_filter_sorted_orElse;

import java.util.List;
import java.util.Optional;

public class IntermediateExample08 {
    public static void main(String[] args) {

        List<Match>matchList=List.of(new Match("Football",11),
                new Match("Basketball",7),
                new Match("Soccer",7),
                new Match("Tennis",2));


        /*
        String ifadelerle çalışırken dikkat et null olabilir mi diye
        .filter(name->name.endsWith("asdf")) --> listede olmayan bişey verildi (asdf) null olacağı için Optional Wrapper kullanmalıyız
        böylece hata vermicek.zaten altını çizer bu Optional diye!!!!
         */
        Optional<String>matchName=matchList.stream()
                .map(Match->Match.getName())
                //.map(Match::getName)
                .filter(name->name.endsWith("asd")) //eğer burada listede olmayan bişey verilseydi null olabilirdi!!!!
                .sorted()
                .findFirst();

        System.out.println("result : "+matchName.orElse("match not found!"));

    }
}
