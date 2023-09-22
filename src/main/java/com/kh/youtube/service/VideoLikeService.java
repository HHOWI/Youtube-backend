package com.kh.youtube.service;

import com.kh.youtube.domain.VideoLike;
import com.kh.youtube.repo.VideoLikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoLikeService {

    @Autowired
    private VideoLikeDAO dao;

    public List<VideoLike> showAll() {
        return dao.findAll();
    }

    public VideoLike show(int code) {
        return dao.findById(code).orElse(null);
    }

    public VideoLike create(VideoLike videoLike) {
        return dao.save(videoLike);
    }

    public VideoLike update(VideoLike videoLike) {
        return dao.save(videoLike);
    }

    public VideoLike delete(int code) {
        VideoLike data = dao.findById(code).orElse(null);
        dao.delete(data);
        return data;
    }
}
