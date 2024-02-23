package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@Slf4j
class SolutionTestV1 {

    @Test
    void testMinStack() {

        MinStack stack = new MinStack();

        stack.push(2);
        assertEquals(2,stack.getMin());
        assertEquals(2,stack.top());

        stack.push(1);
        stack.push(10);
        stack.push(5);
        stack.push(8);

        assertEquals(2,stack.getMin());
        assertEquals(8,stack.top());

        stack.pop();
        assertEquals(5,stack.top());

        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.push(12);
        stack.push(11);
        assertEquals(2,stack.getMin());
        assertEquals(11,stack.top());
    }

}