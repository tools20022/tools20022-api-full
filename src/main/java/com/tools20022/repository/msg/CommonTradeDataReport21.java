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
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContractType5;
import com.tools20022.repository.msg.TradeTransaction15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to contract and transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21#mmContractData
 * CommonTradeDataReport21.mmContractData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21#mmTransactionData
 * CommonTradeDataReport21.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21#mmActionTypeDetails
 * CommonTradeDataReport21.mmActionTypeDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommonTradeDataReport21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to contract and transaction details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommonTradeDataReport21", propOrder = {"contractData", "transactionData", "actionTypeDetails"})
public class CommonTradeDataReport21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctData")
	protected ContractType5 contractData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractType5
	 * ContractType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21
	 * CommonTradeDataReport21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to a trade contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonTradeDataReport21, Optional<ContractType5>> mmContractData = new MMMessageAssociationEnd<CommonTradeDataReport21, Optional<ContractType5>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonTradeDataReport21.mmObject();
			isDerived = false;
			xmlTag = "CtrctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractData";
			definition = "Data related to a trade contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractType5.mmObject();
		}

		@Override
		public Optional<ContractType5> getValue(CommonTradeDataReport21 obj) {
			return obj.getContractData();
		}

		@Override
		public void setValue(CommonTradeDataReport21 obj, Optional<ContractType5> value) {
			obj.setContractData(value.orElse(null));
		}
	};
	@XmlElement(name = "TxData", required = true)
	protected TradeTransaction15 transactionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeTransaction15
	 * TradeTransaction15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21
	 * CommonTradeDataReport21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related specifically to a trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonTradeDataReport21, TradeTransaction15> mmTransactionData = new MMMessageAssociationEnd<CommonTradeDataReport21, TradeTransaction15>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonTradeDataReport21.mmObject();
			isDerived = false;
			xmlTag = "TxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionData";
			definition = "Data related specifically to a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransaction15.mmObject();
		}

		@Override
		public TradeTransaction15 getValue(CommonTradeDataReport21 obj) {
			return obj.getTransactionData();
		}

		@Override
		public void setValue(CommonTradeDataReport21 obj, TradeTransaction15 value) {
			obj.setTransactionData(value);
		}
	};
	@XmlElement(name = "ActnTpDtls")
	protected Max50Text actionTypeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21
	 * CommonTradeDataReport21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionTypeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the other action type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonTradeDataReport21, Optional<Max50Text>> mmActionTypeDetails = new MMMessageAttribute<CommonTradeDataReport21, Optional<Max50Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonTradeDataReport21.mmObject();
			isDerived = false;
			xmlTag = "ActnTpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionTypeDetails";
			definition = "Details of the other action type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public Optional<Max50Text> getValue(CommonTradeDataReport21 obj) {
			return obj.getActionTypeDetails();
		}

		@Override
		public void setValue(CommonTradeDataReport21 obj, Optional<Max50Text> value) {
			obj.setActionTypeDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonTradeDataReport21.mmContractData, com.tools20022.repository.msg.CommonTradeDataReport21.mmTransactionData,
						com.tools20022.repository.msg.CommonTradeDataReport21.mmActionTypeDetails);
				trace_lazy = () -> Trade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CommonTradeDataReport21";
				definition = "Information related to contract and transaction details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContractType5> getContractData() {
		return contractData == null ? Optional.empty() : Optional.of(contractData);
	}

	public CommonTradeDataReport21 setContractData(ContractType5 contractData) {
		this.contractData = contractData;
		return this;
	}

	public TradeTransaction15 getTransactionData() {
		return transactionData;
	}

	public CommonTradeDataReport21 setTransactionData(TradeTransaction15 transactionData) {
		this.transactionData = Objects.requireNonNull(transactionData);
		return this;
	}

	public Optional<Max50Text> getActionTypeDetails() {
		return actionTypeDetails == null ? Optional.empty() : Optional.of(actionTypeDetails);
	}

	public CommonTradeDataReport21 setActionTypeDetails(Max50Text actionTypeDetails) {
		this.actionTypeDetails = actionTypeDetails;
		return this;
	}
}