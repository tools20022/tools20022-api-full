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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.InvestmentFundRole2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.entity.IntermediaryRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party that provides services to investors relating to financial products.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary11#RoleOrExtendedRoleRule
 * Intermediary11.RoleOrExtendedRoleRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary11#mmIdentification
 * Intermediary11.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmAccount
 * Intermediary11.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmRole
 * Intermediary11.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmExtendedRole
 * Intermediary11.mmExtendedRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntermediaryRole
 * IntermediaryRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Intermediary11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services to investors relating to financial products."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25 Intermediary25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27 Intermediary27}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Intermediary11", propOrder = {"identification", "account", "role", "extendedRole"})
public class Intermediary11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification2Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier of the intermediary."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary25#mmIdentification
	 * Intermediary25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary27#mmIdentification
	 * Intermediary27.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary25.mmIdentification, Intermediary27.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "Acct")
	protected Account7 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account7 Account7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25#mmAccount
	 * Intermediary25.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27#mmAccount
	 * Intermediary27.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountPartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary11.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary25.mmAccount, Intermediary27.mmAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account7.mmObject();
		}
	};
	@XmlElement(name = "Role")
	protected InvestmentFundRole2Code role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function performed by the intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRole = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary11.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Function performed by the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedRole")
	protected Extended350Code extendedRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function performed by the intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedRole = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary11.mmObject();
			isDerived = false;
			xmlTag = "XtndedRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedRole";
			definition = "Function performed by the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Either Role or ExtendedRole may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmRole
	 * Intermediary11.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary11#mmExtendedRole
	 * Intermediary11.mmExtendedRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoleOrExtendedRoleRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Role or ExtendedRole may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor RoleOrExtendedRoleRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoleOrExtendedRoleRule";
			definition = "Either Role or ExtendedRole may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Intermediary11.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary11.mmRole, com.tools20022.repository.msg.Intermediary11.mmExtendedRole);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary11.mmIdentification, com.tools20022.repository.msg.Intermediary11.mmAccount, com.tools20022.repository.msg.Intermediary11.mmRole,
						com.tools20022.repository.msg.Intermediary11.mmExtendedRole);
				trace_lazy = () -> IntermediaryRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Intermediary11";
				definition = "Party that provides services to investors relating to financial products.";
				nextVersions_lazy = () -> Arrays.asList(Intermediary25.mmObject(), Intermediary27.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary11.RoleOrExtendedRoleRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification2Choice getIdentification() {
		return identification;
	}

	public Intermediary11 setIdentification(PartyIdentification2Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Account7> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public Intermediary11 setAccount(com.tools20022.repository.msg.Account7 account) {
		this.account = account;
		return this;
	}

	public Optional<InvestmentFundRole2Code> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public Intermediary11 setRole(InvestmentFundRole2Code role) {
		this.role = role;
		return this;
	}

	public Optional<Extended350Code> getExtendedRole() {
		return extendedRole == null ? Optional.empty() : Optional.of(extendedRole);
	}

	public Intermediary11 setExtendedRole(Extended350Code extendedRole) {
		this.extendedRole = extendedRole;
		return this;
	}
}