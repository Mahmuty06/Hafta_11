import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "bookborrowing")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "borrower_Name", nullable = false)
    private String borrower_Name;

    @Column(name = "borrowing_Date", nullable = false)
    private LocalDate borrowing_Date;

    @Column(name = "return_Date", nullable = false)
    private LocalDate return_Date;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name ="book_id")
    private Book book;

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrower_Name='" + borrower_Name + '\'' +
                ", borrowing_Date=" + borrowing_Date +
                ", return_Date=" + return_Date +
                ", book=" + book +
                '}';
    }
}
