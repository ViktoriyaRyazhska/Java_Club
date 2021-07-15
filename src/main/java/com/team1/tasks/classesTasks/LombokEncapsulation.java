package com.team1.tasks.classesTasks;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LombokEncapsulation {
    public int number;
    public String stringValue;
    public Object anObject;
}
