package edu.ctb.upm.midas.rhdwiki.common.util;

import com.google.gson.Gson;
import edu.ctb.upm.midas.rhdwiki.constants.Constants;
import edu.ctb.upm.midas.rhdwiki.model.Disease;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;


/**
 * Created by gerardo on 10/05/2017.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project ExtractionInformationDiseasesWikipedia
 * @className Validations
 * @see
 */
@Service
public class Common {

    private static final Logger logger = LoggerFactory.getLogger(Common.class);


    public boolean isEmpty(String string) {
        if (string == null) {
            return true;
        }
        else {
            if (string.trim().equalsIgnoreCase("")) {
                return true;
            }
            else {
                return false;
            }

        }
    }


    public String writeAnalysisJSONFile(String jsonBody, Disease disease, int count, String snapshot, String directory) throws IOException {
        String fileName = count + "_" + disease.getId() + "_" + snapshot + Constants.DOT_JSON;
        String path = directory + fileName;//Constants.WRITING_DIRECTORY
        InputStream in = getClass().getResourceAsStream(path);
        //BufferedReader bL = new BufferedReader(new InputStreamReader(in));
        File file = new File(path);
        BufferedWriter bW;

        if (!file.exists()){
            bW = new BufferedWriter(new FileWriter(file));
            bW.write(jsonBody);
            bW.close();
        }
        jsonBody = null;
        return fileName;
    }


    public Disease readDiseaseJSONFileAnalysis(File file) {
        Disease disease = null;
//        logger.info("Read JSON disease: " + file.getName());
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            disease = gson.fromJson(br, Disease.class);
//            gson = new GsonBuilder().setPrettyPrinting().create();
//            System.out.println(gson.toJson(disease));
        }catch (Exception e){
            logger.error("Error to read or convert JSON disease file {}", file.getName(), e);
//            System.out.println("Error to read or convert JSON!..." + e.getLocalizedMessage() + e.getMessage() + e.getCause());
        }
        return disease;
    }


}
