package PaginationHelper;

import java.util.ArrayList;
import java.util.List;

class PaginationHelper<I> {
    List<I> items = new ArrayList<I>();
    int n;

    PaginationHelper(List<I> collection, int itemsPerPage) {
        items = collection;
        n = itemsPerPage;
    }

    int itemCount() {
        return items.size();
    }

    int pageCount() {
        return (items.size() % n > 0) ? items.size() / n + 1 : items.size() / n;
    }

    int pageItemCount(int pageIndex) {
        if (pageCount() < pageIndex + 1)
            return -1;
        else return (pageCount() > pageIndex + 1) ? n : items.size() % n;
    }

    int pageIndex(int itemIndex) {
        if (items.size() <= itemIndex || itemIndex < 0)
            return -1;
        else return (itemIndex % n >= 0) ? itemIndex / n : itemIndex / n - 1;
    }
}