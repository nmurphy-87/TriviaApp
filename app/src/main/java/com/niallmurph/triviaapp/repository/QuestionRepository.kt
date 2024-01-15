package com.niallmurph.triviaapp.repository

import com.niallmurph.triviaapp.data.DataOrException
import com.niallmurph.triviaapp.model.QuestionItem
import com.niallmurph.triviaapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val listOfQuestions = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()
}