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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification15;
import com.tools20022.repository.msg.SignedQuantityFormat3;
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
 * Provides information about the corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmOptionNumber
 * CorporateActionOption27.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmOptionType
 * CorporateActionOption27.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmAccountOwner
 * CorporateActionOption27.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmSafekeepingAccount
 * CorporateActionOption27.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmCashAccount
 * CorporateActionOption27.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmSafekeepingPlace
 * CorporateActionOption27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmSecurityIdentification
 * CorporateActionOption27.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmTotalEligibleBalance
 * CorporateActionOption27.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmInstructedBalance
 * CorporateActionOption27.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmUninstructedBalance
 * CorporateActionOption27.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmStatusQuantityOrQuantityToReceive
 * CorporateActionOption27.mmStatusQuantityOrQuantityToReceive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOption27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionOption27
 * ConstraintOptionNumberRule.forCorporateActionOption27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forCorporateActionOption27
 * ConstraintSafekeepingPlaceRule.forCorporateActionOption27}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOption27", propOrder = {"optionNumber", "optionType", "accountOwner", "safekeepingAccount", "cashAccount", "safekeepingPlace", "securityIdentification", "totalEligibleBalance", "instructedBalance",
		"uninstructedBalance", "statusQuantityOrQuantityToReceive"})
