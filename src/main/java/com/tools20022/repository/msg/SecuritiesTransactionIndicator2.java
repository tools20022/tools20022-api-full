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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportingWaiverType1Code;
import com.tools20022.repository.codeset.ReportingWaiverType3Code;
import com.tools20022.repository.codeset.Side5Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional indicators on the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2#mmWaiverIndicator
 * SecuritiesTransactionIndicator2.mmWaiverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2#mmShortSellingIndicator
 * SecuritiesTransactionIndicator2.mmShortSellingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2#mmOTCPostTradeIndicator
 * SecuritiesTransactionIndicator2.mmOTCPostTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2#mmRiskReducingTransaction
 * SecuritiesTransactionIndicator2.mmRiskReducingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2#mmSecuritiesFinancingTransactionIndicator
 * SecuritiesTransactionIndicator2.mmSecuritiesFinancingTransactionIndicator}</li>
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
 * "SecuritiesTransactionIndicator2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides additional indicators on the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTransactionIndicator2", propOrder = {"waiverIndicator", "shortSellingIndicator", "OTCPostTradeIndicator", "riskReducingTransaction", "securitiesFinancingTransactionIndicator"})
public class SecuritiesTransactionIndicator2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ReportingWaiverType1Code> waiverIndicator;
	/**
	 * Indicates whether the transaction was executed under a pre-trade waiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WvrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction was executed under a pre-trade waiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWaiverIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "WvrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiverIndicator";
			definition = "Indicates whether the transaction was executed under a pre-trade waiver.";
			minOccurs = 0;
			simpleType_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	protected Side5Code shortSellingIndicator;
	/**
	 * Indicates a short sell concluded by the investment agent on its own
	 * accounts or on behalf of a client, as described in the local regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side5Code
	 * Side5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtSellgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSellingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a short sell concluded by the investment agent on its own accounts or on behalf of a client, as described in the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortSellingIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "ShrtSellgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSellingIndicator";
			definition = "Indicates a short sell concluded by the investment agent on its own accounts or on behalf of a client, as described in the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side5Code.mmObject();
		}
	};
	protected List<ReportingWaiverType3Code> oTCPostTradeIndicator;
	/**
	 * Indicates the type of transaction in accordance with the local
	 * regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OTCPstTradInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCPostTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction in accordance with the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOTCPostTradeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "OTCPstTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCPostTradeIndicator";
			definition = "Indicates the type of transaction in accordance with the local regulation.";
			minOccurs = 0;
			simpleType_lazy = () -> ReportingWaiverType3Code.mmObject();
		}
	};
	protected TrueFalseIndicator riskReducingTransaction;
	/**
	 * Indicates whether the transaction is objectively measurable as reducing
	 * risks directly relating to the commercial activity of the entity
	 * executing the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskRdcgTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskReducingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is objectively measurable as reducing risks directly relating to the commercial activity of the entity executing the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRiskReducingTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "RskRdcgTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskReducingTransaction";
			definition = "Indicates whether the transaction is objectively measurable as reducing risks directly relating to the commercial activity of the entity executing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator securitiesFinancingTransactionIndicator;
	/**
	 * Indicates whether the transaction falls within the scope of activity to
	 * be reported under the Securities Financing Transactions Regulation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction falls within the scope of activity to be reported under the Securities Financing Transactions Regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTransactionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionIndicator";
			definition = "Indicates whether the transaction falls within the scope of activity to be reported under the Securities Financing Transactions Regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTransactionIndicator2.mmWaiverIndicator, SecuritiesTransactionIndicator2.mmShortSellingIndicator, SecuritiesTransactionIndicator2.mmOTCPostTradeIndicator,
						SecuritiesTransactionIndicator2.mmRiskReducingTransaction, SecuritiesTransactionIndicator2.mmSecuritiesFinancingTransactionIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionIndicator2";
				definition = "Provides additional indicators on the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "WvrInd")
	public List<ReportingWaiverType1Code> getWaiverIndicator() {
		return waiverIndicator;
	}

	public void setWaiverIndicator(List<ReportingWaiverType1Code> waiverIndicator) {
		this.waiverIndicator = waiverIndicator;
	}

	@XmlElement(name = "ShrtSellgInd")
	public Side5Code getShortSellingIndicator() {
		return shortSellingIndicator;
	}

	public void setShortSellingIndicator(Side5Code shortSellingIndicator) {
		this.shortSellingIndicator = shortSellingIndicator;
	}

	@XmlElement(name = "OTCPstTradInd")
	public List<ReportingWaiverType3Code> getOTCPostTradeIndicator() {
		return oTCPostTradeIndicator;
	}

	public void setOTCPostTradeIndicator(List<ReportingWaiverType3Code> oTCPostTradeIndicator) {
		this.oTCPostTradeIndicator = oTCPostTradeIndicator;
	}

	@XmlElement(name = "RskRdcgTx")
	public TrueFalseIndicator getRiskReducingTransaction() {
		return riskReducingTransaction;
	}

	public void setRiskReducingTransaction(TrueFalseIndicator riskReducingTransaction) {
		this.riskReducingTransaction = riskReducingTransaction;
	}

	@XmlElement(name = "SctiesFincgTxInd", required = true)
	public TrueFalseIndicator getSecuritiesFinancingTransactionIndicator() {
		return securitiesFinancingTransactionIndicator;
	}

	public void setSecuritiesFinancingTransactionIndicator(TrueFalseIndicator securitiesFinancingTransactionIndicator) {
		this.securitiesFinancingTransactionIndicator = securitiesFinancingTransactionIndicator;
	}
}