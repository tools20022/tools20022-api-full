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
import com.tools20022.repository.codeset.BusinessDayConvention1Code;
import com.tools20022.repository.codeset.ReferToFundOrderDesk1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.RedemptionSchedule;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * TimeFrame elements that define a period as number of days before or after a
 * activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TimeFrame3#mmOtherTimeFrameDescription
 * TimeFrame3.mmOtherTimeFrameDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3#mmTradeMinus
 * TimeFrame3.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TimeFrame3#mmNonWorkingDayAdjustment
 * TimeFrame3.mmNonWorkingDayAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3#mmReferToOrderDesk
 * TimeFrame3.mmReferToOrderDesk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeMinusRule#forTimeFrame3
 * ConstraintTradeMinusRule.forTimeFrame3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNonWorkingDayAdjustmentRule#forTimeFrame3
 * ConstraintNonWorkingDayAdjustmentRule.forTimeFrame3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeFrame3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TimeFrame elements that define a period as number of days before or after a activity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TimeFrame3", propOrder = {"otherTimeFrameDescription", "tradeMinus", "nonWorkingDayAdjustment", "referToOrderDesk"})
public class TimeFrame3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OthrTmFrameDesc")
	protected Max350Text otherTimeFrameDescription;
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
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmOtherTimeFrameDescription
	 * TimeFrame.mmOtherTimeFrameDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTmFrameDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTimeFrameDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame3, Optional<Max350Text>> mmOtherTimeFrameDescription = new MMMessageAttribute<TimeFrame3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmOtherTimeFrameDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "OthrTmFrameDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TimeFrame3 obj) {
			return obj.getOtherTimeFrameDescription();
		}

		@Override
		public void setValue(TimeFrame3 obj, Optional<Max350Text> value) {
			obj.setOtherTimeFrameDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "TMns")
	protected Number tradeMinus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
	 * TimeFrame.mmTradeMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame3, Optional<Number>> mmTradeMinus = new MMMessageAttribute<TimeFrame3, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmTradeMinus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "TMns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(TimeFrame3 obj) {
			return obj.getTradeMinus();
		}

		@Override
		public void setValue(TimeFrame3 obj, Optional<Number> value) {
			obj.setTradeMinus(value.orElse(null));
		}
	};
	@XmlElement(name = "NonWorkgDayAdjstmnt")
	protected BusinessDayConvention1Code nonWorkingDayAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code
	 * BusinessDayConvention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmBusinessDayConvention
	 * RedemptionSchedule.mmBusinessDayConvention}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonWorkgDayAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWorkingDayAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame3, Optional<BusinessDayConvention1Code>> mmNonWorkingDayAdjustment = new MMMessageAttribute<TimeFrame3, Optional<BusinessDayConvention1Code>>() {
		{
			businessElementTrace_lazy = () -> RedemptionSchedule.mmBusinessDayConvention;
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "NonWorkgDayAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonWorkingDayAdjustment";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessDayConvention1Code.mmObject();
		}

		@Override
		public Optional<BusinessDayConvention1Code> getValue(TimeFrame3 obj) {
			return obj.getNonWorkingDayAdjustment();
		}

		@Override
		public void setValue(TimeFrame3 obj, Optional<BusinessDayConvention1Code> value) {
			obj.setNonWorkingDayAdjustment(value.orElse(null));
		}
	};
	@XmlElement(name = "RefrToOrdrDsk")
	protected ReferToFundOrderDesk1Code referToOrderDesk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReferToFundOrderDesk1Code
	 * ReferToFundOrderDesk1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefrToOrdrDsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferToOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refer to Order Desk."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame3, Optional<ReferToFundOrderDesk1Code>> mmReferToOrderDesk = new MMMessageAttribute<TimeFrame3, Optional<ReferToFundOrderDesk1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "RefrToOrdrDsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferToOrderDesk";
			definition = "Refer to Order Desk.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReferToFundOrderDesk1Code.mmObject();
		}

		@Override
		public Optional<ReferToFundOrderDesk1Code> getValue(TimeFrame3 obj) {
			return obj.getReferToOrderDesk();
		}

		@Override
		public void setValue(TimeFrame3 obj, Optional<ReferToFundOrderDesk1Code> value) {
			obj.setReferToOrderDesk(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimeFrame3.mmOtherTimeFrameDescription, com.tools20022.repository.msg.TimeFrame3.mmTradeMinus,
						com.tools20022.repository.msg.TimeFrame3.mmNonWorkingDayAdjustment, com.tools20022.repository.msg.TimeFrame3.mmReferToOrderDesk);
				trace_lazy = () -> TimeFrame.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeMinusRule.forTimeFrame3, com.tools20022.repository.constraints.ConstraintNonWorkingDayAdjustmentRule.forTimeFrame3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeFrame3";
				definition = "TimeFrame elements that define a period as number of days before or after a activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getOtherTimeFrameDescription() {
		return otherTimeFrameDescription == null ? Optional.empty() : Optional.of(otherTimeFrameDescription);
	}

	public TimeFrame3 setOtherTimeFrameDescription(Max350Text otherTimeFrameDescription) {
		this.otherTimeFrameDescription = otherTimeFrameDescription;
		return this;
	}

	public Optional<Number> getTradeMinus() {
		return tradeMinus == null ? Optional.empty() : Optional.of(tradeMinus);
	}

	public TimeFrame3 setTradeMinus(Number tradeMinus) {
		this.tradeMinus = tradeMinus;
		return this;
	}

	public Optional<BusinessDayConvention1Code> getNonWorkingDayAdjustment() {
		return nonWorkingDayAdjustment == null ? Optional.empty() : Optional.of(nonWorkingDayAdjustment);
	}

	public TimeFrame3 setNonWorkingDayAdjustment(BusinessDayConvention1Code nonWorkingDayAdjustment) {
		this.nonWorkingDayAdjustment = nonWorkingDayAdjustment;
		return this;
	}

	public Optional<ReferToFundOrderDesk1Code> getReferToOrderDesk() {
		return referToOrderDesk == null ? Optional.empty() : Optional.of(referToOrderDesk);
	}

	public TimeFrame3 setReferToOrderDesk(ReferToFundOrderDesk1Code referToOrderDesk) {
		this.referToOrderDesk = referToOrderDesk;
		return this;
	}
}