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
import com.tools20022.repository.choice.TimeFrame4Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EventFrequency5Code;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingCurrencyAccepted
 * ProcessingCharacteristics3.mmDealingCurrencyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmRedemptionAuthorisation
 * ProcessingCharacteristics3.mmRedemptionAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmAmountIndicator
 * ProcessingCharacteristics3.mmAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmUnitsIndicator
 * ProcessingCharacteristics3.mmUnitsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmMainFundOrderDeskLocation
 * ProcessingCharacteristics3.mmMainFundOrderDeskLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingCutOffTime
 * ProcessingCharacteristics3.mmDealingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics3.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingFrequency
 * ProcessingCharacteristics3.mmDealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingFrequencyDescription
 * ProcessingCharacteristics3.mmDealingFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmLimitedPeriod
 * ProcessingCharacteristics3.mmLimitedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmSettlementCycle
 * ProcessingCharacteristics3.mmSettlementCycle}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
 * InvestmentFundClassProcessingCharacteristics}</li>
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
 * "ProcessingCharacteristics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProcessingCharacteristics3", propOrder = {"dealingCurrencyAccepted", "redemptionAuthorisation", "amountIndicator", "unitsIndicator", "mainFundOrderDeskLocation", "dealingCutOffTime", "dealingCutOffTimeFrame",
		"dealingFrequency", "dealingFrequencyDescription", "limitedPeriod", "settlementCycle"})
