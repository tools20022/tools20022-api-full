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
import com.tools20022.repository.codeset.BillingStatementStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the statement reporting the bank services billing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmStatementIdentification
 * BillingStatement1.mmStatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmFromToDate
 * BillingStatement1.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCreationDateTime
 * BillingStatement1.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmStatus
 * BillingStatement1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmAccountCharacteristics
 * BillingStatement1.mmAccountCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmRateData
 * BillingStatement1.mmRateData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCurrencyExchange
 * BillingStatement1.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmBalance
 * BillingStatement1.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCompensation
 * BillingStatement1.mmCompensation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmService
 * BillingStatement1.mmService}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmTaxRegion
 * BillingStatement1.mmTaxRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmBalanceAdjustment
 * BillingStatement1.mmBalanceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmServiceAdjustment
 * BillingStatement1.mmServiceAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "BillingStatement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the statement reporting the bank services billing."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2
 * BillingStatement2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingStatement1", propOrder = {"statementIdentification", "fromToDate", "creationDateTime", "status", "accountCharacteristics", "rateData", "currencyExchange", "balance", "compensation", "service", "taxRegion",
		"balanceAdjustment", "serviceAdjustment"})
public class BillingStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtId", required = true)
	protected Max35Text statementIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the customer billing statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatementIdentification
	 * BillingStatement2.mmStatementIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingStatement1, Max35Text> mmStatementIdentification = new MMMessageAttribute<BillingStatement1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Identification of the customer billing statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmStatementIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BillingStatement1 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(BillingStatement1 obj, Max35Text value) {
			obj.setStatementIdentification(value);
		}
	};
	@XmlElement(name = "FrToDt", required = true)
	protected DatePeriod1 fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DatePeriod1
	 * DatePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date range between the start date and the end date for which the statement is issued."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmFromToDate
	 * BillingStatement2.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingStatement1, DatePeriod1> mmFromToDate = new MMMessageAttribute<BillingStatement1, DatePeriod1>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Date range between the start date and the end date for which the statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmFromToDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriod1.mmObject();
		}

		@Override
		public DatePeriod1 getValue(BillingStatement1 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(BillingStatement1 obj, DatePeriod1 value) {
			obj.setFromToDate(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the statement message was created."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCreationDateTime
	 * BillingStatement2.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingStatement1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<BillingStatement1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date the statement message was created.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(BillingStatement1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(BillingStatement1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected BillingStatementStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code
	 * BillingStatementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmStatus
	 * Document.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatus
	 * BillingStatement2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingStatement1, BillingStatementStatus1Code> mmStatus = new MMMessageAttribute<BillingStatement1, BillingStatementStatus1Code>() {
		{
			businessElementTrace_lazy = () -> Document.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingStatementStatus1Code.mmObject();
		}

		@Override
		public BillingStatementStatus1Code getValue(BillingStatement1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(BillingStatement1 obj, BillingStatementStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "AcctChrtcs", required = true)
	protected CashAccountCharacteristics1 accountCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the details of the account characteristics."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmAccountCharacteristics
	 * BillingStatement2.mmAccountCharacteristics}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, CashAccountCharacteristics1> mmAccountCharacteristics = new MMMessageAssociationEnd<BillingStatement1, CashAccountCharacteristics1>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "AcctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCharacteristics";
			definition = "Specifies the details of the account characteristics.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmAccountCharacteristics);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccountCharacteristics1.mmObject();
		}

		@Override
		public CashAccountCharacteristics1 getValue(BillingStatement1 obj) {
			return obj.getAccountCharacteristics();
		}

		@Override
		public void setValue(BillingStatement1 obj, CashAccountCharacteristics1 value) {
			obj.setAccountCharacteristics(value);
		}
	};
	@XmlElement(name = "RateData")
	protected List<BillingRate1> rateData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingRate1
	 * BillingRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmRateData
	 * BillingStatement2.mmRateData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingRate1>> mmRateData = new MMMessageAssociationEnd<BillingStatement1, List<BillingRate1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "RateData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateData";
			definition = "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmRateData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingRate1.mmObject();
		}

		@Override
		public List<BillingRate1> getValue(BillingStatement1 obj) {
			return obj.getRateData();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingRate1> value) {
			obj.setRateData(value);
		}
	};
	@XmlElement(name = "CcyXchg")
	protected List<CurrencyExchange6> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyExchange6
	 * CurrencyExchange6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies details related to currency exchange data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCurrencyExchange
	 * BillingStatement2.mmCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<CurrencyExchange6>> mmCurrencyExchange = new MMMessageAssociationEnd<BillingStatement1, List<CurrencyExchange6>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies details related to currency exchange data.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmCurrencyExchange);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyExchange6.mmObject();
		}

		@Override
		public List<CurrencyExchange6> getValue(BillingStatement1 obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<CurrencyExchange6> value) {
			obj.setCurrencyExchange(value);
		}
	};
	@XmlElement(name = "Bal")
	protected List<BillingBalance1> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingBalance1
	 * BillingBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the average value of balances held within the statement period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalance
	 * BillingStatement2.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingBalance1>> mmBalance = new MMMessageAssociationEnd<BillingStatement1, List<BillingBalance1>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Identifies the average value of balances held within the statement period.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmBalance);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingBalance1.mmObject();
		}

		@Override
		public List<BillingBalance1> getValue(BillingStatement1 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingBalance1> value) {
			obj.setBalance(value);
		}
	};
	@XmlElement(name = "Compstn")
	protected List<BillingCompensation1> compensation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingCompensation1
	 * BillingCompensation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Compstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the set of values and totals that are used to provide compensation information, service and tax totals."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCompensation
	 * BillingStatement2.mmCompensation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingCompensation1>> mmCompensation = new MMMessageAssociationEnd<BillingStatement1, List<BillingCompensation1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Compstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Identifies the set of values and totals that are used to provide compensation information, service and tax totals.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmCompensation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingCompensation1.mmObject();
		}

		@Override
		public List<BillingCompensation1> getValue(BillingStatement1 obj) {
			return obj.getCompensation();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingCompensation1> value) {
			obj.setCompensation(value);
		}
	};
	@XmlElement(name = "Svc")
	protected List<BillingService1> service;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Service"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the values used for every line item service in the statement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmService
	 * BillingStatement2.mmService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingService1>> mmService = new MMMessageAssociationEnd<BillingStatement1, List<BillingService1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Svc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Service";
			definition = "Specifies the values used for every line item service in the statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmService);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingService1.mmObject();
		}

		@Override
		public List<BillingService1> getValue(BillingStatement1 obj) {
			return obj.getService();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingService1> value) {
			obj.setService(value);
		}
	};
	@XmlElement(name = "TaxRgn")
	protected List<BillingTaxRegion1> taxRegion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRegion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax region(s) that levy a tax on the services within this statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmTaxRegion
	 * BillingStatement2.mmTaxRegion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingTaxRegion1>> mmTaxRegion = new MMMessageAssociationEnd<BillingStatement1, List<BillingTaxRegion1>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "TaxRgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRegion";
			definition = "Tax region(s) that levy a tax on the services within this statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmTaxRegion);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingTaxRegion1.mmObject();
		}

		@Override
		public List<BillingTaxRegion1> getValue(BillingStatement1 obj) {
			return obj.getTaxRegion();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingTaxRegion1> value) {
			obj.setTaxRegion(value);
		}
	};
	@XmlElement(name = "BalAdjstmnt")
	protected List<BalanceAdjustment1> balanceAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalanceAdjustment
	 * BillingStatement2.mmBalanceAdjustment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BalanceAdjustment1>> mmBalanceAdjustment = new MMMessageAssociationEnd<BillingStatement1, List<BalanceAdjustment1>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "BalAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAdjustment";
			definition = "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmBalanceAdjustment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceAdjustment1.mmObject();
		}

		@Override
		public List<BalanceAdjustment1> getValue(BillingStatement1 obj) {
			return obj.getBalanceAdjustment();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BalanceAdjustment1> value) {
			obj.setBalanceAdjustment(value);
		}
	};
	@XmlElement(name = "SvcAdjstmnt")
	protected List<BillingServiceAdjustment1> serviceAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1
	 * BillingStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmServiceAdjustment
	 * BillingStatement2.mmServiceAdjustment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingStatement1, List<BillingServiceAdjustment1>> mmServiceAdjustment = new MMMessageAssociationEnd<BillingStatement1, List<BillingServiceAdjustment1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "SvcAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAdjustment";
			definition = "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmServiceAdjustment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingServiceAdjustment1.mmObject();
		}

		@Override
		public List<BillingServiceAdjustment1> getValue(BillingStatement1 obj) {
			return obj.getServiceAdjustment();
		}

		@Override
		public void setValue(BillingStatement1 obj, List<BillingServiceAdjustment1> value) {
			obj.setServiceAdjustment(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingStatement1.mmStatementIdentification, com.tools20022.repository.msg.BillingStatement1.mmFromToDate,
						com.tools20022.repository.msg.BillingStatement1.mmCreationDateTime, com.tools20022.repository.msg.BillingStatement1.mmStatus, com.tools20022.repository.msg.BillingStatement1.mmAccountCharacteristics,
						com.tools20022.repository.msg.BillingStatement1.mmRateData, com.tools20022.repository.msg.BillingStatement1.mmCurrencyExchange, com.tools20022.repository.msg.BillingStatement1.mmBalance,
						com.tools20022.repository.msg.BillingStatement1.mmCompensation, com.tools20022.repository.msg.BillingStatement1.mmService, com.tools20022.repository.msg.BillingStatement1.mmTaxRegion,
						com.tools20022.repository.msg.BillingStatement1.mmBalanceAdjustment, com.tools20022.repository.msg.BillingStatement1.mmServiceAdjustment);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingStatement1";
				definition = "Details of the statement reporting the bank services billing.";
				nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public BillingStatement1 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public DatePeriod1 getFromToDate() {
		return fromToDate;
	}

	public BillingStatement1 setFromToDate(DatePeriod1 fromToDate) {
		this.fromToDate = Objects.requireNonNull(fromToDate);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public BillingStatement1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public BillingStatementStatus1Code getStatus() {
		return status;
	}

	public BillingStatement1 setStatus(BillingStatementStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CashAccountCharacteristics1 getAccountCharacteristics() {
		return accountCharacteristics;
	}

	public BillingStatement1 setAccountCharacteristics(CashAccountCharacteristics1 accountCharacteristics) {
		this.accountCharacteristics = Objects.requireNonNull(accountCharacteristics);
		return this;
	}

	public List<BillingRate1> getRateData() {
		return rateData == null ? rateData = new ArrayList<>() : rateData;
	}

	public BillingStatement1 setRateData(List<BillingRate1> rateData) {
		this.rateData = Objects.requireNonNull(rateData);
		return this;
	}

	public List<CurrencyExchange6> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public BillingStatement1 setCurrencyExchange(List<CurrencyExchange6> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public List<BillingBalance1> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public BillingStatement1 setBalance(List<BillingBalance1> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public List<BillingCompensation1> getCompensation() {
		return compensation == null ? compensation = new ArrayList<>() : compensation;
	}

	public BillingStatement1 setCompensation(List<BillingCompensation1> compensation) {
		this.compensation = Objects.requireNonNull(compensation);
		return this;
	}

	public List<BillingService1> getService() {
		return service == null ? service = new ArrayList<>() : service;
	}

	public BillingStatement1 setService(List<BillingService1> service) {
		this.service = Objects.requireNonNull(service);
		return this;
	}

	public List<BillingTaxRegion1> getTaxRegion() {
		return taxRegion == null ? taxRegion = new ArrayList<>() : taxRegion;
	}

	public BillingStatement1 setTaxRegion(List<BillingTaxRegion1> taxRegion) {
		this.taxRegion = Objects.requireNonNull(taxRegion);
		return this;
	}

	public List<BalanceAdjustment1> getBalanceAdjustment() {
		return balanceAdjustment == null ? balanceAdjustment = new ArrayList<>() : balanceAdjustment;
	}

	public BillingStatement1 setBalanceAdjustment(List<BalanceAdjustment1> balanceAdjustment) {
		this.balanceAdjustment = Objects.requireNonNull(balanceAdjustment);
		return this;
	}

	public List<BillingServiceAdjustment1> getServiceAdjustment() {
		return serviceAdjustment == null ? serviceAdjustment = new ArrayList<>() : serviceAdjustment;
	}

	public BillingStatement1 setServiceAdjustment(List<BillingServiceAdjustment1> serviceAdjustment) {
		this.serviceAdjustment = Objects.requireNonNull(serviceAdjustment);
		return this;
	}
}