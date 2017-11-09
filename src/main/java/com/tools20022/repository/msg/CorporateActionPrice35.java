/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.IndicativeOrMarketPrice4Choice;
import com.tools20022.repository.choice.PriceFormat17Choice;
import com.tools20022.repository.choice.PriceFormat24Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.Issuance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies prices related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmIndicativeOrMarketPrice
 * CorporateActionPrice35.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmIssuePrice
 * CorporateActionPrice35.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice35.mmGenericCashPricePaidPerProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * </ul>
 */
public class CorporateActionPrice35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected IndicativeOrMarketPrice4Choice indicativeOrMarketPrice;
	/**
	 * Indicates whether the price is an indicative price or a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice4Choice
	 * IndicativeOrMarketPrice4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35
	 * CorporateActionPrice35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvOrMktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativeOrMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is an indicative price or a market price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndicativeOrMarketPrice = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> CorporateActionPrice35.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndicativeOrMarketPrice4Choice.mmObject();
		}
	};
	protected PriceFormat17Choice issuePrice;
	/**
	 * Initial issue price of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat17Choice
	 * PriceFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35
	 * CorporateActionPrice35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> CorporateActionPrice35.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat17Choice.mmObject();
		}
	};
	protected PriceFormat24Choice genericCashPriceReceivedPerProduct;
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, for example, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat24Choice
	 * PriceFormat24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35
	 * CorporateActionPrice35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> CorporateActionPrice35.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat24Choice.mmObject();
		}
	};
	protected PriceFormat17Choice genericCashPricePaidPerProduct;
	/**
	 * Generic cash price paid per product by the underlying security holder
	 * either as a percentage or an amount, for example, reinvestment price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat17Choice
	 * PriceFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35
	 * CorporateActionPrice35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> CorporateActionPrice35.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat17Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPrice35.mmIndicativeOrMarketPrice, CorporateActionPrice35.mmIssuePrice, CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct,
						CorporateActionPrice35.mmGenericCashPricePaidPerProduct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice35";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public IndicativeOrMarketPrice4Choice getIndicativeOrMarketPrice() {
		return indicativeOrMarketPrice;
	}

	public void setIndicativeOrMarketPrice(IndicativeOrMarketPrice4Choice indicativeOrMarketPrice) {
		this.indicativeOrMarketPrice = indicativeOrMarketPrice;
	}

	public PriceFormat17Choice getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(PriceFormat17Choice issuePrice) {
		this.issuePrice = issuePrice;
	}

	public PriceFormat24Choice getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(PriceFormat24Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
	}

	public PriceFormat17Choice getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(PriceFormat17Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
	}
}