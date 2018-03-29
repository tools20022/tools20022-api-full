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
import com.tools20022.repository.msg.Forms;
import com.tools20022.repository.msg.MainFundOrderDeskLocation1;
import com.tools20022.repository.msg.TimeFrame3;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDealingCutOffTimeFrameRule#forProcessingCharacteristics3
 * ConstraintDealingCutOffTimeFrameRule.forProcessingCharacteristics3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingCharacteristics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to the market."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessingCharacteristics3", propOrder = {"dealingCurrencyAccepted", "redemptionAuthorisation", "amountIndicator", "unitsIndicator", "mainFundOrderDeskLocation", "dealingCutOffTime", "dealingCutOffTimeFrame",
		"dealingFrequency", "dealingFrequencyDescription", "limitedPeriod", "settlementCycle"})
public class ProcessingCharacteristics3 {

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
	public static final MMMessageAttribute<ProcessingCharacteristics3, List<ActiveCurrencyCode>> mmDealingCurrencyAccepted = new MMMessageAttribute<ProcessingCharacteristics3, List<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDealingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgCcyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCurrencyAccepted";
			definition = "Currency in which a subscription or redemption is accepted.";
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveCurrencyCode> getValue(ProcessingCharacteristics3 obj) {
			return obj.getDealingCurrencyAccepted();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, List<ActiveCurrencyCode> value) {
			obj.setDealingCurrencyAccepted(value);
		}
	};
	@XmlElement(name = "RedAuthstn", required = true)
	protected Forms redemptionAuthorisation;
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
	public static final MMMessageAssociationEnd<ProcessingCharacteristics3, Forms> mmRedemptionAuthorisation = new MMMessageAssociationEnd<ProcessingCharacteristics3, Forms>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "RedAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAuthorisation";
			definition = "Authorization to claim redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Forms.mmObject();
		}

		@Override
		public Forms getValue(ProcessingCharacteristics3 obj) {
			return obj.getRedemptionAuthorisation();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, Forms value) {
			obj.setRedemptionAuthorisation(value);
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
	 * "Indicates whether a subscription or a redemption can be instructed by amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessingCharacteristics3, YesNoIndicator> mmAmountIndicator = new MMMessageAttribute<ProcessingCharacteristics3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "AmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether a subscription or a redemption can be instructed by amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ProcessingCharacteristics3 obj) {
			return obj.getAmountIndicator();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, YesNoIndicator value) {
			obj.setAmountIndicator(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, YesNoIndicator> mmUnitsIndicator = new MMMessageAttribute<ProcessingCharacteristics3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "UnitsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsIndicator";
			definition = "Indicates whether subscriptions or redemptions may be placed as a number of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ProcessingCharacteristics3 obj) {
			return obj.getUnitsIndicator();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, YesNoIndicator value) {
			obj.setUnitsIndicator(value);
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
	public static final MMMessageAssociationEnd<ProcessingCharacteristics3, MainFundOrderDeskLocation1> mmMainFundOrderDeskLocation = new MMMessageAssociationEnd<ProcessingCharacteristics3, MainFundOrderDeskLocation1>() {
		{
			businessComponentTrace_lazy = () -> Location.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "MainFndOrdrDskLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainFundOrderDeskLocation";
			definition = "Specifies the location of the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MainFundOrderDeskLocation1.mmObject();
		}

		@Override
		public MainFundOrderDeskLocation1 getValue(ProcessingCharacteristics3 obj) {
			return obj.getMainFundOrderDeskLocation();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, MainFundOrderDeskLocation1 value) {
			obj.setMainFundOrderDeskLocation(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, ISOTime> mmDealingCutOffTime = new MMMessageAttribute<ProcessingCharacteristics3, ISOTime>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmOrderCutOffDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgCutOffTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTime";
			definition = "Last date/time at which an order to subscribe or redeem can be given.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public ISOTime getValue(ProcessingCharacteristics3 obj) {
			return obj.getDealingCutOffTime();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, ISOTime value) {
			obj.setDealingCutOffTime(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, TimeFrame3> mmDealingCutOffTimeFrame = new MMMessageAttribute<ProcessingCharacteristics3, TimeFrame3>() {
		{
			businessComponentTrace_lazy = () -> TimeFrame.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgCutOffTmFrame";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TimeFrame3.mmObject();
		}

		@Override
		public TimeFrame3 getValue(ProcessingCharacteristics3 obj) {
			return obj.getDealingCutOffTimeFrame();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, TimeFrame3 value) {
			obj.setDealingCutOffTimeFrame(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, EventFrequency5Code> mmDealingFrequency = new MMMessageAttribute<ProcessingCharacteristics3, EventFrequency5Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDealingFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingFrequency";
			definition = "Frequency at which the subscriptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency5Code.mmObject();
		}

		@Override
		public EventFrequency5Code getValue(ProcessingCharacteristics3 obj) {
			return obj.getDealingFrequency();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, EventFrequency5Code value) {
			obj.setDealingFrequency(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, Max350Text> mmDealingFrequencyDescription = new MMMessageAttribute<ProcessingCharacteristics3, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "DealgFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingFrequencyDescription";
			definition = "Description of frequency at which the subscription is done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(ProcessingCharacteristics3 obj) {
			return obj.getDealingFrequencyDescription();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, Max350Text value) {
			obj.setDealingFrequencyDescription(value);
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, Optional<Max350Text>> mmLimitedPeriod = new MMMessageAttribute<ProcessingCharacteristics3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmLimitedPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "LtdPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(ProcessingCharacteristics3 obj) {
			return obj.getLimitedPeriod();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, Optional<Max350Text> value) {
			obj.setLimitedPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmCycl", required = true)
	protected TimeFrame4Choice settlementCycle;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ProcessingCharacteristics3, TimeFrame4Choice> mmSettlementCycle = new MMMessageAttribute<ProcessingCharacteristics3, TimeFrame4Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SttlmCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCycle";
			definition = "Indicate the last business day following the day on which a redemption order is priced (T) by which settlement will be due\r\nfor orders placed with the main Fund Order Desk.&nbsp; Alternatively, if proceeds will be paid following receipt of written\r\nrenunciation, indicate the last business day following receipt of the relevant renunciation documentation by the main Fund\r\nOrder Desk (R) by which the proceeds will be sent.&nbsp; Examples of the above would be T+3, R+4 etc.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TimeFrame4Choice.mmObject();
		}

		@Override
		public TimeFrame4Choice getValue(ProcessingCharacteristics3 obj) {
			return obj.getSettlementCycle();
		}

		@Override
		public void setValue(ProcessingCharacteristics3 obj, TimeFrame4Choice value) {
			obj.setSettlementCycle(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingCurrencyAccepted, com.tools20022.repository.msg.ProcessingCharacteristics3.mmRedemptionAuthorisation,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmAmountIndicator, com.tools20022.repository.msg.ProcessingCharacteristics3.mmUnitsIndicator,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmMainFundOrderDeskLocation, com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingCutOffTime,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingCutOffTimeFrame, com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingFrequency,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingFrequencyDescription, com.tools20022.repository.msg.ProcessingCharacteristics3.mmLimitedPeriod,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmSettlementCycle);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDealingCutOffTimeFrameRule.forProcessingCharacteristics3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingCharacteristics3";
				definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ActiveCurrencyCode> getDealingCurrencyAccepted() {
		return dealingCurrencyAccepted == null ? dealingCurrencyAccepted = new ArrayList<>() : dealingCurrencyAccepted;
	}

	public ProcessingCharacteristics3 setDealingCurrencyAccepted(List<ActiveCurrencyCode> dealingCurrencyAccepted) {
		this.dealingCurrencyAccepted = Objects.requireNonNull(dealingCurrencyAccepted);
		return this;
	}

	public Forms getRedemptionAuthorisation() {
		return redemptionAuthorisation;
	}

	public ProcessingCharacteristics3 setRedemptionAuthorisation(Forms redemptionAuthorisation) {
		this.redemptionAuthorisation = Objects.requireNonNull(redemptionAuthorisation);
		return this;
	}

	public YesNoIndicator getAmountIndicator() {
		return amountIndicator;
	}

	public ProcessingCharacteristics3 setAmountIndicator(YesNoIndicator amountIndicator) {
		this.amountIndicator = Objects.requireNonNull(amountIndicator);
		return this;
	}

	public YesNoIndicator getUnitsIndicator() {
		return unitsIndicator;
	}

	public ProcessingCharacteristics3 setUnitsIndicator(YesNoIndicator unitsIndicator) {
		this.unitsIndicator = Objects.requireNonNull(unitsIndicator);
		return this;
	}

	public MainFundOrderDeskLocation1 getMainFundOrderDeskLocation() {
		return mainFundOrderDeskLocation;
	}

	public ProcessingCharacteristics3 setMainFundOrderDeskLocation(MainFundOrderDeskLocation1 mainFundOrderDeskLocation) {
		this.mainFundOrderDeskLocation = Objects.requireNonNull(mainFundOrderDeskLocation);
		return this;
	}

	public ISOTime getDealingCutOffTime() {
		return dealingCutOffTime;
	}

	public ProcessingCharacteristics3 setDealingCutOffTime(ISOTime dealingCutOffTime) {
		this.dealingCutOffTime = Objects.requireNonNull(dealingCutOffTime);
		return this;
	}

	public TimeFrame3 getDealingCutOffTimeFrame() {
		return dealingCutOffTimeFrame;
	}

	public ProcessingCharacteristics3 setDealingCutOffTimeFrame(TimeFrame3 dealingCutOffTimeFrame) {
		this.dealingCutOffTimeFrame = Objects.requireNonNull(dealingCutOffTimeFrame);
		return this;
	}

	public EventFrequency5Code getDealingFrequency() {
		return dealingFrequency;
	}

	public ProcessingCharacteristics3 setDealingFrequency(EventFrequency5Code dealingFrequency) {
		this.dealingFrequency = Objects.requireNonNull(dealingFrequency);
		return this;
	}

	public Max350Text getDealingFrequencyDescription() {
		return dealingFrequencyDescription;
	}

	public ProcessingCharacteristics3 setDealingFrequencyDescription(Max350Text dealingFrequencyDescription) {
		this.dealingFrequencyDescription = Objects.requireNonNull(dealingFrequencyDescription);
		return this;
	}

	public Optional<Max350Text> getLimitedPeriod() {
		return limitedPeriod == null ? Optional.empty() : Optional.of(limitedPeriod);
	}

	public ProcessingCharacteristics3 setLimitedPeriod(Max350Text limitedPeriod) {
		this.limitedPeriod = limitedPeriod;
		return this;
	}

	public TimeFrame4Choice getSettlementCycle() {
		return settlementCycle;
	}

	public ProcessingCharacteristics3 setSettlementCycle(TimeFrame4Choice settlementCycle) {
		this.settlementCycle = Objects.requireNonNull(settlementCycle);
		return this;
	}
}