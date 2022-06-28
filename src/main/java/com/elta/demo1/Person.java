package com.elta.demo1;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

//@Data
@Getter
@Setter
@ToString(exclude = "age")
@EqualsAndHashCode(exclude = "bonus")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NonNull
    private String name;
    private int age;
    @NonNull
    private Integer salary;
    private int bonus;

    @Singular
    private Map<String, Integer> beers;

    @Singular("oneFish")
    private List<String> fish;


}
