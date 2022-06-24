package com.ias.omega.BackHandyman.commons;

public interface UseCase<Input,Output> {
    Output execute(Input input);
}
