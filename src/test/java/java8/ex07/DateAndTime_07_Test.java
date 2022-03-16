package java8.ex07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

import org.junit.Test;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

	@Test
	public void test_date_to_localdate() throws Exception {

		// TODO Créer une date Java 1 (12/02/2017)
		Date date = new Date(117, 01, 12);
		// System.out.println(date);

		// TODO transformer la date en Instant
		Instant instant = date.toInstant().plus(1, ChronoUnit.DAYS);
		// System.out.println(instant);

		// TODO transformer la date en LocalDate

		LocalDate result = instant.atZone(ZoneOffset.UTC).toLocalDate();
		// System.out.println(result);

		// TODO valoriser les différentes variables afin de rendre le test passant

		assertThat(result.getYear(), is(2017));
		assertThat(result.getMonth(), is(Month.FEBRUARY));
		assertThat(result.getDayOfMonth(), is(12));

	}
}
