package com.hw.lineage.common.util;

import com.hw.lineage.common.enums.SqlType;

import static com.hw.lineage.common.enums.SqlType.OTHER;

/**
 * @description: EnumUtils
 * @author: HamaWhite
 * @version: 1.0.0
 * @date: 2023/2/6 8:15 PM
 */
public class EnumUtils {
    private EnumUtils() {
        throw new IllegalStateException("Utility class");
    }


    public static SqlType getSqlTypeByValue(String value) {
        for (SqlType sqlType : SqlType.values()) {
            if (value.equals(sqlType.value())) {
                return sqlType;
            }
        }
        return OTHER;
    }
}
