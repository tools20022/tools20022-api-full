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
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmName
 * CashAccount35.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmType
 * CashAccount35.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmCurrency
 * CashAccount35.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount35#mmCurrentMultilateralLimit
 * CashAccount35.mmCurrentMultilateralLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmOwner
 * CashAccount35.mmOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmServicer
 * CashAccount35.mmServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount35#mmMultilateralBalance
 * CashAccount35.mmMultilateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount35#mmCurrentBilateralLimit
 * CashAccount35.mmCurrentBilateralLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmStandingOrder
 * CashAccount35.mmStandingOrder}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralBalanceRule#forCashAccount35
 * ConstraintBilateralBalanceRule.forCashAccount35}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccount35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashAccount23
 * CashAccount23}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccount35", propOrder = {"name", "type", "currency", "currentMultilateralLimit", "owner", "servicer", "multilateralBalance", "currentBilateralLimit", "standingOrder"})
public class CashAccount35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmName
	 * CashAccount23.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount35, Optional<Max70Text>> mmName = new MMMessageAttribute<CashAccount35, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			previousVersion_lazy = () -> CashAccount23.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CashAccount35 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice
	 * CashAccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
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
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmType
	 * CashAccount23.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount35, Optional<CashAccountType2Choice>> mmType = new MMMessageAttribute<CashAccount35, Optional<CashAccountType2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature, or use, of the cash account.";
			previousVersion_lazy = () -> CashAccount23.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccountType2Choice.mmObject();
		}

		@Override
		public Optional<CashAccountType2Choice> getValue(CashAccount35 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<CashAccountType2Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the currency of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmCurrency
	 * CashAccount23.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount35, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<CashAccount35, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Specifies the currency of the cash account.";
			previousVersion_lazy = () -> CashAccount23.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CashAccount35 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CurMulLmt")
	protected Limit5 currentMultilateralLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Limit5 Limit5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurMulLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentMultilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmCurrentMultilateralLimit
	 * CashAccount23.mmCurrentMultilateralLimit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, Optional<Limit5>> mmCurrentMultilateralLimit = new MMMessageAssociationEnd<CashAccount35, Optional<Limit5>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "CurMulLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentMultilateralLimit";
			definition = "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set.";
			previousVersion_lazy = () -> CashAccount23.mmCurrentMultilateralLimit;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Limit5.mmObject();
		}

		@Override
		public Optional<Limit5> getValue(CashAccount35 obj) {
			return obj.getCurrentMultilateralLimit();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<Limit5> value) {
			obj.setCurrentMultilateralLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "Ownr")
	protected PartyIdentification125 owner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ownr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Owner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmOwner
	 * CashAccount23.mmOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, Optional<PartyIdentification125>> mmOwner = new MMMessageAssociationEnd<CashAccount35, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "Ownr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Owner";
			definition = "Owner of the account which is being queried.";
			previousVersion_lazy = () -> CashAccount23.mmOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(CashAccount35 obj) {
			return obj.getOwner();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<PartyIdentification125> value) {
			obj.setOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "Svcr")
	protected BranchAndFinancialInstitutionIdentification5 servicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Servicer of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmServicer
	 * CashAccount23.mmServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, Optional<BranchAndFinancialInstitutionIdentification5>> mmServicer = new MMMessageAssociationEnd<CashAccount35, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Servicer of the account which is being queried.";
			previousVersion_lazy = () -> CashAccount23.mmServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CashAccount35 obj) {
			return obj.getServicer();
		}

		@Override
		public void setValue(CashAccount35 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "MulBal")
	protected List<CashBalance10> multilateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance10
	 * CashBalance10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance is calculated with regard to many members in the system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmMultilateralBalance
	 * CashAccount23.mmMultilateralBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, List<CashBalance10>> mmMultilateralBalance = new MMMessageAssociationEnd<CashAccount35, List<CashBalance10>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "MulBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalance";
			definition = "Balance is calculated with regard to many members in the system.";
			previousVersion_lazy = () -> CashAccount23.mmMultilateralBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalance10.mmObject();
		}

		@Override
		public List<CashBalance10> getValue(CashAccount35 obj) {
			return obj.getMultilateralBalance();
		}

		@Override
		public void setValue(CashAccount35 obj, List<CashBalance10> value) {
			obj.setMultilateralBalance(value);
		}
	};
	@XmlElement(name = "CurBilLmt")
	protected List<BilateralLimit2> currentBilateralLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BilateralLimit2
	 * BilateralLimit2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurBilLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentBilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmCurrentBilateralLimit
	 * CashAccount23.mmCurrentBilateralLimit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, List<BilateralLimit2>> mmCurrentBilateralLimit = new MMMessageAssociationEnd<CashAccount35, List<BilateralLimit2>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "CurBilLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentBilateralLimit";
			definition = "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			previousVersion_lazy = () -> CashAccount23.mmCurrentBilateralLimit;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BilateralLimit2.mmObject();
		}

		@Override
		public List<BilateralLimit2> getValue(CashAccount35 obj) {
			return obj.getCurrentBilateralLimit();
		}

		@Override
		public void setValue(CashAccount35 obj, List<BilateralLimit2> value) {
			obj.setCurrentBilateralLimit(value);
		}
	};
	@XmlElement(name = "StgOrdr")
	protected List<StandingOrder2> standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StandingOrder2
	 * StandingOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmStandingOrder
	 * CashManagementService.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount35 CashAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by a party that has explicit authority to instruct a debit on the account, that is either the debtor or originating party, to the debtor agent, to process liquidity transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmStandingOrder
	 * CashAccount23.mmStandingOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount35, List<StandingOrder2>> mmStandingOrder = new MMMessageAssociationEnd<CashAccount35, List<StandingOrder2>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmStandingOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount35.mmObject();
			isDerived = false;
			xmlTag = "StgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by a party that has explicit authority to instruct a debit on the account, that is either the debtor or originating party, to the debtor agent, to process liquidity transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.";
			previousVersion_lazy = () -> CashAccount23.mmStandingOrder;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StandingOrder2.mmObject();
		}

		@Override
		public List<StandingOrder2> getValue(CashAccount35 obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(CashAccount35 obj, List<StandingOrder2> value) {
			obj.setStandingOrder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount35.mmName, com.tools20022.repository.msg.CashAccount35.mmType, com.tools20022.repository.msg.CashAccount35.mmCurrency,
						com.tools20022.repository.msg.CashAccount35.mmCurrentMultilateralLimit, com.tools20022.repository.msg.CashAccount35.mmOwner, com.tools20022.repository.msg.CashAccount35.mmServicer,
						com.tools20022.repository.msg.CashAccount35.mmMultilateralBalance, com.tools20022.repository.msg.CashAccount35.mmCurrentBilateralLimit, com.tools20022.repository.msg.CashAccount35.mmStandingOrder);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralBalanceRule.forCashAccount35);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccount35";
				definition = "Account to or from which a cash entry is made.";
				previousVersion_lazy = () -> CashAccount23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CashAccount35 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<CashAccountType2Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CashAccount35 setType(CashAccountType2Choice type) {
		this.type = type;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CashAccount35 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<Limit5> getCurrentMultilateralLimit() {
		return currentMultilateralLimit == null ? Optional.empty() : Optional.of(currentMultilateralLimit);
	}

	public CashAccount35 setCurrentMultilateralLimit(Limit5 currentMultilateralLimit) {
		this.currentMultilateralLimit = currentMultilateralLimit;
		return this;
	}

	public Optional<PartyIdentification125> getOwner() {
		return owner == null ? Optional.empty() : Optional.of(owner);
	}

	public CashAccount35 setOwner(PartyIdentification125 owner) {
		this.owner = owner;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getServicer() {
		return servicer == null ? Optional.empty() : Optional.of(servicer);
	}

	public CashAccount35 setServicer(BranchAndFinancialInstitutionIdentification5 servicer) {
		this.servicer = servicer;
		return this;
	}

	public List<CashBalance10> getMultilateralBalance() {
		return multilateralBalance == null ? multilateralBalance = new ArrayList<>() : multilateralBalance;
	}

	public CashAccount35 setMultilateralBalance(List<CashBalance10> multilateralBalance) {
		this.multilateralBalance = Objects.requireNonNull(multilateralBalance);
		return this;
	}

	public List<BilateralLimit2> getCurrentBilateralLimit() {
		return currentBilateralLimit == null ? currentBilateralLimit = new ArrayList<>() : currentBilateralLimit;
	}

	public CashAccount35 setCurrentBilateralLimit(List<BilateralLimit2> currentBilateralLimit) {
		this.currentBilateralLimit = Objects.requireNonNull(currentBilateralLimit);
		return this;
	}

	public List<StandingOrder2> getStandingOrder() {
		return standingOrder == null ? standingOrder = new ArrayList<>() : standingOrder;
	}

	public CashAccount35 setStandingOrder(List<StandingOrder2> standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}
}