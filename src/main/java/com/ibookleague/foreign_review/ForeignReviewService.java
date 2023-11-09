package com.ibookleague.foreign_review;


import com.ibookleague.foreign_review.domain.ForeignReview;
import com.ibookleague.foreignbook.domain.ForeignBook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class ForeignReviewService {

    private final ForeignReviewRepository foreignReviewRepository;


    public void create(ForeignBook foreignBook, String content)
    {
        ForeignReview foreignReview = new ForeignReview();
        foreignReview.setContent(content);
        foreignReview.setCreateDate(LocalDateTime.now());
        foreignReview.setForeignBook(foreignBook);
        this.foreignReviewRepository.save(foreignReview);
    }
}
