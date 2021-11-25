package com.sbg.factorywithannotations.export;

import org.springframework.stereotype.Component;

@Component
@ExporterType("PDF")
public class PDFExporter extends FileExporter {
  @Override
  public void export() {
    System.out.println("Exported as a PDF file!");
  }
}
