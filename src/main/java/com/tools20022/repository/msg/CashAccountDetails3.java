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
import com.tools20022.repository.codeset.CashAccountType2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BilateralLimitDetails2;
import com.tools20022.repository.msg.CashBalanceDetails4;
import com.tools20022.repository.msg.LimitDetails;
import com.tools20022.repository.msg.StandingOrderDetails3;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmName
 * CashAccountDetails3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmType
 * CashAccountDetails3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmCurrency
 * CashAccountDetails3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmCurrentMultilateralLimit
 * CashAccountDetails3.mmCurrentMultilateralLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmAccountOwner
 * CashAccountDetails3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmAccountServicer
 * CashAccountDetails3.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmMultilateralBalance
 * CashAccountDetails3.mmMultilateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmCurrentBilateralLimit
 * CashAccountDetails3.mmCurrentBilateralLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmStandingOrder
 * CashAccountDetails3.mmStandingOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralBalanceRule#forCashAccountDetails3
 * ConstraintBilateralBalanceRule.forCashAccountDetails3}</li>
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
@XmlType(name = "CashAccountDetails3", propOrder = {"name", "type", "currency", "currentMultilateralLimit", "accountOwner", "accountServicer", "multilateralBalance", "currentBilateralLimit", "standingOrder"})
public class CashAccountDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountDetails3, Optional<Max35Text>> mmName = new MMMessageAttribute<CashAccountDetails3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CashAccountDetails3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::CASH, ISO15022Synonym:
	 * :97A::COMM, ISO15022Synonym: :97A::TAXE, ISO15022Synonym: :97A::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountDetails3, Optional<CashAccountType2Code>> mmType = new MMMessageAttribute<CashAccountDetails3, Optional<CashAccountType2Code>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::CASH"), new ISO15022Synonym(this, ":97A::COMM"), new ISO15022Synonym(this, ":97A::TAXE"), new ISO15022Synonym(this, ":97A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature, or use, of the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashAccountType2Code.mmObject();
		}

		@Override
		public Optional<CashAccountType2Code> getValue(CashAccountDetails3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<CashAccountType2Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::ACCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountDetails3, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<CashAccountDetails3, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::ACCT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(CashAccountDetails3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CurMulLmt")
	protected LimitDetails currentMultilateralLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails
	 * LimitDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurMulLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentMultilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountDetails3, Optional<LimitDetails>> mmCurrentMultilateralLimit = new MMMessageAssociationEnd<CashAccountDetails3, Optional<LimitDetails>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "CurMulLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentMultilateralLimit";
			definition = "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitDetails.mmObject();
		}

		@Override
		public Optional<LimitDetails> getValue(CashAccountDetails3 obj) {
			return obj.getCurrentMultilateralLimit();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<LimitDetails> value) {
			obj.setCurrentMultilateralLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected AnyBICIdentifier accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountDetails3, Optional<AnyBICIdentifier>> mmAccountOwner = new MMMessageAttribute<CashAccountDetails3, Optional<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(CashAccountDetails3 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<AnyBICIdentifier> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BICIdentifier accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Servicer of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountDetails3, Optional<BICIdentifier>> mmAccountServicer = new MMMessageAttribute<CashAccountDetails3, Optional<BICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Servicer of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public Optional<BICIdentifier> getValue(CashAccountDetails3 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, Optional<BICIdentifier> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "MulBal")
	protected List<CashBalanceDetails4> multilateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalanceDetails4
	 * CashBalanceDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance is calculated with regard to many members in the system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountDetails3, List<CashBalanceDetails4>> mmMultilateralBalance = new MMMessageAssociationEnd<CashAccountDetails3, List<CashBalanceDetails4>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "MulBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalance";
			definition = "Balance is calculated with regard to many members in the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceDetails4.mmObject();
		}

		@Override
		public List<CashBalanceDetails4> getValue(CashAccountDetails3 obj) {
			return obj.getMultilateralBalance();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, List<CashBalanceDetails4> value) {
			obj.setMultilateralBalance(value);
		}
	};
	@XmlElement(name = "CurBilLmt")
	protected List<BilateralLimitDetails2> currentBilateralLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2
	 * BilateralLimitDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurBilLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentBilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountDetails3, List<BilateralLimitDetails2>> mmCurrentBilateralLimit = new MMMessageAssociationEnd<CashAccountDetails3, List<BilateralLimitDetails2>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "CurBilLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentBilateralLimit";
			definition = "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BilateralLimitDetails2.mmObject();
		}

		@Override
		public List<BilateralLimitDetails2> getValue(CashAccountDetails3 obj) {
			return obj.getCurrentBilateralLimit();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, List<BilateralLimitDetails2> value) {
			obj.setCurrentBilateralLimit(value);
		}
	};
	@XmlElement(name = "StgOrdr")
	protected List<StandingOrderDetails3> standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StandingOrderDetails3
	 * StandingOrderDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashStandingOrder
	 * CashAccount.mmCashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3
	 * CashAccountDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountDetails3, List<StandingOrderDetails3>> mmStandingOrder = new MMMessageAssociationEnd<CashAccountDetails3, List<StandingOrderDetails3>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashStandingOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountDetails3.mmObject();
			isDerived = false;
			xmlTag = "StgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StandingOrderDetails3.mmObject();
		}

		@Override
		public List<StandingOrderDetails3> getValue(CashAccountDetails3 obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(CashAccountDetails3 obj, List<StandingOrderDetails3> value) {
			obj.setStandingOrder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountDetails3.mmName, com.tools20022.repository.msg.CashAccountDetails3.mmType, com.tools20022.repository.msg.CashAccountDetails3.mmCurrency,
						com.tools20022.repository.msg.CashAccountDetails3.mmCurrentMultilateralLimit, com.tools20022.repository.msg.CashAccountDetails3.mmAccountOwner, com.tools20022.repository.msg.CashAccountDetails3.mmAccountServicer,
						com.tools20022.repository.msg.CashAccountDetails3.mmMultilateralBalance, com.tools20022.repository.msg.CashAccountDetails3.mmCurrentBilateralLimit, com.tools20022.repository.msg.CashAccountDetails3.mmStandingOrder);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralBalanceRule.forCashAccountDetails3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashAccountDetails3";
				definition = "Account to or from which a cash entry is made.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CashAccountDetails3 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<CashAccountType2Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CashAccountDetails3 setType(CashAccountType2Code type) {
		this.type = type;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CashAccountDetails3 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<LimitDetails> getCurrentMultilateralLimit() {
		return currentMultilateralLimit == null ? Optional.empty() : Optional.of(currentMultilateralLimit);
	}

	public CashAccountDetails3 setCurrentMultilateralLimit(LimitDetails currentMultilateralLimit) {
		this.currentMultilateralLimit = currentMultilateralLimit;
		return this;
	}

	public Optional<AnyBICIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CashAccountDetails3 setAccountOwner(AnyBICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BICIdentifier> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccountDetails3 setAccountServicer(BICIdentifier accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public List<CashBalanceDetails4> getMultilateralBalance() {
		return multilateralBalance == null ? multilateralBalance = new ArrayList<>() : multilateralBalance;
	}

	public CashAccountDetails3 setMultilateralBalance(List<CashBalanceDetails4> multilateralBalance) {
		this.multilateralBalance = Objects.requireNonNull(multilateralBalance);
		return this;
	}

	public List<BilateralLimitDetails2> getCurrentBilateralLimit() {
		return currentBilateralLimit == null ? currentBilateralLimit = new ArrayList<>() : currentBilateralLimit;
	}

	public CashAccountDetails3 setCurrentBilateralLimit(List<BilateralLimitDetails2> currentBilateralLimit) {
		this.currentBilateralLimit = Objects.requireNonNull(currentBilateralLimit);
		return this;
	}

	public List<StandingOrderDetails3> getStandingOrder() {
		return standingOrder == null ? standingOrder = new ArrayList<>() : standingOrder;
	}

	public CashAccountDetails3 setStandingOrder(List<StandingOrderDetails3> standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}
}