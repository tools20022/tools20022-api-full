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
import com.tools20022.repository.area.camt.ModifyStandingOrderV05;
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DatePeriod2Choice;
import com.tools20022.repository.choice.ExecutionType1Choice;
import com.tools20022.repository.codeset.Frequency2Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * New standing order values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmAmount
 * StandingOrder5.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder5#mmCreditorAccount
 * StandingOrder5.mmCreditorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmDebtorAccount
 * StandingOrder5.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmExecutionType
 * StandingOrder5.mmExecutionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmFrequency
 * StandingOrder5.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder5#mmValidityPeriod
 * StandingOrder5.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder5#mmZeroSweepIndicator
 * StandingOrder5.mmZeroSweepIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmNewStandingOrderValueSet
 * ModifyStandingOrderV05.mmNewStandingOrderValueSet}</li>
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
 * "StandingOrder5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "New standing order values."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.StandingOrder1
 * StandingOrder1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrder5", propOrder = {"amount", "creditorAccount", "debtorAccount", "executionType", "frequency", "validityPeriod", "zeroSweepIndicator"})
public class StandingOrder5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt")
	protected Amount2Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
	 * StandingOrder.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmAmount
	 * StandingOrder1.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrder5, Optional<Amount2Choice>> mmAmount = new MMMessageAttribute<StandingOrder5, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order.";
			previousVersion_lazy = () -> StandingOrder1.mmAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(StandingOrder5 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<Amount2Choice> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount24 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account credited from a standing order mechanism."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmCreditorAccount
	 * StandingOrder1.mmCreditorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrder5, Optional<CashAccount24>> mmCreditorAccount = new MMMessageAssociationEnd<StandingOrder5, Optional<CashAccount24>>() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Cash account credited from a standing order mechanism.";
			previousVersion_lazy = () -> StandingOrder1.mmCreditorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(StandingOrder5 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<CashAccount24> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount24 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account debited from a standing order mechanism."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmDebtorAccount
	 * StandingOrder1.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrder5, Optional<CashAccount24>> mmDebtorAccount = new MMMessageAssociationEnd<StandingOrder5, Optional<CashAccount24>>() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Cash account debited from a standing order mechanism.";
			previousVersion_lazy = () -> StandingOrder1.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(StandingOrder5 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<CashAccount24> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnTp")
	protected ExecutionType1Choice executionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExecutionType1Choice
	 * ExecutionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmType
	 * StandingOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines whether the standing order is executed through a time-based or an event-based trigger."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmExecutionType
	 * StandingOrder1.mmExecutionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrder5, Optional<ExecutionType1Choice>> mmExecutionType = new MMMessageAssociationEnd<StandingOrder5, Optional<ExecutionType1Choice>>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "ExctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionType";
			definition = "Defines whether the standing order is executed through a time-based or an event-based trigger.";
			previousVersion_lazy = () -> StandingOrder1.mmExecutionType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExecutionType1Choice.mmObject();
		}

		@Override
		public Optional<ExecutionType1Choice> getValue(StandingOrder5 obj) {
			return obj.getExecutionType();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<ExecutionType1Choice> value) {
			obj.setExecutionType(value.orElse(null));
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency2Code frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency2Code
	 * Frequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmFrequency
	 * StandingOrder.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which payment instructions are to be created and processed as a result of the standing order, such as daily, weekly, or monthly."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmFrequency
	 * StandingOrder1.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrder5, Optional<Frequency2Code>> mmFrequency = new MMMessageAttribute<StandingOrder5, Optional<Frequency2Code>>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which payment instructions are to be created and processed as a result of the standing order, such as daily, weekly, or monthly.";
			previousVersion_lazy = () -> StandingOrder1.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency2Code.mmObject();
		}

		@Override
		public Optional<Frequency2Code> getValue(StandingOrder5 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<Frequency2Code> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtyPrd")
	protected DatePeriod2Choice validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DatePeriod2Choice
	 * DatePeriod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates during which the standing order is in effect."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmValidityPeriod
	 * StandingOrder1.mmValidityPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrder5, Optional<DatePeriod2Choice>> mmValidityPeriod = new MMMessageAssociationEnd<StandingOrder5, Optional<DatePeriod2Choice>>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmValidityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			previousVersion_lazy = () -> StandingOrder1.mmValidityPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DatePeriod2Choice.mmObject();
		}

		@Override
		public Optional<DatePeriod2Choice> getValue(StandingOrder5 obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<DatePeriod2Choice> value) {
			obj.setValidityPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ZeroSweepInd")
	protected TrueFalseIndicator zeroSweepIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmZeroSweepIndicator
	 * CashStandingOrder.mmZeroSweepIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5 StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZeroSweepInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroSweepIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is zero."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmZeroSweepIndicator
	 * StandingOrder1.mmZeroSweepIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrder5, Optional<TrueFalseIndicator>> mmZeroSweepIndicator = new MMMessageAttribute<StandingOrder5, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmZeroSweepIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder5.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is zero.";
			previousVersion_lazy = () -> StandingOrder1.mmZeroSweepIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(StandingOrder5 obj) {
			return obj.getZeroSweepIndicator();
		}

		@Override
		public void setValue(StandingOrder5 obj, Optional<TrueFalseIndicator> value) {
			obj.setZeroSweepIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrder5.mmAmount, com.tools20022.repository.msg.StandingOrder5.mmCreditorAccount, com.tools20022.repository.msg.StandingOrder5.mmDebtorAccount,
						com.tools20022.repository.msg.StandingOrder5.mmExecutionType, com.tools20022.repository.msg.StandingOrder5.mmFrequency, com.tools20022.repository.msg.StandingOrder5.mmValidityPeriod,
						com.tools20022.repository.msg.StandingOrder5.mmZeroSweepIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(ModifyStandingOrderV05.mmNewStandingOrderValueSet);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder5";
				definition = "New standing order values.";
				previousVersion_lazy = () -> StandingOrder1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Amount2Choice> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public StandingOrder5 setAmount(Amount2Choice amount) {
		this.amount = amount;
		return this;
	}

	public Optional<CashAccount24> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public StandingOrder5 setCreditorAccount(CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public StandingOrder5 setDebtorAccount(CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<ExecutionType1Choice> getExecutionType() {
		return executionType == null ? Optional.empty() : Optional.of(executionType);
	}

	public StandingOrder5 setExecutionType(ExecutionType1Choice executionType) {
		this.executionType = executionType;
		return this;
	}

	public Optional<Frequency2Code> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public StandingOrder5 setFrequency(Frequency2Code frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<DatePeriod2Choice> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public StandingOrder5 setValidityPeriod(DatePeriod2Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}

	public Optional<TrueFalseIndicator> getZeroSweepIndicator() {
		return zeroSweepIndicator == null ? Optional.empty() : Optional.of(zeroSweepIndicator);
	}

	public StandingOrder5 setZeroSweepIndicator(TrueFalseIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
		return this;
	}
}