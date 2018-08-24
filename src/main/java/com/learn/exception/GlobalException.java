package com.learn.exception;

import com.learn.result.CodeMsg;

/**
 * Created by raint on 2018/8/23.
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
