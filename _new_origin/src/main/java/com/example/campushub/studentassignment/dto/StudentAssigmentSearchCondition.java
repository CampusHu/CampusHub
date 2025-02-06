package com.example.campushub.studentassignment.dto;

import com.example.campushub.nweek.domain.Week;
import com.example.campushub.studentassignment.domain.SubmitStatus;

import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentAssigmentSearchCondition {

	private String courseName;
	private String week;
	@Nullable
	private String status;

	@Builder
	public StudentAssigmentSearchCondition(String courseName, String week, String status) {
		this.courseName = courseName;
		this.week = week;
		this.status = status;
	}
}
