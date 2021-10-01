package models;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Authors{

    @Id
    public Long author_id;

    @Constraints.Required
    public String author_name;

    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    public List<Papers> papers;

    public static Model.Find<Long, Authors> find = new Model.Find<Long, Authors>(){};

    public static Authors findByName(String name) {

        return Authors.find
                .where()
                .eq("author_name", name)
                .findUnique();
    }

}
