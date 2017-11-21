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
import com.tools20022.repository.choice.BlockedReason2Choice;
import com.tools20022.repository.choice.TransactionType5Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for a blocked status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmTransactionType
 * BlockedStatusReason2.mmTransactionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmBlocked
 * BlockedStatusReason2.mmBlocked}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmReason
 * BlockedStatusReason2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmAdditionalInformation
 * BlockedStatusReason2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
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
 * "BlockedStatusReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for a blocked status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BlockedStatusReason2", propOrder = {"transactionType", "blocked", "reason", "additionalInformation"})
public class BlockedStatusReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionType5Choice transactionType;
	/**
	 * Type of transaction for which the account has a blocked status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice
	 * TransactionType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2
	 * BlockedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction for which the account has a blocked status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionType = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundOrder.mmObject();
			componentContext_lazy = () -> BlockedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction for which the account has a blocked status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionType5Choice.mmObject();
		}
	};
	protected YesNoIndicator blocked;
	/**
	 * Indicates whether the account is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBlocked
	 * AccountStatus.mmBlocked}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2
	 * BlockedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Blckd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account is blocked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlocked = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmBlocked;
			componentContext_lazy = () -> BlockedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "Blckd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Indicates whether the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<BlockedReason2Choice> reason;
	/**
	 * Reason for the blocked status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice
	 * BlockedReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBlockedReason
	 * AccountStatus.mmBlockedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2
	 * BlockedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the blocked status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmBlockedReason;
			componentContext_lazy = () -> BlockedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the blocked status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockedReason2Choice.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Additional information about the blocked account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2
	 * BlockedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the blocked account status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BlockedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the blocked account status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BlockedStatusReason2.mmTransactionType, BlockedStatusReason2.mmBlocked, BlockedStatusReason2.mmReason, BlockedStatusReason2.mmAdditionalInformation);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BlockedStatusReason2";
				definition = "Reason for a blocked status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxTp", required = true)
	public TransactionType5Choice getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType5Choice transactionType) {
		this.transactionType = transactionType;
	}

	@XmlElement(name = "Blckd", required = true)
	public YesNoIndicator getBlocked() {
		return blocked;
	}

	public void setBlocked(YesNoIndicator blocked) {
		this.blocked = blocked;
	}

	@XmlElement(name = "Rsn")
	public List<BlockedReason2Choice> getReason() {
		return reason;
	}

	public void setReason(List<BlockedReason2Choice> reason) {
		this.reason = reason;
	}

	@XmlElement(name = "AddtlInf", required = true)
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}