package com.auliamnaufal.safeargsnavigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class FlowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val safeArgs: FlowFragmentArgs by navArgs()
        val flowStepNumber = safeArgs.flowStepNum

        return when (flowStepNumber) {
            2 -> inflater.inflate(R.layout.fragment_flow_end, container, false)
            else -> inflater.inflate(R.layout.fragment_flow, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.next_button).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.next_screen)
        )
    }
}