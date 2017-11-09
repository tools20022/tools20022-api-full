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
import com.tools20022.repository.choice.AmountChoice;
import com.tools20022.repository.choice.DatePeriodDetails2Choice;
import com.tools20022.repository.codeset.Frequency2Code;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * New standing order values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmAmount
 * StandingOrderDetails1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmCreditAccount
 * StandingOrderDetails1.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmDebitAccount
 * StandingOrderDetails1.mmDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmFrequency
 * StandingOrderDetails1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmValidityPeriod
 * StandingOrderDetails1.mmValidityPeriod}</li>
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
 * "StandingOrderDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "New standing order values."</li>
 * </ul>
 */
public class StandingOrderDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountChoice amount;
	/**
	 * Amount of money and currency to be transferred when a payment instruction
	 * is created as a result of a standing order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.AmountChoice
	 * AmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
	 * StandingOrder.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1
	 * StandingOrderDetails1}</li>
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
			componentContext_lazy = () -> StandingOrderDetails1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency to be transferred when a payment instruction is created as a result of a standing order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountChoice.mmObject();
		}
	};
	protected AccountIdentificationDetails creditAccount;
	/**
	 * Cash account credited from a standing order mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails
	 * AccountIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmCreditAccount
	 * StandingOrder.mmCreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1
	 * StandingOrderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account credited from a  standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmCreditAccount;
			componentContext_lazy = () -> StandingOrderDetails1.mmObject();
			isDerived = false;
			xmlTag = "CdtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountIdentificationDetails.mmObject();
		}
	};
	protected AccountIdentificationDetails debitAccount;
	/**
	 * Cash account debited from a standing order mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails
	 * AccountIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
	 * StandingOrder.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1
	 * StandingOrderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account debited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebitAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmDebitAccount;
			componentContext_lazy = () -> StandingOrderDetails1.mmObject();
			isDerived = false;
			xmlTag = "DbtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountIdentificationDetails.mmObject();
		}
	};
	protected Frequency2Code frequency;
	/**
	 * Regularity with which payment instructions are to be created and
	 * processed as a result of the standing order, eg, daily, weekly, or
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1
	 * StandingOrderDetails1}</li>
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
	 * "Regularity with which payment instructions are to be created and processed as a result of the standing order, eg, daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmFrequency;
			componentContext_lazy = () -> StandingOrderDetails1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which payment instructions are to be created and processed as a result of the standing order, eg, daily, weekly, or monthly.";
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
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1
	 * StandingOrderDetails1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidityPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmValidityPeriod;
			componentContext_lazy = () -> StandingOrderDetails1.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DatePeriodDetails2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StandingOrderDetails1.mmAmount, StandingOrderDetails1.mmCreditAccount, StandingOrderDetails1.mmDebitAccount, StandingOrderDetails1.mmFrequency,
						StandingOrderDetails1.mmValidityPeriod);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrderDetails1";
				definition = "New standing order values.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountChoice getAmount() {
		return amount;
	}

	public void setAmount(AmountChoice amount) {
		this.amount = amount;
	}

	public AccountIdentificationDetails getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(com.tools20022.repository.msg.AccountIdentificationDetails creditAccount) {
		this.creditAccount = creditAccount;
	}

	public AccountIdentificationDetails getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(com.tools20022.repository.msg.AccountIdentificationDetails debitAccount) {
		this.debitAccount = debitAccount;
	}

	public Frequency2Code getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency2Code frequency) {
		this.frequency = frequency;
	}

	public DatePeriodDetails2Choice getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(DatePeriodDetails2Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
}