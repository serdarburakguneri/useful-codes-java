package com.sbg.factorywithannotations;

import com.sbg.factorywithannotations.export.ExporterFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FactoryWithAnnotationsApplication implements CommandLineRunner {

  @Resource private ExporterFactory exporterFactory;

  public static void main(String[] args) {
    SpringApplication.run(FactoryWithAnnotationsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    exporterFactory.getExporter("PDF").export();

    exporterFactory.getExporter("RTF").export();
  }
}
