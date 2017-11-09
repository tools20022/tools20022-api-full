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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Timeframe2Choice;
import com.tools20022.repository.choice.TimeFrame3Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmAmountIndicator
 * ProcessingCharacteristics1.mmAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmUnitsIndicator
 * ProcessingCharacteristics1.mmUnitsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmDealingCurrencyAccepted
 * ProcessingCharacteristics1.mmDealingCurrencyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmDealingCutOffTime
 * ProcessingCharacteristics1.mmDealingCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics1.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmSettlementCycle
 * ProcessingCharacteristics1.mmSettlementCycle}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingCharacteristics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
public class ProcessingCharacteristics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "DealgCcyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCurrencyAccepted";
			definition = "Currency in which a subscription or redemption is accepted.";
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
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
	protected TimeFrame3Choice dealingCutOffTimeFrame;
	/**
	 * TimeFrame or period concept that allows definition of a period as number
	 * of days before or after a defined activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice
	 * TimeFrame3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "DealgCutOffTmFrame";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TimeFrame3Choice.mmObject();
		}
	};
	protected Timeframe2Choice settlementCycle;
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period
	 * 
	 * Where T = the date the price is applied to a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Timeframe2Choice
	 * Timeframe2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
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
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \n\nWhere T = the date the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			componentContext_lazy = () -> ProcessingCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCycle";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \n\nWhere T = the date the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Timeframe2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProcessingCharacteristics1.mmAmountIndicator, ProcessingCharacteristics1.mmUnitsIndicator, ProcessingCharacteristics1.mmDealingCurrencyAccepted,
						ProcessingCharacteristics1.mmDealingCutOffTime, ProcessingCharacteristics1.mmDealingCutOffTimeFrame, ProcessingCharacteristics1.mmSettlementCycle);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ProcessingCharacteristics1";
				definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAmountIndicator() {
		return amountIndicator;
	}

	public void setAmountIndicator(YesNoIndicator amountIndicator) {
		this.amountIndicator = amountIndicator;
	}

	public YesNoIndicator getUnitsIndicator() {
		return unitsIndicator;
	}

	public void setUnitsIndicator(YesNoIndicator unitsIndicator) {
		this.unitsIndicator = unitsIndicator;
	}

	public List<ActiveCurrencyCode> getDealingCurrencyAccepted() {
		return dealingCurrencyAccepted;
	}

	public void setDealingCurrencyAccepted(List<ActiveCurrencyCode> dealingCurrencyAccepted) {
		this.dealingCurrencyAccepted = dealingCurrencyAccepted;
	}

	public ISOTime getDealingCutOffTime() {
		return dealingCutOffTime;
	}

	public void setDealingCutOffTime(ISOTime dealingCutOffTime) {
		this.dealingCutOffTime = dealingCutOffTime;
	}

	public TimeFrame3Choice getDealingCutOffTimeFrame() {
		return dealingCutOffTimeFrame;
	}

	public void setDealingCutOffTimeFrame(TimeFrame3Choice dealingCutOffTimeFrame) {
		this.dealingCutOffTimeFrame = dealingCutOffTimeFrame;
	}

	public Timeframe2Choice getSettlementCycle() {
		return settlementCycle;
	}

	public void setSettlementCycle(Timeframe2Choice settlementCycle) {
		this.settlementCycle = settlementCycle;
	}
}