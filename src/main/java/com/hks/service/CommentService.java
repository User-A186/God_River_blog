package com.hks.service;

import com.hks.po.Comment;

import java.util.List;

/**
 * @author 河丶神
 * @date 2021/7/2 11:52
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
