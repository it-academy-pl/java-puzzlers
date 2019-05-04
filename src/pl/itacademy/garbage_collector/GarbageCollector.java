package pl.itacademy.garbage_collector;

/*
https://www.youtube.com/watch?v=CdAmS9H93q4
https://www.youtube.com/watch?v=XrNgF2sbhGQ
*/
public class GarbageCollector {

        public static void main(String[] args) throws InterruptedException
        {
            Runtime runtime = Runtime.getRuntime();
            long availableBytes = runtime.freeMemory();
            System.out.println("Available memory at start: " + availableBytes / 1024 + "k");

            for (int i=0; i<1000000; i++)
            {
                Student student = new Student("Student " + i);
            }

            availableBytes = runtime.freeMemory();
            System.out.println("Available memory  when students created: " + availableBytes / 1024 + "k");


            availableBytes = runtime.freeMemory();
            System.out.println("Available memory when students no longer referenced: " + availableBytes / 1024 + "k");

            Thread.sleep(1000);

            availableBytes = runtime.freeMemory();
            System.out.println("Available memory  1 second later: " + availableBytes / 1024 + "k");

            /* this is command **suggests** garbage collector to do the memory cleanup. However it
            does not guarantee that the GC will do its work.
             */
            System.gc();

            availableBytes = runtime.freeMemory();
            System.out.println("Available memory  after GC command: " + availableBytes / 1024 + "k");
        }

}
