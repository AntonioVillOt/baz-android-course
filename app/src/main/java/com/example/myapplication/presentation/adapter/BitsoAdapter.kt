package com.example.myapplication.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.util.core.BaseViewHolder
import com.example.myapplication.model.Book
import com.example.myapplication.databinding.ItemBitsoBinding

class BitsoAdapter(private  val bitsoList: List<Book>,
                   private val itemClickListener: OnBitsoClickListener
): RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnBitsoClickListener{
        fun onBitsoClick(book: Book)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding = ItemBitsoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = BitcoinViewHolder(itemBinding, parent.context)

        itemBinding.root.setOnClickListener {
            val position = holder.bindingAdapterPosition.takeIf { it != DiffUtil.DiffResult.NO_POSITION }
                ?: return@setOnClickListener
            itemClickListener.onBitsoClick(bitsoList[position])
        }
        return holder
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is BitcoinViewHolder -> holder.bind(bitsoList[position])
        }
    }

    override fun getItemCount(): Int = bitsoList.size

    private inner class BitcoinViewHolder(
        val binding: ItemBitsoBinding,
        val context: Context
    ): BaseViewHolder<Book>(binding.root){
        override fun bind(item: Book){
            Glide.with(context).load(R.drawable.ic_info)
                .centerCrop().into(binding.ivImageCoin)
            binding.tvCoinName.text = item.book
            binding.tvMaxPrice.text = item.maximumPrice.toString()
            binding.tvMinPrice.text = item.minimumPrice.toString()

            when(item.book){
                "btc_mxn" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "eth_btc" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "eth_mxn" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "xrp_btc" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "xrp_mxn" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "ltc_btc" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "ltc_mxn" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "bch_btc" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "bch_mxn" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "tusd_btc" -> Glide.with(context).load(R.drawable.tusd).centerCrop().into(binding.ivImageCoin)
                "tusd_mxn" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "mana_btc" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "mana_mxn" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "bat_btc" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "bat_mxn" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "btc_ars" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "btc_dai" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "dai_mxn" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "btc_mxn" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "xrp_usd" -> Glide.with(context).load(R.drawable.tusd).centerCrop().into(binding.ivImageCoin)
                "eth_usd" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "dai_ars" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "btc_brl" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "eth_ars" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "eth_brl" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "btc_usdt" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "usd_mxn" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "usd_ars" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "usd_brl" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "mana_usd" -> Glide.with(context).load(R.drawable.mana).centerCrop().into(binding.ivImageCoin)
                "ltc_usd" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "comp_usd" -> Glide.with(context).load(R.drawable.comp).centerCrop().into(binding.ivImageCoin)
                "link_usd" -> Glide.with(context).load(R.drawable.link).centerCrop().into(binding.ivImageCoin)
                "uni_usd" -> Glide.with(context).load(R.drawable.uni).centerCrop().into(binding.ivImageCoin)
                "aave_usd" -> Glide.with(context).load(R.drawable.aave).centerCrop().into(binding.ivImageCoin)
                "chz_usd" -> Glide.with(context).load(R.drawable.chz).centerCrop().into(binding.ivImageCoin)
                "btc_cop" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "axs_usd" -> Glide.with(context).load(R.drawable.axs).centerCrop().into(binding.ivImageCoin)
                "dydx_usd" -> Glide.with(context).load(R.drawable.dydx).centerCrop().into(binding.ivImageCoin)
                "yfi_usd" -> Glide.with(context).load(R.drawable.yfi).centerCrop().into(binding.ivImageCoin)
                "sand_usd" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "shib_usd" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "snx_usd" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "matic_usd" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "mkr_usd" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "enj_usd" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "ftm_usd" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)
                "crv_usd" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "gala_usd" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "ala_usd" -> Glide.with(context).load(R.drawable.tusd).centerCrop().into(binding.ivImageCoin)
                "lrc_usd" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "grt_usd" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "ape_usd" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "sushi_usd" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "omg_usd" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "sol_usd" -> Glide.with(context).load(R.drawable.sol).centerCrop().into(binding.ivImageCoin)
                "dot_usd" -> Glide.with(context).load(R.drawable.dot).centerCrop().into(binding.ivImageCoin)
                "qnt_usd" -> Glide.with(context).load(R.drawable.qnt).centerCrop().into(binding.ivImageCoin)
                "doge_usd" -> Glide.with(context).load(R.drawable.dogecoin).centerCrop().into(binding.ivImageCoin)
                "eth_cop" -> Glide.with(context).load(R.drawable.tusd).centerCrop().into(binding.ivImageCoin)
                "xrp_cop" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "usd_cop" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "bal_usd" -> Glide.with(context).load(R.drawable.bal).centerCrop().into(binding.ivImageCoin)
                "trx_usd" -> Glide.with(context).load(R.drawable.trx).centerCrop().into(binding.ivImageCoin)
                "algo_usd" -> Glide.with(context).load(R.drawable.algo).centerCrop().into(binding.ivImageCoin)
                "ldo_usd" -> Glide.with(context).load(R.drawable.ldo).centerCrop().into(binding.ivImageCoin)
                "xlm_usd" -> Glide.with(context).load(R.drawable.stellar).centerCrop().into(binding.ivImageCoin)
                "matic_brl" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "ada_brl" -> Glide.with(context).load(R.drawable.bch).centerCrop().into(binding.ivImageCoin)
                "sol_brl" -> Glide.with(context).load(R.drawable.tusd).centerCrop().into(binding.ivImageCoin)
                "xrp_brl" -> Glide.with(context).load(R.drawable.bitcoin).centerCrop().into(binding.ivImageCoin)
                "doge_brl" -> Glide.with(context).load(R.drawable.eth_btc).centerCrop().into(binding.ivImageCoin)
                "chz_brl" -> Glide.with(context).load(R.drawable.eth).centerCrop().into(binding.ivImageCoin)
                "usdt_brl" -> Glide.with(context).load(R.drawable.xrp).centerCrop().into(binding.ivImageCoin)
                "paxg_usd" -> Glide.with(context).load(R.drawable.paxgold).centerCrop().into(binding.ivImageCoin)
                "shib_brl" -> Glide.with(context).load(R.drawable.ltc).centerCrop().into(binding.ivImageCoin)

            }
        }
    }
}


