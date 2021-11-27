class Thread_q01 extends Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread("Scooby") {
            public void run() {
                System.out.println("I'm " + Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread("Shaggy") {
            public void run() {
                System.out.println("I'm " + Thread.currentThread().getName());
            }
        };

        t1.start();
        t2.start();
    }
}

                                                   //SECOND WAY//


//    String thread_name;
//    Thread_q01(String thread_name) {
//        this.thread_name = thread_name;
//    }
//
//    public void run() {                                                       //thread 2
//        System.out.println("The name of thread second: "+thread_name);         // printing 1st thread name
//    }
//}
//class test {
//    public static void main(String[] args) {                                 //thread 1
//
//        String  thread_name02 = "Scooby";
//        Thread_q01 obj = new Thread_q01("Shaggy");
//        obj.start();
//
//        System.out.println("The name of thread first: " +thread_name02);              // printing 2nd thread name
//
//    }



