//package com.example.rodrigo.s_testing;
//
///**
// * Created by Rodrigo on 1/29/2016.
// */
//import android.os.Environment;
//import android.util.Log;
//
//import jxl.*;
//import java.io.File;
//import java.io.IOException;
//
//import jxl.write.*;
//import jxl.write.biff.RowsExceededException;
//
//
//public class XlWrite {
//    public static final String TAG = "TAG NAME";
//    public WritableWorkbook createWorkbook(String fileName) {
//        //exports must use a temp file while writing to avoid memory hogging
//        WorkbookSettings wbSettings = new WorkbookSettings();
//        wbSettings.setUseTemporaryFileDuringWrite(true);
//
//
//
//        //get the sdcard's directory
//        File sdCard = Environment.getExternalStorageDirectory();
//        //add on the your app's path
//        File dir = new File(sdCard.getAbsolutePath() + "/JExcelApiTest");
//        //make them in case they're not there
//        dir.mkdirs();
//        //create a standard java.io.File object for the Workbook to use
//        File wbfile = new File(dir, fileName);
//
//        WritableWorkbook wb = null;
//
//        try {
//            //create a new WritableWorkbook using the java.io.File and
//            //WorkbookSettings from above
//            wb = Workbook.createWorkbook(wbfile, wbSettings);
//        } catch (IOException ex) {
//            Log.e(TAG, ex.getStackTrace().toString());
//            Log.e(TAG, ex.getMessage());
//        }
//
//        return wb;
//    }
//
//    public WritableSheet createSheet(WritableWorkbook wb, String sheetName, int sheetIndex)
//    {
//        return wb.createSheet(sheetName,sheetIndex);
//
//    }
//
//    public void writeCell(int columnPosition,int rowPosition,String contents,boolean headerCell, WritableSheet sheet)throws RowsExceededException, WriteException
//    {
//        Label newCell = new Label(columnPosition,rowPosition,contents);
//        if(headerCell)
//        {
//            WritableFont headerFont = new WritableFont(WritableFont.ARIAL,10,WritableFont.BOLD);
//            WritableCellFormat headerFormat =  new WritableCellFormat(headerFont);
//            headerFormat.setAlignment(Alignment.CENTRE);
//            newCell.setCellFormat(headerFormat);
//
//        }
//        sheet.addCell(newCell);
//    }
//}
