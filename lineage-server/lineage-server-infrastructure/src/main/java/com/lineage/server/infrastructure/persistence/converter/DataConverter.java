package com.lineage.server.infrastructure.persistence.converter;

import com.lineage.server.domain.entity.*;
import com.lineage.server.infrastructure.persistence.dos.*;
import com.lineage.server.infrastructure.persistence.dos.task.TaskDO;
import com.lineage.server.infrastructure.persistence.dos.task.TaskLineageDO;
import com.lineage.server.infrastructure.persistence.dos.task.TaskSqlDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @description: DataConverter
 * @author: HamaWhite
 * @version: 1.0.0
 * @date: 2023/1/31 2:33 PM
 */
@Mapper
public interface DataConverter {
    DataConverter INSTANCE = Mappers.getMapper(DataConverter.class);

    @Mapping(source = "taskId", target = "taskId.value")
    @Mapping(source = "pluginId", target = "pluginId.value")
    @Mapping(source = "catalogId", target = "catalogId.value")
    @Mapping(source = "taskSource", target = "taskSource.value")
    Task toTask(TaskDO taskDO);

    @Mapping(source = "taskId.value", target = "taskId")
    @Mapping(source = "pluginId.value", target = "pluginId")
    @Mapping(source = "catalogId.value", target = "catalogId")
    @Mapping(source = "taskSource.value", target = "taskSource")
    TaskDO fromTask(Task task);

    List<Task> toTaskList(List<TaskDO> taskDOList);

    @Mapping(source = "taskId", target = "taskId.value")
    @Mapping(source = "sqlId", target = "sqlId.value")
    TaskSql toTaskSql(TaskSqlDO taskSqlDO);

    @Mapping(source = "taskId.value", target = "taskId")
    @Mapping(source = "sqlId.value", target = "sqlId")
    TaskSqlDO fromTaskSql(TaskSql taskSql);


    @Mapping(source = "taskId", target = "taskId.value")
    @Mapping(source = "sqlId", target = "sqlId.value")
    TaskLineage toTaskLineage(TaskLineageDO taskLineageDO);

    @Mapping(source = "taskId.value", target = "taskId")
    @Mapping(source = "sqlId.value", target = "sqlId")
    TaskLineageDO fromTaskLineage(TaskLineage taskLineage);

    @Mapping(source = "pluginId", target = "pluginId.value")
    Plugin toPlugin(PluginDO pluginDO);

    @Mapping(source = "pluginId.value", target = "pluginId")
    PluginDO fromPlugin(Plugin plugin);

    @Mapping(source = "catalogId", target = "catalogId.value")
    Catalog toCatalog(CatalogDO catalogDO);

    @Mapping(source = "catalogId.value", target = "catalogId")
    CatalogDO fromCatalog(Catalog catalog);

    @Mapping(source = "functionId", target = "functionId.value")
    Function toFunction(FunctionDO pluginDO);

    @Mapping(source = "functionId.value", target = "functionId")
    FunctionDO fromFunction(Function function);

}
