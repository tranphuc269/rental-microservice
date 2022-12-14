package com.microservice.rentalservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseRental {
    private String rentalId;
    private Long postId;
    private Long price;
    private String owner;
    private String borrower;
    private String startDate;
    private String endDate;
    private String createdDate;

    private String status;

    @Builder
    public ResponseRental(
            String rentalId,
            Long postId,
            Long price,
            String owner,
            String borrower,
            String startDate,
            String endDate,
            String createdDate,
            String status
    ) {
        this.rentalId = rentalId;
        this.postId = postId;
        this.price = price;
        this.owner = owner;
        this.borrower = borrower;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdDate = createdDate;
        this.status = status;
    }
}
