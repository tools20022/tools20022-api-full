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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateType1Choice;
import com.tools20022.repository.choice.Quantity1Choice;
import com.tools20022.repository.codeset.LegSwapType1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additionnal details related to the leg.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegIdentification
 * InstrumentLeg2.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOrderQuantity
 * InstrumentLeg2.mmLegOrderQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegBidPrice
 * InstrumentLeg2.mmLegBidPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOfferPrice
 * InstrumentLeg2.mmLegOfferPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOptionRatio
 * InstrumentLeg2.mmLegOptionRatio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSwapType
 * InstrumentLeg2.mmLegSwapType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSettlementDate
 * InstrumentLeg2.mmLegSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSettlementDateCode
 * InstrumentLeg2.mmLegSettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmInstrumentLegDetails
 * InstrumentLeg2.mmInstrumentLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegFinancialInstrumentAttributes
 * InstrumentLeg2.mmLegFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegStipulations
 * InstrumentLeg2.mmLegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegBenchmarkCurveDetails
 * InstrumentLeg2.mmLegBenchmarkCurveDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmTradingParties
 * InstrumentLeg2.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmCashParties
 * InstrumentLeg2.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmOtherBusinessParties
 * InstrumentLeg2.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmReceivingSettlementParties
 * InstrumentLeg2.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmDeliveringSettlementParties
 * InstrumentLeg2.mmDeliveringSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
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
 * "InstrumentLeg2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additionnal details related to the leg."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstrumentLeg2", propOrder = {"legIdentification", "legOrderQuantity", "legBidPrice", "legOfferPrice", "legOptionRatio", "legSwapType", "legSettlementDate", "legSettlementDateCode", "instrumentLegDetails",
		"legFinancialInstrumentAttributes", "legStipulations", "legBenchmarkCurveDetails", "tradingParties", "cashParties", "otherBusinessParties", "receivingSettlementParties", "deliveringSettlementParties"})
