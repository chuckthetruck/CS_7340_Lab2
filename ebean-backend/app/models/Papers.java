package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
public class Papers {

    @Id
    public Long paper_id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String book_title;

    @Constraints.Required
    public String pages;

    @Constraints.Required
    public String year;

    @Constraints.Required
    public String url;

    @Constraints.Required
    public String ee;

    @Constraints.Required
    public String publisher;

    @Constraints.Required
    public String journal;

    @Constraints.Required
    public String volume;

    @Constraints.Required
    public String number;

    @Constraints.Required
    public String crossref;

    @Constraints.Required
    public String isbn;

    @ManyToMany
    @JoinTable(name="paperstoauthors",
            joinColumns=@JoinColumn(name="paper_id",referencedColumnName = "paper_id"),
            inverseJoinColumns = @JoinColumn(name="author_id", referencedColumnName="author_id"))
    public List<Authors> authors;

    public static Model.Find<Long, Papers> find = new Model.Find<Long, Papers>(){};

    public static Papers findByName(String name) {

        Papers paper = Papers.find
                        .where()
                        .eq("title", name)
                        .findUnique();

        System.out.println(paper.authors.get(0).author_name);

        return paper;
    }


}
