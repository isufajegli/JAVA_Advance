package com.sda.lesson.two;

import java.util.HashMap;

public class HashMapShkoder<K, V> {

    public K key;
    public V value;

    public HashMapShkoder(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