public class ProcessingCharacteristics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ActiveCurrencyCode> dealingCurrencyAccepted;
	/**
	 * Currency in which a subscription or redemption is accepted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgCcyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCurrencyAccepted";
			definition = "Currency in which a subscription or redemption is accepted.";
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected Forms redemptionAuthorisation;
	/**
	 * Authorization to claim redemption proceeds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedAuthstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorization to claim redemption proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionAuthorisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount;
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "RedAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAuthorisation";
			definition = "Authorization to claim redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	protected YesNoIndicator amountIndicator;
	/**
	 * Indicates whether a subscription or a redemption can be instructed by
	 * amount.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmAmountIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
	 * "Indicates whether a subscription or  a redemption can be instructed by amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmAmountIndicator;
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "AmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether a subscription or  a redemption can be instructed by amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator unitsIndicator;
	/**
	 * Indicates whether subscriptions or redemptions may be placed as a number
	 * of units.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmUnitsIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected MainFundOrderDeskLocation1 mainFundOrderDeskLocation;
	/**
	 * Specifies the location of the main fund order desk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1
	 * MainFundOrderDeskLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			businessComponentTrace_lazy = () -> Location.mmObject();
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected ISOTime dealingCutOffTime;
	/**
	 * Last date/time at which an order to subscribe or redeem can be given.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected TimeFrame3 dealingCutOffTimeFrame;
	/**
	 * TimeFrame or period concept that allows definition of a period as number
	 * of days before or after a defined activity.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected EventFrequency5Code dealingFrequency;
	/**
	 * Frequency at which the subscriptions are done.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected Max350Text dealingFrequencyDescription;
	/**
	 * Description of frequency at which the subscription is done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected Max350Text limitedPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
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
	protected TimeFrame4Choice settlementCycle;
	/**
	 * Indicate the last business day following the day on which a redemption
	 * order is priced (T) by which settlement will be due<br>
	 * for orders placed with the main Fund Order Desk.&amp;nbsp; Alternatively,
	 * if proceeds will be paid following receipt of written<br>
	 * renunciation, indicate the last business day following receipt of the
	 * relevant renunciation documentation by the main Fund<br>
	 * Order Desk (R) by which the proceeds will be sent.&amp;nbsp; Examples of
	 * the above would be T+3, R+4 etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice
	 * TimeFrame4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
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
	 * "Indicate the last business day following the day on which a redemption order is priced (T) by which settlement will be due\r\nfor orders placed with the main Fund Order Desk.&amp;nbsp; Alternatively, if proceeds will be paid following receipt of written\r\nrenunciation, indicate the last business day following receipt of the relevant renunciation documentation by the main Fund\r\nOrder Desk (R) by which the proceeds will be sent.&amp;nbsp; Examples of the above would be T+3, R+4 etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			componentContext_lazy = () -> ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SttlmCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCycle";
			definition = "Indicate the last business day following the day on which a redemption order is priced (T) by which settlement will be due\r\nfor orders placed with the main Fund Order Desk.&nbsp; Alternatively, if proceeds will be paid following receipt of written\r\nrenunciation, indicate the last business day following receipt of the relevant renunciation documentation by the main Fund\r\nOrder Desk (R) by which the proceeds will be sent.&nbsp; Examples of the above would be T+3, R+4 etc.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TimeFrame4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProcessingCharacteristics3.mmDealingCurrencyAccepted, ProcessingCharacteristics3.mmRedemptionAuthorisation, ProcessingCharacteristics3.mmAmountIndicator,
						ProcessingCharacteristics3.mmUnitsIndicator, ProcessingCharacteristics3.mmMainFundOrderDeskLocation, ProcessingCharacteristics3.mmDealingCutOffTime, ProcessingCharacteristics3.mmDealingCutOffTimeFrame,
						ProcessingCharacteristics3.mmDealingFrequency, ProcessingCharacteristics3.mmDealingFrequencyDescription, ProcessingCharacteristics3.mmLimitedPeriod, ProcessingCharacteristics3.mmSettlementCycle);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingCharacteristics3";
				definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DealgCcyAccptd", required = true)
	public List<ActiveCurrencyCode> getDealingCurrencyAccepted() {
		return dealingCurrencyAccepted;
	}

	public void setDealingCurrencyAccepted(List<ActiveCurrencyCode> dealingCurrencyAccepted) {
		this.dealingCurrencyAccepted = dealingCurrencyAccepted;
	}

	@XmlElement(name = "RedAuthstn", required = true)
	public Forms getRedemptionAuthorisation() {
		return redemptionAuthorisation;
	}

	public void setRedemptionAuthorisation(com.tools20022.repository.msg.Forms redemptionAuthorisation) {
		this.redemptionAuthorisation = redemptionAuthorisation;
	}

	@XmlElement(name = "AmtInd", required = true)
	public YesNoIndicator getAmountIndicator() {
		return amountIndicator;
	}

	public void setAmountIndicator(YesNoIndicator amountIndicator) {
		this.amountIndicator = amountIndicator;
	}

	@XmlElement(name = "UnitsInd", required = true)
	public YesNoIndicator getUnitsIndicator() {
		return unitsIndicator;
	}

	public void setUnitsIndicator(YesNoIndicator unitsIndicator) {
		this.unitsIndicator = unitsIndicator;
	}

	@XmlElement(name = "MainFndOrdrDskLctn", required = true)
	public MainFundOrderDeskLocation1 getMainFundOrderDeskLocation() {
		return mainFundOrderDeskLocation;
	}

	public void setMainFundOrderDeskLocation(com.tools20022.repository.msg.MainFundOrderDeskLocation1 mainFundOrderDeskLocation) {
		this.mainFundOrderDeskLocation = mainFundOrderDeskLocation;
	}

	@XmlElement(name = "DealgCutOffTm", required = true)
	public ISOTime getDealingCutOffTime() {
		return dealingCutOffTime;
	}

	public void setDealingCutOffTime(ISOTime dealingCutOffTime) {
		this.dealingCutOffTime = dealingCutOffTime;
	}

	@XmlElement(name = "DealgCutOffTmFrame", required = true)
	public TimeFrame3 getDealingCutOffTimeFrame() {
		return dealingCutOffTimeFrame;
	}

	public void setDealingCutOffTimeFrame(com.tools20022.repository.msg.TimeFrame3 dealingCutOffTimeFrame) {
		this.dealingCutOffTimeFrame = dealingCutOffTimeFrame;
	}

	@XmlElement(name = "DealgFrqcy", required = true)
	public EventFrequency5Code getDealingFrequency() {
		return dealingFrequency;
	}

	public void setDealingFrequency(EventFrequency5Code dealingFrequency) {
		this.dealingFrequency = dealingFrequency;
	}

	@XmlElement(name = "DealgFrqcyDesc", required = true)
	public Max350Text getDealingFrequencyDescription() {
		return dealingFrequencyDescription;
	}

	public void setDealingFrequencyDescription(Max350Text dealingFrequencyDescription) {
		this.dealingFrequencyDescription = dealingFrequencyDescription;
	}

	@XmlElement(name = "LtdPrd")
	public Max350Text getLimitedPeriod() {
		return limitedPeriod;
	}

	public void setLimitedPeriod(Max350Text limitedPeriod) {
		this.limitedPeriod = limitedPeriod;
	}

	@XmlElement(name = "SttlmCycl", required = true)
	public TimeFrame4Choice getSettlementCycle() {
		return settlementCycle;
	}

	public void setSettlementCycle(TimeFrame4Choice settlementCycle) {
		this.settlementCycle = settlementCycle;
	}
}