package com.test.leboncointest.ui.albumlist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.leboncointest.R

class AlbumListFragment : Fragment() {

    companion object {
        fun newInstance() = AlbumListFragment()
    }

    private lateinit var viewModel: AlbumListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.album_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AlbumListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}