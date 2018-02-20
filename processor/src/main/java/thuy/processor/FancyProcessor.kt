package thuy.processor

import com.google.auto.service.AutoService
import thuy.annotations.Fancy
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

@AutoService(Processor::class)
class FancyProcessor : AbstractProcessor() {
  private lateinit var logger: Messager
  override fun init(environment: ProcessingEnvironment) {
    super.init(environment)
    logger = environment.messager
  }

  override fun getSupportedAnnotationTypes(): MutableSet<String> {
    return mutableSetOf(Fancy::class.java.name)
  }

  override fun getSupportedSourceVersion(): SourceVersion =
      SourceVersion.latestSupported()

  override fun process(
      annotations: MutableSet<out TypeElement>?,
      roundEnv: RoundEnvironment?
  ): Boolean {
    logger.printMessage(Diagnostic.Kind.NOTE, "LOL: FancyProcessor.process()")
    return true
  }
}
