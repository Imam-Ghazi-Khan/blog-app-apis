package com.igk.blog.payloads;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	private String categoryTitle;
	@NotBlank
	private String categoryDescription;
}
