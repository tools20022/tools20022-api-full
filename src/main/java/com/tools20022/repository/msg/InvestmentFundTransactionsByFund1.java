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
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions;
import com.tools20022.repository.choice.SecurityIdentification1Choice;
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentFundTransaction2;
import com.tools20022.repository.msg.PaginationBalance1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Investment fund transactions for a specific financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmIdentification
 * InvestmentFundTransactionsByFund1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmName
 * InvestmentFundTransactionsByFund1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmSupplementaryIdentification
 * InvestmentFundTransactionsByFund1.mmSupplementaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmForm
 * InvestmentFundTransactionsByFund1.mmForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmClassType
 * InvestmentFundTransactionsByFund1.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmDistributionPolicy
 * InvestmentFundTransactionsByFund1.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmTransactionDetails
 * InvestmentFundTransactionsByFund1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmBalanceByPage
 * InvestmentFundTransactionsByFund1.mmBalanceByPage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#mmTransactionOnAccount
 * StatementOfInvestmentFundTransactions.mmTransactionOnAccount}</li>
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
 * "InvestmentFundTransactionsByFund1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Investment fund transactions for a specific financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundTransactionsByFund1", propOrder = {"identification", "name", "supplementaryIdentification", "form", "classType", "distributionPolicy", "transactionDetails", "balanceByPage"})
public class InvestmentFundTransactionsByFund1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification1Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice
	 * SecurityIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
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
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, SecurityIdentification1Choice> mmIdentification = new MMMessageAttribute<InvestmentFundTransactionsByFund1, SecurityIdentification1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification1Choice.mmObject();
		}

		@Override
		public SecurityIdentification1Choice getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, SecurityIdentification1Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
	 * SecuritiesIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
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
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max350Text>> mmName = new MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<Max350Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryId")
	protected Max35Text supplementaryIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a financial instrument to help identify the instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max35Text>> mmSupplementaryIdentification = new MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryIdentification";
			definition = "Additional information about a financial instrument to help identify the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getSupplementaryIdentification();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<Max35Text> value) {
			obj.setSupplementaryIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Form")
	protected FormOfSecurity1Code form;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Form"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FORM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Form"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<FormOfSecurity1Code>> mmForm = new MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<FormOfSecurity1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "Form";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Form";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}

		@Override
		public Optional<FormOfSecurity1Code> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getForm();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<FormOfSecurity1Code> value) {
			obj.setForm(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssTp")
	protected Max35Text classType;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
	 * InvestmentFundClass.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max35Text>> mmClassType = new MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "ClssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getClassType();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<Max35Text> value) {
			obj.setClassType(value.orElse(null));
		}
	};
	@XmlElement(name = "DstrbtnPlcy")
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
	 * InvestmentFundClass.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<DistributionPolicy1Code>> mmDistributionPolicy = new MMMessageAttribute<InvestmentFundTransactionsByFund1, Optional<DistributionPolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}

		@Override
		public Optional<DistributionPolicy1Code> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getDistributionPolicy();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<DistributionPolicy1Code> value) {
			obj.setDistributionPolicy(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected List<InvestmentFundTransaction2> transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2
	 * InvestmentFundTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process of buying, selling, switching or transferring fund units."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundTransactionsByFund1, List<InvestmentFundTransaction2>> mmTransactionDetails = new MMMessageAssociationEnd<InvestmentFundTransactionsByFund1, List<InvestmentFundTransaction2>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Process of buying, selling, switching or transferring fund units.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentFundTransaction2.mmObject();
		}

		@Override
		public List<InvestmentFundTransaction2> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, List<InvestmentFundTransaction2> value) {
			obj.setTransactionDetails(value);
		}
	};
	@XmlElement(name = "BalByPg")
	protected PaginationBalance1 balanceByPage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
	 * InvestmentFundTransactionsByFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalByPg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceByPage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the financial instrument for this specific statement page."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundTransactionsByFund1, Optional<PaginationBalance1>> mmBalanceByPage = new MMMessageAssociationEnd<InvestmentFundTransactionsByFund1, Optional<PaginationBalance1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmObject();
			isDerived = false;
			xmlTag = "BalByPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceByPage";
			definition = "Balance of the financial instrument for this specific statement page.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaginationBalance1.mmObject();
		}

		@Override
		public Optional<PaginationBalance1> getValue(InvestmentFundTransactionsByFund1 obj) {
			return obj.getBalanceByPage();
		}

		@Override
		public void setValue(InvestmentFundTransactionsByFund1 obj, Optional<PaginationBalance1> value) {
			obj.setBalanceByPage(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmIdentification, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmName,
						com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmSupplementaryIdentification, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmForm,
						com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmClassType, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmDistributionPolicy,
						com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmTransactionDetails, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmBalanceByPage);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions.mmTransactionOnAccount);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionsByFund1";
				definition = "Investment fund transactions for a specific financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification1Choice getIdentification() {
		return identification;
	}

	public InvestmentFundTransactionsByFund1 setIdentification(SecurityIdentification1Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public InvestmentFundTransactionsByFund1 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getSupplementaryIdentification() {
		return supplementaryIdentification == null ? Optional.empty() : Optional.of(supplementaryIdentification);
	}

	public InvestmentFundTransactionsByFund1 setSupplementaryIdentification(Max35Text supplementaryIdentification) {
		this.supplementaryIdentification = supplementaryIdentification;
		return this;
	}

	public Optional<FormOfSecurity1Code> getForm() {
		return form == null ? Optional.empty() : Optional.of(form);
	}

	public InvestmentFundTransactionsByFund1 setForm(FormOfSecurity1Code form) {
		this.form = form;
		return this;
	}

	public Optional<Max35Text> getClassType() {
		return classType == null ? Optional.empty() : Optional.of(classType);
	}

	public InvestmentFundTransactionsByFund1 setClassType(Max35Text classType) {
		this.classType = classType;
		return this;
	}

	public Optional<DistributionPolicy1Code> getDistributionPolicy() {
		return distributionPolicy == null ? Optional.empty() : Optional.of(distributionPolicy);
	}

	public InvestmentFundTransactionsByFund1 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
		return this;
	}

	public List<InvestmentFundTransaction2> getTransactionDetails() {
		return transactionDetails == null ? transactionDetails = new ArrayList<>() : transactionDetails;
	}

	public InvestmentFundTransactionsByFund1 setTransactionDetails(List<InvestmentFundTransaction2> transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<PaginationBalance1> getBalanceByPage() {
		return balanceByPage == null ? Optional.empty() : Optional.of(balanceByPage);
	}

	public InvestmentFundTransactionsByFund1 setBalanceByPage(PaginationBalance1 balanceByPage) {
		this.balanceByPage = balanceByPage;
		return this;
	}
}