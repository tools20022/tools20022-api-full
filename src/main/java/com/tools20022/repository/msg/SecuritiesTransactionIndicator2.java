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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionIndicator2", propOrder = {"waiverIndicator", "shortSellingIndicator", "oTCPostTradeIndicator", "riskReducingTransaction", "securitiesFinancingTransactionIndicator"})
public class SecuritiesTransactionIndicator2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WvrInd")
	protected List<ReportingWaiverType1Code> waiverIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesTransactionIndicator2, List<ReportingWaiverType1Code>> mmWaiverIndicator = new MMMessageAttribute<SecuritiesTransactionIndicator2, List<ReportingWaiverType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "WvrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiverIndicator";
			definition = "Indicates whether the transaction was executed under a pre-trade waiver.";
			minOccurs = 0;
			simpleType_lazy = () -> ReportingWaiverType1Code.mmObject();
		}

		@Override
		public List<ReportingWaiverType1Code> getValue(SecuritiesTransactionIndicator2 obj) {
			return obj.getWaiverIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionIndicator2 obj, List<ReportingWaiverType1Code> value) {
			obj.setWaiverIndicator(value);
		}
	};
	@XmlElement(name = "ShrtSellgInd")
	protected Side5Code shortSellingIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesTransactionIndicator2, Optional<Side5Code>> mmShortSellingIndicator = new MMMessageAttribute<SecuritiesTransactionIndicator2, Optional<Side5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "ShrtSellgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSellingIndicator";
			definition = "Indicates a short sell concluded by the investment agent on its own accounts or on behalf of a client, as described in the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side5Code.mmObject();
		}

		@Override
		public Optional<Side5Code> getValue(SecuritiesTransactionIndicator2 obj) {
			return obj.getShortSellingIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionIndicator2 obj, Optional<Side5Code> value) {
			obj.setShortSellingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "OTCPstTradInd")
	protected List<ReportingWaiverType3Code> oTCPostTradeIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesTransactionIndicator2, List<ReportingWaiverType3Code>> mmOTCPostTradeIndicator = new MMMessageAttribute<SecuritiesTransactionIndicator2, List<ReportingWaiverType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "OTCPstTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCPostTradeIndicator";
			definition = "Indicates the type of transaction in accordance with the local regulation.";
			minOccurs = 0;
			simpleType_lazy = () -> ReportingWaiverType3Code.mmObject();
		}

		@Override
		public List<ReportingWaiverType3Code> getValue(SecuritiesTransactionIndicator2 obj) {
			return obj.getOTCPostTradeIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionIndicator2 obj, List<ReportingWaiverType3Code> value) {
			obj.setOTCPostTradeIndicator(value);
		}
	};
	@XmlElement(name = "RskRdcgTx")
	protected TrueFalseIndicator riskReducingTransaction;
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
	public static final MMMessageAttribute<SecuritiesTransactionIndicator2, Optional<TrueFalseIndicator>> mmRiskReducingTransaction = new MMMessageAttribute<SecuritiesTransactionIndicator2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "RskRdcgTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskReducingTransaction";
			definition = "Indicates whether the transaction is objectively measurable as reducing risks directly relating to the commercial activity of the entity executing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(SecuritiesTransactionIndicator2 obj) {
			return obj.getRiskReducingTransaction();
		}

		@Override
		public void setValue(SecuritiesTransactionIndicator2 obj, Optional<TrueFalseIndicator> value) {
			obj.setRiskReducingTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesFincgTxInd", required = true)
	protected TrueFalseIndicator securitiesFinancingTransactionIndicator;
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
	public static final MMMessageAttribute<SecuritiesTransactionIndicator2, TrueFalseIndicator> mmSecuritiesFinancingTransactionIndicator = new MMMessageAttribute<SecuritiesTransactionIndicator2, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionIndicator";
			definition = "Indicates whether the transaction falls within the scope of activity to be reported under the Securities Financing Transactions Regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SecuritiesTransactionIndicator2 obj) {
			return obj.getSecuritiesFinancingTransactionIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionIndicator2 obj, TrueFalseIndicator value) {
			obj.setSecuritiesFinancingTransactionIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmWaiverIndicator, com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmShortSellingIndicator,
						com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmOTCPostTradeIndicator, com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmRiskReducingTransaction,
						com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmSecuritiesFinancingTransactionIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionIndicator2";
				definition = "Provides additional indicators on the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReportingWaiverType1Code> getWaiverIndicator() {
		return waiverIndicator == null ? waiverIndicator = new ArrayList<>() : waiverIndicator;
	}

	public SecuritiesTransactionIndicator2 setWaiverIndicator(List<ReportingWaiverType1Code> waiverIndicator) {
		this.waiverIndicator = Objects.requireNonNull(waiverIndicator);
		return this;
	}

	public Optional<Side5Code> getShortSellingIndicator() {
		return shortSellingIndicator == null ? Optional.empty() : Optional.of(shortSellingIndicator);
	}

	public SecuritiesTransactionIndicator2 setShortSellingIndicator(Side5Code shortSellingIndicator) {
		this.shortSellingIndicator = shortSellingIndicator;
		return this;
	}

	public List<ReportingWaiverType3Code> getOTCPostTradeIndicator() {
		return oTCPostTradeIndicator == null ? oTCPostTradeIndicator = new ArrayList<>() : oTCPostTradeIndicator;
	}

	public SecuritiesTransactionIndicator2 setOTCPostTradeIndicator(List<ReportingWaiverType3Code> oTCPostTradeIndicator) {
		this.oTCPostTradeIndicator = Objects.requireNonNull(oTCPostTradeIndicator);
		return this;
	}

	public Optional<TrueFalseIndicator> getRiskReducingTransaction() {
		return riskReducingTransaction == null ? Optional.empty() : Optional.of(riskReducingTransaction);
	}

	public SecuritiesTransactionIndicator2 setRiskReducingTransaction(TrueFalseIndicator riskReducingTransaction) {
		this.riskReducingTransaction = riskReducingTransaction;
		return this;
	}

	public TrueFalseIndicator getSecuritiesFinancingTransactionIndicator() {
		return securitiesFinancingTransactionIndicator;
	}

	public SecuritiesTransactionIndicator2 setSecuritiesFinancingTransactionIndicator(TrueFalseIndicator securitiesFinancingTransactionIndicator) {
		this.securitiesFinancingTransactionIndicator = Objects.requireNonNull(securitiesFinancingTransactionIndicator);
		return this;
	}
}