package learn.hibernate.learn.hibernate.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="L_AUTHOR")
public class Author {

    @Id
    @Column(name="AUTHOR_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME", nullable=false)
    private String name;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="author")
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public void setBooks( List<Book> books ) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                   "id=" + id +
                   ", books=" + books +
                   '}';
    }
}
