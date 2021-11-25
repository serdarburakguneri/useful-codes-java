package com.sbg.factorywithannotations.export;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ExporterFactory {

  @Resource private List<FileExporter> fileExporters;

  public FileExporter getExporter(String type) {
    return fileExporters.stream()
        .filter(c -> c.getClass().getAnnotation(ExporterType.class).value().equals(type))
        .findAny()
        .orElse(null);
  }
}
