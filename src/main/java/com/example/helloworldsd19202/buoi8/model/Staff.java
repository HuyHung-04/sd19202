package com.example.helloworldsd19202.buoi8.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @NotNull(message = "Vui long dien id")
    private Integer id;
    @NotBlank(message = "Vui long dien ten")
    private String name;
    @NotNull(message = "Vui long dien tuoi")
    private Integer age;
    @NotBlank(message = "Vui long dien chuc vu")
    private String position;
    @NotEmpty(message = "Vui long dien so thich")
    private String[] hobbies;
    @NotNull(message = "Vui chon quoc qia")
    private Country country;
}
