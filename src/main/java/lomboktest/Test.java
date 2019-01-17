package lomboktest;

import java.time.Instant;

import lombok.experimental.FieldNameConstants;

@FieldNameConstants
public class Test {

	private String fancyFirstFieldName;
	private Instant fancySecondFieldName;

	public static void main(String[] args) {
		// lombok 1.18.4
		System.out.println(Test.Fields.fancyFirstFieldName);
		System.out.println(Test.Fields.fancySecondFieldName);
		// lombok 1.18.2
//		System.out.println(Test.FIELD_FANCY_FIRST_FIELD_NAME);
//		System.out.println(Test.FIELD_FANCY_SECOND_FIELD_NAME);
	}
}
