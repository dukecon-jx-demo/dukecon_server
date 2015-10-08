package org.dukecon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * @author Falk Sippach, falk@jug-da.de, @sippsack
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Room {
    private String id;
    private Integer order;
    private String name;
}