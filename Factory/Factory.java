import java.util.*;

public class Factory {

    public Toy create(String title) throws NoSuchToyException{

        if (title.equalsIgnoreCase("teddy")) {
            return new TeddyBear(title);
        } else if (title.equalsIgnoreCase("gameboy")) {
            return new Gameboy(title);
        } else {
            throw new NoSuchToyException("No such toy : " + title);
        }

    }

    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> papers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }

}
