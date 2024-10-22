package SingletonDesign;

import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonDesignApplication {
    public static void main(String[] args) throws Exception {

        BookMyShow bookMyShow1 = BookMyShow.getInstance();
        BookMyShow bookMyShow2 = BookMyShow.getInstance();
        if (bookMyShow1.equals(bookMyShow2))
            System.out.println("Both objects are equal " + bookMyShow1.hashCode() + ",  " + bookMyShow2.hashCode());

        //Using reflection
        //either throw an exception
//        Class<?> clazz = Class.forName("SingletonDesign.BookMyShow");
//        Constructor<?> ctor = clazz.getDeclaredConstructor();
//        ctor.setAccessible(true);
//        BookMyShow bms = (BookMyShow) ctor.newInstance();
//        System.out.println("using reflection "+bms.hashCode());


        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {
            Future<BookMyShow> future1 = executorService.submit(BookMyShow::getInstance);
            Future<BookMyShow> future2 = executorService.submit(BookMyShow::getInstance);
            Future<BookMyShow> future3 = executorService.submit(BookMyShow::getInstance);
            System.out.println("Objects with different threads");
            System.out.println(future1.get().hashCode());
            System.out.println(future2.get().hashCode());
            System.out.println(future3.get().hashCode());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
