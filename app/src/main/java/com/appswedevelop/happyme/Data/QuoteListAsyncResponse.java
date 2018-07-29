package com.appswedevelop.happyme.Data;

import com.appswedevelop.happyme.Model.Quote;

import java.util.ArrayList;



public interface QuoteListAsyncResponse {
    void processFinished(ArrayList<Quote> quotes);
}
