package com.endriwbento.workshopmongo.domain.services;

import com.endriwbento.workshopmongo.domain.Post;
import com.endriwbento.workshopmongo.domain.repository.PostRepository;
import com.endriwbento.workshopmongo.domain.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

        public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
            return repo.findByTitleContainingIgnoreCase(text);
    }
}
