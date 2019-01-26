package com.baeldung.springmvc.accessparamsjs.model;

import java.io.Serializable;

public class Item implements Serializable {
    private String key;
    private String value;

    public Item(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Item() {
        this("", "");
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
