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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.choice.RestrictionStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#Limitation
 * AccountRestrictions1.Limitation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#AdditionalInformation
 * AccountRestrictions1.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#AccountValidation
 * AccountRestrictions1.AccountValidation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#Type
 * AccountRestrictions1.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#Regulator
 * AccountRestrictions1.Regulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#Status
 * AccountRestrictions1.Status}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRestrictions1#Period
 * AccountRestrictions1.Period}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#AdditionalInformation
 * AccountOpeningInstructionV06.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#AdditionalInformation
 * AccountDetailsConfirmationV06.AdditionalInformation}</li>
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
public class AccountRestrictions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#Limitation
	 * AdditiononalInformation12.Limitation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Limitation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Lmttn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limitation";
			definition = "Restrictions and/or limitations on the account or account party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.Limitation);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#AdditionalInformation
	 * AdditiononalInformation12.AdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.AdditionalInformation);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#AccountValidation
	 * AdditiononalInformation12.AccountValidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AccountValidation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "AcctVldtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountValidation";
			definition = "Information or instructions for the by-passing of validations in the account registration process.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.AccountValidation);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#Type
	 * AdditiononalInformation12.Type}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type or identification of the restriction";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.Type);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#Regulator
	 * AdditiononalInformation12.Regulator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Regulator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Rgltr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regulator";
			definition = "Regulator that may have to be informed about restrictions or limitations on the account or account party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.Regulator);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#Status
	 * AdditiononalInformation12.Status}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Status = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the restriction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.Status);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RestrictionStatus1Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#Period
	 * AdditiononalInformation12.Period}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Period = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountRestrictions1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Period of the restriction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.Period);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriodDetails1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountRestrictions1.Limitation, com.tools20022.repository.msg.AccountRestrictions1.AdditionalInformation,
						com.tools20022.repository.msg.AccountRestrictions1.AccountValidation, com.tools20022.repository.msg.AccountRestrictions1.Type, com.tools20022.repository.msg.AccountRestrictions1.Regulator,
						com.tools20022.repository.msg.AccountRestrictions1.Status, com.tools20022.repository.msg.AccountRestrictions1.Period);
				messageBuildingBlock_lazy = () -> Arrays
						.asList(com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.AdditionalInformation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.AdditionalInformation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountRestrictions1";
				definition = "Restrictions that may be applied to an account or investment plan.";
				nextVersions_lazy = () -> Arrays.asList(AdditiononalInformation12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}