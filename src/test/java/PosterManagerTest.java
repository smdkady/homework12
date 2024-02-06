import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void testPosterNoChanges() {
        PosterManager manager = new PosterManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        PosterManager manager = new PosterManager();
        manager.add("Movie");
        String[] actual = manager.findAll();
        String[] expected = {"Movie"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManager manager = new PosterManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLimit() {
        PosterManager manager = new PosterManager(10);
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}