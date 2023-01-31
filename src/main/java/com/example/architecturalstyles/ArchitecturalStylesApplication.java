package com.example.architecturalstyles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchitecturalStylesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchitecturalStylesApplication.class, args);
    }

}

/**
 * Результат:
 * 1) CRUD'ы для User и Role
 *    - создать пользователя с ролью
 *    - удалить роль у пользователя
 *    - изменить или добавить роль пользователю
 */
