package Mouiad.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;
    public void push(String url){
//        count = urls.length + 1;
        urls[count++] = url;
    }
    public String pop(){

        return  urls[--count];
    }
    public Iterator creatIterator(){
       return  new ListIterator(this);
    }

    public class ListIterator implements Iterator{
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public void next() {
            index++;
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public Boolean hasNext() {
            return (index < history.count);
        }
    }
}