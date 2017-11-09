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
import com.tools20022.repository.choice.DateType1Choice;
import com.tools20022.repository.choice.Quantity1Choice;
import com.tools20022.repository.codeset.LegSwapType1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class InstrumentLeg2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text legIdentification;
	/**
	 * Used to identify a specific leg.
	 * <p>
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
	public static final MMMessageAttribute mmLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Used to identify a specific leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Quantity1Choice legOrderQuantity;
	/**
	 * Required for multileg Quote/Order and for each leg.
	 * <p>
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
	public static final MMMessageAttribute mmLegOrderQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOrdrQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOrderQuantity";
			definition = "Required for multileg Quote/Order and for each leg.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity1Choice.mmObject();
		}
	};
	protected Price1 legBidPrice;
	/**
	 * Amount of money for which goods or services are offered, sold, or bought.
	 * <p>
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
	public static final MMMessageAttribute mmLegBidPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegBidPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected Price1 legOfferPrice;
	/**
	 * Amount of money for which goods or services are offered, sold, or bought.
	 * <p>
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
	public static final MMMessageAttribute mmLegOfferPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOfferPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOfferPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected PercentageRate legOptionRatio;
	/**
	 * A derived multiplier or factor used against the future leg to specify how
	 * many futures is needed to cover the option.
	 * 
	 * Expresses the risk of an option legValue must be between -1 and 1. A Call
	 * Option will require a ratio value between 0 and 1. A Put Option will
	 * require a ratio value between -1 and 0.
	 * <p>
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
	public static final MMMessageAttribute mmLegOptionRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionRatio;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegOptnRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOptionRatio";
			definition = "A derived multiplier or factor used against the future leg to specify how many futures is needed to cover the option.\n\nExpresses the risk of an option legValue must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected LegSwapType1Code legSwapType;
	/**
	 * For Fixed Income, used instead of LegQty or LegOrderQty to requests the
	 * respondent to calculate the quantity based on the quantity on the
	 * opposite side of the swap.
	 * <p>
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
	public static final MMMessageAttribute mmLegSwapType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Leg.mmSwapType;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSwpTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSwapType";
			definition = "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegSwapType1Code.mmObject();
		}
	};
	protected ISODateTime legSettlementDate;
	/**
	 * Parameters applied to the settlement of a security transfer.
	 * <p>
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
	public static final MMMessageAttribute mmLegSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementDate";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateType1Choice legSettlementDateCode;
	/**
	 * Indicates the date of settlement for the leg in a coded form or using a
	 * data source scheme.
	 * <p>
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
	public static final MMMessageAttribute mmLegSettlementDateCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmSettlementDateCode;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmDtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementDateCode";
			definition = "Indicates the date of settlement for the leg in a coded form or using a data source scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateType1Choice.mmObject();
		}
	};
	protected SecurityIdentification7 instrumentLegDetails;
	/**
	 * Provides details about the financial instrument of a particular leg.
	 * <p>
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
	public static final MMMessageAssociationEnd mmInstrumentLegDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegDetails";
			definition = "Provides details about the financial instrument of a particular leg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected FinancialInstrumentAttributes1 legFinancialInstrumentAttributes;
	/**
	 * Provides details about the leg financial instrument attributes.
	 * <p>
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
	public static final MMMessageAssociationEnd mmLegFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Leg.mmRelatedAsset;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegFinancialInstrumentAttributes";
			definition = "Provides details about the leg financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	protected FinancialInstrumentStipulations legStipulations;
	/**
	 * Provides details about the leg stipulations
	 * <p>
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
	 * definition} = "Provides details about the leg stipulations"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegStipulations = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegStipulations";
			definition = "Provides details about the leg stipulations";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};
	protected BenchmarkCurve1 legBenchmarkCurveDetails;
	/**
	 * Describes a benchmark curve.
	 * <p>
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
	public static final MMMessageAssociationEnd mmLegBenchmarkCurveDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Spread.mmBenchmarkCurve;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "LegBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegBenchmarkCurveDetails";
			definition = "Describes a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Intermediary14> tradingParties;
	/**
	 * Organised structure that is set up for a particular purpose, eg, a
	 * business, government body, department, charity, or financial institution.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTradingParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary14.mmObject();
		}
	};
	protected CashParties1 cashParties;
	/**
	 * Payment processes required to transfer cash from the debtor to the
	 * creditor.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCashParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentPartyRole.mmObject();
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashParties1.mmObject();
		}
	};
	protected OtherParties1 otherBusinessParties;
	/**
	 * Chain of parties involved in the settlement of a transaction, including
	 * receipts and deliveries, book transfers, treasury deals, or other
	 * activities, resulting in the movement of a security or amount of money
	 * from one account to another.
	 * <p>
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
	public static final MMMessageAssociationEnd mmOtherBusinessParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetPartyRole;
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherParties1.mmObject();
		}
	};
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * Chain of parties involved in the settlement of a transaction, including
	 * receipts and deliveries, book transfers, treasury deals, or other
	 * activities, resulting in the movement of a security or amount of money
	 * from one account to another.
	 * <p>
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
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties3.mmObject();
		}
	};
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * Chain of parties involved in the settlement of a transaction, including
	 * receipts and deliveries, book transfers, treasury deals, or other
	 * activities, resulting in the movement of a security or amount of money
	 * from one account to another.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> InstrumentLeg2.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstrumentLeg2.mmLegIdentification, InstrumentLeg2.mmLegOrderQuantity, InstrumentLeg2.mmLegBidPrice, InstrumentLeg2.mmLegOfferPrice, InstrumentLeg2.mmLegOptionRatio,
						InstrumentLeg2.mmLegSwapType, InstrumentLeg2.mmLegSettlementDate, InstrumentLeg2.mmLegSettlementDateCode, InstrumentLeg2.mmInstrumentLegDetails, InstrumentLeg2.mmLegFinancialInstrumentAttributes,
						InstrumentLeg2.mmLegStipulations, InstrumentLeg2.mmLegBenchmarkCurveDetails, InstrumentLeg2.mmTradingParties, InstrumentLeg2.mmCashParties, InstrumentLeg2.mmOtherBusinessParties,
						InstrumentLeg2.mmReceivingSettlementParties, InstrumentLeg2.mmDeliveringSettlementParties);
				trace_lazy = () -> Leg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InstrumentLeg2";
				definition = "Additionnal details related to the leg.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLegIdentification() {
		return legIdentification;
	}

	public void setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
	}

	public Quantity1Choice getLegOrderQuantity() {
		return legOrderQuantity;
	}

	public void setLegOrderQuantity(Quantity1Choice legOrderQuantity) {
		this.legOrderQuantity = legOrderQuantity;
	}

	public Price1 getLegBidPrice() {
		return legBidPrice;
	}

	public void setLegBidPrice(com.tools20022.repository.msg.Price1 legBidPrice) {
		this.legBidPrice = legBidPrice;
	}

	public Price1 getLegOfferPrice() {
		return legOfferPrice;
	}

	public void setLegOfferPrice(com.tools20022.repository.msg.Price1 legOfferPrice) {
		this.legOfferPrice = legOfferPrice;
	}

	public PercentageRate getLegOptionRatio() {
		return legOptionRatio;
	}

	public void setLegOptionRatio(PercentageRate legOptionRatio) {
		this.legOptionRatio = legOptionRatio;
	}

	public LegSwapType1Code getLegSwapType() {
		return legSwapType;
	}

	public void setLegSwapType(LegSwapType1Code legSwapType) {
		this.legSwapType = legSwapType;
	}

	public ISODateTime getLegSettlementDate() {
		return legSettlementDate;
	}

	public void setLegSettlementDate(ISODateTime legSettlementDate) {
		this.legSettlementDate = legSettlementDate;
	}

	public DateType1Choice getLegSettlementDateCode() {
		return legSettlementDateCode;
	}

	public void setLegSettlementDateCode(DateType1Choice legSettlementDateCode) {
		this.legSettlementDateCode = legSettlementDateCode;
	}

	public SecurityIdentification7 getInstrumentLegDetails() {
		return instrumentLegDetails;
	}

	public void setInstrumentLegDetails(com.tools20022.repository.msg.SecurityIdentification7 instrumentLegDetails) {
		this.instrumentLegDetails = instrumentLegDetails;
	}

	public FinancialInstrumentAttributes1 getLegFinancialInstrumentAttributes() {
		return legFinancialInstrumentAttributes;
	}

	public void setLegFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 legFinancialInstrumentAttributes) {
		this.legFinancialInstrumentAttributes = legFinancialInstrumentAttributes;
	}

	public FinancialInstrumentStipulations getLegStipulations() {
		return legStipulations;
	}

	public void setLegStipulations(com.tools20022.repository.msg.FinancialInstrumentStipulations legStipulations) {
		this.legStipulations = legStipulations;
	}

	public BenchmarkCurve1 getLegBenchmarkCurveDetails() {
		return legBenchmarkCurveDetails;
	}

	public void setLegBenchmarkCurveDetails(com.tools20022.repository.msg.BenchmarkCurve1 legBenchmarkCurveDetails) {
		this.legBenchmarkCurveDetails = legBenchmarkCurveDetails;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties;
	}

	public void setTradingParties(List<com.tools20022.repository.msg.Intermediary14> tradingParties) {
		this.tradingParties = tradingParties;
	}

	public CashParties1 getCashParties() {
		return cashParties;
	}

	public void setCashParties(com.tools20022.repository.msg.CashParties1 cashParties) {
		this.cashParties = cashParties;
	}

	public OtherParties1 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(com.tools20022.repository.msg.OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	public SettlementParties3 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	public SettlementParties3 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}
}