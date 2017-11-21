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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.SystemIdentification2Choice;
import com.tools20022.repository.codeset.ReservationType1Code;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a reservation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmSystemIdentification
 * ReservationSearchCriteria2.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmDefaultReservationType
 * ReservationSearchCriteria2.mmDefaultReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmCurrentReservationType
 * ReservationSearchCriteria2.mmCurrentReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmAccountOwner
 * ReservationSearchCriteria2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmAccountIdentification
 * ReservationSearchCriteria2.mmAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
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
 * "ReservationSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a reservation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ReservationSearchCriteria2", propOrder = {"systemIdentification", "defaultReservationType", "currentReservationType", "accountOwner", "accountIdentification"})
public class ReservationSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemIdentification2Choice systemIdentification;
	/**
	 * Identification of a particular cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
	 * SystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
	 * ReservationSearchCriteria2}</li>
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
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> ReservationSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemIdentification2Choice.mmObject();
		}
	};
	protected List<ReservationType1Code> defaultReservationType;
	/**
	 * Type of reservation as set by default in the system. The default
	 * reservation is applicable by the system unless otherwise instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmReservationType
	 * Reservation.mmReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
	 * ReservationSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltRsvatnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultReservationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of reservation as set by default in the system. The default reservation is applicable by the system unless otherwise instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultReservationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Reservation.mmReservationType;
			componentContext_lazy = () -> ReservationSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DfltRsvatnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultReservationType";
			definition = "Type of reservation as set by default in the system. The default reservation is applicable by the system unless otherwise instructed.";
			minOccurs = 0;
			simpleType_lazy = () -> ReservationType1Code.mmObject();
		}
	};
	protected List<ReservationType1Code> currentReservationType;
	/**
	 * Type of reservation applied by the system at the present time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmReservationType
	 * Reservation.mmReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
	 * ReservationSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurRsvatnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentReservationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of reservation applied by the system at the present time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentReservationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Reservation.mmReservationType;
			componentContext_lazy = () -> ReservationSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CurRsvatnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentReservationType";
			definition = "Type of reservation applied by the system at the present time.";
			minOccurs = 0;
			simpleType_lazy = () -> ReservationType1Code.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountOwner;
	/**
	 * Owner of the account which is being queried.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
	 * ReservationSearchCriteria2}</li>
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
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ReservationSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
	 * ReservationSearchCriteria2}</li>
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
			componentContext_lazy = () -> ReservationSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReservationSearchCriteria2.mmSystemIdentification, ReservationSearchCriteria2.mmDefaultReservationType, ReservationSearchCriteria2.mmCurrentReservationType,
						ReservationSearchCriteria2.mmAccountOwner, ReservationSearchCriteria2.mmAccountIdentification);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReservationSearchCriteria2";
				definition = "Defines the criteria used to search for a reservation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SysId")
	public SystemIdentification2Choice getSystemIdentification() {
		return systemIdentification;
	}

	public void setSystemIdentification(SystemIdentification2Choice systemIdentification) {
		this.systemIdentification = systemIdentification;
	}

	@XmlElement(name = "DfltRsvatnTp")
	public List<ReservationType1Code> getDefaultReservationType() {
		return defaultReservationType;
	}

	public void setDefaultReservationType(List<ReservationType1Code> defaultReservationType) {
		this.defaultReservationType = defaultReservationType;
	}

	@XmlElement(name = "CurRsvatnTp")
	public List<ReservationType1Code> getCurrentReservationType() {
		return currentReservationType;
	}

	public void setCurrentReservationType(List<ReservationType1Code> currentReservationType) {
		this.currentReservationType = currentReservationType;
	}

	@XmlElement(name = "AcctOwnr")
	public BranchAndFinancialInstitutionIdentification5 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "AcctId")
	public AccountIdentification4Choice getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
	}
}