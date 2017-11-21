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
import com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unambiguous identification for the account between the account owner and the
 * account servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmAccount
 * SecuritiesAccount21.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmSubAccount
 * SecuritiesAccount21.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmBaseCurrency
 * SecuritiesAccount21.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmReportingCurrency
 * SecuritiesAccount21.mmReportingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmForeignExchangeRate
 * SecuritiesAccount21.mmForeignExchangeRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmAccountDetails
 * TotalPortfolioValuationReportV01.mmAccountDetails}</li>
 * </ul>
 * </li>
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
 * "SecuritiesAccount21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unambiguous identification for the account between the account owner and the account servicer."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesAccount21", propOrder = {"account", "subAccount", "baseCurrency", "reportingCurrency", "foreignExchangeRate"})
public class SecuritiesAccount21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentification5 account;
	/**
	 * Account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountIdentification5
	 * AccountIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
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
	 * definition} = "Account identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> SecuritiesAccount21.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountIdentification5.mmObject();
		}
	};
	protected AccountIdentification5 subAccount;
	/**
	 * Sub-account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountIdentification5
	 * AccountIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-account identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> SecuritiesAccount21.mmObject();
			isDerived = false;
			xmlTag = "SubAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccount";
			definition = "Sub-account identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountIdentification5.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode baseCurrency;
	/**
	 * Base currency for the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Base currency for the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBaseCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> SecuritiesAccount21.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency for the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode reportingCurrency;
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
	 * Account.mmReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmReportingCurrency;
			componentContext_lazy = () -> SecuritiesAccount21.mmObject();
			isDerived = false;
			xmlTag = "RptgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected BaseOneRate foreignExchangeRate;
	/**
	 * Foreign exchange rate applied between the reporting and base currencies.
	 * It is assumed the valuation date is the same as the report date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange rate applied between the reporting and base currencies. It is assumed the valuation date is the same as the report date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> SecuritiesAccount21.mmObject();
			isDerived = false;
			xmlTag = "FXRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeRate";
			definition = "Foreign exchange rate applied between the reporting and base currencies. It is assumed the valuation date is the same as the report date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesAccount21.mmAccount, SecuritiesAccount21.mmSubAccount, SecuritiesAccount21.mmBaseCurrency, SecuritiesAccount21.mmReportingCurrency,
						SecuritiesAccount21.mmForeignExchangeRate);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmAccountDetails);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount21";
				definition = "Unambiguous identification for the account between the account owner and the account servicer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Acct", required = true)
	public AccountIdentification5 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.AccountIdentification5 account) {
		this.account = account;
	}

	@XmlElement(name = "SubAcct")
	public AccountIdentification5 getSubAccount() {
		return subAccount;
	}

	public void setSubAccount(com.tools20022.repository.msg.AccountIdentification5 subAccount) {
		this.subAccount = subAccount;
	}

	@XmlElement(name = "BaseCcy")
	public ActiveOrHistoricCurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(ActiveOrHistoricCurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	@XmlElement(name = "RptgCcy")
	public ActiveOrHistoricCurrencyCode getReportingCurrency() {
		return reportingCurrency;
	}

	public void setReportingCurrency(ActiveOrHistoricCurrencyCode reportingCurrency) {
		this.reportingCurrency = reportingCurrency;
	}

	@XmlElement(name = "FXRate")
	public BaseOneRate getForeignExchangeRate() {
		return foreignExchangeRate;
	}

	public void setForeignExchangeRate(BaseOneRate foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
	}
}