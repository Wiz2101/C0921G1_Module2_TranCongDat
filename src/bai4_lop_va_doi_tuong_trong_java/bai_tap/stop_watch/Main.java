package bai4_lop_va_doi_tuong_trong_java.bai_tap.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        stopWatch.end();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());

    }
}
