package com.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 夏凯
 * @Description
 * @since 2021/4/2 15:21
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String sex;

    @Column
    private LocalDateTime birth;

}
