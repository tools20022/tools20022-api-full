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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price4;
import com.tools20022.repository.msg.PriceInformation11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMaximum
 * OtherPrices2.mmMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmTransaction
 * OtherPrices2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarketBrokerCommission
 * OtherPrices2.mmMarketBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedUp
 * OtherPrices2.mmMarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedDown
 * OtherPrices2.mmMarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetDisclosed
 * OtherPrices2.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetUndisclosed
 * OtherPrices2.mmNetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNotionalGross
 * OtherPrices2.mmNotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmarkWeightedAverage
 * OtherPrices2.mmBenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmAllMarketsWeightedAverage
 * OtherPrices2.mmAllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmark
 * OtherPrices2.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmOtherPrice
 * OtherPrices2.mmOtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmIndexPrice
 * OtherPrices2.mmIndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmReportedPrice
 * OtherPrices2.mmReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmReferencePrice
 * OtherPrices2.mmReferencePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherPrices
 * SecuritiesTradeConfirmationV03.mmOtherPrices}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherPrices2", propOrder = {"maximum", "transaction", "marketBrokerCommission", "markedUp", "markedDown", "netDisclosed", "netUndisclosed", "notionalGross", "benchmarkWeightedAverage", "allMarketsWeightedAverage",
		"benchmark", "otherPrice", "indexPrice", "reportedPrice", "referencePrice"})
