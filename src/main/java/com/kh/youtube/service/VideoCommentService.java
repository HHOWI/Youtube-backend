package com.kh.youtube.service;

import com.kh.youtube.domain.VideoComment;
import com.kh.youtube.repo.VideoCommentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoCommentService {

    @Autowired
    private VideoCommentDAO dao;

    public List<VideoComment> showAll() {
        return dao.findAll();
    }

    public VideoComment show(int code) {
        return dao.findById(code).orElse(null);
    }

    public VideoComment create(VideoComment videoComment) {
        return dao.save(videoComment);
    }

    public VideoComment update(VideoComment videoComment) {
        return dao.save(videoComment);
    }

    public VideoComment delete(int code) {
        VideoComment data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }

    public List<VideoComment> findByVideoCode(int code) {
        return dao.findByVideoCode(code);
    }
}
