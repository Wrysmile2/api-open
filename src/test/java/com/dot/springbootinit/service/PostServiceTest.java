package com.dot.springbootinit.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wwcr.springbootinit.model.dto.post.PostQueryRequest;
import com.wwcr.springbootinit.model.entity.Post;
import javax.annotation.Resource;

import com.wwcr.springbootinit.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子服务测试
 *
  * @author <a href="https://github.com/a-bleak-morning"dot</a>
 * 
 */
@SpringBootTest
class PostServiceTest {

    @Resource
    private PostService postService;

    @Test
    void searchFromEs() {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setUserId(1L);
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        Assertions.assertNotNull(postPage);
    }

}