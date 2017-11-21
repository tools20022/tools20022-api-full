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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information describing the high level details of a split trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmStatusDetails
 * SplitTradeDetails3.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmTradeAmounts
 * SplitTradeDetails3.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmAgreedRate
 * SplitTradeDetails3.mmAgreedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmSplitTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSplitTradeInformation}</li>
 * </ul>
 * </li>
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
 * "SplitTradeDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information describing the high level details of a split trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SplitTradeDetails3", propOrder = {"statusDetails", "tradeAmounts", "agreedRate"})
public class SplitTradeDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeData16 statusDetails;
	/**
	 * Provides information on the status of a foreign exchange trade in the
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeData16
	 * TradeData16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
	 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3
	 * SplitTradeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the status of a foreign exchange trade in the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TreasuryTrade.mmTreasuryTradeSettlementStatus;
			componentContext_lazy = () -> SplitTradeDetails3.mmObject();
			isDerived = false;
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Provides information on the status of a foreign exchange trade in the system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeData16.mmObject();
		}
	};
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * Amounts of the foreign exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3
	 * SplitTradeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amounts of the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeAmounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ForeignExchangeTrade.mmObject();
			componentContext_lazy = () -> SplitTradeDetails3.mmObject();
			isDerived = false;
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Amounts of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate1.mmObject();
		}
	};
	protected AgreedRate3 agreedRate;
	/**
	 * Exchange rate as agreed by the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3
	 * SplitTradeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate as agreed by the traders."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAgreedRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> SplitTradeDetails3.mmObject();
			isDerived = false;
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreedRate3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SplitTradeDetails3.mmStatusDetails, SplitTradeDetails3.mmTradeAmounts, SplitTradeDetails3.mmAgreedRate);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSplitTradeInformation);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SplitTradeDetails3";
				definition = "Information describing the high level details of a split trade.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StsDtls")
	public TradeData16 getStatusDetails() {
		return statusDetails;
	}

	public void setStatusDetails(com.tools20022.repository.msg.TradeData16 statusDetails) {
		this.statusDetails = statusDetails;
	}

	@XmlElement(name = "TradAmts", required = true)
	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public void setTradeAmounts(com.tools20022.repository.msg.AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = tradeAmounts;
	}

	@XmlElement(name = "AgrdRate")
	public AgreedRate3 getAgreedRate() {
		return agreedRate;
	}

	public void setAgreedRate(com.tools20022.repository.msg.AgreedRate3 agreedRate) {
		this.agreedRate = agreedRate;
	}
}