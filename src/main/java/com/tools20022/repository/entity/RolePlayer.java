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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.msg.PartyIdentification79;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of entity that plays a specific role in a specific context.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RolePlayer" src="doc-files/RolePlayer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#Role
 * RolePlayer.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#ValidityPeriod
 * RolePlayer.ValidityPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Player Role.Player}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedRolePlayer
 * DateTimePeriod.RelatedRolePlayer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#RegisteredShareholderName
 * AccountParties13.RegisteredShareholderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#RegisteredShareholderName
 * AccountParties14.RegisteredShareholderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#RegisteredShareholderName
 * AccountParties15.RegisteredShareholderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#RegisteredShareholderName
 * AccountParties16.RegisteredShareholderName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification79
 * PartyIdentification79}</li>
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
 * "RolePlayer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of entity that plays a specific role in a specific context."</li>
 * </ul>
 */
public class RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Role of the entity in the activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#Player
	 * Role.Player}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#ExtendedPartyRole
	 * InvestmentAccountOwnershipInformation2.ExtendedPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty2#ExtendedPartyRole
	 * ExtendedParty2.ExtendedPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#ExtendedPartyRole
	 * InvestmentAccountOwnershipInformation3.ExtendedPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty1#ExtendedPartyRole
	 * ExtendedParty1.ExtendedPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#Role
	 * ContactIdentification4.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#Role
	 * ContactIdentification3.Role}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary26#Role
	 * Intermediary26.Role}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25#Role
	 * Intermediary25.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1#BaseParty
	 * SingleQualifiedPartyIdentification1.BaseParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#Role
	 * QualifiedPartyIdentification1.Role}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary34#Role
	 * Intermediary34.Role}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35#Role
	 * Intermediary35.Role}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the entity in the activity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty2.ExtendedPartyRole,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty1.ExtendedPartyRole, com.tools20022.repository.msg.ContactIdentification4.Role,
					com.tools20022.repository.msg.ContactIdentification3.Role, com.tools20022.repository.msg.Intermediary26.Role, com.tools20022.repository.msg.Intermediary25.Role,
					com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.BaseParty, com.tools20022.repository.msg.QualifiedPartyIdentification1.Role, com.tools20022.repository.msg.Intermediary34.Role,
					com.tools20022.repository.msg.Intermediary35.Role);
			elementContext_lazy = () -> RolePlayer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role of the entity in the activity.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Role.Player;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which a role player is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedRolePlayer
	 * DateTimePeriod.RelatedRolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the period during which a role player is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RolePlayer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a role player is valid";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RolePlayer";
				definition = "Type of entity that plays a specific role in a specific context.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Player, com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties13.RegisteredShareholderName, com.tools20022.repository.msg.AccountParties14.RegisteredShareholderName,
						com.tools20022.repository.msg.AccountParties15.RegisteredShareholderName, com.tools20022.repository.msg.AccountParties16.RegisteredShareholderName);
				subType_lazy = () -> Arrays.asList(Party.mmObject(), System.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.Role, com.tools20022.repository.entity.RolePlayer.ValidityPeriod);
				derivationComponent_lazy = () -> Arrays.asList(PartyIdentification79.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}