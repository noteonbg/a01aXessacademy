package a08pagination.repository;



import a08pagination.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookRepository extends JpaRepository<Book, Long> {

    // Custom paginated query (optional filtering)
    Page<Book> findByGenre(String genre, Pageable pageable);
}

