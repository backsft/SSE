package com.SSE_Test01;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    private String name;
    private int age;
    private String phoneNo;

    @JsonProperty("isSeen") // ✅ force JSON name to isSeen
    private boolean isSeen;

    // constructors, getters, setters

    public boolean isSeen() { return isSeen; }
    public void setSeen(boolean seen) { isSeen = seen; }
}
