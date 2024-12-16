package com.codej.service;

import com.codej.dto.TagDTO;
import com.codej.model.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ITagService {
    public List<TagDTO> findAll();
    public TagDTO findById(UUID id);
    public TagDTO save (TagDTO tag);
    public TagDTO update(TagDTO tag, UUID id);
    public void delete(UUID id);
}