public class OtherPrices2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Max")
	protected Price4 maximum;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMaximum
	 * OtherPrices1.mmMaximum}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherPrices2, Optional<Price4>> mmMaximum = new MMMessageAssociationEnd<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "Max";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			definition = "Specifies the maximum price.";
			previousVersion_lazy = () -> OtherPrices1.mmMaximum;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getMaximum();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setMaximum(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx")
	protected Price4 transaction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmTransaction
	 * OtherPrices1.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherPrices2, Optional<Price4>> mmTransaction = new MMMessageAssociationEnd<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Specifies the transaction price.";
			previousVersion_lazy = () -> OtherPrices1.mmTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "MktBrkrComssn")
	protected Price4 marketBrokerCommission;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarketBrokerCommission
	 * OtherPrices1.mmMarketBrokerCommission}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmMarketBrokerCommission = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "MktBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketBrokerCommission";
			definition = "Market price including or excluding the broker's commission.";
			previousVersion_lazy = () -> OtherPrices1.mmMarketBrokerCommission;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getMarketBrokerCommission();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setMarketBrokerCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "MrkdUp")
	protected Price4 markedUp;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedUp
	 * OtherPrices1.mmMarkedUp}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherPrices2, Optional<Price4>> mmMarkedUp = new MMMessageAssociationEnd<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "MrkdUp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedUp";
			definition = "In case of an order to buy, the price that the broker paid on the market plus the broker's commission.";
			previousVersion_lazy = () -> OtherPrices1.mmMarkedUp;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getMarkedUp();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setMarkedUp(value.orElse(null));
		}
	};
	@XmlElement(name = "MrkdDwn")
	protected Price4 markedDown;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedDown
	 * OtherPrices1.mmMarkedDown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherPrices2, Optional<Price4>> mmMarkedDown = new MMMessageAssociationEnd<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "MrkdDwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedDown";
			definition = "In case of an order to sell, the price the broker receives in the market minus the broker's commission.";
			previousVersion_lazy = () -> OtherPrices1.mmMarkedDown;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getMarkedDown();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setMarkedDown(value.orElse(null));
		}
	};
	@XmlElement(name = "NetDscld")
	protected Price4 netDisclosed;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetDisclosed
	 * OtherPrices1.mmNetDisclosed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmNetDisclosed = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "NetDscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			previousVersion_lazy = () -> OtherPrices1.mmNetDisclosed;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getNetDisclosed();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setNetDisclosed(value.orElse(null));
		}
	};
	@XmlElement(name = "NetUdscld")
	protected Price4 netUndisclosed;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetUndisclosed
	 * OtherPrices1.mmNetUndisclosed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmNetUndisclosed = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "NetUdscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			previousVersion_lazy = () -> OtherPrices1.mmNetUndisclosed;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getNetUndisclosed();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setNetUndisclosed(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlGrss")
	protected Price4 notionalGross;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmNotionalGross
	 * OtherPrices1.mmNotionalGross}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmNotionalGross = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "NtnlGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			previousVersion_lazy = () -> OtherPrices1.mmNotionalGross;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getNotionalGross();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setNotionalGross(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkWghtdAvrg")
	protected Price4 benchmarkWeightedAverage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmarkWeightedAverage
	 * OtherPrices1.mmBenchmarkWeightedAverage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmBenchmarkWeightedAverage = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "BchmkWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkWeightedAverage";
			definition = "Price is weighted average price of the benchmark prices at the time of each partial fill.";
			previousVersion_lazy = () -> OtherPrices1.mmBenchmarkWeightedAverage;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getBenchmarkWeightedAverage();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setBenchmarkWeightedAverage(value.orElse(null));
		}
	};
	@XmlElement(name = "AllMktsWghtdAvrg")
	protected Price4 allMarketsWeightedAverage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmAllMarketsWeightedAverage
	 * OtherPrices1.mmAllMarketsWeightedAverage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmAllMarketsWeightedAverage = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "AllMktsWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMarketsWeightedAverage";
			definition = "Price is weighted average price of all market executions during the completion of the order.";
			previousVersion_lazy = () -> OtherPrices1.mmAllMarketsWeightedAverage;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getAllMarketsWeightedAverage();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setAllMarketsWeightedAverage(value.orElse(null));
		}
	};
	@XmlElement(name = "Bchmk")
	protected Price4 benchmark;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmark
	 * OtherPrices1.mmBenchmark}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmBenchmark = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "Bchmk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Benchmark";
			definition = "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market).";
			previousVersion_lazy = () -> OtherPrices1.mmBenchmark;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getBenchmark();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setBenchmark(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrPric")
	protected Price4 otherPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmOtherPrice
	 * OtherPrices1.mmOtherPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmOtherPrice = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "OthrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrice";
			definition = "Type of price that is not defined explicitly.";
			previousVersion_lazy = () -> OtherPrices1.mmOtherPrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getOtherPrice();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setOtherPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "IndxPric")
	protected Price4 indexPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmIndexPrice
	 * OtherPrices1.mmIndexPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmIndexPrice = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "IndxPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPrice";
			definition = "Price of securities representing a particular market or a portion of it.";
			previousVersion_lazy = () -> OtherPrices1.mmIndexPrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getIndexPrice();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setIndexPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RptdPric")
	protected Price4 reportedPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmReportedPrice
	 * OtherPrices1.mmReportedPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<Price4>> mmReportedPrice = new MMMessageAttribute<OtherPrices2, Optional<Price4>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "RptdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedPrice";
			definition = "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade.";
			previousVersion_lazy = () -> OtherPrices1.mmReportedPrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(OtherPrices2 obj) {
			return obj.getReportedPrice();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<Price4> value) {
			obj.setReportedPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RefPric")
	protected PriceInformation11 referencePrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmReferencePrice
	 * OtherPrices1.mmReferencePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherPrices2, Optional<PriceInformation11>> mmReferencePrice = new MMMessageAttribute<OtherPrices2, Optional<PriceInformation11>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices2.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of reference of the concerned financial instrument.";
			previousVersion_lazy = () -> OtherPrices1.mmReferencePrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceInformation11.mmObject();
		}

		@Override
		public Optional<PriceInformation11> getValue(OtherPrices2 obj) {
			return obj.getReferencePrice();
		}

		@Override
		public void setValue(OtherPrices2 obj, Optional<PriceInformation11> value) {
			obj.setReferencePrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherPrices2.mmMaximum, com.tools20022.repository.msg.OtherPrices2.mmTransaction, com.tools20022.repository.msg.OtherPrices2.mmMarketBrokerCommission,
						com.tools20022.repository.msg.OtherPrices2.mmMarkedUp, com.tools20022.repository.msg.OtherPrices2.mmMarkedDown, com.tools20022.repository.msg.OtherPrices2.mmNetDisclosed,
						com.tools20022.repository.msg.OtherPrices2.mmNetUndisclosed, com.tools20022.repository.msg.OtherPrices2.mmNotionalGross, com.tools20022.repository.msg.OtherPrices2.mmBenchmarkWeightedAverage,
						com.tools20022.repository.msg.OtherPrices2.mmAllMarketsWeightedAverage, com.tools20022.repository.msg.OtherPrices2.mmBenchmark, com.tools20022.repository.msg.OtherPrices2.mmOtherPrice,
						com.tools20022.repository.msg.OtherPrices2.mmIndexPrice, com.tools20022.repository.msg.OtherPrices2.mmReportedPrice, com.tools20022.repository.msg.OtherPrices2.mmReferencePrice);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV03.mmOtherPrices);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherPrices2";
				definition = "Specifies the type of price and information about the price.";
				previousVersion_lazy = () -> OtherPrices1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Price4> getMaximum() {
		return maximum == null ? Optional.empty() : Optional.of(maximum);
	}

	public OtherPrices2 setMaximum(Price4 maximum) {
		this.maximum = maximum;
		return this;
	}

	public Optional<Price4> getTransaction() {
		return transaction == null ? Optional.empty() : Optional.of(transaction);
	}

	public OtherPrices2 setTransaction(Price4 transaction) {
		this.transaction = transaction;
		return this;
	}

	public Optional<Price4> getMarketBrokerCommission() {
		return marketBrokerCommission == null ? Optional.empty() : Optional.of(marketBrokerCommission);
	}

	public OtherPrices2 setMarketBrokerCommission(Price4 marketBrokerCommission) {
		this.marketBrokerCommission = marketBrokerCommission;
		return this;
	}

	public Optional<Price4> getMarkedUp() {
		return markedUp == null ? Optional.empty() : Optional.of(markedUp);
	}

	public OtherPrices2 setMarkedUp(Price4 markedUp) {
		this.markedUp = markedUp;
		return this;
	}

	public Optional<Price4> getMarkedDown() {
		return markedDown == null ? Optional.empty() : Optional.of(markedDown);
	}

	public OtherPrices2 setMarkedDown(Price4 markedDown) {
		this.markedDown = markedDown;
		return this;
	}

	public Optional<Price4> getNetDisclosed() {
		return netDisclosed == null ? Optional.empty() : Optional.of(netDisclosed);
	}

	public OtherPrices2 setNetDisclosed(Price4 netDisclosed) {
		this.netDisclosed = netDisclosed;
		return this;
	}

	public Optional<Price4> getNetUndisclosed() {
		return netUndisclosed == null ? Optional.empty() : Optional.of(netUndisclosed);
	}

	public OtherPrices2 setNetUndisclosed(Price4 netUndisclosed) {
		this.netUndisclosed = netUndisclosed;
		return this;
	}

	public Optional<Price4> getNotionalGross() {
		return notionalGross == null ? Optional.empty() : Optional.of(notionalGross);
	}

	public OtherPrices2 setNotionalGross(Price4 notionalGross) {
		this.notionalGross = notionalGross;
		return this;
	}

	public Optional<Price4> getBenchmarkWeightedAverage() {
		return benchmarkWeightedAverage == null ? Optional.empty() : Optional.of(benchmarkWeightedAverage);
	}

	public OtherPrices2 setBenchmarkWeightedAverage(Price4 benchmarkWeightedAverage) {
		this.benchmarkWeightedAverage = benchmarkWeightedAverage;
		return this;
	}

	public Optional<Price4> getAllMarketsWeightedAverage() {
		return allMarketsWeightedAverage == null ? Optional.empty() : Optional.of(allMarketsWeightedAverage);
	}

	public OtherPrices2 setAllMarketsWeightedAverage(Price4 allMarketsWeightedAverage) {
		this.allMarketsWeightedAverage = allMarketsWeightedAverage;
		return this;
	}

	public Optional<Price4> getBenchmark() {
		return benchmark == null ? Optional.empty() : Optional.of(benchmark);
	}

	public OtherPrices2 setBenchmark(Price4 benchmark) {
		this.benchmark = benchmark;
		return this;
	}

	public Optional<Price4> getOtherPrice() {
		return otherPrice == null ? Optional.empty() : Optional.of(otherPrice);
	}

	public OtherPrices2 setOtherPrice(Price4 otherPrice) {
		this.otherPrice = otherPrice;
		return this;
	}

	public Optional<Price4> getIndexPrice() {
		return indexPrice == null ? Optional.empty() : Optional.of(indexPrice);
	}

	public OtherPrices2 setIndexPrice(Price4 indexPrice) {
		this.indexPrice = indexPrice;
		return this;
	}

	public Optional<Price4> getReportedPrice() {
		return reportedPrice == null ? Optional.empty() : Optional.of(reportedPrice);
	}

	public OtherPrices2 setReportedPrice(Price4 reportedPrice) {
		this.reportedPrice = reportedPrice;
		return this;
	}

	public Optional<PriceInformation11> getReferencePrice() {
		return referencePrice == null ? Optional.empty() : Optional.of(referencePrice);
	}

	public OtherPrices2 setReferencePrice(PriceInformation11 referencePrice) {
		this.referencePrice = referencePrice;
		return this;
	}
}