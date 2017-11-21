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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV06;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.choice.RestrictionStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Restrictions that may be applied to an account or investment plan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmLimitation
 * AccountRestrictions1.mmLimitation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmAdditionalInformation
 * AccountRestrictions1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmAccountValidation
 * AccountRestrictions1.mmAccountValidation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmType
 * AccountRestrictions1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmRegulator
 * AccountRestrictions1.mmRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmStatus
 * AccountRestrictions1.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmPeriod
 * AccountRestrictions1.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmAdditionalInformation
 * AccountOpeningInstructionV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAdditionalInformation
 * AccountDetailsConfirmationV06.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountRestrictions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Restrictions that may be applied to an account or investment plan."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditiononalInformation12
 * AdditiononalInformation12}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountRestrictions1", propOrder = {"limitation", "additionalInformation", "accountValidation", "type", "regulator", "status", "period"})
public class AccountRestrictions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text limitation;
	/**
	 * Restrictions and/or limitations on the account or account party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmttn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limitation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restrictions and/or limitations on the account or account party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmLimitation
	 * AdditiononalInformation12.mmLimitation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Lmttn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limitation";
			definition = "Restrictions and/or limitations on the account or account party.";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmLimitation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmAdditionalInformation
	 * AdditiononalInformation12.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information. ";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text accountValidation;
	/**
	 * Information or instructions for the by-passing of validations in the
	 * account registration process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information or instructions for the by-passing of validations in the account registration process."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmAccountValidation
	 * AdditiononalInformation12.mmAccountValidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountValidation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "AcctVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountValidation";
			definition = "Information or instructions for the by-passing of validations in the account registration process.";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmAccountValidation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text type;
	/**
	 * Type or identification of the restriction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
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
	 * definition} = "Type or identification of the restriction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmType
	 * AdditiononalInformation12.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type or identification of the restriction";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification70Choice regulator;
	/**
	 * Regulator that may have to be informed about restrictions or limitations
	 * on the account or account party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulator that may have to be informed about restrictions or limitations on the account or account party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmRegulator
	 * AdditiononalInformation12.mmRegulator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Rgltr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regulator";
			definition = "Regulator that may have to be informed about restrictions or limitations on the account or account party.";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmRegulator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected RestrictionStatus1Choice status;
	/**
	 * Status of the restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RestrictionStatus1Choice
	 * RestrictionStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the restriction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmStatus
	 * AdditiononalInformation12.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the restriction.";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RestrictionStatus1Choice.mmObject();
		}
	};
	protected DateTimePeriodDetails1 period;
	/**
	 * Period of the restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the restriction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmPeriod
	 * AdditiononalInformation12.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Period of the restriction.";
			nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountRestrictions1.mmLimitation, AccountRestrictions1.mmAdditionalInformation, AccountRestrictions1.mmAccountValidation, AccountRestrictions1.mmType,
						AccountRestrictions1.mmRegulator, AccountRestrictions1.mmStatus, AccountRestrictions1.mmPeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV06.mmAdditionalInformation, AccountDetailsConfirmationV06.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountRestrictions1";
				definition = "Restrictions that may be applied to an account or investment plan.";
				nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Lmttn")
	public Max350Text getLimitation() {
		return limitation;
	}

	public void setLimitation(Max350Text limitation) {
		this.limitation = limitation;
	}

	@XmlElement(name = "AddtlInf")
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "AcctVldtn")
	public Max350Text getAccountValidation() {
		return accountValidation;
	}

	public void setAccountValidation(Max350Text accountValidation) {
		this.accountValidation = accountValidation;
	}

	@XmlElement(name = "Tp")
	public Max35Text getType() {
		return type;
	}

	public void setType(Max35Text type) {
		this.type = type;
	}

	@XmlElement(name = "Rgltr")
	public PartyIdentification70Choice getRegulator() {
		return regulator;
	}

	public void setRegulator(PartyIdentification70Choice regulator) {
		this.regulator = regulator;
	}

	@XmlElement(name = "Sts")
	public RestrictionStatus1Choice getStatus() {
		return status;
	}

	public void setStatus(RestrictionStatus1Choice status) {
		this.status = status;
	}

	@XmlElement(name = "Prd")
	public DateTimePeriodDetails1 getPeriod() {
		return period;
	}

	public void setPeriod(com.tools20022.repository.msg.DateTimePeriodDetails1 period) {
		this.period = period;
	}
}