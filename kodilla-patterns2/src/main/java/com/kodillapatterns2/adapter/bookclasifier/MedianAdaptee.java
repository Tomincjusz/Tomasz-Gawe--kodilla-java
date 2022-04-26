package com.kodillapatterns2.adapter.bookclasifier;

import com.kodillapatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodillapatterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodillapatterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
