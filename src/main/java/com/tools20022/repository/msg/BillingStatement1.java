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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class BillingStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text statementIdentification;
	/**
	 * Identification of the customer billing statement.
	 * <p>
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
	public static final MMMessageAttribute mmStatementIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> BillingStatement1.mmObject();
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
	};
	protected DatePeriod1 fromToDate;
	/**
	 * Date range between the start date and the end date for which the
	 * statement is issued.
	 * <p>
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
	public static final MMMessageAttribute mmFromToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Date range between the start date and the end date for which the statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmFromToDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriod1.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date the statement message was created.
	 * <p>
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
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> BillingStatement1.mmObject();
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
	};
	protected BillingStatementStatus1Code status;
	/**
	 * Defines the status of the statement.
	 * <p>
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
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmStatus;
			componentContext_lazy = () -> BillingStatement1.mmObject();
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
	};
	protected CashAccountCharacteristics1 accountCharacteristics;
	/**
	 * Specifies the details of the account characteristics.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAccountCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "AcctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCharacteristics";
			definition = "Specifies the details of the account characteristics.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmAccountCharacteristics);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingRate1> rateData;
	/**
	 * Identifies the non tax per annum rate and factor values used within the
	 * statement along with any time dependent charge basis.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRateData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "RateData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateData";
			definition = "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmRateData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingRate1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CurrencyExchange6> currencyExchange;
	/**
	 * Specifies details related to currency exchange data.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies details related to currency exchange data.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmCurrencyExchange);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyExchange6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingBalance1> balance;
	/**
	 * Identifies the average value of balances held within the statement
	 * period.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Identifies the average value of balances held within the statement period.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmBalance);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingBalance1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingCompensation1> compensation;
	/**
	 * Identifies the set of values and totals that are used to provide
	 * compensation information, service and tax totals.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCompensation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Compstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Identifies the set of values and totals that are used to provide compensation information, service and tax totals.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmCompensation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingCompensation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingService1> service;
	/**
	 * Specifies the values used for every line item service in the statement.
	 * <p>
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
	public static final MMMessageAssociationEnd mmService = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "Svc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Service";
			definition = "Specifies the values used for every line item service in the statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmService);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingTaxRegion1> taxRegion;
	/**
	 * Tax region(s) that levy a tax on the services within this statement.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTaxRegion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "TaxRgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRegion";
			definition = "Tax region(s) that levy a tax on the services within this statement.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmTaxRegion);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingTaxRegion1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BalanceAdjustment1> balanceAdjustment;
	/**
	 * One or more sections that identify balance or float adjustments to the
	 * account. They can reflect either adjustments to the current statement or
	 * adjustments to statements from prior reporting periods.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBalanceAdjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "BalAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAdjustment";
			definition = "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmBalanceAdjustment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingServiceAdjustment1> serviceAdjustment;
	/**
	 * One or more sections that identify line item service adjustments to the
	 * account. They reflect adjustments to statements from prior reporting
	 * periods.
	 * <p>
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
	public static final MMMessageAssociationEnd mmServiceAdjustment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> BillingStatement1.mmObject();
			isDerived = false;
			xmlTag = "SvcAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAdjustment";
			definition = "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods.";
			nextVersions_lazy = () -> Arrays.asList(BillingStatement2.mmServiceAdjustment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BillingStatement1.mmStatementIdentification, BillingStatement1.mmFromToDate, BillingStatement1.mmCreationDateTime, BillingStatement1.mmStatus,
						BillingStatement1.mmAccountCharacteristics, BillingStatement1.mmRateData, BillingStatement1.mmCurrencyExchange, BillingStatement1.mmBalance, BillingStatement1.mmCompensation, BillingStatement1.mmService,
						BillingStatement1.mmTaxRegion, BillingStatement1.mmBalanceAdjustment, BillingStatement1.mmServiceAdjustment);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = statementIdentification;
	}

	public DatePeriod1 getFromToDate() {
		return fromToDate;
	}

	public void setFromToDate(com.tools20022.repository.msg.DatePeriod1 fromToDate) {
		this.fromToDate = fromToDate;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public BillingStatementStatus1Code getStatus() {
		return status;
	}

	public void setStatus(BillingStatementStatus1Code status) {
		this.status = status;
	}

	public CashAccountCharacteristics1 getAccountCharacteristics() {
		return accountCharacteristics;
	}

	public void setAccountCharacteristics(com.tools20022.repository.msg.CashAccountCharacteristics1 accountCharacteristics) {
		this.accountCharacteristics = accountCharacteristics;
	}

	public List<BillingRate1> getRateData() {
		return rateData;
	}

	public void setRateData(List<com.tools20022.repository.msg.BillingRate1> rateData) {
		this.rateData = rateData;
	}

	public List<CurrencyExchange6> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.msg.CurrencyExchange6> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public List<BillingBalance1> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.msg.BillingBalance1> balance) {
		this.balance = balance;
	}

	public List<BillingCompensation1> getCompensation() {
		return compensation;
	}

	public void setCompensation(List<com.tools20022.repository.msg.BillingCompensation1> compensation) {
		this.compensation = compensation;
	}

	public List<BillingService1> getService() {
		return service;
	}

	public void setService(List<com.tools20022.repository.msg.BillingService1> service) {
		this.service = service;
	}

	public List<BillingTaxRegion1> getTaxRegion() {
		return taxRegion;
	}

	public void setTaxRegion(List<com.tools20022.repository.msg.BillingTaxRegion1> taxRegion) {
		this.taxRegion = taxRegion;
	}

	public List<BalanceAdjustment1> getBalanceAdjustment() {
		return balanceAdjustment;
	}

	public void setBalanceAdjustment(List<com.tools20022.repository.msg.BalanceAdjustment1> balanceAdjustment) {
		this.balanceAdjustment = balanceAdjustment;
	}

	public List<BillingServiceAdjustment1> getServiceAdjustment() {
		return serviceAdjustment;
	}

	public void setServiceAdjustment(List<com.tools20022.repository.msg.BillingServiceAdjustment1> serviceAdjustment) {
		this.serviceAdjustment = serviceAdjustment;
	}
}