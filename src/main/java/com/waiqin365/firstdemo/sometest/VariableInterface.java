package com.waiqin365.firstdemo.sometest;

public interface VariableInterface {
    interface parse {
        String getFileKey();

        String getFileName();

        Long getUserId();

        String getFileType();
    }

    static void main(String[] args) {
        VariableInterface.parse vp = new VariableInterface.parse() {
            @Override
            public String getFileKey() {
                return "1";
            }

            @Override
            public String getFileName() {
                return "2";
            }

            @Override
            public Long getUserId() {
                return 3L;
            }

            @Override
            public String getFileType() {
                return "4";
            }
        };
        System.out.println(vp.getFileKey());
        System.out.println(vp.getUserId());
    }
}
