package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void displayLastTenMovies() {
        PosterManager manager = new PosterManager();

        PosterItem first = new PosterItem(1, 112233, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 445566, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 778899, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 111222, "Movie fourth", "adventure", 1);
        PosterItem fifth = new PosterItem(5, 333444, "Movie fifth", "drama", 1);
        PosterItem sixth = new PosterItem(6, 555666, "Movie sixth", "animated", 1);
        PosterItem seventh = new PosterItem(7, 777888, "Movie seventh", "historical", 1);
        PosterItem eighth = new PosterItem(8, 999111, "Movie eighth", "horror", 1);
        PosterItem ninth = new PosterItem(9, 123456, "Movie ninth", "noir", 1);
        PosterItem tenth = new PosterItem(10, 789123, "Movie tenth", "western", 1);
        PosterItem eleventh = new PosterItem(11, 777777, "Movie eleventh", "thriller", 1);
        PosterItem twelve = new PosterItem(12, 111111, "Movie twelve", "comedy", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayLastMoviesLessTen() {
        PosterManager manager = new PosterManager();

        PosterItem first = new PosterItem(1, 112233, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 445566, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 778899, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 111222, "Movie fourth", "adventure", 1);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayThreeMovies() {
        PosterManager manager = new PosterManager(3);

        PosterItem first = new PosterItem(1, 112233, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 445566, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 778899, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 111222, "Movie fourth", "adventure", 1);
        PosterItem fifth = new PosterItem(5, 333444, "Movie fifth", "drama", 1);
        PosterItem sixth = new PosterItem(6, 555666, "Movie sixth", "animated", 1);
        PosterItem seventh = new PosterItem(7, 777888, "Movie seventh", "historical", 1);
        PosterItem eighth = new PosterItem(8, 999111, "Movie eighth", "horror", 1);
        PosterItem ninth = new PosterItem(9, 123456, "Movie ninth", "noir", 1);
        PosterItem tenth = new PosterItem(10, 789123, "Movie tenth", "western", 1);
        PosterItem eleventh = new PosterItem(11, 777777, "Movie eleventh", "thriller", 1);
        PosterItem twelve = new PosterItem(12, 111111, "Movie twelve", "comedy", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth};

        assertArrayEquals(expected, actual);
    }


}