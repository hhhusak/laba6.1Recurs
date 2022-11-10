import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest61 {

    @Test
    void arrayCrRecurs() {
        int size = 25;
        int min = -10; int max = 10;
        int[] a = new int[size];
        Main.arrayCrRecurs(a, size, 0, min, max);
        for (int i = 0; i < size; i++) {
            assertTrue(a[i] >= min && a[i] <= max);
        }
    }
}