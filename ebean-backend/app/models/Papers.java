package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlRow;
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

        return paper;
    }

    public static List<SqlRow> findByJournal(String title, String volume, String issue){

        String sql = "select * from papers where journal = '" + title + "' and  volume = "+ volume +" and number =" + issue +";";
        System.out.println(sql);

        List<SqlRow> papers = Ebean.createSqlQuery(sql).findList();

        return papers;
    }

    public static List<SqlRow> findByAuthorYear(String name, String year){
        String sql = "SELECT title, book_title, pages, year, url, ee, publisher, journal, volume, number, crossref, isbn  FROM papers p inner join paperstoauthors pa on p.paper_id = pa.paper_id inner join authors a on pa.author_id = a.author_id where a.author_name = '" + name + "' and p.year =" + year + ";";
        System.out.println(sql);

        List<SqlRow> papers = Ebean.createSqlQuery(sql).findList();

        return papers;
    }

    public static List<SqlRow> productiveAuthors(){

        String sql = "select author_name, count(author_name) as count from authors a inner join paperstoauthors pa on pa.author_id = a.author_id group by a.author_name having count(author_name) >= 10 order by count(author_name) desc;";
        System.out.println(sql);

        List<SqlRow> prodAuth = Ebean.createSqlQuery(sql).findList();

        return prodAuth;

    }

}
