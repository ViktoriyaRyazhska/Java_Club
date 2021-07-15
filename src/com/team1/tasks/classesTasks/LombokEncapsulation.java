package com.team1.tasks.classesTasks;

import com.team1.IRunTask;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LombokEncapsulation implements IRunTask {
    public int number;
    public String stringValue;
    public Object anObject;

    @Override
    public void execute() {

    }
}
