import java.util.*;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    public static int saveCounter = 0;
    Resume[] storage = new Resume[10000];

    void clear() {
    }

    void save(Resume r) {
        storage[saveCounter] = r;
        saveCounter++;
    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        /**
        Resume[] list = new Resume[saveCounter];
        for (int i = 0; i <= saveCounter; i++)
        {
            list[i] = storage[i];
        }
        return list;
         */
        return storage;
    }

    int size() {
        return saveCounter;
    }
}
