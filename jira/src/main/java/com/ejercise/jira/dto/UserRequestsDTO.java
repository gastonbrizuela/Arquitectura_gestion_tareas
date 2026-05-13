package com.ejercise.jira.dto;

import com.ejercise.jira.models.UserModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestsDTO {

    @NotBlank(message = "El username es un dato requerido")
    @Size(min = 3, max = 50, message = "El username debe tener entre 3 y 50 caracteres")
    private String username;

    @NotBlank(message = "El password es un dato requerido")
    @Size(min = 8, max = 100, message = "El password debe tener al menos 8 caracteres")
    private String password;

    @NotBlank(message = "El name es un dato requerido")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String name;

    public UserModel toEntity(){
        return UserModel.builder().
        username(this.getUsername()).
        password(this.getPassword()).
        name(this.getName()).build();
    }

}
