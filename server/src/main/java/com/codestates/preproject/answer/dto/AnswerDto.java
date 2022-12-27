package com.codestates.preproject.answer.dto;

import lombok.*;

import java.time.LocalDateTime;

public class AnswerDto {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long answerId;
        private Long memberId;
        private String nickname;
        private Long questionId;
        private String answerContent;
        private Long voteCount;
        private Boolean isVoted;
        private LocalDateTime createdAt;
        private LocalDateTime lastModifiedAt;
    }
}