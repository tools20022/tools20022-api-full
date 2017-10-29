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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max128Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.NonDisclosedListTrading;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List trading by which the buy-side provides details to the sell-side
 * information about the sector, country, index and potential market impact of
 * the financial instrument to be bought or sold. Using this information, the
 * sell-side firms bid for the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#BidByCurrency
 * NonDisclosedBid1.BidByCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#BidBySector
 * NonDisclosedBid1.BidBySector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#BidByIndex
 * NonDisclosedBid1.BidByIndex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#SideIndicator
 * NonDisclosedBid1.SideIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#Liquidity
 * NonDisclosedBid1.Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#ExchangeForPhysicalTrade
 * NonDisclosedBid1.ExchangeForPhysicalTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
 * NonDisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonDisclosedBid1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
 * </li>
 * </ul>
 */
public class NonDisclosedBid1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies a type of bid based on a common characteristic (the currency)
	 * of all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#BidByCurrency
	 * NonDisclosedListTrading.BidByCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BidByCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.BidByCurrency;
			isDerived = false;
			xmlTag = "BidByCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByCurrency";
			definition = "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Identifies a type of bid based on a common characteristic (the sector) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#BidBySector
	 * NonDisclosedListTrading.BidBySector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidBySctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidBySector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BidBySector = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.BidBySector;
			isDerived = false;
			xmlTag = "BidBySctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidBySector";
			definition = "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	/**
	 * Identifies a type of bid based on a common characteristic (the index) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#BidByIndex
	 * NonDisclosedListTrading.BidByIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the index) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BidByIndex = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.BidByIndex;
			isDerived = false;
			xmlTag = "BidByIndx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByIndex";
			definition = "Identifies a type of bid based on a common characteristic (the index) of all securities of a list.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	/**
	 * Indicates the side of the bid in the case of a non disclosed bidding
	 * process. Used instead of buy and sell side. True = Side 1 False = Side 2
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the side of the bid in the case of a non disclosed bidding process. Used instead of buy and sell side.\nTrue = Side 1\nFalse = Side 2"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SideIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "SdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideIndicator";
			definition = "Indicates the side of the bid in the case of a non disclosed bidding process. Used instead of buy and sell side.\nTrue = Side 1\nFalse = Side 2";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Provides additionnal details about the liquidity of a financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Liquidity1 Liquidity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#Liquidity
	 * ListTrading.Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lqdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additionnal details about the liquidity of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Liquidity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.Liquidity;
			isDerived = false;
			xmlTag = "Lqdty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "Provides additionnal details about the liquidity of a financial instrument.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Liquidity1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Details about the exchange for physical trade parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExchangeForPhysicalTrade
	 * SecuritiesOrder.ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgForPhysTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details about the exchange for physical trade parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ExchangeForPhysicalTrade = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NonDisclosedBid1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade;
			isDerived = false;
			xmlTag = "XchgForPhysTrad";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Details about the exchange for physical trade parameters.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExchangeForPhysicalTradeParameters1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDisclosedBid1.BidByCurrency, com.tools20022.repository.msg.NonDisclosedBid1.BidBySector, com.tools20022.repository.msg.NonDisclosedBid1.BidByIndex,
						com.tools20022.repository.msg.NonDisclosedBid1.SideIndicator, com.tools20022.repository.msg.NonDisclosedBid1.Liquidity, com.tools20022.repository.msg.NonDisclosedBid1.ExchangeForPhysicalTrade);
				trace_lazy = () -> NonDisclosedListTrading.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonDisclosedBid1";
				definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
			}
		});
		return mmObject_lazy.get();
	}
}