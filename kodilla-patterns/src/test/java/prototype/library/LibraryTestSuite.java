package prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        Library library =new Library("Biblioteka szkolna");
        Book book1 = new Book ("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1911,10,10));
        Book book2 = new Book ("Przemineło z wiatrem", "Margaret Mitchell", LocalDate.of(1936,2,16));
        Book book3 = new Book ("Niebieski rower", "Régine Deforges", LocalDate.of(1988,7,1));
        Book book4 = new Book ("Cukiernia pod amorem", "Małgorzata Gutowska-Adamczyk", LocalDate.of(2010,4,21));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        System.out.println("Przed klonowaniem " + library);

        Library clonedLibrary=null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka szkolna - płytkie klonowanie");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary=null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka szkolna - głębokie klonowanie");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

    }

}
