package com.sbg.factorywithannotations.export;

import org.springframework.stereotype.Component;

@Component
@ExporterType("RTF")
public class RTFExporter extends FileExporter {
  @Override
  public void export() {
    System.out.println("Exported as a RTF file!");
  }
}
