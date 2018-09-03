package com.learn.redis;

/**
 * Created by Administrator on 2018/9/3.
 */
public abstract class BasePrefix implements KeyPrefix{

    private int expireSeconds;

    private String prefix;
    /**  0代表永不过期 **/
    public BasePrefix(String prefix) {
        this(0, prefix);
    }

    public BasePrefix( int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    /**  默认0代表永不过期 **/
    public int expireSeconds() {
        return expireSeconds;
    }

    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":" + prefix;
    }
}
