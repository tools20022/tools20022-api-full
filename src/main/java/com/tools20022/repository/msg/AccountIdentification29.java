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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification51Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account information and detailed account holdings information report for
 * corporate action events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmSafekeepingAccount
 * AccountIdentification29.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmAccountOwner
 * AccountIdentification29.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmSafekeepingPlace
 * AccountIdentification29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmCorporateActionEventAndBalance
 * AccountIdentification29.mmCorporateActionEventAndBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification29
 * ConstraintSafekeepingPlaceRule.forAccountIdentification29}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountIdentification29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account information and detailed account holdings information report for corporate action events."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification29", propOrder = {"safekeepingAccount", "accountOwner", "safekeepingPlace", "corporateActionEventAndBalance"})
public class AccountIdentification29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgAcct", required = true)
	protected RestrictedFINXMax35Text safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29
	 * AccountIdentification29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account where financial instruments are maintained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingAccount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountIdentification29.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification51Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice
	 * PartyIdentification51Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29
	 * AccountIdentification29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACOW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountIdentification29.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACOW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification51Choice.mmObject();
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat5Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice
	 * SafekeepingPlaceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29
	 * AccountIdentification29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location where the financial instruments are/will be safekept."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountIdentification29.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are/will be safekept.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat5Choice.mmObject();
		}
	};
	@XmlElement(name = "CorpActnEvtAndBal")
	protected List<com.tools20022.repository.msg.CorporateActionEventAndBalance8> corporateActionEventAndBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8
	 * CorporateActionEventAndBalance8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29
	 * AccountIdentification29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtAndBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed account holdings information report for a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventAndBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountIdentification29.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtAndBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalance";
			definition = "Detailed account holdings information report for a corporate action event.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentification29.mmSafekeepingAccount, com.tools20022.repository.msg.AccountIdentification29.mmAccountOwner,
						com.tools20022.repository.msg.AccountIdentification29.mmSafekeepingPlace, com.tools20022.repository.msg.AccountIdentification29.mmCorporateActionEventAndBalance);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification29);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountIdentification29";
				definition = "Account information and detailed account holdings information report for corporate action events.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax35Text getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public AccountIdentification29 setSafekeepingAccount(RestrictedFINXMax35Text safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<PartyIdentification51Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public AccountIdentification29 setAccountOwner(PartyIdentification51Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<SafekeepingPlaceFormat5Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public AccountIdentification29 setSafekeepingPlace(SafekeepingPlaceFormat5Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public List<CorporateActionEventAndBalance8> getCorporateActionEventAndBalance() {
		return corporateActionEventAndBalance == null ? corporateActionEventAndBalance = new ArrayList<>() : corporateActionEventAndBalance;
	}

	public AccountIdentification29 setCorporateActionEventAndBalance(List<com.tools20022.repository.msg.CorporateActionEventAndBalance8> corporateActionEventAndBalance) {
		this.corporateActionEventAndBalance = Objects.requireNonNull(corporateActionEventAndBalance);
		return this;
	}
}