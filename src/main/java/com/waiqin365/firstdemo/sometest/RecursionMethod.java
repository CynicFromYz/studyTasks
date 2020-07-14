package com.waiqin365.firstdemo.sometest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/16 14:59
 */
public class RecursionMethod {

    public static void main(String[] args) throws IOException {
        readAllFiles();
    }

    public static void readAllFiles() throws IOException {
        String txtName = "E:\\test";
//        File toSaveFile = new File(txtName);
//        if (!toSaveFile.exists()) {
//            toSaveFile.createNewFile();
//        }
//        FileInputStream fileInputStream = new FileInputStream(toSaveFile);
//        FileOutputStream fileOutputStream = new FileOutputStream(txtName);
//        List<String> fileNames = getAllFileName(txtName, new ArrayList<>());
        File file = new File(txtName);
        File[] files = file.listFiles();
        List<String> fileNames = getAllFileName(files, new ArrayList<>());
        for (int i = 0; i < fileNames.size(); i++) {
            System.out.println(fileNames.get(i));
        }
    }

    public static List<String> getAllFileName(File[] files, List<String> nameList) {
        List<String> list = nameList;
        for (File file : files) {
            if (file.isDirectory()) {
                File[] childFiles = file.listFiles();
                getAllFileName(childFiles, list);
            } else {
                list.add(file.getName());
            }
        }
        return list;
    }
}
