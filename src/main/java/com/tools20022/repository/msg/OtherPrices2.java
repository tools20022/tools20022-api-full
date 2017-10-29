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
import com.tools20022.repository.entity.Price;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Maximum
 * OtherPrices2.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Transaction
 * OtherPrices2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#MarketBrokerCommission
 * OtherPrices2.MarketBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#MarkedUp
 * OtherPrices2.MarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#MarkedDown
 * OtherPrices2.MarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NetDisclosed
 * OtherPrices2.NetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NetUndisclosed
 * OtherPrices2.NetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NotionalGross
 * OtherPrices2.NotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#BenchmarkWeightedAverage
 * OtherPrices2.BenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#AllMarketsWeightedAverage
 * OtherPrices2.AllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Benchmark
 * OtherPrices2.Benchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#OtherPrice
 * OtherPrices2.OtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#IndexPrice
 * OtherPrices2.IndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#ReportedPrice
 * OtherPrices2.ReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#ReferencePrice
 * OtherPrices2.ReferencePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#OtherPrices
 * SecuritiesTradeConfirmationV03.OtherPrices}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherPrices2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OtherPrices1
 * OtherPrices1}</li>
 * </ul>
 */
public class OtherPrices2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the maximum price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Max"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the maximum price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#Maximum
	 * OtherPrices1.Maximum}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Maximum = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "Max";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			definition = "Specifies the maximum price.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.Maximum;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the transaction price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transaction price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#Transaction
	 * OtherPrices1.Transaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Transaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Specifies the transaction price.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.Transaction;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Market price including or excluding the broker's commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#Price
	 * Adjustment.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market price including or excluding the broker's commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#MarketBrokerCommission
	 * OtherPrices1.MarketBrokerCommission}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MarketBrokerCommission = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.Price;
			isDerived = false;
			xmlTag = "MktBrkrComssn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketBrokerCommission";
			definition = "Market price including or excluding the broker's commission.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.MarketBrokerCommission;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * In case of an order to buy, the price that the broker paid on the market
	 * plus the broker's commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkdUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkedUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of an order to buy, the price that the broker paid on the market plus the broker's commission."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#MarkedUp
	 * OtherPrices1.MarkedUp}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MarkedUp = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "MrkdUp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedUp";
			definition = "In case of an order to buy, the price that the broker paid on the market plus the broker's commission.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.MarkedUp;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * In case of an order to sell, the price the broker receives in the market
	 * minus the broker's commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkdDwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkedDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of an order to sell, the price the broker receives in the market minus the broker's commission."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#MarkedDown
	 * OtherPrices1.MarkedDown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MarkedDown = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "MrkdDwn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedDown";
			definition = "In case of an order to sell, the price the broker receives in the market minus the broker's commission.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.MarkedDown;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Price is net to the disclosed client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDscld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is net to the disclosed client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#NetDisclosed
	 * OtherPrices1.NetDisclosed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NetDisclosed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "NetDscld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.NetDisclosed;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price is net to the client undisclosed (used in the UK market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetUdscld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUndisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is net to the client undisclosed (used in the UK market)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#NetUndisclosed
	 * OtherPrices1.NetUndisclosed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NetUndisclosed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "NetUdscld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.NetUndisclosed;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price is notional gross (used in the UK market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlGrss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is notional gross (used in the UK market)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#NotionalGross
	 * OtherPrices1.NotionalGross}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NotionalGross = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "NtnlGrss";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.NotionalGross;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price is weighted average price of the benchmark prices at the time of
	 * each partial fill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkWghtdAvrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkWeightedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is weighted average price of the benchmark prices at the time of each partial fill."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#BenchmarkWeightedAverage
	 * OtherPrices1.BenchmarkWeightedAverage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute BenchmarkWeightedAverage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "BchmkWghtdAvrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkWeightedAverage";
			definition = "Price is weighted average price of the benchmark prices at the time of each partial fill.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.BenchmarkWeightedAverage;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price is weighted average price of all market executions during the
	 * completion of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllMktsWghtdAvrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllMarketsWeightedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is weighted average price of all market executions during the completion of the order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#AllMarketsWeightedAverage
	 * OtherPrices1.AllMarketsWeightedAverage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AllMarketsWeightedAverage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "AllMktsWghtdAvrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMarketsWeightedAverage";
			definition = "Price is weighted average price of all market executions during the completion of the order.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.AllMarketsWeightedAverage;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price is a benchmark price relating to the current partial fills (eg,
	 * last trade tick from market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bchmk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Benchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#Benchmark
	 * OtherPrices1.Benchmark}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Benchmark = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "Bchmk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Benchmark";
			definition = "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.Benchmark;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Type of price that is not defined explicitly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of price that is not defined explicitly."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#OtherPrice
	 * OtherPrices1.OtherPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OtherPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "OthrPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrice";
			definition = "Type of price that is not defined explicitly.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.OtherPrice;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price of securities representing a particular market or a portion of it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of securities representing a particular market or a portion of it."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#IndexPrice
	 * OtherPrices1.IndexPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IndexPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "IndxPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPrice";
			definition = "Price of securities representing a particular market or a portion of it.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.IndexPrice;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price used to differentiate from price on a confirmation of a marked up
	 * or marked down principal trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#ReportedPrice
	 * OtherPrices1.ReportedPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReportedPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "RptdPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedPrice";
			definition = "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.ReportedPrice;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}
	};
	/**
	 * Price of reference of the concerned financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11
	 * PriceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of reference of the concerned financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#ReferencePrice
	 * OtherPrices1.ReferencePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReferencePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherPrices2.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of reference of the concerned financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherPrices1.ReferencePrice;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PriceInformation11.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherPrices2.Maximum, com.tools20022.repository.msg.OtherPrices2.Transaction, com.tools20022.repository.msg.OtherPrices2.MarketBrokerCommission,
						com.tools20022.repository.msg.OtherPrices2.MarkedUp, com.tools20022.repository.msg.OtherPrices2.MarkedDown, com.tools20022.repository.msg.OtherPrices2.NetDisclosed,
						com.tools20022.repository.msg.OtherPrices2.NetUndisclosed, com.tools20022.repository.msg.OtherPrices2.NotionalGross, com.tools20022.repository.msg.OtherPrices2.BenchmarkWeightedAverage,
						com.tools20022.repository.msg.OtherPrices2.AllMarketsWeightedAverage, com.tools20022.repository.msg.OtherPrices2.Benchmark, com.tools20022.repository.msg.OtherPrices2.OtherPrice,
						com.tools20022.repository.msg.OtherPrices2.IndexPrice, com.tools20022.repository.msg.OtherPrices2.ReportedPrice, com.tools20022.repository.msg.OtherPrices2.ReferencePrice);
				trace_lazy = () -> Price.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.OtherPrices);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OtherPrices2";
				definition = "Specifies the type of price and information about the price.";
				previousVersion_lazy = () -> OtherPrices1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}