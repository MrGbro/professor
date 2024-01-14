package com.homeey.stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/14 下午4:48
 **/
public class ConstructStack {

    static class Stack{
        private int[] target;

        public Stack() {
            this.target = new int[10];
        }

        public Stack(int capacity) {
            this.target = new int[capacity];
        }
    }
}
