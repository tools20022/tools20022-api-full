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
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DatePeriodDetails2Choice;
import com.tools20022.repository.choice.ExecutionType1Choice;
import com.tools20022.repository.codeset.Frequency2Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmAmount
 * StandingOrder1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmCreditorAccount
 * StandingOrder1.mmCreditorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmDebtorAccount
 * StandingOrder1.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmExecutionType
 * StandingOrder1.mmExecutionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmFrequency
 * StandingOrder1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmValidityPeriod
 * StandingOrder1.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmZeroSweepIndicator
 * StandingOrder1.mmZeroSweepIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
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
 * "StandingOrder1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "New standing order values."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StandingOrder1", propOrder = {"amount", "creditorAccount", "debtorAccount", "executionType", "frequency", "validityPeriod", "zeroSweepIndicator"})
public class StandingOrder1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Amount2Choice amount;
	/**
	 * Amount of money and currency to be transferred when a payment instruction
	 * is created as a result of a standing order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmAmount;
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}
	};
	protected CashAccount24 creditorAccount;
	/**
	 * Cash account credited from a standing order mechanism.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * definition} = "Cash account credited from a  standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected CashAccount24 debtorAccount;
	/**
	 * Cash account debited from a standing order mechanism.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected ExecutionType1Choice executionType;
	/**
	 * Defines whether the standing order is executed through a time-based or an
	 * event-based trigger.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExecutionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmType;
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionType";
			definition = "Defines whether the standing order is executed through a time-based or an event-based trigger.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExecutionType1Choice.mmObject();
		}
	};
	protected Frequency2Code frequency;
	/**
	 * Regularity with which payment instructions are to be created and
	 * processed as a result of the standing order, such as daily, weekly, or
	 * monthly.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmFrequency;
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which payment instructions are to be created and processed as a result of the standing order, such as daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency2Code.mmObject();
		}
	};
	protected DatePeriodDetails2Choice validityPeriod;
	/**
	 * Dates during which the standing order is in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice
	 * DatePeriodDetails2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * definition} = "Dates during which the standing order is in effect. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidityPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmValidityPeriod;
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DatePeriodDetails2Choice.mmObject();
		}
	};
	protected TrueFalseIndicator zeroSweepIndicator;
	/**
	 * Indicates whether the standing order is defined as a zero sweeping order.
	 * When true, the liquidity transfer standing order will transfer all amount
	 * of money out of the account so the resulting balance is zero.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
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
	 * "Indicates whether the standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmZeroSweepIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashStandingOrder.mmZeroSweepIndicator;
			componentContext_lazy = () -> StandingOrder1.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StandingOrder1.mmAmount, StandingOrder1.mmCreditorAccount, StandingOrder1.mmDebtorAccount, StandingOrder1.mmExecutionType, StandingOrder1.mmFrequency,
						StandingOrder1.mmValidityPeriod, StandingOrder1.mmZeroSweepIndicator);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrder1";
				definition = "New standing order values.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Amt")
	public Amount2Choice getAmount() {
		return amount;
	}

	public void setAmount(Amount2Choice amount) {
		this.amount = amount;
	}

	@XmlElement(name = "CdtrAcct")
	public CashAccount24 getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(com.tools20022.repository.msg.CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	@XmlElement(name = "DbtrAcct")
	public CashAccount24 getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(com.tools20022.repository.msg.CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	@XmlElement(name = "ExctnTp")
	public ExecutionType1Choice getExecutionType() {
		return executionType;
	}

	public void setExecutionType(ExecutionType1Choice executionType) {
		this.executionType = executionType;
	}

	@XmlElement(name = "Frqcy")
	public Frequency2Code getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency2Code frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "VldtyPrd")
	public DatePeriodDetails2Choice getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(DatePeriodDetails2Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	@XmlElement(name = "ZeroSweepInd")
	public TrueFalseIndicator getZeroSweepIndicator() {
		return zeroSweepIndicator;
	}

	public void setZeroSweepIndicator(TrueFalseIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
	}
}