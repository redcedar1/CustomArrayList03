package customArrayList;

import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<E> {
    Object[] elementArray = {};

    private int size;

    // 값 추가
    public Boolean add(E element) {
        if (size == elementArray.length)
            elementArray = grow(size + 1);
        elementArray[size] = element;
        size += 1;

        return true;
    }

    private Object[] grow(int capacity) {
        int oldCapacity = elementArray.length;
        if (oldCapacity > 0 || !Arrays.equals(elementArray, new Object[]{})) {
            return elementArray = Arrays.copyOf(elementArray, capacity);
        } else {
            return elementArray = new Object[capacity];
        }
    }

    // 값 조회
    @SuppressWarnings("unchecked")
    public E get(int idx) { // 10, 10 idx
        // 인덱스의 범위가 유효한지 확인
        Objects.checkIndex(idx, size);
        return (E) elementArray[idx];
    }

    // 값 삭제
    public E remove(int idx) {
        Objects.checkIndex(idx, size);

        @SuppressWarnings("unchecked")
        E originElement = (E) elementArray[idx];

        int newSize;
        if ((newSize = size - 1) > idx) {
            System.arraycopy(elementArray, idx + 1, elementArray, idx,  newSize - idx);
        }
        size = newSize;

        return originElement;
    }
}
