/* GENERATED  BY CHAT GPT */
package com.archive;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("links")
public record Link(
        @Id Long id,
        String url,
        String status,
        String title
) {}
