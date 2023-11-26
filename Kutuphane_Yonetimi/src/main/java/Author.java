import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "author")
@AllArgsConstructor //PARAMETRELİ KONSTRAKTIR
@NoArgsConstructor  //PARAMETRESİZ KONSTRAKTIR
@Getter
@Setter

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_Date", nullable = false)
    private LocalDate birth_Date;

    @Column(name = "country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "author",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List <Book> bookList;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth_Date=" + birth_Date +
                ", country='" + country + '\'' +
               // ", bookList=" + bookList +
                '}';
    }
}
