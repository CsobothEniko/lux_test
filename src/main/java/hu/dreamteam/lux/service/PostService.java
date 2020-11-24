package hu.dreamteam.lux.service;

import hu.dreamteam.lux.entity.Post;
import hu.dreamteam.lux.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepo postRepo;

    @Autowired
    private void setPostRepo(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public List<Post> getPosts(){
        return postRepo.findAll();
    }

    public void savePost(Post post){
        postRepo.save(post);
    }

}