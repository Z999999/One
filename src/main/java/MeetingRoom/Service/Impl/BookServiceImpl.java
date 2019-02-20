package MeetingRoom.Service.Impl;


import MeetingRoom.Service.BookService;
import MeetingRoom.dao.BookDao;
import MeetingRoom.dao.impl.BookDaoImpl;
import MeetingRoom.enity.Book;

import java.util.List;

/**
 * Created by LENOVO on 2019-01-15.
 */
public class BookServiceImpl implements BookService {
    BookDao bookDao=new BookDaoImpl();
    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public int add(Book book) {
        return bookDao.add(book);
    }

    @Override
    public int delete(int id) {
        return bookDao.delete(id);
    }
}
