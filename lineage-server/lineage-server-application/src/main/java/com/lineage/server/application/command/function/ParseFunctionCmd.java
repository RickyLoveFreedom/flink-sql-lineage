package com.lineage.server.application.command.function;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @description: ParseFunctionCmd
 * @author: HamaWhite
 * @version: 1.0.0
 * @date: 2023/2/5 9:37 PM
 */
@Data
public class ParseFunctionCmd {

    @NotNull
    private Long pluginId;
    @NotBlank
    private String fileName;

}
