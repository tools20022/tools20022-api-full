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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMaximum
 * OtherPrices1.mmMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmTransaction
 * OtherPrices1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarketBrokerCommission
 * OtherPrices1.mmMarketBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedUp
 * OtherPrices1.mmMarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedDown
 * OtherPrices1.mmMarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetDisclosed
 * OtherPrices1.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetUndisclosed
 * OtherPrices1.mmNetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNotionalGross
 * OtherPrices1.mmNotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmarkWeightedAverage
 * OtherPrices1.mmBenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmAllMarketsWeightedAverage
 * OtherPrices1.mmAllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmark
 * OtherPrices1.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmOtherPrice
 * OtherPrices1.mmOtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmIndexPrice
 * OtherPrices1.mmIndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReportedPrice
 * OtherPrices1.mmReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReferencePrice
 * OtherPrices1.mmReferencePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherPrices
 * SecuritiesTradeConfirmationV01.mmOtherPrices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmOtherPrices
 * SecuritiesTradeConfirmationV02.mmOtherPrices}</li>
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
 * "OtherPrices1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class OtherPrices1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Price4 maximum;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMaximum
	 * OtherPrices2.mmMaximum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximum = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Max";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			definition = "Specifies the maximum price.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMaximum);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 transaction;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmTransaction
	 * OtherPrices2.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Specifies the transaction price.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 marketBrokerCommission;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
	 * Adjustment.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarketBrokerCommission
	 * OtherPrices2.mmMarketBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmPrice;
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MktBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketBrokerCommission";
			definition = "Market price including or excluding the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarketBrokerCommission);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 markedUp;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedUp
	 * OtherPrices2.mmMarkedUp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkedUp = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MrkdUp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedUp";
			definition = "In case of an order to buy, the price that the broker paid on the market plus the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarkedUp);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 markedDown;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedDown
	 * OtherPrices2.mmMarkedDown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkedDown = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MrkdDwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedDown";
			definition = "In case of an order to sell, the price the broker receives in the market minus the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarkedDown);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 netDisclosed;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetDisclosed
	 * OtherPrices2.mmNetDisclosed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetDisclosed = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NetDscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNetDisclosed);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 netUndisclosed;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetUndisclosed
	 * OtherPrices2.mmNetUndisclosed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetUndisclosed = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NetUdscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNetUndisclosed);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 notionalGross;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNotionalGross
	 * OtherPrices2.mmNotionalGross}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalGross = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NtnlGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNotionalGross);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 benchmarkWeightedAverage;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmarkWeightedAverage
	 * OtherPrices2.mmBenchmarkWeightedAverage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkWeightedAverage = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "BchmkWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkWeightedAverage";
			definition = "Price is weighted average price of the benchmark prices at the time of each partial fill.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmBenchmarkWeightedAverage);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 allMarketsWeightedAverage;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmAllMarketsWeightedAverage
	 * OtherPrices2.mmAllMarketsWeightedAverage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllMarketsWeightedAverage = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "AllMktsWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMarketsWeightedAverage";
			definition = "Price is weighted average price of all market executions during the completion of the order.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmAllMarketsWeightedAverage);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 benchmark;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmark
	 * OtherPrices2.mmBenchmark}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmark = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Bchmk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Benchmark";
			definition = "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmBenchmark);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 otherPrice;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmOtherPrice
	 * OtherPrices2.mmOtherPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "OthrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrice";
			definition = "Type of price that is not defined explicitly.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmOtherPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 indexPrice;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmIndexPrice
	 * OtherPrices2.mmIndexPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "IndxPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPrice";
			definition = "Price of securities representing a particular market or a portion of it.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmIndexPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected Price4 reportedPrice;
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmReportedPrice
	 * OtherPrices2.mmReportedPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "RptdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedPrice";
			definition = "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmReportedPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected PriceInformation9 referencePrice;
	/**
	 * Price of reference of the concerned financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmReferencePrice
	 * OtherPrices2.mmReferencePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferencePrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of reference of the concerned financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmReferencePrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceInformation9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherPrices1.mmMaximum, OtherPrices1.mmTransaction, OtherPrices1.mmMarketBrokerCommission, OtherPrices1.mmMarkedUp, OtherPrices1.mmMarkedDown, OtherPrices1.mmNetDisclosed,
						OtherPrices1.mmNetUndisclosed, OtherPrices1.mmNotionalGross, OtherPrices1.mmBenchmarkWeightedAverage, OtherPrices1.mmAllMarketsWeightedAverage, OtherPrices1.mmBenchmark, OtherPrices1.mmOtherPrice,
						OtherPrices1.mmIndexPrice, OtherPrices1.mmReportedPrice, OtherPrices1.mmReferencePrice);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmOtherPrices, SecuritiesTradeConfirmationV02.mmOtherPrices);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherPrices1";
				definition = "Specifies the type of price and information about the price.";
				nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Price4 getMaximum() {
		return maximum;
	}

	public void setMaximum(com.tools20022.repository.msg.Price4 maximum) {
		this.maximum = maximum;
	}

	public Price4 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.Price4 transaction) {
		this.transaction = transaction;
	}

	public Price4 getMarketBrokerCommission() {
		return marketBrokerCommission;
	}

	public void setMarketBrokerCommission(com.tools20022.repository.msg.Price4 marketBrokerCommission) {
		this.marketBrokerCommission = marketBrokerCommission;
	}

	public Price4 getMarkedUp() {
		return markedUp;
	}

	public void setMarkedUp(com.tools20022.repository.msg.Price4 markedUp) {
		this.markedUp = markedUp;
	}

	public Price4 getMarkedDown() {
		return markedDown;
	}

	public void setMarkedDown(com.tools20022.repository.msg.Price4 markedDown) {
		this.markedDown = markedDown;
	}

	public Price4 getNetDisclosed() {
		return netDisclosed;
	}

	public void setNetDisclosed(com.tools20022.repository.msg.Price4 netDisclosed) {
		this.netDisclosed = netDisclosed;
	}

	public Price4 getNetUndisclosed() {
		return netUndisclosed;
	}

	public void setNetUndisclosed(com.tools20022.repository.msg.Price4 netUndisclosed) {
		this.netUndisclosed = netUndisclosed;
	}

	public Price4 getNotionalGross() {
		return notionalGross;
	}

	public void setNotionalGross(com.tools20022.repository.msg.Price4 notionalGross) {
		this.notionalGross = notionalGross;
	}

	public Price4 getBenchmarkWeightedAverage() {
		return benchmarkWeightedAverage;
	}

	public void setBenchmarkWeightedAverage(com.tools20022.repository.msg.Price4 benchmarkWeightedAverage) {
		this.benchmarkWeightedAverage = benchmarkWeightedAverage;
	}

	public Price4 getAllMarketsWeightedAverage() {
		return allMarketsWeightedAverage;
	}

	public void setAllMarketsWeightedAverage(com.tools20022.repository.msg.Price4 allMarketsWeightedAverage) {
		this.allMarketsWeightedAverage = allMarketsWeightedAverage;
	}

	public Price4 getBenchmark() {
		return benchmark;
	}

	public void setBenchmark(com.tools20022.repository.msg.Price4 benchmark) {
		this.benchmark = benchmark;
	}

	public Price4 getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(com.tools20022.repository.msg.Price4 otherPrice) {
		this.otherPrice = otherPrice;
	}

	public Price4 getIndexPrice() {
		return indexPrice;
	}

	public void setIndexPrice(com.tools20022.repository.msg.Price4 indexPrice) {
		this.indexPrice = indexPrice;
	}

	public Price4 getReportedPrice() {
		return reportedPrice;
	}

	public void setReportedPrice(com.tools20022.repository.msg.Price4 reportedPrice) {
		this.reportedPrice = reportedPrice;
	}

	public PriceInformation9 getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(com.tools20022.repository.msg.PriceInformation9 referencePrice) {
		this.referencePrice = referencePrice;
	}
}