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
import com.tools20022.repository.choice.DateAndDateTimeSearchChoice;
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.codeset.BalanceCounterparty1Code;
import com.tools20022.repository.codeset.BalanceType6Code;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance related detailed for a cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails3#mmBalanceType
 * BalanceDetails3.mmBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmCounterpartyType
 * BalanceDetails3.mmCounterpartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmCounterpartyIdentification
 * BalanceDetails3.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmBalanceValueDate
 * BalanceDetails3.mmBalanceValueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance related detailed for a cash account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule#forBalanceDetails3
 * ConstraintCounterpartyIdentification1Rule.forBalanceDetails3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification2Rule#forBalanceDetails3
 * ConstraintCounterpartyIdentification2Rule.forBalanceDetails3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceDetails3", propOrder = {"balanceType", "counterpartyType", "counterpartyIdentification", "balanceValueDate"})
public class BalanceDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BalTp")
	protected List<BalanceType6Code> balanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType6Code
	 * BalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3
	 * BalanceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature of a balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceDetails3, List<BalanceType6Code>> mmBalanceType = new MMMessageAttribute<BalanceDetails3, List<BalanceType6Code>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails3.mmObject();
			isDerived = false;
			xmlTag = "BalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceType";
			definition = "Specifies the nature of a balance.";
			minOccurs = 0;
			simpleType_lazy = () -> BalanceType6Code.mmObject();
		}

		@Override
		public List<BalanceType6Code> getValue(BalanceDetails3 obj) {
			return obj.getBalanceType();
		}

		@Override
		public void setValue(BalanceDetails3 obj, List<BalanceType6Code> value) {
			obj.setBalanceType(value);
		}
	};
	@XmlElement(name = "CtrPtyTp", required = true)
	protected BalanceCounterparty1Code counterpartyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterparty1Code
	 * BalanceCounterparty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCalculationType
	 * CashBalance.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3
	 * BalanceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of counterparty for which the balance is calculated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceDetails3, BalanceCounterparty1Code> mmCounterpartyType = new MMMessageAttribute<BalanceDetails3, BalanceCounterparty1Code>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyType";
			definition = "Specifies the type of counterparty for which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceCounterparty1Code.mmObject();
		}

		@Override
		public BalanceCounterparty1Code getValue(BalanceDetails3 obj) {
			return obj.getCounterpartyType();
		}

		@Override
		public void setValue(BalanceDetails3 obj, BalanceCounterparty1Code value) {
			obj.setCounterpartyType(value);
		}
	};
	@XmlElement(name = "CtrPtyId")
	protected List<MemberIdentificationChoice> counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice
	 * MemberIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCounterparty
	 * CashBalance.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3
	 * BalanceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the counterparty for which the balance is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceDetails3, List<MemberIdentificationChoice>> mmCounterpartyIdentification = new MMMessageAttribute<BalanceDetails3, List<MemberIdentificationChoice>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCounterparty;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identifies the counterparty for which the balance is calculated.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}

		@Override
		public List<MemberIdentificationChoice> getValue(BalanceDetails3 obj) {
			return obj.getCounterpartyIdentification();
		}

		@Override
		public void setValue(BalanceDetails3 obj, List<MemberIdentificationChoice> value) {
			obj.setCounterpartyIdentification(value);
		}
	};
	@XmlElement(name = "BalValDt")
	protected List<DateAndDateTimeSearchChoice> balanceValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmValueDate
	 * Balance.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3
	 * BalanceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the balance is or will be available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceDetails3, List<DateAndDateTimeSearchChoice>> mmBalanceValueDate = new MMMessageAttribute<BalanceDetails3, List<DateAndDateTimeSearchChoice>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails3.mmObject();
			isDerived = false;
			xmlTag = "BalValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceValueDate";
			definition = "Date and time at which the balance is or will be available.";
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}

		@Override
		public List<DateAndDateTimeSearchChoice> getValue(BalanceDetails3 obj) {
			return obj.getBalanceValueDate();
		}

		@Override
		public void setValue(BalanceDetails3 obj, List<DateAndDateTimeSearchChoice> value) {
			obj.setBalanceValueDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails3.mmBalanceType, com.tools20022.repository.msg.BalanceDetails3.mmCounterpartyType,
						com.tools20022.repository.msg.BalanceDetails3.mmCounterpartyIdentification, com.tools20022.repository.msg.BalanceDetails3.mmBalanceValueDate);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule.forBalanceDetails3,
						com.tools20022.repository.constraints.ConstraintCounterpartyIdentification2Rule.forBalanceDetails3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BalanceDetails3";
				definition = "Balance related detailed for a cash account.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<BalanceType6Code> getBalanceType() {
		return balanceType == null ? balanceType = new ArrayList<>() : balanceType;
	}

	public BalanceDetails3 setBalanceType(List<BalanceType6Code> balanceType) {
		this.balanceType = Objects.requireNonNull(balanceType);
		return this;
	}

	public BalanceCounterparty1Code getCounterpartyType() {
		return counterpartyType;
	}

	public BalanceDetails3 setCounterpartyType(BalanceCounterparty1Code counterpartyType) {
		this.counterpartyType = Objects.requireNonNull(counterpartyType);
		return this;
	}

	public List<MemberIdentificationChoice> getCounterpartyIdentification() {
		return counterpartyIdentification == null ? counterpartyIdentification = new ArrayList<>() : counterpartyIdentification;
	}

	public BalanceDetails3 setCounterpartyIdentification(List<MemberIdentificationChoice> counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public List<DateAndDateTimeSearchChoice> getBalanceValueDate() {
		return balanceValueDate == null ? balanceValueDate = new ArrayList<>() : balanceValueDate;
	}

	public BalanceDetails3 setBalanceValueDate(List<DateAndDateTimeSearchChoice> balanceValueDate) {
		this.balanceValueDate = Objects.requireNonNull(balanceValueDate);
		return this;
	}
}