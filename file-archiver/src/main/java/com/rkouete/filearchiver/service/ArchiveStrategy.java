package com.rkouete.filearchiver.service;

import common.EnumProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * @author rkouete
 */
public interface ArchiveStrategy {
    Logger logger = LogManager.getLogger();

    void archive(File file);

    EnumProvider provider();
}
