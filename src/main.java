import java.util.concurrent.TimeUnit;

class main {
    public static void main(String[] args) throws InterruptedException {
        DataGenerator d = new DataGenerator();
        d.generateData();

        Logger log = new Logger();
		log.archiveLog();
    }
}