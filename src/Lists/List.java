
package Lists;



public interface List <T> {
    public T find (Object id);
    public boolean add(T t);
    public boolean remove(T t);
    public void showAll();
}