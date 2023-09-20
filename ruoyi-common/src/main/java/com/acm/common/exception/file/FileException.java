package com.acm.common.exception.file;

import com.acm.common.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author acm
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
