/* Module 2. Task 4
 * Classname: Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 *
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student.
 */
package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Student ivan = new Student("Ivam", "Ivanov","Ivanovich", Gender.MALE,
            LocalDate.of(1997,2,12),
            "Kharkiv, Gagarina Street, 12","+3802224466","ivan@mail.ru",
            true, "Philipova A.M.", true,
            Speciality.COMPUTER_SCIENCES,Department.CYBER_SECURITY, "KN-112",
            "KN-112-a", "KN-12565566", "XA№5522333",true,
            EducationalMaintenanceAllowance.NO_EDUCATIONL_MAINTENANCE_ALLOWANCE,
            true, true,ForeignLanguage.GERMAN,
            false, SportSection.PING_PONG, 4.22);
	Student petr = new Student.Builder()
            .setFirstName("Petr")
            .setLastName("Petrov")
            .setPatronymic("Ivanovich")
            .buid();
        System.out.println(petr);
    }
}
