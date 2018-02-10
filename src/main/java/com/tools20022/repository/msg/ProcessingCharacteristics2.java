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
import com.tools20022.repository.choice.TimeFrame5Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EventFrequency5Code;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FundOrderDesk;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingCurrencyAccepted
 * ProcessingCharacteristics2.mmDealingCurrencyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmInitialInvestment
 * ProcessingCharacteristics2.mmInitialInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmSubsequentInvestment
 * ProcessingCharacteristics2.mmSubsequentInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmAmountIndicator
 * ProcessingCharacteristics2.mmAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmUnitsIndicator
 * ProcessingCharacteristics2.mmUnitsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmMainFundOrderDeskLocation
 * ProcessingCharacteristics2.mmMainFundOrderDeskLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingCutOffTime
 * ProcessingCharacteristics2.mmDealingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics2.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingFrequency
 * ProcessingCharacteristics2.mmDealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingFrequencyDescription
 * ProcessingCharacteristics2.mmDealingFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmLimitedPeriod
 * ProcessingCharacteristics2.mmLimitedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmSettlementCycle
 * ProcessingCharacteristics2.mmSettlementCycle}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
 * InvestmentFundClassProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDealingCutOffTimeFrameRule#forProcessingCharacteristics2
 * ConstraintDealingCutOffTimeFrameRule.forProcessingCharacteristics2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to the market."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessingCharacteristics2", propOrder = {"dealingCurrencyAccepted", "initialInvestment", "subsequentInvestment", "amountIndicator", "unitsIndicator", "mainFundOrderDeskLocation", "dealingCutOffTime",
		"dealingCutOffTimeFrame", "dealingFrequency", "dealingFrequencyDescription", "limitedPeriod", "settlementCycle"})
