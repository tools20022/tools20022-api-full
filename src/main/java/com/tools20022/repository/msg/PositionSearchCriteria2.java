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
import com.tools20022.repository.choice.SecuritiesAccount2Choice;
import com.tools20022.repository.choice.SecuritiesBalanceType7Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification100;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the securities account position query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmAccountOwner
 * PositionSearchCriteria2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmAccountServicer
 * PositionSearchCriteria2.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmSafekeepingAccount
 * PositionSearchCriteria2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmFinancialInstrument
 * PositionSearchCriteria2.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmCountryOfIssue
 * PositionSearchCriteria2.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmSubBalanceType
 * PositionSearchCriteria2.mmSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2#mmReturnZeroPosition
 * PositionSearchCriteria2.mmReturnZeroPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PositionSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the securities account position query criteria."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1
 * PositionSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PositionSearchCriteria2", propOrder = {"accountOwner", "accountServicer", "safekeepingAccount", "financialInstrument", "countryOfIssue", "subBalanceType", "returnZeroPosition"})
public class PositionSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification100 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmAccountOwner
	 * PositionSearchCriteria1.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PositionSearchCriteria2, Optional<PartyIdentification100>> mmAccountOwner = new MMMessageAttribute<PositionSearchCriteria2, Optional<PartyIdentification100>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public Optional<PartyIdentification100> getValue(PositionSearchCriteria2 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<PartyIdentification100> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification100 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmAccountServicer
	 * PositionSearchCriteria1.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PositionSearchCriteria2, Optional<PartyIdentification100>> mmAccountServicer = new MMMessageAttribute<PositionSearchCriteria2, Optional<PartyIdentification100>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public Optional<PartyIdentification100> getValue(PositionSearchCriteria2 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<PartyIdentification100> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount2Choice safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice
	 * SecuritiesAccount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmSafekeepingAccount
	 * PositionSearchCriteria1.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecuritiesAccount2Choice>> mmSafekeepingAccount = new MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecuritiesAccount2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount2Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount2Choice> getValue(PositionSearchCriteria2 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<SecuritiesAccount2Choice> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrm")
	protected SecurityIdentification19 financialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-à-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmFinancialInstrument
	 * PositionSearchCriteria1.mmFinancialInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecurityIdentification19>> mmFinancialInstrument = new MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecurityIdentification19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument representing a sum of rights of the investor vis-à-vis the issuer.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmFinancialInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19> getValue(PositionSearchCriteria2 obj) {
			return obj.getFinancialInstrument();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<SecurityIdentification19> value) {
			obj.setFinancialInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected CountryCode countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country where the security is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmCountryOfIssue
	 * PositionSearchCriteria1.mmCountryOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PositionSearchCriteria2, Optional<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<PositionSearchCriteria2, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where the security is issued.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmCountryOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PositionSearchCriteria2 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<CountryCode> value) {
			obj.setCountryOfIssue(value.orElse(null));
		}
	};
	@XmlElement(name = "SubBalTp")
	protected SecuritiesBalanceType7Choice subBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice
	 * SecuritiesBalanceType7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines specific restriction characteristics for a securities position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmSubBalanceType
	 * PositionSearchCriteria1.mmSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecuritiesBalanceType7Choice>> mmSubBalanceType = new MMMessageAssociationEnd<PositionSearchCriteria2, Optional<SecuritiesBalanceType7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceType";
			definition = "Defines specific restriction characteristics for a securities position.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesBalanceType7Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesBalanceType7Choice> getValue(PositionSearchCriteria2 obj) {
			return obj.getSubBalanceType();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, Optional<SecuritiesBalanceType7Choice> value) {
			obj.setSubBalanceType(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrZeroPos", required = true)
	protected TrueFalseIndicator returnZeroPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria2
	 * PositionSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrZeroPos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnZeroPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option to provide output zero position in the results."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PositionSearchCriteria1#mmReturnZeroPosition
	 * PositionSearchCriteria1.mmReturnZeroPosition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PositionSearchCriteria2, TrueFalseIndicator> mmReturnZeroPosition = new MMMessageAttribute<PositionSearchCriteria2, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PositionSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RtrZeroPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnZeroPosition";
			definition = "Option to provide output zero position in the results.";
			previousVersion_lazy = () -> PositionSearchCriteria1.mmReturnZeroPosition;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(PositionSearchCriteria2 obj) {
			return obj.getReturnZeroPosition();
		}

		@Override
		public void setValue(PositionSearchCriteria2 obj, TrueFalseIndicator value) {
			obj.setReturnZeroPosition(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PositionSearchCriteria2.mmAccountOwner, com.tools20022.repository.msg.PositionSearchCriteria2.mmAccountServicer,
						com.tools20022.repository.msg.PositionSearchCriteria2.mmSafekeepingAccount, com.tools20022.repository.msg.PositionSearchCriteria2.mmFinancialInstrument,
						com.tools20022.repository.msg.PositionSearchCriteria2.mmCountryOfIssue, com.tools20022.repository.msg.PositionSearchCriteria2.mmSubBalanceType,
						com.tools20022.repository.msg.PositionSearchCriteria2.mmReturnZeroPosition);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PositionSearchCriteria2";
				definition = "Defines the securities account position query criteria.";
				previousVersion_lazy = () -> PositionSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification100> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public PositionSearchCriteria2 setAccountOwner(PartyIdentification100 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<PartyIdentification100> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public PositionSearchCriteria2 setAccountServicer(PartyIdentification100 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<SecuritiesAccount2Choice> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public PositionSearchCriteria2 setSafekeepingAccount(SecuritiesAccount2Choice safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<SecurityIdentification19> getFinancialInstrument() {
		return financialInstrument == null ? Optional.empty() : Optional.of(financialInstrument);
	}

	public PositionSearchCriteria2 setFinancialInstrument(SecurityIdentification19 financialInstrument) {
		this.financialInstrument = financialInstrument;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public PositionSearchCriteria2 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<SecuritiesBalanceType7Choice> getSubBalanceType() {
		return subBalanceType == null ? Optional.empty() : Optional.of(subBalanceType);
	}

	public PositionSearchCriteria2 setSubBalanceType(SecuritiesBalanceType7Choice subBalanceType) {
		this.subBalanceType = subBalanceType;
		return this;
	}

	public TrueFalseIndicator getReturnZeroPosition() {
		return returnZeroPosition;
	}

	public PositionSearchCriteria2 setReturnZeroPosition(TrueFalseIndicator returnZeroPosition) {
		this.returnZeroPosition = Objects.requireNonNull(returnZeroPosition);
		return this;
	}
}