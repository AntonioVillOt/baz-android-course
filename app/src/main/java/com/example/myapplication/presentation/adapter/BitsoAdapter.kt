package com.example.myapplication.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.util.core.BaseViewHolder
import com.example.myapplication.model.Book
import com.example.myapplication.databinding.ItemBitsoBinding
import com.example.myapplication.util.load

class BitsoAdapter(
    private val bitsoList: List<Book>, private val itemClickListener: OnBitsoClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnBitsoClickListener {
        fun onBitsoClick(book: Book)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding =
            ItemBitsoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = BitcoinViewHolder(itemBinding, parent.context)

        itemBinding.root.setOnClickListener {
            val position =
                holder.bindingAdapterPosition.takeIf { it != DiffUtil.DiffResult.NO_POSITION }
                    ?: return@setOnClickListener
            itemClickListener.onBitsoClick(bitsoList[position])
        }
        return holder
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is BitcoinViewHolder -> holder.bind(bitsoList[position])
        }
    }

    override fun getItemCount(): Int = bitsoList.size

    private inner class BitcoinViewHolder(
        val binding: ItemBitsoBinding, val context: Context
    ) : BaseViewHolder<Book>(binding.root) {
        override fun bind(item: Book) {
            Glide.with(context).load(R.drawable.ic_info).centerCrop().into(binding.ivImageCoin)
            binding.tvCoinName.text = item.book
            binding.tvMaxPrice.text = item.maximumPrice.toString()
            binding.tvMinPrice.text = item.minimumPrice.toString()
            val imageView: ImageView = binding.ivImageCoin

            when (item.book) {
                "btc_mxn" -> imageView.load(R.drawable.bitcoin)
                "eth_btc" -> imageView.load(R.drawable.eth_btc)
                "eth_mxn" -> imageView.load(R.drawable.eth)
                "xrp_btc" -> imageView.load(R.drawable.xrp)
                "xrp_mxn" -> imageView.load(R.drawable.xrp)
                "ltc_btc" -> imageView.load(R.drawable.ltc)
                "ltc_mxn" -> imageView.load(R.drawable.ltc)
                "bch_btc" -> imageView.load(R.drawable.bch)
                "bch_mxn" -> imageView.load(R.drawable.bch)
                "tusd_btc" -> imageView.load(R.drawable.tusd)
                "tusd_mxn" -> imageView.load(R.drawable.bitcoin)
                "mana_btc" -> imageView.load(R.drawable.eth_btc)
                "mana_mxn" -> imageView.load(R.drawable.eth)
                "bat_btc" -> imageView.load(R.drawable.xrp)
                "bat_mxn" -> imageView.load(R.drawable.xrp)
                "btc_ars" -> imageView.load(R.drawable.ltc)
                "btc_dai" -> imageView.load(R.drawable.ltc)
                "dai_mxn" -> imageView.load(R.drawable.bch)
                "xrp_usd" -> imageView.load(R.drawable.tusd)
                "eth_usd" -> imageView.load(R.drawable.bitcoin)
                "dai_ars" -> imageView.load(R.drawable.eth_btc)
                "btc_brl" -> imageView.load(R.drawable.eth)
                "eth_ars" -> imageView.load(R.drawable.xrp)
                "eth_brl" -> imageView.load(R.drawable.xrp)
                "btc_usdt" -> imageView.load(R.drawable.ltc)
                "usd_mxn" -> imageView.load(R.drawable.ltc)
                "usd_ars" -> imageView.load(R.drawable.bch)
                "usd_brl" -> imageView.load(R.drawable.bch)
                "mana_usd" -> imageView.load(R.drawable.mana)
                "ltc_usd" -> imageView.load(R.drawable.ltc)
                "comp_usd" -> imageView.load(R.drawable.comp)
                "link_usd" -> imageView.load(R.drawable.link)
                "uni_usd" -> imageView.load(R.drawable.uni)
                "aave_usd" -> imageView.load(R.drawable.aave)
                "chz_usd" -> imageView.load(R.drawable.chz)
                "btc_cop" -> imageView.load(R.drawable.ltc)
                "axs_usd" -> imageView.load(R.drawable.axs)
                "dydx_usd" -> imageView.load(R.drawable.dydx)
                "yfi_usd" -> imageView.load(R.drawable.yfi)
                "sand_usd" -> imageView.load(R.drawable.bitcoin)
                "shib_usd" -> imageView.load(R.drawable.eth_btc)
                "snx_usd" -> imageView.load(R.drawable.eth)
                "matic_usd" -> imageView.load(R.drawable.xrp)
                "mkr_usd" -> imageView.load(R.drawable.xrp)
                "enj_usd" -> imageView.load(R.drawable.ltc)
                "ftm_usd" -> imageView.load(R.drawable.ltc)
                "crv_usd" -> imageView.load(R.drawable.bch)
                "gala_usd" -> imageView.load(R.drawable.bch)
                "ala_usd" -> imageView.load(R.drawable.tusd)
                "lrc_usd" -> imageView.load(R.drawable.bitcoin)
                "grt_usd" -> imageView.load(R.drawable.eth_btc)
                "ape_usd" -> imageView.load(R.drawable.eth)
                "sushi_usd" -> imageView.load(R.drawable.xrp)
                "omg_usd" -> imageView.load(R.drawable.xrp)
                "sol_usd" -> imageView.load(R.drawable.sol)
                "dot_usd" -> imageView.load(R.drawable.dot)
                "qnt_usd" -> imageView.load(R.drawable.qnt)
                "doge_usd" -> imageView.load(R.drawable.dogecoin)
                "eth_cop" -> imageView.load(R.drawable.tusd)
                "xrp_cop" -> imageView.load(R.drawable.bitcoin)
                "usd_cop" -> imageView.load(R.drawable.eth_btc)
                "bal_usd" -> imageView.load(R.drawable.bal)
                "trx_usd" -> imageView.load(R.drawable.trx)
                "algo_usd" -> imageView.load(R.drawable.algo)
                "ldo_usd" -> imageView.load(R.drawable.ldo)
                "xlm_usd" -> imageView.load(R.drawable.stellar)
                "matic_brl" -> imageView.load(R.drawable.bch)
                "ada_brl" -> imageView.load(R.drawable.bch)
                "sol_brl" -> imageView.load(R.drawable.tusd)
                "xrp_brl" -> imageView.load(R.drawable.bitcoin)
                "doge_brl" -> imageView.load(R.drawable.eth_btc)
                "chz_brl" -> imageView.load(R.drawable.eth)
                "usdt_brl" -> imageView.load(R.drawable.xrp)
                "paxg_usd" -> imageView.load(R.drawable.paxgold)
                "shib_brl" -> imageView.load(R.drawable.ltc)
            }
        }
    }
}