public class ProcessingCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DealgCcyAccptd", required = true)
	protected List<ActiveCurrencyCode> dealingCurrencyAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCurrency
	 * InvestmentFundClassProcessingCharacteristics.mmDealingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgCcyAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCurrencyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which a subscription or redemption is accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingCurrencyAccepted = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDealingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DealgCcyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCurrencyAccepted";
			definition = "Currency in which a subscription or redemption is accepted.";
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "InitlInvstmt", required = true)
	protected Forms initialInvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionAmount
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmMinimumInitialSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlInvstmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialInvestment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "InitlInvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialInvestment";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	@XmlElement(name = "SbsqntInvstmt", required = true)
	protected Forms subsequentInvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbsqntInvstmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubsequentInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as number of units/shares that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubsequentInvestment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "SbsqntInvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubsequentInvestment";
			definition = "Minimum quantity of securities, expressed as number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	@XmlElement(name = "AmtInd", required = true)
	protected YesNoIndicator amountIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmAmountIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a subscription or a redemption can be instructed by amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "AmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether a subscription or a redemption can be instructed by amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "UnitsInd", required = true)
	protected YesNoIndicator unitsIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmUnitsIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether subscriptions or redemptions may be placed as a number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "UnitsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsIndicator";
			definition = "Indicates whether subscriptions or redemptions may be placed as a number of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "MainFndOrdrDskLctn", required = true)
	protected MainFundOrderDeskLocation1 mainFundOrderDeskLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1
	 * MainFundOrderDeskLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk FundOrderDesk}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MainFndOrdrDskLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainFundOrderDeskLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the location of the main fund order desk."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMainFundOrderDeskLocation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundOrderDesk.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "MainFndOrdrDskLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainFundOrderDeskLocation";
			definition = "Specifies the location of the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MainFundOrderDeskLocation1.mmObject();
		}
	};
	@XmlElement(name = "DealgCutOffTm", required = true)
	protected ISOTime dealingCutOffTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmOrderCutOffDateTime
	 * InvestmentFundClassProcessingCharacteristics.mmOrderCutOffDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgCutOffTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which an order to subscribe or redeem can be given."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingCutOffTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmOrderCutOffDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DealgCutOffTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTime";
			definition = "Last date/time at which an order to subscribe or redeem can be given.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	@XmlElement(name = "DealgCutOffTmFrame", required = true)
	protected TimeFrame3 dealingCutOffTimeFrame;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgCutOffTmFrame"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTimeFrame"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingCutOffTimeFrame = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TimeFrame.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DealgCutOffTmFrame";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.TimeFrame3.mmObject();
		}
	};
	@XmlElement(name = "DealgFrqcy", required = true)
	protected EventFrequency5Code dealingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingFrequency
	 * InvestmentFundClassProcessingCharacteristics.mmDealingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the subscriptions are done."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDealingFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DealgFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingFrequency";
			definition = "Frequency at which the subscriptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency5Code.mmObject();
		}
	};
	@XmlElement(name = "DealgFrqcyDesc", required = true)
	protected Max350Text dealingFrequencyDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgFrqcyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingFrequencyDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of frequency at which the subscription is done."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingFrequencyDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DealgFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingFrequencyDescription";
			definition = "Description of frequency at which the subscription is done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "LtdPrd")
	protected Max350Text limitedPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedPeriod
	 * InvestmentFundClassProcessingCharacteristics.mmLimitedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitedPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmLimitedPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "LtdPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "SttlmCycl", required = true)
	protected TimeFrame5Choice settlementCycle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame5Choice
	 * TimeFrame5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCycl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Enter the last business day following the day on which a subscription order is priced (T) by which settlement will be due\r\nfor orders placed with the main Fund Order Desk, eg. T+3. Enter \"P\" (pre-payment) if cleared funds may be required before a\r\nsubscription order can be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCycle";
			definition = "Enter the last business day following the day on which a subscription order is priced (T) by which settlement will be due\r\nfor orders placed with the main Fund Order Desk, eg. T+3. Enter \"P\" (pre-payment) if cleared funds may be required before a\r\nsubscription order can be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TimeFrame5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingCurrencyAccepted, com.tools20022.repository.msg.ProcessingCharacteristics2.mmInitialInvestment,
						com.tools20022.repository.msg.ProcessingCharacteristics2.mmSubsequentInvestment, com.tools20022.repository.msg.ProcessingCharacteristics2.mmAmountIndicator,
						com.tools20022.repository.msg.ProcessingCharacteristics2.mmUnitsIndicator, com.tools20022.repository.msg.ProcessingCharacteristics2.mmMainFundOrderDeskLocation,
						com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingCutOffTime, com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingCutOffTimeFrame,
						com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingFrequency, com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingFrequencyDescription,
						com.tools20022.repository.msg.ProcessingCharacteristics2.mmLimitedPeriod, com.tools20022.repository.msg.ProcessingCharacteristics2.mmSettlementCycle);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDealingCutOffTimeFrameRule.forProcessingCharacteristics2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingCharacteristics2";
				definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ActiveCurrencyCode> getDealingCurrencyAccepted() {
		return dealingCurrencyAccepted == null ? dealingCurrencyAccepted = new ArrayList<>() : dealingCurrencyAccepted;
	}

	public ProcessingCharacteristics2 setDealingCurrencyAccepted(List<ActiveCurrencyCode> dealingCurrencyAccepted) {
		this.dealingCurrencyAccepted = Objects.requireNonNull(dealingCurrencyAccepted);
		return this;
	}

	public Forms getInitialInvestment() {
		return initialInvestment;
	}

	public ProcessingCharacteristics2 setInitialInvestment(com.tools20022.repository.msg.Forms initialInvestment) {
		this.initialInvestment = Objects.requireNonNull(initialInvestment);
		return this;
	}

	public Forms getSubsequentInvestment() {
		return subsequentInvestment;
	}

	public ProcessingCharacteristics2 setSubsequentInvestment(com.tools20022.repository.msg.Forms subsequentInvestment) {
		this.subsequentInvestment = Objects.requireNonNull(subsequentInvestment);
		return this;
	}

	public YesNoIndicator getAmountIndicator() {
		return amountIndicator;
	}

	public ProcessingCharacteristics2 setAmountIndicator(YesNoIndicator amountIndicator) {
		this.amountIndicator = Objects.requireNonNull(amountIndicator);
		return this;
	}

	public YesNoIndicator getUnitsIndicator() {
		return unitsIndicator;
	}

	public ProcessingCharacteristics2 setUnitsIndicator(YesNoIndicator unitsIndicator) {
		this.unitsIndicator = Objects.requireNonNull(unitsIndicator);
		return this;
	}

	public MainFundOrderDeskLocation1 getMainFundOrderDeskLocation() {
		return mainFundOrderDeskLocation;
	}

	public ProcessingCharacteristics2 setMainFundOrderDeskLocation(com.tools20022.repository.msg.MainFundOrderDeskLocation1 mainFundOrderDeskLocation) {
		this.mainFundOrderDeskLocation = Objects.requireNonNull(mainFundOrderDeskLocation);
		return this;
	}

	public ISOTime getDealingCutOffTime() {
		return dealingCutOffTime;
	}

	public ProcessingCharacteristics2 setDealingCutOffTime(ISOTime dealingCutOffTime) {
		this.dealingCutOffTime = Objects.requireNonNull(dealingCutOffTime);
		return this;
	}

	public TimeFrame3 getDealingCutOffTimeFrame() {
		return dealingCutOffTimeFrame;
	}

	public ProcessingCharacteristics2 setDealingCutOffTimeFrame(com.tools20022.repository.msg.TimeFrame3 dealingCutOffTimeFrame) {
		this.dealingCutOffTimeFrame = Objects.requireNonNull(dealingCutOffTimeFrame);
		return this;
	}

	public EventFrequency5Code getDealingFrequency() {
		return dealingFrequency;
	}

	public ProcessingCharacteristics2 setDealingFrequency(EventFrequency5Code dealingFrequency) {
		this.dealingFrequency = Objects.requireNonNull(dealingFrequency);
		return this;
	}

	public Max350Text getDealingFrequencyDescription() {
		return dealingFrequencyDescription;
	}

	public ProcessingCharacteristics2 setDealingFrequencyDescription(Max350Text dealingFrequencyDescription) {
		this.dealingFrequencyDescription = Objects.requireNonNull(dealingFrequencyDescription);
		return this;
	}

	public Optional<Max350Text> getLimitedPeriod() {
		return limitedPeriod == null ? Optional.empty() : Optional.of(limitedPeriod);
	}

	public ProcessingCharacteristics2 setLimitedPeriod(Max350Text limitedPeriod) {
		this.limitedPeriod = limitedPeriod;
		return this;
	}

	public TimeFrame5Choice getSettlementCycle() {
		return settlementCycle;
	}

	public ProcessingCharacteristics2 setSettlementCycle(TimeFrame5Choice settlementCycle) {
		this.settlementCycle = Objects.requireNonNull(settlementCycle);
		return this;
	}
}