package pl.mlznk.bitjava.projectlombok.requiredargsconstructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class PersonWithRequiredConstructor {

    @NonNull
    private String name;
    @NonNull
    private String surname;

}





