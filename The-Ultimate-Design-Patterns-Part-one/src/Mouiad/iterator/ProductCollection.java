package Mouiad.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> productList = new ArrayList<>();

    public void push(Product product){
        productList.add(product);

    }
    public Product pop(){
        var lastIndex = productList.size()-1;
        var lastProduct = productList.get(lastIndex);
        productList.remove(lastProduct);
        return lastProduct;
    }
    public Iterator creatIterator(){
        return  new ProduectListCollection(this);
    }
    public class ProduectListCollection implements Iterator{
        private ProductCollection productCollection;
        private int index;

        public ProduectListCollection(ProductCollection productCollection){
            this.productCollection = productCollection;
        }
        @Override
        public void next() {
            index++;
        }

        @Override
        public Object current() {
            return productCollection.productList.get(index);
        }

        @Override
        public Boolean hasNext() {
            return (index < productCollection.productList.size());
        }
    }
}
