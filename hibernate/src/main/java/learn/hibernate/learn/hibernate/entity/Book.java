package learn.hibernate.learn.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="L_BOOK")
public class Book {

    @Id
    @Column(name="PERSON_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME", nullable=false, length=50)
    private String name;

    @Column(name="PRICE", nullable=false)
    private Double price;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AUTHOR_ID")
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice( Double price) {
        this.price = price;
    }

    public void setAuthor( Author author ) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", price=" + price +
                   ", author=" + author +
                   '}';
    }
}
