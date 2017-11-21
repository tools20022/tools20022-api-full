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
import com.tools20022.repository.choice.Quantity1Choice;
import com.tools20022.repository.codeset.PositionEffect1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegIdentification
 * InstrumentLeg3.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegOrderQuantity
 * InstrumentLeg3.mmLegOrderQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPrice
 * InstrumentLeg3.mmLegPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegOptionRatio
 * InstrumentLeg3.mmLegOptionRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPositionEffect
 * InstrumentLeg3.mmLegPositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegDerivativeCoveredIndicator
 * InstrumentLeg3.mmLegDerivativeCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPreAllocationDetails
 * InstrumentLeg3.mmLegPreAllocationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmInstrumentLegDetails
 * InstrumentLeg3.mmInstrumentLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegFinancialInstrumentAttributes
 * InstrumentLeg3.mmLegFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmTradingParties
 * InstrumentLeg3.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmCashParties
 * InstrumentLeg3.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmOtherBusinessParties
 * InstrumentLeg3.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmReceivingSettlementParties
 * InstrumentLeg3.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmDeliveringSettlementParties
 * InstrumentLeg3.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmAmountsDetails
 * InstrumentLeg3.mmAmountsDetails}</li>
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
 * "InstrumentLeg3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additionnal details related to the leg."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstrumentLeg3", propOrder = {"legIdentification", "legOrderQuantity", "legPrice", "legOptionRatio", "legPositionEffect", "legDerivativeCoveredIndicator", "legPreAllocationDetails", "instrumentLegDetails",
		"legFinancialInstrumentAttributes", "tradingParties", "cashParties", "otherBusinessParties", "receivingSettlementParties", "deliveringSettlementParties", "amountsDetails"})
