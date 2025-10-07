package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * Created by Qinhao on 2025/09/26.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
