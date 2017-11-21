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
import com.tools20022.repository.choice.BalanceType3Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearchChoice;
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.codeset.BalanceCounterparty1Code;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails4#mmBalanceType
 * BalanceDetails4.mmBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmCounterpartyType
 * BalanceDetails4.mmCounterpartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmCounterpartyIdentification
 * BalanceDetails4.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmBalanceValueDate
 * BalanceDetails4.mmBalanceValueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
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
 * "BalanceDetails4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance related detailed for a cash account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BalanceDetails4", propOrder = {"balanceType", "counterpartyType", "counterpartyIdentification", "balanceValueDate"})
public class BalanceDetails4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<BalanceType3Choice> balanceType;
	/**
	 * Specifies the nature of a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BalanceType3Choice
	 * BalanceType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4
	 * BalanceDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature of a balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> BalanceDetails4.mmObject();
			isDerived = false;
			xmlTag = "BalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceType";
			definition = "Specifies the nature of a balance.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceType3Choice.mmObject();
		}
	};
	protected BalanceCounterparty1Code counterpartyType;
	/**
	 * Specifies the type of counterparty for which the balance is calculated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4
	 * BalanceDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of counterparty for which the balance is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCalculationType;
			componentContext_lazy = () -> BalanceDetails4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyType";
			definition = "Specifies the type of counterparty for which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceCounterparty1Code.mmObject();
		}
	};
	protected List<MemberIdentificationChoice> counterpartyIdentification;
	/**
	 * Identifies the counterparty for which the balance is calculated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4
	 * BalanceDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the counterparty for which the balance is calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCounterparty;
			componentContext_lazy = () -> BalanceDetails4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identifies the counterparty for which the balance is calculated.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}
	};
	protected List<DateAndDateTimeSearchChoice> balanceValueDate;
	/**
	 * Date and time at which the balance is or will be available.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4
	 * BalanceDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the balance is or will be available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Balance.mmValueDate;
			componentContext_lazy = () -> BalanceDetails4.mmObject();
			isDerived = false;
			xmlTag = "BalValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceValueDate";
			definition = "Date and time at which the balance is or will be available.";
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BalanceDetails4.mmBalanceType, BalanceDetails4.mmCounterpartyType, BalanceDetails4.mmCounterpartyIdentification, BalanceDetails4.mmBalanceValueDate);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BalanceDetails4";
				definition = "Balance related detailed for a cash account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BalTp")
	public List<BalanceType3Choice> getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(List<BalanceType3Choice> balanceType) {
		this.balanceType = balanceType;
	}

	@XmlElement(name = "CtrPtyTp", required = true)
	public BalanceCounterparty1Code getCounterpartyType() {
		return counterpartyType;
	}

	public void setCounterpartyType(BalanceCounterparty1Code counterpartyType) {
		this.counterpartyType = counterpartyType;
	}

	@XmlElement(name = "CtrPtyId")
	public List<MemberIdentificationChoice> getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public void setCounterpartyIdentification(List<MemberIdentificationChoice> counterpartyIdentification) {
		this.counterpartyIdentification = counterpartyIdentification;
	}

	@XmlElement(name = "BalValDt")
	public List<DateAndDateTimeSearchChoice> getBalanceValueDate() {
		return balanceValueDate;
	}

	public void setBalanceValueDate(List<DateAndDateTimeSearchChoice> balanceValueDate) {
		this.balanceValueDate = balanceValueDate;
	}
}