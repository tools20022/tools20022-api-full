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
import com.tools20022.repository.choice.PartyIdentification26Choice;
import com.tools20022.repository.codeset.InvestmentFundRole5Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.Intermediary20#mmRoleOrExtendedRoleRule
 * Intermediary20.mmRoleOrExtendedRoleRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary20#mmIdentification
 * Intermediary20.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmAccount
 * Intermediary20.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmRole
 * Intermediary20.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmExtendedRole
 * Intermediary20.mmExtendedRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Intermediary20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services to investors relating to financial products."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Intermediary20", propOrder = {"identification", "account", "role", "extendedRole"})
public class Intermediary20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification26Choice identification;
	/**
	 * Unique and unambiguous identifier of the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice
	 * PartyIdentification26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Intermediary20.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of the intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26Choice.mmObject();
		}
	};
	protected Account8 account;
	/**
	 * Business relationship between two entities; one entity is the account
	 * owner, the other entity is the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account8 Account8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmAccount;
			componentContext_lazy = () -> Intermediary20.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account8.mmObject();
		}
	};
	protected InvestmentFundRole5Code role;
	/**
	 * Function performed by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole5Code
	 * InvestmentFundRole5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
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
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> Intermediary20.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Function performed by the intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundRole5Code.mmObject();
		}
	};
	protected Extended350Code extendedRole;
	/**
	 * Function performed by the intermediary.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
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
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> Intermediary20.mmObject();
			isDerived = false;
			xmlTag = "XtndedRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedRole";
			definition = "Function performed by the intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
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
	 * {@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmRole
	 * Intermediary20.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary20#mmExtendedRole
	 * Intermediary20.mmExtendedRole}</li>
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
	public static final MMXor mmRoleOrExtendedRoleRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoleOrExtendedRoleRule";
			definition = "Either Role or ExtendedRole may be present, but not both.";
			messageComponent_lazy = () -> Intermediary20.mmObject();
			impactedElements_lazy = () -> Arrays.asList(Intermediary20.mmRole, Intermediary20.mmExtendedRole);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Intermediary20.mmIdentification, Intermediary20.mmAccount, Intermediary20.mmRole, Intermediary20.mmExtendedRole);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Intermediary20";
				definition = "Party that provides services to investors relating to financial products.";
				xors_lazy = () -> Arrays.asList(Intermediary20.mmRoleOrExtendedRoleRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public PartyIdentification26Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification26Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Acct")
	public Account8 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.Account8 account) {
		this.account = account;
	}

	@XmlElement(name = "Role", required = true)
	public InvestmentFundRole5Code getRole() {
		return role;
	}

	public void setRole(InvestmentFundRole5Code role) {
		this.role = role;
	}

	@XmlElement(name = "XtndedRole", required = true)
	public Extended350Code getExtendedRole() {
		return extendedRole;
	}

	public void setExtendedRole(Extended350Code extendedRole) {
		this.extendedRole = extendedRole;
	}
}