public class CorporateActionOption27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb", required = true)
	protected OptionNumber1Choice optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionNumber1Choice
	 * OptionNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, OptionNumber1Choice> mmOptionNumber = new MMMessageAssociationEnd<CorporateActionOption27, OptionNumber1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}

		@Override
		public OptionNumber1Choice getValue(CorporateActionOption27 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, OptionNumber1Choice value) {
			obj.setOptionNumber(value);
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption7Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice
	 * CorporateActionOption7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, CorporateActionOption7Choice> mmOptionType = new MMMessageAssociationEnd<CorporateActionOption27, CorporateActionOption7Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption7Choice.mmObject();
		}

		@Override
		public CorporateActionOption7Choice getValue(CorporateActionOption27 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, CorporateActionOption7Choice value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification50Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice
	 * PartyIdentification50Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACOW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<PartyIdentification50Choice>> mmAccountOwner = new MMMessageAssociationEnd<CorporateActionOption27, Optional<PartyIdentification50Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACOW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification50Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification50Choice> getValue(CorporateActionOption27 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<PartyIdentification50Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account where financial instruments are maintained."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption27, Optional<RestrictedFINXMax35Text>> mmSafekeepingAccount = new MMMessageAttribute<CorporateActionOption27, Optional<RestrictedFINXMax35Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax35Text> getValue(CorporateActionOption27 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<RestrictedFINXMax35Text> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccountIdentification6Choice cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<CashAccountIdentification6Choice>> mmCashAccount = new MMMessageAssociationEnd<CorporateActionOption27, Optional<CashAccountIdentification6Choice>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account on which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification6Choice> getValue(CorporateActionOption27 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<CashAccountIdentification6Choice> value) {
			obj.setCashAccount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location where the financial instruments are/will be safekept."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<SafekeepingPlaceFormat5Choice>> mmSafekeepingPlace = new MMMessageAssociationEnd<CorporateActionOption27, Optional<SafekeepingPlaceFormat5Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
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

		@Override
		public Optional<SafekeepingPlaceFormat5Choice> getValue(CorporateActionOption27 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<SafekeepingPlaceFormat5Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyId")
	protected SecurityIdentification15 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<SecurityIdentification15>> mmSecurityIdentification = new MMMessageAssociationEnd<CorporateActionOption27, Optional<SecurityIdentification15>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification15.mmObject();
		}

		@Override
		public Optional<SecurityIdentification15> getValue(CorporateActionOption27 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<SecurityIdentification15> value) {
			obj.setSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlElgblBal")
	protected SignedQuantityFormat3 totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>> mmTotalEligibleBalance = new MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat3.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat3> getValue(CorporateActionOption27 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<SignedQuantityFormat3> value) {
			obj.setTotalEligibleBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdBal")
	protected SignedQuantityFormat3 instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::INBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>> mmInstructedBalance = new MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::INBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat3.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat3> getValue(CorporateActionOption27 obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<SignedQuantityFormat3> value) {
			obj.setInstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UinstdBal")
	protected SignedQuantityFormat3 uninstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>> mmUninstructedBalance = new MMMessageAssociationEnd<CorporateActionOption27, Optional<SignedQuantityFormat3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat3.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat3> getValue(CorporateActionOption27 obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<SignedQuantityFormat3> value) {
			obj.setUninstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "StsQtyOrQtyToRcv")
	protected StatusOrQuantityToReceive2Choice statusQuantityOrQuantityToReceive;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice
	 * StatusOrQuantityToReceive2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsQtyOrQtyToRcv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusQuantityOrQuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the quantity of financial instrument is a status quantity or a quantity to receive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption27, Optional<StatusOrQuantityToReceive2Choice>> mmStatusQuantityOrQuantityToReceive = new MMMessageAssociationEnd<CorporateActionOption27, Optional<StatusOrQuantityToReceive2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption27.mmObject();
			isDerived = false;
			xmlTag = "StsQtyOrQtyToRcv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusQuantityOrQuantityToReceive";
			definition = "Specifies whether the quantity of financial instrument is a status quantity or a quantity to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusOrQuantityToReceive2Choice.mmObject();
		}

		@Override
		public Optional<StatusOrQuantityToReceive2Choice> getValue(CorporateActionOption27 obj) {
			return obj.getStatusQuantityOrQuantityToReceive();
		}

		@Override
		public void setValue(CorporateActionOption27 obj, Optional<StatusOrQuantityToReceive2Choice> value) {
			obj.setStatusQuantityOrQuantityToReceive(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption27.mmOptionNumber, com.tools20022.repository.msg.CorporateActionOption27.mmOptionType,
						com.tools20022.repository.msg.CorporateActionOption27.mmAccountOwner, com.tools20022.repository.msg.CorporateActionOption27.mmSafekeepingAccount, com.tools20022.repository.msg.CorporateActionOption27.mmCashAccount,
						com.tools20022.repository.msg.CorporateActionOption27.mmSafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption27.mmSecurityIdentification,
						com.tools20022.repository.msg.CorporateActionOption27.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption27.mmInstructedBalance,
						com.tools20022.repository.msg.CorporateActionOption27.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption27.mmStatusQuantityOrQuantityToReceive);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionOption27,
						com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forCorporateActionOption27);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionOption27";
				definition = "Provides information about the corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionOption27 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOption7Choice getOptionType() {
		return optionType;
	}

	public CorporateActionOption27 setOptionType(CorporateActionOption7Choice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public Optional<PartyIdentification50Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CorporateActionOption27 setAccountOwner(PartyIdentification50Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<RestrictedFINXMax35Text> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public CorporateActionOption27 setSafekeepingAccount(RestrictedFINXMax35Text safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<CashAccountIdentification6Choice> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public CorporateActionOption27 setCashAccount(CashAccountIdentification6Choice cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<SafekeepingPlaceFormat5Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public CorporateActionOption27 setSafekeepingPlace(SafekeepingPlaceFormat5Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<SecurityIdentification15> getSecurityIdentification() {
		return securityIdentification == null ? Optional.empty() : Optional.of(securityIdentification);
	}

	public CorporateActionOption27 setSecurityIdentification(SecurityIdentification15 securityIdentification) {
		this.securityIdentification = securityIdentification;
		return this;
	}

	public Optional<SignedQuantityFormat3> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionOption27 setTotalEligibleBalance(SignedQuantityFormat3 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<SignedQuantityFormat3> getInstructedBalance() {
		return instructedBalance == null ? Optional.empty() : Optional.of(instructedBalance);
	}

	public CorporateActionOption27 setInstructedBalance(SignedQuantityFormat3 instructedBalance) {
		this.instructedBalance = instructedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat3> getUninstructedBalance() {
		return uninstructedBalance == null ? Optional.empty() : Optional.of(uninstructedBalance);
	}

	public CorporateActionOption27 setUninstructedBalance(SignedQuantityFormat3 uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
		return this;
	}

	public Optional<StatusOrQuantityToReceive2Choice> getStatusQuantityOrQuantityToReceive() {
		return statusQuantityOrQuantityToReceive == null ? Optional.empty() : Optional.of(statusQuantityOrQuantityToReceive);
	}

	public CorporateActionOption27 setStatusQuantityOrQuantityToReceive(StatusOrQuantityToReceive2Choice statusQuantityOrQuantityToReceive) {
		this.statusQuantityOrQuantityToReceive = statusQuantityOrQuantityToReceive;
		return this;
	}
}