public class InstrumentLeg2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 654</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used to identify a specific leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<Max35Text>> mmLegIdentification = new MMMessageAttribute<InstrumentLeg2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "654"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Used to identify a specific leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InstrumentLeg2 obj) {
			return obj.getLegIdentification();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<Max35Text> value) {
			obj.setLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LegOrdrQty", required = true)
	protected Quantity1Choice legOrderQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity1Choice
	 * Quantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegOrdrQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 685</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required for multileg Quote/Order and for each leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Quantity1Choice> mmLegOrderQuantity = new MMMessageAttribute<InstrumentLeg2, Quantity1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOrdrQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "685"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOrderQuantity";
			definition = "Required for multileg Quote/Order and for each leg.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity1Choice.mmObject();
		}

		@Override
		public Quantity1Choice getValue(InstrumentLeg2 obj) {
			return obj.getLegOrderQuantity();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Quantity1Choice value) {
			obj.setLegOrderQuantity(value);
		}
	};
	@XmlElement(name = "LegBidPric")
	protected Price1 legBidPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegBidPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 686, FIXSynonym: 681</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<Price1>> mmLegBidPrice = new MMMessageAttribute<InstrumentLeg2, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegBidPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "686"), new FIXSynonym(this, "681"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegBidPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(InstrumentLeg2 obj) {
			return obj.getLegBidPrice();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<Price1> value) {
			obj.setLegBidPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "LegOfferPric")
	protected Price1 legOfferPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegOfferPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 686, FIXSynonym: 684</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegOfferPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<Price1>> mmLegOfferPrice = new MMMessageAttribute<InstrumentLeg2, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOfferPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "686"), new FIXSynonym(this, "684"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOfferPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(InstrumentLeg2 obj) {
			return obj.getLegOfferPrice();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<Price1> value) {
			obj.setLegOfferPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "LegOptnRatio")
	protected PercentageRate legOptionRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionRatio
	 * Option.mmOptionRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegOptnRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegOptionRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A derived multiplier or factor used against the future leg to specify how many futures is needed to cover the option.\n\nExpresses the risk of an option legValue must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<PercentageRate>> mmLegOptionRatio = new MMMessageAttribute<InstrumentLeg2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOptnRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOptionRatio";
			definition = "A derived multiplier or factor used against the future leg to specify how many futures is needed to cover the option.\n\nExpresses the risk of an option legValue must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(InstrumentLeg2 obj) {
			return obj.getLegOptionRatio();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<PercentageRate> value) {
			obj.setLegOptionRatio(value.orElse(null));
		}
	};
	@XmlElement(name = "LegSwpTp")
	protected LegSwapType1Code legSwapType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code
	 * LegSwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmSwapType
	 * Leg.mmSwapType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSwpTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSwapType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<LegSwapType1Code>> mmLegSwapType = new MMMessageAttribute<InstrumentLeg2, Optional<LegSwapType1Code>>() {
		{
			businessElementTrace_lazy = () -> Leg.mmSwapType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSwpTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSwapType";
			definition = "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegSwapType1Code.mmObject();
		}

		@Override
		public Optional<LegSwapType1Code> getValue(InstrumentLeg2 obj) {
			return obj.getLegSwapType();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<LegSwapType1Code> value) {
			obj.setLegSwapType(value.orElse(null));
		}
	};
	@XmlElement(name = "LegSttlmDt")
	protected ISODateTime legSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<ISODateTime>> mmLegSettlementDate = new MMMessageAttribute<InstrumentLeg2, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementDate";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(InstrumentLeg2 obj) {
			return obj.getLegSettlementDate();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<ISODateTime> value) {
			obj.setLegSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LegSttlmDtCd")
	protected DateType1Choice legSettlementDateCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateType1Choice
	 * DateType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSettlementDateCode
	 * SecuritiesDeliveryObligation.mmSettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSttlmDtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSettlementDateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date of settlement for the leg in a coded form or using a data source scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstrumentLeg2, Optional<DateType1Choice>> mmLegSettlementDateCode = new MMMessageAttribute<InstrumentLeg2, Optional<DateType1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmSettlementDateCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmDtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementDateCode";
			definition = "Indicates the date of settlement for the leg in a coded form or using a data source scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateType1Choice.mmObject();
		}

		@Override
		public Optional<DateType1Choice> getValue(InstrumentLeg2 obj) {
			return obj.getLegSettlementDateCode();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<DateType1Choice> value) {
			obj.setLegSettlementDateCode(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrmLegDtls")
	protected SecurityIdentification7 instrumentLegDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmLegDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument of a particular leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<SecurityIdentification7>> mmInstrumentLegDetails = new MMMessageAssociationEnd<InstrumentLeg2, Optional<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegDetails";
			definition = "Provides details about the financial instrument of a particular leg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public Optional<SecurityIdentification7> getValue(InstrumentLeg2 obj) {
			return obj.getInstrumentLegDetails();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<SecurityIdentification7> value) {
			obj.setInstrumentLegDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "LegFinInstrmAttrbts")
	protected FinancialInstrumentAttributes1 legFinancialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
	 * Leg.mmRelatedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the leg financial instrument attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<FinancialInstrumentAttributes1>> mmLegFinancialInstrumentAttributes = new MMMessageAssociationEnd<InstrumentLeg2, Optional<FinancialInstrumentAttributes1>>() {
		{
			businessElementTrace_lazy = () -> Leg.mmRelatedAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegFinancialInstrumentAttributes";
			definition = "Provides details about the leg financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes1> getValue(InstrumentLeg2 obj) {
			return obj.getLegFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<FinancialInstrumentAttributes1> value) {
			obj.setLegFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "LegStiptns")
	protected FinancialInstrumentStipulations legStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegStiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the leg stipulations."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<FinancialInstrumentStipulations>> mmLegStipulations = new MMMessageAssociationEnd<InstrumentLeg2, Optional<FinancialInstrumentStipulations>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegStipulations";
			definition = "Provides details about the leg stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentStipulations> getValue(InstrumentLeg2 obj) {
			return obj.getLegStipulations();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<FinancialInstrumentStipulations> value) {
			obj.setLegStipulations(value.orElse(null));
		}
	};
	@XmlElement(name = "LegBchmkCrvDtls")
	protected BenchmarkCurve1 legBenchmarkCurveDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve1
	 * BenchmarkCurve1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
	 * Spread.mmBenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegBchmkCrvDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegBenchmarkCurveDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes a benchmark curve."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<BenchmarkCurve1>> mmLegBenchmarkCurveDetails = new MMMessageAssociationEnd<InstrumentLeg2, Optional<BenchmarkCurve1>>() {
		{
			businessElementTrace_lazy = () -> Spread.mmBenchmarkCurve;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegBenchmarkCurveDetails";
			definition = "Describes a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BenchmarkCurve1.mmObject();
		}

		@Override
		public Optional<BenchmarkCurve1> getValue(InstrumentLeg2 obj) {
			return obj.getLegBenchmarkCurveDetails();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<BenchmarkCurve1> value) {
			obj.setLegBenchmarkCurveDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, List<Intermediary14>> mmTradingParties = new MMMessageAssociationEnd<InstrumentLeg2, List<Intermediary14>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(InstrumentLeg2 obj) {
			return obj.getTradingParties();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, List<Intermediary14> value) {
			obj.setTradingParties(value);
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<CashParties1>> mmCashParties = new MMMessageAssociationEnd<InstrumentLeg2, Optional<CashParties1>>() {
		{
			businessComponentTrace_lazy = () -> PaymentPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties1.mmObject();
		}

		@Override
		public Optional<CashParties1> getValue(InstrumentLeg2 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<CashParties1> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetPartyRole
	 * Asset.mmAssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<OtherParties1>> mmOtherBusinessParties = new MMMessageAssociationEnd<InstrumentLeg2, Optional<OtherParties1>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties1.mmObject();
		}

		@Override
		public Optional<OtherParties1> getValue(InstrumentLeg2 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<OtherParties1> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<SettlementParties3>> mmReceivingSettlementParties = new MMMessageAssociationEnd<InstrumentLeg2, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(InstrumentLeg2 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<SettlementParties3> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstrumentLeg2, Optional<SettlementParties3>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<InstrumentLeg2, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(InstrumentLeg2 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(InstrumentLeg2 obj, Optional<SettlementParties3> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.mmLegIdentification, com.tools20022.repository.msg.InstrumentLeg2.mmLegOrderQuantity,
						com.tools20022.repository.msg.InstrumentLeg2.mmLegBidPrice, com.tools20022.repository.msg.InstrumentLeg2.mmLegOfferPrice, com.tools20022.repository.msg.InstrumentLeg2.mmLegOptionRatio,
						com.tools20022.repository.msg.InstrumentLeg2.mmLegSwapType, com.tools20022.repository.msg.InstrumentLeg2.mmLegSettlementDate, com.tools20022.repository.msg.InstrumentLeg2.mmLegSettlementDateCode,
						com.tools20022.repository.msg.InstrumentLeg2.mmInstrumentLegDetails, com.tools20022.repository.msg.InstrumentLeg2.mmLegFinancialInstrumentAttributes, com.tools20022.repository.msg.InstrumentLeg2.mmLegStipulations,
						com.tools20022.repository.msg.InstrumentLeg2.mmLegBenchmarkCurveDetails, com.tools20022.repository.msg.InstrumentLeg2.mmTradingParties, com.tools20022.repository.msg.InstrumentLeg2.mmCashParties,
						com.tools20022.repository.msg.InstrumentLeg2.mmOtherBusinessParties, com.tools20022.repository.msg.InstrumentLeg2.mmReceivingSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg2.mmDeliveringSettlementParties);
				trace_lazy = () -> Leg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InstrumentLeg2";
				definition = "Additionnal details related to the leg.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public InstrumentLeg2 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public Quantity1Choice getLegOrderQuantity() {
		return legOrderQuantity;
	}

	public InstrumentLeg2 setLegOrderQuantity(Quantity1Choice legOrderQuantity) {
		this.legOrderQuantity = Objects.requireNonNull(legOrderQuantity);
		return this;
	}

	public Optional<Price1> getLegBidPrice() {
		return legBidPrice == null ? Optional.empty() : Optional.of(legBidPrice);
	}

	public InstrumentLeg2 setLegBidPrice(Price1 legBidPrice) {
		this.legBidPrice = legBidPrice;
		return this;
	}

	public Optional<Price1> getLegOfferPrice() {
		return legOfferPrice == null ? Optional.empty() : Optional.of(legOfferPrice);
	}

	public InstrumentLeg2 setLegOfferPrice(Price1 legOfferPrice) {
		this.legOfferPrice = legOfferPrice;
		return this;
	}

	public Optional<PercentageRate> getLegOptionRatio() {
		return legOptionRatio == null ? Optional.empty() : Optional.of(legOptionRatio);
	}

	public InstrumentLeg2 setLegOptionRatio(PercentageRate legOptionRatio) {
		this.legOptionRatio = legOptionRatio;
		return this;
	}

	public Optional<LegSwapType1Code> getLegSwapType() {
		return legSwapType == null ? Optional.empty() : Optional.of(legSwapType);
	}

	public InstrumentLeg2 setLegSwapType(LegSwapType1Code legSwapType) {
		this.legSwapType = legSwapType;
		return this;
	}

	public Optional<ISODateTime> getLegSettlementDate() {
		return legSettlementDate == null ? Optional.empty() : Optional.of(legSettlementDate);
	}

	public InstrumentLeg2 setLegSettlementDate(ISODateTime legSettlementDate) {
		this.legSettlementDate = legSettlementDate;
		return this;
	}

	public Optional<DateType1Choice> getLegSettlementDateCode() {
		return legSettlementDateCode == null ? Optional.empty() : Optional.of(legSettlementDateCode);
	}

	public InstrumentLeg2 setLegSettlementDateCode(DateType1Choice legSettlementDateCode) {
		this.legSettlementDateCode = legSettlementDateCode;
		return this;
	}

	public Optional<SecurityIdentification7> getInstrumentLegDetails() {
		return instrumentLegDetails == null ? Optional.empty() : Optional.of(instrumentLegDetails);
	}

	public InstrumentLeg2 setInstrumentLegDetails(SecurityIdentification7 instrumentLegDetails) {
		this.instrumentLegDetails = instrumentLegDetails;
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getLegFinancialInstrumentAttributes() {
		return legFinancialInstrumentAttributes == null ? Optional.empty() : Optional.of(legFinancialInstrumentAttributes);
	}

	public InstrumentLeg2 setLegFinancialInstrumentAttributes(FinancialInstrumentAttributes1 legFinancialInstrumentAttributes) {
		this.legFinancialInstrumentAttributes = legFinancialInstrumentAttributes;
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getLegStipulations() {
		return legStipulations == null ? Optional.empty() : Optional.of(legStipulations);
	}

	public InstrumentLeg2 setLegStipulations(FinancialInstrumentStipulations legStipulations) {
		this.legStipulations = legStipulations;
		return this;
	}

	public Optional<BenchmarkCurve1> getLegBenchmarkCurveDetails() {
		return legBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(legBenchmarkCurveDetails);
	}

	public InstrumentLeg2 setLegBenchmarkCurveDetails(BenchmarkCurve1 legBenchmarkCurveDetails) {
		this.legBenchmarkCurveDetails = legBenchmarkCurveDetails;
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public InstrumentLeg2 setTradingParties(List<Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<CashParties1> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public InstrumentLeg2 setCashParties(CashParties1 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public InstrumentLeg2 setOtherBusinessParties(OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public InstrumentLeg2 setReceivingSettlementParties(SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<SettlementParties3> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public InstrumentLeg2 setDeliveringSettlementParties(SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}
}