//package com.example.campushub.course.domain;
//
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@Getter
//@RequiredArgsConstructor
//public enum CourseDay {
//	MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일");
//
//	private final String name;
//
//	public static CourseDay of(String koreaName) {
//		if(koreaName == "월요일") {
//			return MONDAY;
//		} else if(koreaName == "화요일") {
//			return TUESDAY;
//		} else if(koreaName == "수요일") {
//			return WEDNESDAY;
//		} else if(koreaName == "목요일") {
//			return THURSDAY;
//		} else return FRIDAY;
//	}
//}
package com.example.campushub.course.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CourseDay {
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일");

	private final String name;

	public static CourseDay of(String koreaName) {
		if (koreaName.equals("월요일")) {
			return MONDAY;
		} else if (koreaName.equals("화요일")) {
			return TUESDAY;
		} else if (koreaName.equals("수요일")) {
			return WEDNESDAY;
		} else if (koreaName.equals("목요일")) {
			return THURSDAY;
		} else if (koreaName.equals("금요일")) {
			return FRIDAY;
		} else {
			throw new IllegalArgumentException("존재하지 않는 요일입니다: " + koreaName);
		}
	}
}
