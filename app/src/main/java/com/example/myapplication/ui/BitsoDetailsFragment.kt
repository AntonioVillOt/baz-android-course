package com.example.myapplication.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBitsoDetailsBinding

class BitsoDetailsFragment : Fragment(R.layout.fragment_bitso_details) {

    private lateinit var binding: FragmentBitsoDetailsBinding
    private val args by navArgs<BitsoDetailsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBitsoDetailsBinding.bind(view)

        Glide.with(requireContext()).load(R.drawable.syntetix).centerCrop().into(binding.imgBitcoin)
        Glide.with(requireContext()).load(R.drawable.bitcoinfondo).centerCrop().into(binding.imgBackground)
        binding.txtBitsoTitle.text = args.bitcoinTitle.uppercase()
        binding.txtPriceMin.text = args.minPrice
        binding.txtPriceMax.text = args.maxPrice
        binding.amountAsks.text = args.maxAmount
        binding.amountBinds.text = args.minAmount
        binding.priceAsks.text = args.minValue
        binding.priceBinds.text = args.maxValue
        binding.bookAsks.text = args.bitcoinTitle
        binding.bookBinds.text = args.bitcoinTitle

        when(binding.txtBitsoTitle.text) {
            "BTC_MXN" -> Glide.with(requireContext()).load(R.drawable.bitcoin).centerCrop()
                .into(binding.imgBitcoin)
            "ETH_BTC" -> Glide.with(requireContext()).load(R.drawable.eth_btc).centerCrop()
                .into(binding.imgBitcoin)
            "ETH_MXN" -> Glide.with(requireContext()).load(R.drawable.eth).centerCrop()
                .into(binding.imgBitcoin)
            "XRP_BTC" -> Glide.with(requireContext()).load(R.drawable.xrp).centerCrop()
                .into(binding.imgBitcoin)
            "XPR_MXN" -> Glide.with(requireContext()).load(R.drawable.xrp).centerCrop()
                .into(binding.imgBitcoin)
            "LTC_BTC" -> Glide.with(requireContext()).load(R.drawable.ltc).centerCrop()
                .into(binding.imgBitcoin)
            "LYC_MXN" -> Glide.with(requireContext()).load(R.drawable.ltc).centerCrop()
                .into(binding.imgBitcoin)
            "BCH_BTC" -> Glide.with(requireContext()).load(R.drawable.bch).centerCrop()
                .into(binding.imgBitcoin)
            "BCH_MXN" -> Glide.with(requireContext()).load(R.drawable.bch).centerCrop()
                .into(binding.imgBitcoin)
            "TUSD_BTC" -> Glide.with(requireContext()).load(R.drawable.tusd).centerCrop()
                .into(binding.imgBitcoin)
            "TUSD_MXN" -> Glide.with(requireContext()).load(R.drawable.bitcoin).centerCrop()
                .into(binding.imgBitcoin)
            "MANA_BTC" -> Glide.with(requireContext()).load(R.drawable.eth_btc).centerCrop()
                .into(binding.imgBitcoin)
            "MANA_MXN" -> Glide.with(requireContext()).load(R.drawable.eth).centerCrop()
                .into(binding.imgBitcoin)
            "BAT_BTC" -> Glide.with(requireContext()).load(R.drawable.xrp).centerCrop()
                .into(binding.imgBitcoin)
            "BAT_MXN" -> Glide.with(requireContext()).load(R.drawable.xrp).centerCrop()
                .into(binding.imgBitcoin)
            "BTC_ARS" -> Glide.with(requireContext()).load(R.drawable.ltc).centerCrop()
                .into(binding.imgBitcoin)
            "BTC_DAI" -> Glide.with(requireContext()).load(R.drawable.ltc).centerCrop()
                .into(binding.imgBitcoin)
            "DAI_MXN" -> Glide.with(requireContext()).load(R.drawable.bch).centerCrop()
                .into(binding.imgBitcoin)
            "XRP_USD" -> Glide.with(requireContext()).load(R.drawable.tusd).centerCrop()
                .into(binding.imgBitcoin)
        }
    }
}