public class InstrumentLeg3 {

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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	protected Price1 legPrice;
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected PercentageRate legOptionRatio;
	/**
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
	 * "Expresses the risk of an option legValue must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegOptionRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionRatio;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegOptnRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOptionRatio";
			definition = "Expresses the risk of an option legValue must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PositionEffect1Code legPositionEffect;
	/**
	 * PositionEffect for leg of a multileg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegPosFct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegPositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PositionEffect for leg of a multileg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegPositionEffect = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegPosFct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegPositionEffect";
			definition = "PositionEffect for leg of a multileg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositionEffect1Code.mmObject();
		}
	};
	protected YesNoIndicator legDerivativeCoveredIndicator;
	/**
	 * Indicates if the CoveredOrUncovered for the leg is different from that
	 * specified for the overall multileg security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
	 * Derivative.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegDerivCvrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegDerivativeCoveredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the CoveredOrUncovered for the leg is different from that specified for the overall multileg security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegDerivativeCoveredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegDerivCvrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegDerivativeCoveredIndicator";
			definition = "Indicates if the CoveredOrUncovered for the leg is different from that specified for the overall multileg security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PreAllocation1 legPreAllocationDetails;
	/**
	 * Provides pre-allocation information for the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PreAllocation1
	 * PreAllocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
	 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegPreAllcnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegPreAllocationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides pre-allocation information for the order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegPreAllocationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderAllocation;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegPreAllcnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegPreAllocationDetails";
			definition = "Provides pre-allocation information for the order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	 * Provides details about the financial instrument attibutes of a particular
	 * leg.
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
	 * "Provides details about the financial instrument attibutes of a particular leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Leg.mmRelatedAsset;
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "LegFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegFinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attibutes of a particular leg.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Intermediary14> tradingParties;
	/**
	 * Parties used for acting parties that applies either to the whole message
	 * or to individual sides.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
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
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
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
	protected List<com.tools20022.repository.msg.OtherAmounts1> amountsDetails;
	/**
	 * Amount of money debited and credited on the books of an account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts1
	 * OtherAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money debited and credited on the books of an account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountsDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InstrumentLeg3.mmObject();
			isDerived = false;
			xmlTag = "AmtsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountsDetails";
			definition = "Amount of money debited and credited on the books of an account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherAmounts1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstrumentLeg3.mmLegIdentification, InstrumentLeg3.mmLegOrderQuantity, InstrumentLeg3.mmLegPrice, InstrumentLeg3.mmLegOptionRatio, InstrumentLeg3.mmLegPositionEffect,
						InstrumentLeg3.mmLegDerivativeCoveredIndicator, InstrumentLeg3.mmLegPreAllocationDetails, InstrumentLeg3.mmInstrumentLegDetails, InstrumentLeg3.mmLegFinancialInstrumentAttributes, InstrumentLeg3.mmTradingParties,
						InstrumentLeg3.mmCashParties, InstrumentLeg3.mmOtherBusinessParties, InstrumentLeg3.mmReceivingSettlementParties, InstrumentLeg3.mmDeliveringSettlementParties, InstrumentLeg3.mmAmountsDetails);
				trace_lazy = () -> Leg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InstrumentLeg3";
				definition = "Additionnal details related to the leg.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LegId")
	public Max35Text getLegIdentification() {
		return legIdentification;
	}

	public void setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
	}

	@XmlElement(name = "LegOrdrQty", required = true)
	public Quantity1Choice getLegOrderQuantity() {
		return legOrderQuantity;
	}

	public void setLegOrderQuantity(Quantity1Choice legOrderQuantity) {
		this.legOrderQuantity = legOrderQuantity;
	}

	@XmlElement(name = "LegPric")
	public Price1 getLegPrice() {
		return legPrice;
	}

	public void setLegPrice(com.tools20022.repository.msg.Price1 legPrice) {
		this.legPrice = legPrice;
	}

	@XmlElement(name = "LegOptnRatio")
	public PercentageRate getLegOptionRatio() {
		return legOptionRatio;
	}

	public void setLegOptionRatio(PercentageRate legOptionRatio) {
		this.legOptionRatio = legOptionRatio;
	}

	@XmlElement(name = "LegPosFct", required = true)
	public PositionEffect1Code getLegPositionEffect() {
		return legPositionEffect;
	}

	public void setLegPositionEffect(PositionEffect1Code legPositionEffect) {
		this.legPositionEffect = legPositionEffect;
	}

	@XmlElement(name = "LegDerivCvrdInd", required = true)
	public YesNoIndicator getLegDerivativeCoveredIndicator() {
		return legDerivativeCoveredIndicator;
	}

	public void setLegDerivativeCoveredIndicator(YesNoIndicator legDerivativeCoveredIndicator) {
		this.legDerivativeCoveredIndicator = legDerivativeCoveredIndicator;
	}

	@XmlElement(name = "LegPreAllcnDtls")
	public PreAllocation1 getLegPreAllocationDetails() {
		return legPreAllocationDetails;
	}

	public void setLegPreAllocationDetails(com.tools20022.repository.msg.PreAllocation1 legPreAllocationDetails) {
		this.legPreAllocationDetails = legPreAllocationDetails;
	}

	@XmlElement(name = "InstrmLegDtls")
	public SecurityIdentification7 getInstrumentLegDetails() {
		return instrumentLegDetails;
	}

	public void setInstrumentLegDetails(com.tools20022.repository.msg.SecurityIdentification7 instrumentLegDetails) {
		this.instrumentLegDetails = instrumentLegDetails;
	}

	@XmlElement(name = "LegFinInstrmAttrbts", required = true)
	public FinancialInstrumentAttributes1 getLegFinancialInstrumentAttributes() {
		return legFinancialInstrumentAttributes;
	}

	public void setLegFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 legFinancialInstrumentAttributes) {
		this.legFinancialInstrumentAttributes = legFinancialInstrumentAttributes;
	}

	@XmlElement(name = "TradgPties")
	public List<Intermediary14> getTradingParties() {
		return tradingParties;
	}

	public void setTradingParties(List<com.tools20022.repository.msg.Intermediary14> tradingParties) {
		this.tradingParties = tradingParties;
	}

	@XmlElement(name = "CshPties")
	public CashParties1 getCashParties() {
		return cashParties;
	}

	public void setCashParties(com.tools20022.repository.msg.CashParties1 cashParties) {
		this.cashParties = cashParties;
	}

	@XmlElement(name = "OthrBizPties")
	public OtherParties1 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(com.tools20022.repository.msg.OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties3 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties3 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "AmtsDtls")
	public List<OtherAmounts1> getAmountsDetails() {
		return amountsDetails;
	}

	public void setAmountsDetails(List<com.tools20022.repository.msg.OtherAmounts1> amountsDetails) {
		this.amountsDetails = amountsDetails;
	}
}