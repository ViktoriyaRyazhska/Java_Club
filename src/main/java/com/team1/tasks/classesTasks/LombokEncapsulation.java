package com.team1.tasks.classesTasks;

import com.team1.IRunTask;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LombokEncapsulation implements IRunTask  {
    public int number;
    public String stringValue;

    @Override
    public String toString() {
        return "LombokEncapsulation{" +
                "number=" + number +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }

    @Override
    public void execute() {
        LombokEncapsulation lombokEncapsulation=new LombokEncapsulation();
        LombokEncapsulation lombokEncapsulation2=new LombokEncapsulation(2,"lombok is nice)");
        lombokEncapsulation.setNumber(1);
        lombokEncapsulation.setStringValue("lombok is cool)");
        System.out.println(lombokEncapsulation+"\n"+lombokEncapsulation2);
    }
}
