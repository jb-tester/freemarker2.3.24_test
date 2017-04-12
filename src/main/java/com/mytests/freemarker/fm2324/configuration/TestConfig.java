package com.mytests.freemarker.fm2324.configuration;

import com.mytests.freemarker.fm2324.datamodel.Data;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/28/2016.
 * Project: freemarker2.3.24_test
 * *******************************
 */
public class TestConfig {



        public static void main(String[] args) throws Exception {

        /* ------------------------------------------------------------------------ */
        /* You should do this ONLY ONCE in the whole application life-cycle:        */

        /* Create and adjust the configuration singleton */
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_24);
            cfg.setDirectoryForTemplateLoading(new File("src/main/java/com/mytests/freemarker/fm2324/templates"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);

        /* ------------------------------------------------------------------------ */
        /* You usually do these for MULTIPLE TIMES in the application life-cycle:   */

        /* Create a data-model */

            Map root = Data.setDatas();

        /* Get the template (uses cache internally) */
            Template temp = cfg.getTemplate("test.ftl");

        /* Merge data-model with template */
            Writer out = new OutputStreamWriter(System.out);
            temp.process(root, out);
            // Note: Depending on what `out` is, you may need to call `out.close()`.
            // This is usually the case for file output, but not for servlet output.
        }
    }

