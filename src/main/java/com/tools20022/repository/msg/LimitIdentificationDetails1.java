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
import com.tools20022.repository.choice.AccountIdentification1Choice;
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.choice.SystemIdentificationChoice;
import com.tools20022.repository.codeset.LimitType1Code;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cash management feature limiting the maximum risk a party accepts to take
 * with respect to a counterparty or a set of counterparties. A risk management
 * limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a
 * set of counterparties or all other members in a system.The limit may also
 * apply to sponsored members, ie, indirect members. In principle, a risk
 * management limit is calculated on the net position between two members and is
 * expressed as a credit or debit limit, from the point of view of the party
 * setting the limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmSystemIdentification
 * LimitIdentificationDetails1.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmBilateralLimitCounterpartyIdentification
 * LimitIdentificationDetails1.mmBilateralLimitCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmType
 * LimitIdentificationDetails1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmAccountOwner
 * LimitIdentificationDetails1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmAccountIdentification
 * LimitIdentificationDetails1.mmAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty1Rule#forLimitIdentificationDetails1
 * ConstraintBilateralLimitCounterparty1Rule.forLimitIdentificationDetails1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty2Rule#forLimitIdentificationDetails1
 * ConstraintBilateralLimitCounterparty2Rule.forLimitIdentificationDetails1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitIdentificationDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitIdentificationDetails1", propOrder = {"systemIdentification", "bilateralLimitCounterpartyIdentification", "type", "accountOwner", "accountIdentification"})
public class LimitIdentificationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysId")
	protected SystemIdentificationChoice systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
	 * SystemIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
	 * TransactionAdministrator.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a particular cash clearing system. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCashClearingSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails1.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemIdentificationChoice.mmObject();
		}
	};
	@XmlElement(name = "BilLmtCtrPtyId")
	protected MemberIdentificationChoice bilateralLimitCounterpartyIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtCtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilateralLimitCounterpartyIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails1.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Identification of the system member for which the limit is established.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected LimitType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType1Code
	 * LimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the risk management limit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Nature of the risk management limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LimitType1Code.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected BICIdentifier accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "AcctId")
	protected AccountIdentification1Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice
	 * AccountIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
	 * LimitIdentificationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitIdentificationDetails1.mmSystemIdentification,
						com.tools20022.repository.msg.LimitIdentificationDetails1.mmBilateralLimitCounterpartyIdentification, com.tools20022.repository.msg.LimitIdentificationDetails1.mmType,
						com.tools20022.repository.msg.LimitIdentificationDetails1.mmAccountOwner, com.tools20022.repository.msg.LimitIdentificationDetails1.mmAccountIdentification);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty1Rule.forLimitIdentificationDetails1,
						com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty2Rule.forLimitIdentificationDetails1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitIdentificationDetails1";
				definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemIdentificationChoice> getSystemIdentification() {
		return systemIdentification == null ? Optional.empty() : Optional.of(systemIdentification);
	}

	public LimitIdentificationDetails1 setSystemIdentification(SystemIdentificationChoice systemIdentification) {
		this.systemIdentification = systemIdentification;
		return this;
	}

	public Optional<MemberIdentificationChoice> getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification == null ? Optional.empty() : Optional.of(bilateralLimitCounterpartyIdentification);
	}

	public LimitIdentificationDetails1 setBilateralLimitCounterpartyIdentification(MemberIdentificationChoice bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = bilateralLimitCounterpartyIdentification;
		return this;
	}

	public LimitType1Code getType() {
		return type;
	}

	public LimitIdentificationDetails1 setType(LimitType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<BICIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public LimitIdentificationDetails1 setAccountOwner(BICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<AccountIdentification1Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public LimitIdentificationDetails1 setAccountIdentification(AccountIdentification1Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}
}