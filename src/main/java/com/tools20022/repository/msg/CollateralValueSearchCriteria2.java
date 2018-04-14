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
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmAccountIdentification
 * CollateralValueSearchCriteria2.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmCurrency
 * CollateralValueSearchCriteria2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmAccountOwner
 * CollateralValueSearchCriteria2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmAccountServicer
 * CollateralValueSearchCriteria2.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmFinancialInstrumentIdentification
 * CollateralValueSearchCriteria2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmSecuritiesAccountOwner
 * CollateralValueSearchCriteria2.mmSecuritiesAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2#mmSecuritiesAccountServicer
 * CollateralValueSearchCriteria2.mmSecuritiesAccountServicer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for an account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCollateralValueSearchCriteria2
 * ConstraintCashAccountIdentificationGuideline.
 * forCollateralValueSearchCriteria2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
 * CollateralValueSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueSearchCriteria2", propOrder = {"accountIdentification", "currency", "accountOwner", "accountServicer", "financialInstrumentIdentification", "securitiesAccountOwner", "securitiesAccountServicer"})
public class CollateralValueSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountIdentification
	 * CollateralValueSearchCriteria1.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueSearchCriteria2, Optional<AccountIdentification4Choice>> mmAccountIdentification = new MMMessageAssociationEnd<CollateralValueSearchCriteria2, Optional<AccountIdentification4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, Optional<AccountIdentification4Choice> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected List<ActiveOrHistoricCurrencyCode> currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmCurrency
	 * CollateralValueSearchCriteria1.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueSearchCriteria2, List<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<CollateralValueSearchCriteria2, List<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, List<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification71Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountOwner
	 * CollateralValueSearchCriteria1.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>> mmAccountOwner = new MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account being queried.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification71Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, which is being queried."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountServicer
	 * CollateralValueSearchCriteria1.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>> mmAccountServicer = new MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, which is being queried.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification19> financialInstrumentIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN identification of the related financial instrument into which this security can be converted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmFinancialInstrumentIdentification
	 * CollateralValueSearchCriteria1.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueSearchCriteria2, List<SecurityIdentification19>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<CollateralValueSearchCriteria2, List<SecurityIdentification19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmFinancialInstrumentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public List<SecurityIdentification19> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, List<SecurityIdentification19> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "SctiesAcctOwnr")
	protected PartyIdentification71Choice securitiesAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the securities account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmSecuritiesAccountOwner
	 * CollateralValueSearchCriteria1.mmSecuritiesAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>> mmSecuritiesAccountOwner = new MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountOwner";
			definition = "Unique and unambiguous identification of the securities account owner.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmSecuritiesAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getSecuritiesAccountOwner();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setSecuritiesAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesAcctSvcr")
	protected PartyIdentification71Choice securitiesAccountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the securities account on behalf of the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmSecuritiesAccountServicer
	 * CollateralValueSearchCriteria1.mmSecuritiesAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>> mmSecuritiesAccountServicer = new MMMessageAttribute<CollateralValueSearchCriteria2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountServicer";
			definition = "Party that manages the securities account on behalf of the account owner.";
			previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmSecuritiesAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueSearchCriteria2 obj) {
			return obj.getSecuritiesAccountServicer();
		}

		@Override
		public void setValue(CollateralValueSearchCriteria2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setSecuritiesAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmAccountIdentification, com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmCurrency,
						com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmAccountOwner, com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmAccountServicer,
						com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmSecuritiesAccountOwner,
						com.tools20022.repository.msg.CollateralValueSearchCriteria2.mmSecuritiesAccountServicer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCollateralValueSearchCriteria2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueSearchCriteria2";
				definition = "Defines the criteria used to search for an account.";
				previousVersion_lazy = () -> CollateralValueSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification4Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public CollateralValueSearchCriteria2 setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? currency = new ArrayList<>() : currency;
	}

	public CollateralValueSearchCriteria2 setCurrency(List<ActiveOrHistoricCurrencyCode> currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<PartyIdentification71Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CollateralValueSearchCriteria2 setAccountOwner(PartyIdentification71Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<PartyIdentification71Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CollateralValueSearchCriteria2 setAccountServicer(PartyIdentification71Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public List<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public CollateralValueSearchCriteria2 setFinancialInstrumentIdentification(List<SecurityIdentification19> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountOwner() {
		return securitiesAccountOwner == null ? Optional.empty() : Optional.of(securitiesAccountOwner);
	}

	public CollateralValueSearchCriteria2 setSecuritiesAccountOwner(PartyIdentification71Choice securitiesAccountOwner) {
		this.securitiesAccountOwner = securitiesAccountOwner;
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountServicer() {
		return securitiesAccountServicer == null ? Optional.empty() : Optional.of(securitiesAccountServicer);
	}

	public CollateralValueSearchCriteria2 setSecuritiesAccountServicer(PartyIdentification71Choice securitiesAccountServicer) {
		this.securitiesAccountServicer = securitiesAccountServicer;
		return this;
	}
}