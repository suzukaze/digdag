package io.digdag.core;

import java.util.List;
import java.util.Map;
import java.util.Date;
import com.google.common.base.*;
import com.google.common.collect.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@JsonDeserialize(as = ImmutableTask.class)
public abstract class Task
{
    public abstract long getSessionId();

    public abstract Optional<Long> getParentId();

    public abstract String getFullName();

    public abstract ConfigSource getConfig();

    public abstract TaskType getTaskType();

    //public abstract TaskErrorMode getErrorMode();

    public abstract TaskStateCode getState();

    public static ImmutableTask.Builder taskBuilder()
    {
        return ImmutableTask.builder();
    }
}