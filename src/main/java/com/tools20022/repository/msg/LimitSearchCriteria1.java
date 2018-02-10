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
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.entity.TransactionAdministrator;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmSystemIdentification
 * LimitSearchCriteria1.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmBilateralLimitCounterpartyIdentification
 * LimitSearchCriteria1.mmBilateralLimitCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmDefaultLimitType
 * LimitSearchCriteria1.mmDefaultLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmCurrentLimitType
 * LimitSearchCriteria1.mmCurrentLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmAccountOwner
 * LimitSearchCriteria1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmAccountIdentification
 * LimitSearchCriteria1.mmAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty3Rule#forLimitSearchCriteria1
 * ConstraintBilateralLimitCounterparty3Rule.forLimitSearchCriteria1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty4Rule#forLimitSearchCriteria1
 * ConstraintBilateralLimitCounterparty4Rule.forLimitSearchCriteria1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a limit."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitSearchCriteria1", propOrder = {"systemIdentification", "bilateralLimitCounterpartyIdentification", "defaultLimitType", "currentLimitType", "accountOwner", "accountIdentification"})
public class LimitSearchCriteria1 {

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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
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
	 * definition} = "Identification of a particular cash clearing system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCashClearingSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemIdentificationChoice.mmObject();
		}
	};
	@XmlElement(name = "BilLmtCtrPtyId")
	protected List<MemberIdentificationChoice> bilateralLimitCounterpartyIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCounterparty
	 * RiskManagementLimit.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
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
	 * "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilateralLimitCounterpartyIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RiskManagementLimit.mmCounterparty;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}
	};
	@XmlElement(name = "DfltLmtTp")
	protected List<LimitType1Code> defaultLimitType;
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of limit as set by default in the system. The default limit is applicable by the system unless otherwise instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitType";
			definition = "Type of limit as set by default in the system. The default limit is applicable by the system unless otherwise instructed.";
			minOccurs = 0;
			simpleType_lazy = () -> LimitType1Code.mmObject();
		}
	};
	@XmlElement(name = "CurLmtTp")
	protected List<LimitType1Code> currentLimitType;
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of limit applied by the system at the present time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CurLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitType";
			definition = "Type of limit applied by the system at the present time.";
			minOccurs = 0;
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
	 * LimitSearchCriteria1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria1.mmSystemIdentification, com.tools20022.repository.msg.LimitSearchCriteria1.mmBilateralLimitCounterpartyIdentification,
						com.tools20022.repository.msg.LimitSearchCriteria1.mmDefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria1.mmCurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria1.mmAccountOwner,
						com.tools20022.repository.msg.LimitSearchCriteria1.mmAccountIdentification);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty3Rule.forLimitSearchCriteria1,
						com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty4Rule.forLimitSearchCriteria1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitSearchCriteria1";
				definition = "Defines the criteria used to search for a limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemIdentificationChoice> getSystemIdentification() {
		return systemIdentification == null ? Optional.empty() : Optional.of(systemIdentification);
	}

	public LimitSearchCriteria1 setSystemIdentification(SystemIdentificationChoice systemIdentification) {
		this.systemIdentification = systemIdentification;
		return this;
	}

	public List<MemberIdentificationChoice> getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification == null ? bilateralLimitCounterpartyIdentification = new ArrayList<>() : bilateralLimitCounterpartyIdentification;
	}

	public LimitSearchCriteria1 setBilateralLimitCounterpartyIdentification(List<MemberIdentificationChoice> bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = Objects.requireNonNull(bilateralLimitCounterpartyIdentification);
		return this;
	}

	public List<LimitType1Code> getDefaultLimitType() {
		return defaultLimitType == null ? defaultLimitType = new ArrayList<>() : defaultLimitType;
	}

	public LimitSearchCriteria1 setDefaultLimitType(List<LimitType1Code> defaultLimitType) {
		this.defaultLimitType = Objects.requireNonNull(defaultLimitType);
		return this;
	}

	public List<LimitType1Code> getCurrentLimitType() {
		return currentLimitType == null ? currentLimitType = new ArrayList<>() : currentLimitType;
	}

	public LimitSearchCriteria1 setCurrentLimitType(List<LimitType1Code> currentLimitType) {
		this.currentLimitType = Objects.requireNonNull(currentLimitType);
		return this;
	}

	public Optional<BICIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public LimitSearchCriteria1 setAccountOwner(BICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<AccountIdentification1Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public LimitSearchCriteria1 setAccountIdentification(AccountIdentification1Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}
}